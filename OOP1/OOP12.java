class InsufficientStockException extends Exception{
    public InsufficientStockException(String message){
    super("Insufficient Stock cannot sell");
    }
}

class Product {


    private int prod_id;
    private String prod_name;
    private double price;
    private int quantity_on_hand;

    // Default constructor
    public Product() {
        this.prod_id = 0;
        this.prod_name = "Unknown";
        this.price = 0.0;
        this.quantity_on_hand = 0;
    }

    // Constructor with id, name, price
    public Product(int prod_id, String prod_name, double price) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.price = price;
        this.quantity_on_hand = 0; // default
    }
    //// Constructor with all details
    public Product(int prod_id, String prod_name, double price, int quantity_on_hand) {
        this.prod_id= prod_id;
        this.prod_name= prod_name;
        this.price= price;
        this.quantity_on_hand= quantity_on_hand;
    }
    //init method
    public void init(int prod_id, String prod_name, double price, int quantity_on_hand) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.price = price;
        this.quantity_on_hand = quantity_on_hand;
    }

    // getNetPrice()
    public double getNetPrice() {
        return price + (price * 0.12);  // price + 12% tax
    }

    public void purchase() {
        quantity_on_hand += 1;
        System.out.println("Unit added");
    }

    public void sell() throws InsufficientStockException {
        if (quantity_on_hand>0) {
            quantity_on_hand -= 1;
            System.out.println( " A unit sold. Current stock: " + quantity_on_hand);
        } else {
            throw new InsufficientStockException("Cannot sell "+ prod_name);
        }
    }
}
public class OOP12 {
    public static void main(String[] args) {
        try{
        Product p= new Product(1, "box", 30, -2);
          p.sell();
        }
        catch(Exception e){
        System.out.println(e.getMessage());
        }
    
    }

}
