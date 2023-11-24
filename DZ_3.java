// Напишите класс Calculator, который будет выполнять математические операции (+, -, *, /) над двумя числами
//  и возвращать результат. В классе должен быть метод calculate, который принимает оператор 
//  и значения аргументов и возвращает результат вычислений.
// При неверно переданном операторе, программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".
public class DZ_3 {
   public static void main(String[] args) {
        int a = 10;
        int b = 5;
        char op = '+';
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(op, a, b));
    }


    static class Calculator {
        public int calculate(char op, int a, int b) {
            int result = 0;
            switch (op){
                case '+':{
                    result = (a + b);
                    break;
                }
                case '/':{
                    result = (a / b);
                    break;
                }
                case '*':{
                    result = (a * b);
                    break;
                }
                case '-':{
                    result = (a - b);
                    break;
                }
                default:{
                    System.out.printf("Некорректный оператор: '%s'", op);
                }
            }
            return result;
        }
    } 
}
