// Задание №0
// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
// Сравните с предыдущим.

import java.util.ArrayList;
import java.util.LinkedList;

public class CompareLists {
    public static void main(String[] args) {
        int count = 10_000;

        System.out.println("добавление в конец :");
        long start = System.currentTimeMillis();
        getArrayListLast(count);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        getLinkedListLast(count);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("добавление в начало  :");
        start = System.currentTimeMillis();
        getArrayListFirst(count);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        getLinkedListFirst(count);
        System.out.println(System.currentTimeMillis() - start);
        
        System.out.println("добавление в Середину  :");
        start = System.currentTimeMillis();
        getArrayListMiddle(count);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        getLinkedListMiddle(count);
        System.out.println(System.currentTimeMillis() - start);
    }

    public static ArrayList<Integer> getArrayListLast(int count){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int index = 0; index < count; index++) {
            arrayList.add(index);
        }
        return arrayList;
    }

    public static LinkedList<Integer> getLinkedListLast(int count){
        LinkedList<Integer> LinkedList = new LinkedList<>();
        for (int index = 0; index < count; index++) {
            LinkedList.addLast(index);
        }
        return LinkedList;
    }

     public static ArrayList<Integer> getArrayListFirst(int count){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int index = 0; index < count; index++) {
            arrayList.add(0, index);
        }
        return arrayList;
    }

    public static LinkedList<Integer> getLinkedListFirst(int count){
        LinkedList<Integer> LinkedList = new LinkedList<>();
        for (int index = 0; index < count; index++) {
            LinkedList.add(0,index);
        }
        return LinkedList;
    }

    public static ArrayList<Integer> getArrayListMiddle(int count){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int index = 0; index < count; index++) {
            arrayList.add(arrayList.size()/2, index);
        }
        return arrayList;
    }

    public static LinkedList<Integer> getLinkedListMiddle(int count){
        LinkedList<Integer> LinkedList = new LinkedList<>();
        for (int index = 0; index < count; index++) {
            LinkedList.add(LinkedList.size()/2, index);
        }
        return LinkedList;
    }

}
