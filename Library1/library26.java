
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class library26 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Enter starting date:");

        LocalDate start= LocalDate.parse(sc.nextLine(), df);

        System.out.println("Enter starting date:");

        LocalDate end= LocalDate.parse(sc.nextLine(), df);
        long days = ChronoUnit.DAYS.between(start, end);
        System.out.println("Number of days: " + days);
    }
}
