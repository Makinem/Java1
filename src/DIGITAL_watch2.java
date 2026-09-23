import java.util.Scanner;
public class DIGITAL_watch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int totalSecondsToday = n % 86400;
        int hours = totalSecondsToday / 3600;
        int minutes = (totalSecondsToday % 3600) / 60;
        int seconds = totalSecondsToday % 60;
        System.out.printf("%d:%02d:%02d%n", hours, minutes, seconds);
    }
}
