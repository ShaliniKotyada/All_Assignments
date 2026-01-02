
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class library37 {
    public static void main(String[] args) throws Exception{
        DataOutputStream dos=new DataOutputStream(new FileOutputStream("Marks.data"));
        for(int i=1;i<=20;i++){
            dos.writeInt(i*2);
           
        }
         dos.close();
    }
}
