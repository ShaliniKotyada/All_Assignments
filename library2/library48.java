import java.io.BufferedReader;
import java.io.FileReader;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class library48 {
     public static void main(String[] args) throws Exception {
        TreeMap<String,String> map=new TreeMap<>();
        BufferedReader br=new BufferedReader(new FileReader("Customers.txt"));
        Pattern p=Pattern.compile("(\\w+)\\s+(\\d+)");
        String line;

        while((line=br.readLine())!=null){
            Matcher m=p.matcher(line);
            if(m.matches())
                map.put(m.group(1), m.group(2));
        }
        br.close();
        map.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
