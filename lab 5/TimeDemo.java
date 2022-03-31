import java.util.Scanner;

class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void add(Time t) {
        this.second += t.second;
        while (this.second >= 60) {
            if (this.second >= 60) {
                this.minute++;
                this.second -= 60;
            }
        }
        this.minute += t.minute;
        while (this.minute >= 60) {
            if (this.minute >= 60) {
                this.hour++;
                this.minute -= 60;
            }
        }
        this.hour += t.hour;
    }
}

public class TimeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hour,minute,second ");
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();
        Time t1 = new Time(hour, minute, second);
        Time t2 = new Time(0, 0, 0);
        t1.add(t2);
        System.out.println(t1.hour + " : " + t1.minute + " : " + t1.second);
    }
}