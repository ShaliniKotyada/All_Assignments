import java.util.Scanner;

public class library43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter PAN number");
        String pan=sc.nextLine();
        System.out.println(pan.matches("[A-Z]{5}[0-9]{4}[A-Z]")
                ?"Valid PAN":"Invalid PAN");
    }
}
