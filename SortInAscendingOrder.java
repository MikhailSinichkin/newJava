// Реализуйте метод, который принимает на вход целочисленный массив arr:
// - Создаёт список ArrayList, заполненный числами из исходого массива arr.
// - Сортирует список по возрастанию и выводит на экран.
// - Находит минимальное значение в списке и выводит на экран - Minimum is {число} - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
// - Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
// Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:

// Integer[] arr - массив целых чисел.

// Пример.
// Исходный массив:

// 4, 2, 7, 5, 1, 3, 8, 6, 9
// Результаты:

// [1, 2, 3, 4, 5, 6, 7, 8, 9]
// Minimum is 1
// Maximum is 9

import java.util.Arrays;

class SortInAscendingOrder { public void analystNumbers(Integer[] arr) {

    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println("Minimum is " + Arrays.stream(arr).min(Integer::compareTo).get());
    System.out.println("Maximum is " + Arrays.stream(arr).max(Integer::compareTo).get());
    System.out.println("Average is = " + (int) (Arrays.stream(arr).mapToInt(value -> value).sum() / Arrays.stream(arr).count()));

}
}

class SortInAscendingOrderPrinter{ public static void main(String[] args) { Integer[] arr = {};

    if (args.length == 0) {
        arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
    }
    else{
        arr = Arrays.stream(args[0].split(", "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
    }

    SortInAscendingOrder ans = new SortInAscendingOrder();
    ans.analystNumbers(arr);
}
}
