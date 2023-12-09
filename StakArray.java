// Задание №4
// Реализовать стэк с помощью массива.
// Нужно реализовать методы:
// size(), empty(), push(), peek(), pop(). 

import java.util.Stack;

public class StakArray {
    public static void main(String[] args) {
        int size = 4;
        Stack stack = new Stack();

        System.out.println(stack.empty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.empty());
    }
    
}

class stack {
    int[] array ;
    int maxsize;
    int indexLast;

    public stack(int size) {
        this.maxsize = size ; 
        array = new int[size];
        indexLast = -1;
    }
    public int sizeArray(){
        return indexLast + 1;
    }
    public boolean empty(){
        return indexLast == -1;
    }

    public void push(int value){
        array[indexLast + 1] = value ;
        indexLast++;
    }

    public int peek(){
        return array[indexLast];
    }

    public int pop(){
        return array[indexLast--];
    }
}
