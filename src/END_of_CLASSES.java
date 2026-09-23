import java.util.Scanner;
public class END_of_CLASSES{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int shortBreaks = n / 2;
        int longBreaks = (n - 1) / 2;
        int totalMinutes = n * 45 + shortBreaks * 5 + longBreaks * 15;
        int hours = 9 + totalMinutes / 60;
        int minutes = totalMinutes % 60;
        System.out.println(hours + " " + minutes);
    }
}