// Задание №1
// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида
// text~num
// 2. Нужно рассплитить строку по ~, сохранить text в связный список на
// позицию num.
// 3. Если введено print~num, выводит строку из позиции num в связном
// списке и удаляет её из списка.

import java.util.LinkedList;
import java.util.Scanner;

public class ConsoleProgram1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите строка вида:text~num ");
            System.out.println("Введите строка вида:print~num  для удаления ");
            System.out.println("Введите exit для выхода");
            String input = scanner.nextLine();
            if (input.equals("exit"))
                break;

            String[] pars = input.split("~");
            if (pars.length > 2)
                break;
            String text = pars[0];
            int position = Integer.parseInt(pars[1]);

            if (text.equals("print")) {
                printAndRemove(list, position);
                System.out.println(list);
            } else {
                addToList(list, text, position);
                System.out.println(list);
            }
        }
    }

    public static void addToList(LinkedList<String> list, String text, int position) {
        if (position >= 0 && position <= list.size()) {
            list.add(position, text);
            System.out.println("Строка добавлена ");
        } else
            System.out.println("Не корректная позиция ");
    }

    public static void printAndRemove(LinkedList<String> list, int position) {
        if (position >= 0 && position <= list.size()) {
            String text = list.get(position);

            list.remove(position);
            System.out.println("строка \" " + text + " \" удалена ");
        }
    }
}
