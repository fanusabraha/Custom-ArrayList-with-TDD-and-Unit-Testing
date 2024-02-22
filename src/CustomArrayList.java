import java.util.Arrays;
public class CustomArrayList <T>implements CustomList<T > {
        Object[] items = new Object[10];
        private int size;
        //private Object[]items;
        @Override
        public boolean add(T item) {
            // TODO Auto-generated method stub
            if(size==items.length){increaseCapacity();}
            items[size++]= item;
            return true;
        }
        @Override
        public boolean add(int index, T item) throws IndexOutOfBoundsException {
            if (index <0 || index >size){ throw new IndexOutOfBoundsException("index out of Bound");}
            if (size == items.length) {
                increaseCapacity();}
            System.arraycopy(items, index, items, index + 1, size - index);
            items[index] = item;
            size++;
            return true;
        }

        @Override
        public int getSize() {
            // TODO Auto-generated method stub
            return size;
        }

        @Override
        public T get(int index) {
            // TODO Auto-generated method stub
            return (T) items[index];
        }

        @Override
        public T remove(int index) throws IndexOutOfBoundsException {
            if (index <0 || index >size){ throw new IndexOutOfBoundsException("index out of Bound");}
            T removedItem = (T) items[index];

            System.arraycopy(items, index + 1,items, index,size- index-1);
            items[--size]= null;
            return removedItem;
        }

        private void increaseCapacity(){
            int newSize=items.length*2;
            items= Arrays.copyOf(items,newSize);}


}
