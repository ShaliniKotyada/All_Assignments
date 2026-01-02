import java.io.FileWriter;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class library46 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        Pattern p=Pattern.compile("[A-Za-z]+\\d+");
        TreeSet<String> set=new TreeSet<>();

        while(true){
            String s=sc.nextLine();
            if(s.equalsIgnoreCase("end")) break;
            if(p.matcher(s).matches()) set.add(s);
        }
        FileWriter fw=new FileWriter("Codes.txt");
        for(String s:set) fw.write(s+"\n");
        fw.close();
        sc.close();
    }
}

