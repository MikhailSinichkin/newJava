// Задание №4
// Каталог товаров книжного магазина сохранен в виде двумерного
// списка List<ArrayList<String>> так, что на 0й позиции каждого
// внутреннего списка содержится название жанра, а на остальных
// позициях - названия книг. Напишите метод для заполнения данной
// структуры.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        List<ArrayList<String>> catalog = new ArrayList<>();
        
        ArrayList<String> genreOne = new ArrayList<>();
        genreOne.add("Жанр 1");
        genreOne.add("книга 1");
        genreOne.add("Книга 2");
        genreOne.add("Книга 3");

        ArrayList<String> genreTwo = new ArrayList<>();
        genreTwo.add("Жанр 2");
        genreTwo.add("книга 1");
        genreTwo.add("Книга 2");
        genreTwo.add("Книга 3");

        ArrayList<String> genreThree = new ArrayList<>();
        genreThree.add("Жанр 3");
        genreThree.add("книга 1");
        genreThree.add("Книга 2");
        genreThree.add("Книга 3");

        catalog.add(genreOne);
        catalog.add(genreTwo);
        catalog.add(genreThree);

        for (int i = 0; i < catalog.size();i++){
            System.out.println(catalog.get(i));
        }
        
    }
}
