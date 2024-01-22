import java.util.*;

public class validPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        System.out.println(check(s));
    }

    public static boolean check(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        String str = new StringBuilder(s).reverse().toString();

        return str.equals(s);
    }
}
