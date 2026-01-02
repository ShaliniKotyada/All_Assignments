import java.util.Scanner;
public class Basics8 {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr= new int[5];

        System.out.println("Enter 5 numbers:");
        for(int i=0;i<5;i++){
             arr[i]= sc.nextInt();
        }
       System.out.println("Reverse order:");
        for(int i=4;i>=0;i--){
             System.out.println(arr[i]);
        }

        
     }
}
