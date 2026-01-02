import java.util.Scanner;

public class library25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";

        while (true) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            if (name.equals("END"))
                break;
            result += name + "-";
        }
        if (!result.isEmpty())
            result = result.substring(0, result.length() - 1);
        System.out.println("Names: " + result);
    }
}
