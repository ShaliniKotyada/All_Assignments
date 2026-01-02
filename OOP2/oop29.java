import java.util.Scanner;
public class oop29 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum=0;

        for(int i=1;i<=5;i++){
            System.out.println("Enter String "+ i+":");
            String s= sc.next();
        

        try {
            sum+=Integer.parseInt(s);
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid Number");
        }
    }
    }
}
