// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

public class Task5_2 {
    public static void main(String[] args) {
        String phrase = "Добро пожаловать на курс по Java";
        System.out.println(phraseRevers(phrase));
    }

    static String phraseRevers(String phrase){
        String [] words = phrase.split(" ");
        String reversPhrase = "";
        for (int i = words.length - 1; i >= 0 ;i-- ){
            reversPhrase += words[i] +" ";

        }
        return reversPhrase;

    }
}
