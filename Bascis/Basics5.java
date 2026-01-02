import java.util.Scanner;
public class Basics5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int sum=0;
        for(int i=1;i<=5;i++){
        System.out.println(" Enter number"+ i+ ":");
        sum+=sc.nextInt();

        }

        double average = sum/5.0;
        System.out.println(average);
    }
}
