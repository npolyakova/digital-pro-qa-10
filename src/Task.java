import java.util.HashSet;
import java.util.Scanner;

public class Task {

    //Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
    //Избавиться от повторяющихся элементов в строке.
    //Вывести результат на экран.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        while (sc.hasNextInt()) {
            set.add(sc.nextInt());
        }

        System.out.println(set);
    }
}
