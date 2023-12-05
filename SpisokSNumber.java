// Задание №3
// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;
import java.util.List;

public class SpisokSNumber {
    
    static List<String> removeNumbers(List<String> array){
        for(int i = 0 ; i < array.size() ; i++){
            if(isNumber(array,i)){
                array.remove(i);
                i--;
            }
        }
        return array;


    }

    private static Boolean isNumber(List<String> array, int i) {
        try {
            Integer.parseInt(array.get(i));
            return true;
        } catch (Exception e){
            return false;
        }
        
        
    } 

    static void getList(List<String> array){
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("5");
        array.add("7");
        array.add("12");
        array.add("3");
        array.add("ada");
    }
    
    public static void main(String[] args) {
        List<String> arrayString = new ArrayList<>();
        getList(arrayString);
        System.out.println(arrayString);
        System.out.println(removeNumbers(arrayString));


    }
}
