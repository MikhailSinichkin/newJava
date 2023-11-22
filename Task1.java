// Написать программу , которая запросит пользавателя ввести Имя в консоли
// Получит введенную строку и выведет в консоль сообщение привет имя !

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "ibm866");
        System.err.println("Введите имя пользователя ");
        String name = scanner.nextLine();
        System.out.println("Привет," + name +"!");
        scanner.close();
    }
    
}
