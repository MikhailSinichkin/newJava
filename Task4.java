// Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку "".

// "flower", "flow", "flight"


public class Task4 {
    public static void main(String[] args) {
        String[] strs ={"flower", "flow", "floight"};
        System.out.println(prefix(strs));
    }
    public static String prefix(String[] str) {
        if (str.length == 0) return "";
        String prefix = str[0];
        for (int i = 1; i < str.length;i++){
            while (str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() -1 );
                if(prefix.isEmpty()){
                    return "";
                }
            }
            
        }
        return prefix;
    }
}