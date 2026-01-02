import java.io.FileReader;
import java.util.Scanner;

public class library34 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filename: ");
        FileReader fr = new FileReader(sc.nextLine());

        int lc=0, uc=0, d=0;
        int ch;
        while((ch=fr.read())!=-1){
            if(Character.isUpperCase(ch)) uc++;
            else if(Character.isLowerCase(ch)) lc++;
            else if(Character.isDigit(ch)) d++;
        }

        fr.close();
        System.out.println("upperCase: "+uc+" "+"LowerCase: "+lc+" "+"Digits: "+d);
}
}
