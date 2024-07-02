REcursive method
public class PowerCalculation {
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(power(x, n));
    }

    public static int power(int x, int n) {
        // Base case
        if (n == 0) {
            return 1;
        }

        // Recursive case
        int halfPower = power(x, n / 2);

        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return x * halfPower * halfPower;
        }
    }
}
