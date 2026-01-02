import java.util.*;
class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return id + " " + name + " " + price;
    }
}

class SortByName implements Comparator<Product>{
    public int compare(Product p1, Product p2){
        return p1.name.compareTo(p2.name);
    }
}

class SortByPrice implements Comparator<Product>{
    public int compare(Product p1, Product p2){
        return Double.compare(p1.price, p2.price);
    }
}
public class oop28 {
    public static void main(String[] args) {
        List<Product> list= new ArrayList<>();
        list.add(new Product(1, "Pen", 10));
        list.add(new Product(1, "Pen", 20));
        
        Collections.sort(list, new SortByName());
        System.out.println("By Name");
        list.forEach(System.out::println);

        Collections.sort(list, new SortByPrice());
        System.out.println("By Price");
        list.forEach(System.out::println);


    }
}
