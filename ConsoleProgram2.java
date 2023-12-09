// Задание №2
//  Реализовать консольное приложение, которое:
// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная
// была первой в списке, а первая - последней.
// 3. Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ConsoleProgram2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> lines = new LinkedList<>();

        while (true) {
            System.out.println("Введите text для сохранения в памяти");
            System.out.println("Введите revert для удаления последнего элемента ");
            System.out.println("Введите print для вывода в обратном порядке ");
            System.out.println("Введите exit для выхода");
            String input = scanner.nextLine();
            if (input.equals("exit"))
                break;
            if(input.equals("revert")){
                deliteLastStrok(lines);
                System.out.println(lines);
            }
            else if (input.equals("print")){
                printReverseLinkedList(lines);
            }else {
                lines.add(input);
                System.out.println(lines);
            }

        }
    }

    public static void printReverseLinkedList(LinkedList<String> linkedlist) {
        for (int i = linkedlist.size() - 1; i >= 0; i--) {
            System.out.print(linkedlist.get(i) +" ");
        
        }
    }

    public static void deliteLastStrok(LinkedList<String> linkedlist){
        linkedlist.removeLast();
    }
}
