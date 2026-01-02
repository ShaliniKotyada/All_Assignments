 import java.util.*;
public class library42 {
   


    public static void main(String[] args){
        TreeSet<String> ts= new TreeSet<>((a,b)->a.length()==b.length()? a.compareTo(b): a.length()-b.length());
        ts.add("Java");
        ts.add("pyhton");
        System.out.println(ts);
    }
}
