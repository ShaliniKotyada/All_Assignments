
import java.util.Random;


public class library19{
    public static void main(String[] args) {
        int[] arr= new int[10];

        Random r= new Random();
        int sum=0;

        for(int i=0;i<10;i++){
            arr[i] =r.nextInt(70);
            sum+= arr[i];
        }

        double avg = sum / 10.0;
        System.out.println("Average: " + avg);
        System.out.println("Elements greater than average:");

        for(int x : arr){
            if (x > avg)
                System.out.println(x);
        }
     }
        
    }
