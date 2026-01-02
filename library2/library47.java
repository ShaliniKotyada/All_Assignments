import java.io.*;
public class library47 {
    


    public static void main(String[] args) throws Exception {
        File dir=new File(".");
        for(File f: dir.listFiles()){
            if(f.isFile() && new String(java.nio.file.Files.readAllBytes(f.toPath()))
                    .contains("Java"))
                System.out.println(f.getName());
        }
    }
}


