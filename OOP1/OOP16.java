/// Super class
class InvalidEmployeeException extends Exception {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}
class Employee{
    private int emp_id;
    private String emp_name;
    //
    public Employee(int emp_id, String emp_name) throws InvalidEmployeeException{
        

        if(emp_id<=0){
            throw new InvalidEmployeeException("emp_id invalid: "+emp_name);
        }

        if (emp_name == null || emp_name.isEmpty()) {
            throw new InvalidEmployeeException("Employee name cannot be empty");
        }

        this.emp_id=emp_id;
        this.emp_name=emp_name;
    }
}
// Sub class
class FactoryEmployee extends Employee{

    private int bus_no;
    private String emp_boards;

    public FactoryEmployee(int emp_id, String emp_name,int bus_no, String emp_boards) 
    throws InvalidEmployeeException{
        super(emp_id, emp_name);
        this.bus_no = bus_no;
        this.emp_boards = emp_boards;
    }

}
public class OOP16 {
    public static void main(String[] args) {
     try {
            FactoryEmployee fe=
                new FactoryEmployee(0, "Shalini", 12, "Main Gate");
            System.out.println("Factory Employee created successfully");
        } catch (InvalidEmployeeException e) {
            System.out.println("Error: " + e.getMessage());
        }   
    }
     
}
