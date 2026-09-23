import java.util.Scanner;
public class TWO_digit_NUMBER_of_TENS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tens = n / 10;
        System.out.println(tens);
    }
}
