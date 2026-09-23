import java.util.Scanner;
public class DIGITAL_watch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int totalMinutesToday = n % 1440;
        int hours = totalMinutesToday / 60;
        int minutes = totalMinutesToday % 60;
        System.out.println(hours + " " + minutes);
    }
}
