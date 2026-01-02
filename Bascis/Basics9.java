import java.util.Scanner;
public class Basics9 {

    static int findLargest(int[] arr){
        int max_n= arr[0];
        for(int i:arr){
            max_n = Math.max(i, max_n);
        }
        return max_n;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n= sc.nextInt();
        int[] arr= new int[n];

        System.out.println("Enter numbers:");
        for(int i=0;i<n;i++){
             arr[i]= sc.nextInt();
        }
        System.out.println("Largest number: "+ findLargest(arr));

    }
}
