import java.util.Scanner;

public class library21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks seperated by commas: ");
        String input  = sc.nextLine();

        double total=0;
        String[] marks= input.split(",");
        for(String m: marks){
            total+= Integer.parseInt(m.trim());
        }

        System.out.println("Total Marks: "+ total);
    }
}
