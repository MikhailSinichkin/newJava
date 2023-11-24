// Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.

public class DZ_2 {
    public static void main(String[] args) {
        for(int i= 1;i <=1001; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0 ){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(i);
            }

        }
    }
}
