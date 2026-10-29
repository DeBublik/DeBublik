import java.util.Scanner;

public class Taskkk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите r1, r2, r3: ");
        double r1 = sc.nextDouble();
        double r2 = sc.nextDouble();
        double r3 = sc.nextDouble();

        double corners = 2 * (r3 * r3 / 2 - Math.PI * r3 * r3 / 8);

        double rings = 3 * Math.PI * (r2 * r2 - r1 * r1) / 8;

        double s = corners + rings;
        System.out.println(s);
    }
}