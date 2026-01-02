import java.util.Scanner;
public class Basics4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter day of the week(1-7):");
        int day= sc.nextInt();
        //
        System.out.println("Enter Number of hours worked:");
        int hours= sc.nextInt();
        sc.close();
        //
        int wages;

        wages= switch(day){
            case 1,2,3 -> 200;
            case 4, 5 -> 400;
            case 6 ->600;
            case 7 -> 700;
            default -> 0;
        
        };
        int totalWage= wages * hours;

        if(totalWage>2000){
            totalWage+= totalWage*0.10;
        }
        System.out.println("Total Wage: Rs "+ totalWage);

    }
}
