package collections;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

      AddToLists listCreating = new AddToLists();

     ArrayList<Box> originalList =  listCreating.createList();
     ArrayList<Box> anotherList = listCreating.sortList(originalList);

        System.out.println("Список с маленькими коробками");
        System.out.println(originalList);
        System.out.println("\nСписок с большими коробками");
        System.out.println(anotherList);



    }
}
