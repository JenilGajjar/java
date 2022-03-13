import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in 5 subject");
        int subject1 = sc.nextInt();
        int subject2 = sc.nextInt();
        int subject3 = sc.nextInt();
        int subject4 = sc.nextInt();
        int subject5 = sc.nextInt();
        Percentage obj = new Percentage();
        System.out.println("marks in subject1 " + subject1);
        System.out.println("marks in subject2 " + subject2);
        System.out.println("marks in subject3 " + subject3);
        System.out.println("marks in subject4 " + subject4);
        System.out.println("marks in subject5 " + subject5);
        float p = obj.calculatePercentage(subject1, subject2, subject3, subject4, subject5);
        System.out.format("percentage : %.2f\n", p);
        System.out.println("perecentage : " + String.format("%.2f", p));
        obj.calculateDividion(p);
    }
}