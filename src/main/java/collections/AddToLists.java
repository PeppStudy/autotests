package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class AddToLists {

    public ArrayList<Box> createList() {

        ArrayList<Box> originalList = new ArrayList<>();
        CreateBox newBox = new CreateBox();

        for (int i = 0; i < 10; i++) {
            originalList.add(newBox.createBox());
        }

        return originalList;
    }

    public ArrayList<Box> sortList(ArrayList<Box> originalList) {
        ArrayList<Box> anotherList = new ArrayList<>();

        Iterator<Box> iterator = originalList.iterator();

        while (iterator.hasNext()) {
            Box thisBox = iterator.next();

            if (thisBox.getWidth() > 30) {
                anotherList.add(thisBox);
                iterator.remove();
            }

        }
        return anotherList;
    }
}
