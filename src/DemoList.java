import java.util.ArrayList;

public class DemoList {

    public static void main(String[] args) {
        int[] array = new int[4];
        int[] array2 = {1, 2, 3};

        //System.out.println(array);
        array[3] = 2;

        ArrayList<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Peer");
        myList.add("Melon");
        myList.add("Peach");
        myList.add("Peach");
        System.out.println(myList);

        myList.add(1, "Pineapple");

        System.out.println(myList);
        System.out.println(myList.get(2));
        System.out.println(myList.indexOf("Melon"));

        myList.remove(0);
        myList.remove("Peach");
        System.out.println(myList);

    }
}
