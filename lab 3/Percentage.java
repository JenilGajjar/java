
public class Percentage {

    public float calculatePercentage(int a, int b, int c, int d, int e) {
        float p = (a + b + c + d + e) / 5;
        return p;
    }

    public void calculateDividion(float p) {
        if (p >= 60) {
            System.out.println("first division ");
        } else if (p >= 50 && p < 60) {
            System.out.println("second diviosn ");
        } else if (p >= 40 && p < 50) {
            System.out.println("Third divison ");
        } else if (p < 40) {
            System.out.println("Fail");
        }
    }
}
