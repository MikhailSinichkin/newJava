import java.util.ArrayDeque;
import java.util.Deque;

class Calculator {

    private Deque<Integer> results;

    public Calculator() {
        results = new ArrayDeque<>();
    }

    public int calculate(char op, int a, int b) {

        int result = 0;
        if (op == '+')
            result = a + b;
        else if (op == '-')
            result =  a - b;
        else if (op == '*')
            result =  a * b;
        else if (op == '/')
            result =  a / b;

        if (op == '<') {
            results.removeLast();
            result = results.getLast();}
         else
            results.add(result);

        return result;
    }

}
class CalculatorTwo {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {

            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';}
         else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
        double result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        double prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}