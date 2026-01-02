import java.nio.file.*;
import java.util.Scanner;

public class library45 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter file name: ");
            String fileName = sc.nextLine();

            Path path = Paths.get(fileName);
            String content= Files.readString(path);

            content= content.replaceAll("\\s+"," ");
            Files.write(path, content.getBytes());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

}
}
