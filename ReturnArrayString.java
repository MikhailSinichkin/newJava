// Задание №5
// Напишите метод, который вернет содержимое текущей папки в виде
// массива строк.
// Напишите метод, который запишет массив, возвращенный предыдущим
// методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае
// возникновения исключения, оно должно записаться в лог-файл.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.swing.text.AbstractDocument.Content;

public class ReturnArrayString {
    static Logger logger = Logger.getLogger(ReturnArrayString.class.getName());
    public static void main(String[] args) {
        settingLogger();
        String[] str = getContentFolder(".") ;
        logger.log(Level.INFO,"получили содержимое текущей папки");
        //System.out.println(Arrays.toString(str));
        writeFile(str , "contentFolder.txt");


    }

    static String[] getContentFolder(String folderPath) {
        File folder = new File(folderPath);
        //получение списков файлов в этой папке
        String[] folderContent = folder.list();
        return folderContent;

    }

    static void writeFile(String[] contentFolder ,String fileName){
        try (FileWriter fw = new FileWriter(fileName)) {
            for (String content : contentFolder) {
                fw.write(content);
                logger.info(content);
                fw.write(System.lineSeparator());

                
            }
            // System.out.println("Данные успешно добавлены");
            logger.info("Данные успешно добавлены");
        } catch (IOException e) {
            System.out.println("Ошибочка вышла");
            logger.warning("Ошибочка вышла" + "\n" + e.getMessage());
            // e.printStackTrace();
        }
        
    }

    static void settingLogger(){
        try {
            
            FileHandler fh = new FileHandler("log.txt");
            logger.addHandler(fh);
            SimpleFormatter sFormatter = new SimpleFormatter();
            fh.setFormatter(sFormatter);
        } catch (SecurityException e) {
            
            e.printStackTrace();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
    

}
