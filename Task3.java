import java.util.Scanner;

public class Task3 {

    static int countPrimeFactors(long n) {
        int count = 0;
        for (long d = 2; d * d <= n; d++) {
            while (n % d == 0) {
                count++;
                n = n / d;
            }
        }
        if (n > 1) {
            count++; 
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите A и B: ");
        long a = sc.nextLong();
        long b = sc.nextLong();

        int result = 0;
        for (long i = a; i <= b; i++) {
            if (countPrimeFactors(i) == 3) {
                result++;
            }
        }
        System.out.println("Количество чисел: " + result);
    }
}