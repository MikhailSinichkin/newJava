// Дан массив nums = [3,2,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int array[] = {3,2,2,3};
        int val = 3;
        for (int i = 0;i < array.length; i++){
            if (array[i] == val){
                int index = array.length-1;
                while(index > i){
                    if (array[index] != val){
                        int temp = array[index];
                        array[index] = array[i];
                        array[i] = temp;
                        break;
                    }
                    index--;
                }
                if ( index == i )break;
            }
                
        }
        System.out.println(Arrays.toString(array));
    }
}