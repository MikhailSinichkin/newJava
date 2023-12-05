// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
// Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:
// int[] arr - числовой массив
// После каждой итерации, ваш код должен делать запись в лог-файл 'log.txt' в формате год-месяц-день час:минуты {массив на данной итерации}.
// Пример
// arr = new int[]{9, 4, 8, 3, 1};
// sort(arr)
// // При чтении лог-файла получим:
// 2023-05-19 07:53 [4, 8, 3, 1, 9]
// 2023-05-19 07:53 [4, 3, 1, 8, 9]
// 2023-05-19 07:53 [3, 1, 4, 8, 9]
// 2023-05-19 07:53 [1, 3, 4, 8, 9]
// 2023-05-19 07:53 [1, 3, 4, 8, 9]

import java.util.Arrays;

public class BubleSorte {
    public static void main(String[] args) {
        int[] mas = {9, 4, 8, 3, 1};
        boolean isSorted = false;
        int buf;
        while(!isSorted){
            isSorted=true;
            for (int i = 0 ; i < mas.length -1 ; i++){
                if(mas[i] > mas[i+1]) {
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
                System.out.println(Arrays.toString(mas));
            }
            
        }
        System.out.println(Arrays.toString(mas));
    }
}
