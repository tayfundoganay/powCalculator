import java.util.Scanner;

public class powCalculator {
    static int pow(int base, int power) {
        if (power != 0) {

            // recursive call to power()
            return (base * pow(base, power - 1));
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int base,power;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı ve üssünü sırayla giriniz!");
        base = scanner.nextInt();
        power = scanner.nextInt();

        System.out.printf("%d^%d = %d",base,power,pow(base,power));
    }
}
