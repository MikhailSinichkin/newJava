// Дан массив двоичных чисел, например 
// [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.



public class Task2{
    public static void main(String[] args){
        int [] nums = {1,1,0,1,1,1,0,1,1,1,1};
        getMaxSequenceOnes(nums);
        System.out.println(getMaxSequenceOnes(nums));
    }

    static int getMaxSequenceOnes(int[] array){

        int count = 0;
        int maxSequenceOnes = 0 ;
        for (int i =0; i < array.length; i++){
            if(array[i] == 1){
                count++;
                maxSequenceOnes = count < maxSequenceOnes ? maxSequenceOnes : count;
            }
            else count = 0;
        }
        return maxSequenceOnes;
    }
}