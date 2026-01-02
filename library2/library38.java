import java.nio.file.*;
public class library38 {
    public static void main(String[] args) throws Exception{
        Path p= Paths.get("names.txt");
        Files.write(p, Files.readString(p).toUpperCase().getBytes());
    }
}
