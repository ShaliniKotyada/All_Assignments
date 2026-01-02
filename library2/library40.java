import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class library40 {
    public static void main(String[] args) throws Exception{
        LinkedHashSet<String> set= new  LinkedHashSet<>();
        for(String f: new String[]{"names.txt", "names2.txt"}){
            BufferedReader br= new BufferedReader(new FileReader(f));
        
        String line;
            while ((line = br.readLine()) != null){
                set.add(line);
            }
            br.close();
        }
        set.forEach(System.out::println);
    }


    }

