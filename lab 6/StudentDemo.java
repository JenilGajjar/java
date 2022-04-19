import java.util.Scanner;

class Student {
    int id_no;
    int no_of_subject_registerd;
    int[] subject_credit = new int[10];
    String[] subject_code = new String[10];
    String[] grade_obtained = new String[10];
    double spi;

    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id number ");
        id_no = sc.nextInt();
        System.out.println("Enter number of subjects ");
        no_of_subject_registerd = sc.nextInt();
        for (int i = 0; i < no_of_subject_registerd; i++) {
            System.out.println("Enter Subject code ");
            subject_code[i] = sc.next();
            System.out.println("Enter Subject credit ");
            subject_credit[i] = sc.nextInt();
            System.out.println("Enter obtained grade ");
            grade_obtained[i] = sc.next();
        }
    }

    public void displayDetails() {
        System.out.println("id no : " + id_no);
        System.out.println("number of subject registerd : " + no_of_subject_registerd);
        System.out.println("spi : " + spi);
    }

    public double calcualteSpi() {
        int totalCredit = 0, sum = 0;
        int[] temp = new int[no_of_subject_registerd];
        for (int i = 0; i < no_of_subject_registerd; i++) {
            totalCredit = totalCredit + subject_credit[i];
            if (grade_obtained[i].equalsIgnoreCase("a+")) {
                temp[i] = 10 * subject_credit[i];
            } else if (grade_obtained[i].equalsIgnoreCase("a")) {
                temp[i] = 9 * subject_credit[i];
            } else if (grade_obtained[i].equalsIgnoreCase("b+")) {
                temp[i] = 8 * subject_credit[i];
            } else if (grade_obtained[i].equalsIgnoreCase("b")) {
                temp[i] = 7 * subject_credit[i];
            } else if (grade_obtained[i].equalsIgnoreCase("c+")) {
                temp[i] = 6 * subject_credit[i];
            } else if (grade_obtained[i].equalsIgnoreCase("c")) {
                temp[i] = 5 * subject_credit[i];
            } else if (grade_obtained[i].equalsIgnoreCase("d+")) {
                temp[i] = 4 * subject_credit[i];
            } else if (grade_obtained[i].equalsIgnoreCase("d")) {
                temp[i] = 3 * subject_credit[i];
            } else {
                temp[i] = 2 * subject_credit[i];
            }
            sum = sum + temp[i];
        }

        return ((float) sum / totalCredit);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.spi = s1.calcualteSpi();
        s1.displayDetails();
    }
}