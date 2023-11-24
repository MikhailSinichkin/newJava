// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class DZ_1 {
    public static void main(String[] args) {
        int n = 4;
        int sum = 0;
       while(n!=0){
        sum = sum + n;
        n = n -1;
       }
    System.out.print(sum) ;
    }
}
