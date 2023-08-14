import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize;
        System.out.println("Please input array size > 0:");
        if (scanner.hasNextInt())
        {
            arrSize = scanner.nextInt();
        }
        else
        {
            System.out.println("Incorrect input.");
            return;
        }
        if (arrSize <= 0)
        {
            System.out.println("Incorrect input.");
            return;

        }

    }
}
