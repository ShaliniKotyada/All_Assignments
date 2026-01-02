import java.util.Scanner;
public class Basics6 {
    
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number:");
    int n= sc.nextInt();
    //
    for(int i=n/2 ;i>=0;i--){
        if(n%i==0){
            System.err.println("Largest Factor is " +i);
            break;
        }
    }
    }
   
}
