import java.util.*;

 public class RockPaperScissorsGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Rock Or Paper Scissors ");
        System.out.print("You :");
        String str1 = sc.next();
        String str2 = new String();
        int a = (int) (Math.random() * 3 + 1);
        System.out.println(a);
        if (a == 1 ) {
            str2 = "rock";
        } else if (a == 2 ) {
            str2 = "paper";
        } else {
            str2 = "scissors";
        }
        if (str1.equalsIgnoreCase("rock")) {
            System.out.print("Computer : ");
            System.out.println(str2);
            if (str1.equals(str2)) {
                System.out.println("tie");
            } else if (str2.equals("paper")) {
                System.out.println("You Lose");
            } else {
                System.out.println("You Win");
            }
        } else if (str1.equalsIgnoreCase("paper")) {
            System.out.print("Computer : ");
            System.out.println(str2);
            if (str1.equals(str2)) {
                System.out.println("tie");
            } else if (str2.equals("scissors")) {
                System.out.println("You Lose");
            } else {
                System.out.println("You Win");
            }
        } else {
          
            System.out.print("Computer : ");
            System.out.println(str2);
              if (str1.equals(str2)) {
                System.out.println("tie");
            } else if (str2.equals("rock")) {
                System.out.println("You Lose");
            } else {
                System.out.println("You Win");
            }
        }
    }
}
