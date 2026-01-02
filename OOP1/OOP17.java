

class InvalidProductException extends Exception {
    public InvalidProductException(String message) {
        super(message);
    }
}

class BaseProduct{
    protected  String name;
    protected  double base_price;
    //
    public BaseProduct(String name, double base_price) throws InvalidProductException{
        if (name == null || name.isEmpty()) {
            throw new InvalidProductException("Product name cannot be empty");
        }
        if (base_price < 0) {
            throw new InvalidProductException("Base price cannot be negative");
        }
        this.name= name;
        this.base_price= base_price;
    }
    public double getNetPrice() {
        return base_price;
    }

    public void setPrice(double price) throws InvalidProductException{
        if(price<0){
            throw new InvalidProductException("Pricecannot be negative for product: "
            +name);
        }
        this.base_price = price;
    }
    
    public void print() {
        System.out.println("Product: " + name + ", Price: " + base_price);
    }
}

class ImportedProducts extends BaseProduct{
    private double importDuty;

        public ImportedProducts(String name, double base_price, double importDuty)
        throws InvalidProductException {
        super(name, base_price);
        this.importDuty = importDuty;
    }

    @Override
    public double getNetPrice() {
        return base_price + importDuty;
    }

    public void setImportDuty(double duty) {
        this.importDuty = duty;
    }
}

// DiscountedProducts
class DiscountedProducts extends BaseProduct{
    private double discount_rate;

        public DiscountedProducts(String name, double base_price, double discount_rate) 
        throws InvalidProductException{
        super(name, base_price);
        this.discount_rate = discount_rate;
    }

    @Override
    public double getNetPrice() {
        return base_price - (base_price* discount_rate /100);
    }

    public void setDiscountRate(double rate) {
        this.discount_rate = rate;
    }
}
public class OOP17 {
    public static void main(String[] args) {
        try {
            BaseProduct p1= new BaseProduct("Pen", 20);
            ImportedProducts ip= new ImportedProducts("Laptop", 50000, 5000);
            DiscountedProducts dp= new DiscountedProducts("Book", 300, 10);

            p1.print();
            ip.print();
            dp.print();
            p1.setPrice(-98);

        } catch (InvalidProductException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
