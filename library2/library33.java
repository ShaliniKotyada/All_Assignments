import java.io.*;
import java.util.Scanner;
public class library33 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        FileWriter fw= new FileWriter("names.txt");

        while (true) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("END")) break;
            fw.write(name+"\n");
        }
        fw.close();
    }
    
}
