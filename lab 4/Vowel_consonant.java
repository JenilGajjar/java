import java.util.Scanner;

public class Vowel_consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str1 = sc.nextLine();
        String str2 = str1.toLowerCase();
        int l = str1.length(), vowel = 0, cons = 0;
        for (int i = 0; i < l; i++) {
            char ch = str2.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            } else {
                cons++;
            }
        }
        System.out.println("The Number of vowel : " + vowel);
        System.out.println("The Number of consonant : " + cons);
    }
}