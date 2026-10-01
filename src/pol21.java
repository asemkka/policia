import java.util.Scanner;

public class pol21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        // Если одно число делится на другое, то один из остатков равен 0,
        // а значит их произведение будет равно 0.
        // Прибавляем 1, чтобы получить 1.
        // Если не делятся, произведение больше 0, и получится любое другое число.
        int result = (n % m) * (m % n) + 1;

        System.out.println(result);
    }
}