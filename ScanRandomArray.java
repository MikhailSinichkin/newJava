import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//📌 Заполнить список десятью случайными числами
//📌 Отсортировать список методом sort() и вывести его на
//        экран.
public class ScanRandomArray {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            listInt.add(random.nextInt(1,100));
        }
        System.out.println(listInt);
        Collections.sort(listInt);
        System.out.println(listInt);
    }

    private static List<Integer> getIntegers() {
        List<Integer> listInt = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            listInt.add(random.nextInt(1,100));
        }
        return listInt;
    }
}