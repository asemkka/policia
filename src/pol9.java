import java.util.Scanner;

public class pol9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int hundreds = n / 100;
        int tens = (n / 10) % 10;
        int ones = n % 10;

        System.out.println(hundreds + tens + ones);
    }
}
