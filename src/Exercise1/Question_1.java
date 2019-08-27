package Exercise1;
import java.util.Scanner;

public class Question_1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int size = scanner.nextInt();
        int sum = 0;
        for (int i=1; i<= size; i++){
            sum = sum + i;
        }
        System.out.println (sum);
    }
}




