// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

public class Task5 {
    public static void main(String[] args) {
        String Text = "Добро пожаловать на курс по Java";
        String array[] = Text.split(" ");
        System.out.println(array.toString());
        for(int i = array.length -1 ; i != -1; i--){
            System.out.print(array[i] + " ");
        }
    }
}