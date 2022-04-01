import java.util.Scanner;

class Vowel {
    public Vowel() {
        Scanner sc = new Scanner(System.in);
        int totalVowelConnt = 0, totalConsonantConnt = 0;
        String str;
        do {
            System.out.println("Enter A Sentence ");
            str = sc.next();
            String temp = str.toLowerCase();
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) == 'a' || temp.charAt(i) == 'e' ||
                        temp.charAt(i) == 'i' || temp.charAt(i) == 'o' ||
                        temp.charAt(i) == 'u') {
                    totalVowelConnt++;
                } else {
                    totalConsonantConnt++;
                }
            }

        } while (!str.equals("quit"));
        System.out.println("Total Number of vowel " + totalVowelConnt);
        System.out.println("Total Number of Consonant " + totalConsonantConnt);
    }
}

public class VowelDemo {
    public static void main(String[] args) {
        Vowel obj = new Vowel();
    }
}