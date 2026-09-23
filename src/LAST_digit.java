import java.util.Scanner;
public class LAST_digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int lastDigit = n % 10;
        System.out.println(lastDigit);
    }
}
