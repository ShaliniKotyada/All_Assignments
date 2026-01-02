import java.io.*;
import java.util.*;

public class library39 {
    public static void main(String[] args) throws Exception{
        TreeSet<String> set= new TreeSet<>();
        BufferedReader br= new BufferedReader(new FileReader("names.txt"));

        String line;
        while((line=br.readLine())!=null){
            set.add(line);
        }
        br.close();
        System.out.println(set);

    }
}
