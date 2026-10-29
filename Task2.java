import java.util.Scanner;

public class Task2 {

    static boolean parallel(double x1, double y1, double x2, double y2,
                            double x3, double y3, double x4, double y4) {

        return (x2 - x1) * (y4 - y3)==(y2 - y1) * (x4 - x3);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();

        if (parallel(x1, y1, x2, y2, x3, y3, x4, y4)
                && parallel(x2, y2, x3, y3, x4, y4, x1, y1)) {

            System.out.println("Это паралелограмм");
        } else {
            System.out.println("Это не параллелограмм");
        }
    }
}