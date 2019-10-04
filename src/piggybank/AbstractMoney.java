package piggybank; 

public abstract class AbstractMoney {

    protected int amount; 
    protected double value; 

     public AbstractMoney() {


    }
    
    public AbstractMoney(int amount) {

        this.amount = amount; 
    }

    public int getAmount() {

        return amount; 
    }

    public String getName() {

        return name; 
    }
    
    public abstract double getValue(); 

    public double getTotal() {

        return amount * value; 
    }
    
    @Override
    public String toString() {

        return "Abstract Money{" + 
        "Amount:'" + amount  + '\'' +  
        ", Value: " + value +
        '}';  
    }
}