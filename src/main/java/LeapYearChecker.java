import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год:");
        int inputYear = scanner.nextInt();

        if (isYearLeap(inputYear)) {
            System.out.printf("%d - високосный год", inputYear );

        } else {
            System.out.printf("%d - не високосный год", inputYear);
        }
    }

    private static boolean isYearLeap(int year) {
        return year % 4 == 0 || (year % 100 == 0 && year % 400 == 0);
    }
}