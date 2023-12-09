// Задание №3
// 1) Написать метод, который принимает массив элементов, помещает их в стэк
// и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в
// очередь и выводит на консоль содержимое очереди. 

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ConsoleProgram3 {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5};
        addAndPrintValue(nums);
        System.out.println();
        addAndPrintValInQueue(nums);
    }

    public static void addAndPrintValue(int[] elems){
        Stack<Integer> stack = new Stack<>();
        for (int elem : elems) {
            stack.push(elem);
        }
        // System.out.println("содержимое стэка: " + stack);

        while(!stack.isEmpty()) System.out.print(stack.pop() +",");
    }

    public static void addAndPrintValInQueue(int[] elems){
        Queue<Integer> queue = new LinkedList<>();
        for (int elem : elems) {
            queue.add(elem);
        }
        // System.out.println("содержимое стэка: " + stack);

        while(!queue.isEmpty()) System.out.print(queue.poll() +",");
    }
}
