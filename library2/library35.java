import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class library35 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filename: ");
        FileReader fr = new FileReader(sc.nextLine());

        //
        BufferedReader br= new BufferedReader(fr);

        String line;

        while((line=br.readLine())!=null){
            if(line.length()>5){
                System.out.println(line);
            }
        }
        br.close();
}
}
