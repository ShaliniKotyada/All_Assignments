class CounterUnderflowException extends Exception{
    public CounterUnderflowException(String message){
        super(message);
    }
}
class Counter{
    private int count;
    //
    public Counter(){
        this.count=0;
    }

    public Counter(int count) {
        this.count = count;
    }
    public void increment() {
        count++;
    }

     public void decrement() throws CounterUnderflowException {
        if (count > 0) {
            count--;
        } else {
            throw new CounterUnderflowException(
                "Counter cannot be decremented below zero"
            );
        }
    }

    public int getCount() {
        return count;
    }
}
public class OOP14 {
    public static void main(String[] args) {
       Counter c = new Counter(0);

        try {
            c.decrement();
        } catch (CounterUnderflowException e) {
            System.out.println(e.getMessage());
        }
    } 
    }
     

