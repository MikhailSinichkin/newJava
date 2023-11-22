// Дан массив nums = [3,2,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

import java.util.Arrays;

public class Task3_2 {
    public static void main(String[] args) {
        int [] array ={3,2,2,3,1,5,3,3,5,10};
        int val = 3;
        System.out.println(Arrays.toString(array));
        moveToEnd(array, val);
        System.out.println(Arrays.toString(array));
    }
    public static void moveToEnd(int[] array , int val) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while (leftIndex < rightIndex) {
            while (array[rightIndex] == val && rightIndex > leftIndex){
                rightIndex--;
            }
            if (array[leftIndex] == val){
                int temp = array[leftIndex];
                array[leftIndex] = array[rightIndex];
                array[rightIndex] = temp ;
                rightIndex--;
            }
            leftIndex++;
        }
    }
}
