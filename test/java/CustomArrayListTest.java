import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {
    // test driven development steps
    //1. write a failing test eg. fail ("not yet implemented");
    // 2. write the business logic to make the test pass
    //3.Refacor your code
    @Test
    void should_add_one_item_to_list() {
        // Steps Arrange, Act, Assert
        // Arrange
        CustomArrayList<Integer> customList = new CustomArrayList();
        // act
        customList.add(5);
        //assert
        assertEquals(5, customList.get(0));
        assertEquals(1, customList.getSize());
    }

    @Test
    void should_add_11_items_to_List_and_check_size() {
        CustomArrayList<Integer> sut = new CustomArrayList();       // sut system under test
        sut.add(1);
        sut.add(2);
        sut.add(3);
        sut.add(4);
        sut.add(5);
        sut.add(6);
        sut.add(7);
        sut.add(8);
        sut.add(9);
        sut.add(10);
        sut.add(11);
        for (int i = 0; i < sut.getSize(); i++) {
            assertEquals(i + 1, sut.get(i));
        }
        assertEquals(11, sut.getSize());
    }


    @Test
    void should_add_item_and_remove_item_and_get_item() {
        CustomArrayList<String> sut1 = new CustomArrayList<>();
        sut1.add("A");
        sut1.add("D");
        sut1.add("Y");
        sut1.add("X");
        sut1.add("F");
        System.out.println(sut1.get(0) + sut1.get(1) + sut1.get(2));
        // removing items
        sut1.remove(1);
        sut1.remove(2);
        //getting items
        assertEquals("Y", sut1.get(1));
        assertEquals("F", sut1.get(2));
    }

}