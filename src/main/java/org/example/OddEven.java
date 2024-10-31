import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int oddCount = 0;
        int evenCount = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println(oddCount + " " + evenCount);
    }
}
