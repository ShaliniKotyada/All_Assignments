class InvalidFeeException extends Exception{
    public InvalidFeeException(String message) {
        super(message);
    }
}

class InvalidPaymentException extends Exception{
    public InvalidPaymentException(String message) {
        super(message);
    }
}

class Student{
    private int admin_no;
    private String stu_name;
    private String course_joined;
    private double fees_paid;
    // constructor
    public Student(int admin_no, String stu_name, String course_joined, double fees_paid)
    throws InvalidFeeException
    {
        this.admin_no=admin_no;
        this.stu_name=stu_name;
        this.course_joined=(course_joined==null)||(course_joined.isEmpty())? "JAVA" : course_joined;
        this.fees_paid=fees_paid;

        if (fees_paid < 0) {
            throw new InvalidFeeException("Fees paid cannot be negative");
        }

    }

    
    // constants
    public static final int JAVA_FEE=10000;
    public static final int PYTHON_FEE=7500;

    // methods
    // getTotalfee
    public double getTotalFee() {
        return course_joined.equalsIgnoreCase("JAVA") ? JAVA_FEE : PYTHON_FEE;
    }
    // getdue()
    public double getDue(){
        return getTotalFee()-fees_paid;
    }

    public double getFeePaid(){
        return fees_paid;
    }

    public void payment(double amount) throws InvalidPaymentException{
        if(amount<=0){
            throw new InvalidPaymentException("Payment amount must be valid");
        }
        fees_paid+=amount;
    }
}
public class OOP15 {
    public static void main(String[] args) {
        try {
            Student s= new Student(101, "Shalini", "", 3000);
            s.payment(-2000);
            System.out.println("Total Fee: "+ s.getTotalFee());
            System.out.println("Fee Paid: "+ s.getFeePaid());
            System.out.println("Due Amount:" + s.getDue());
        }
        catch (InvalidFeeException | InvalidPaymentException e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
