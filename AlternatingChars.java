public class AlternatingChars {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'b';
        int n = 8;

        long start = System.currentTimeMillis();
        alternatingCharsSb(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        alternatingCharsStr(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);

    }

    public static String alternatingCharsSb(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n / 2; i++) {
            sb.append(c1).append(c2);
        }
        return sb.toString();
    }

    public static String alternatingCharsStr(int n, char c1, char c2) {
        String str = "";
        for (int i = 0; i < n / 2; i++) {
            str += Character.toString(c1) + Character.toString(c2);
        }
        return str;
    }
}


