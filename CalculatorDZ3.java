import java.util.Scanner;

public class CalculatorDZ3 {
    public static void main(String[] args) {
       int result;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите числа");
        int a = reader.nextInt();
        int b = reader.nextInt();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        char op = reader.next().charAt(0);
        switch(op) {
           case '+': result = a + b;
              break;
           case '-': result = a - b;
              break;
           case '*': result = a * b;
              break;
           case '/': result = a / b;
              break;
           default:  System.out.printf("Некорректный оператор ");
              return;
        }
        
        System.out.printf(a + " " + op + " " + b + " = " + result);
     }
}

