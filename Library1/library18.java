import java.util.Random;
import java.util.Scanner;

public class library18 {
        public static void main(String[] args) {
        Random r =new Random();
        Scanner sc= new Scanner(System.in);

        int number=r.nextInt(25) + 1; // 1 to 25
        int attempts=3;

        while (attempts > 0) {
            System.out.print("Guess the number: ");
            int guess=sc.nextInt();

            if (guess==number) {
                System.out.println("You guessed it.");
                return;
            } else {
                attempts--;
                System.out.println("Wrong Guess!");
            }
        }
        System.out.println("Number was: " + number);
    }
}

