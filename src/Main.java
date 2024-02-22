import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CustomArrayList  newList= new CustomArrayList<>();
        List<Integer> firstList= new ArrayList<>();
        List<Integer> secondList= new ArrayList<>();
        List<Integer> thirdList= new ArrayList<>();
        List<Integer> foiurthList= new ArrayList<>();
        List<Integer> fifthList= new ArrayList<>();
        List<Integer> sixthList= new ArrayList<>();
        List<Integer> seventhList= new ArrayList<>();
        List<Integer> eightthList= new ArrayList<>();
        List<Integer> ninthList= new ArrayList<>();
        List<Integer> tenthList= new ArrayList<>();
        List<Integer> eleventhList= new ArrayList<>();
        newList.add(firstList);
        newList.add(secondList);
        newList.add(thirdList);
        newList.add(foiurthList);
        newList.add(fifthList);
        newList.add(sixthList);
        newList.add(seventhList);
        newList.add(eightthList);
        newList.add(ninthList);
        newList.add(tenthList);
        newList.add(eleventhList);
        firstList.add(8888);
        firstList.add(5555);
        secondList.add(11111);
        secondList.add(22222);

        System.out.println( "Size of the newList is " + newList.getSize());
        for (int i =0; i< newList.getSize();i++){
            System.out.println(newList.get(i));
        }
        newList.remove(1);
        System.out.println(newList.getSize());
        System.out.println(newList.get(1));

    }
}