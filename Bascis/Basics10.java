import java.util.Scanner;

public class Basics10 {

    static void displayCommonFactors(int[] arr){
        int mini = arr[0];
        for(int i: arr){
            mini = Math.min(mini, i);
        }

        for(int i=1;i<=mini;i++){

                boolean isCommon= true;
            for (int n : arr) {
                if (n % i != 0) {
                    isCommon = false;
                    break;
                }
            }

            if (isCommon) {
                System.out.print(i + " ");
            }
            }
        }
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        displayCommonFactors(arr);
}
}
