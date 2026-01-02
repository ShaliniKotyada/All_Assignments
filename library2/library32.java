import java.util.Scanner;

public class library32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
         System.out.print("Enter number (0 to stop): ");

        while (true) {
           
            int n = sc.nextInt();
            if (n == 0) break;
            if (n > 0) sum += n;
        }
        System.out.println("Sum of positive numbers = " + sum);
    }
}