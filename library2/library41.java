import java.util.*;

class Circle implements Comparable<Circle>{
    int xr,yr,r;
    Circle(int xr,int yr, int r)
    {
        this.xr=xr;
        this.yr=yr;
        this.r=r;
    }

    public int compareTo(Circle c){
        return this.r- c.r;
    }

}


public class library41{
public static void main(String[] args) {
        HashSet<Circle> hs=new HashSet<>();
        TreeSet<Circle> ts=new TreeSet<>();

        Circle c1=new Circle(1,2,3);
        Circle c2=new Circle(1,2,3);

        hs.add(c1);
        hs.add(c2);
        ts.add(c1);
        ts.add(c2);

        System.out.println("HashSet size: "+hs.size());
        System.out.println("TreeSet size: "+ts.size());
    }
}