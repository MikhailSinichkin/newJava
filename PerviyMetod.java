// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.

import java.io.FileWriter;
import java.io.IOException;

public class PerviyMetod {
    public static void main(String[] args) {
        System.out.println(getRepeatWord("test",10));
        String words = getRepeatWord("test",10);
        writeFile(words, "repeatWord.txt");
    }

    static String getRepeatWord(String word, int repeat){
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < repeat; i++){
            sb.append(word).append(" ");
        }
        return sb.toString();
    }

    static void writeFile(String str,String fileName){
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(str);
            System.out.println("Данные успешно добавлены");
        } catch (IOException e) {
            System.out.println("Ошибочка вышла");
            e.printStackTrace();
        }
        
    }
}
