public class Basics11 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int length= (args.length >1)? Integer.parseInt(args[1]):num;
        System.out.println("num: "+num+" "+"Length: "+length);

    }
}
