package piggybank; 

public abstract class AbstractMoney {

    private double amount; 
    private String name; 

    
    public AbstractMoney(String name, double amount) {

        this.amount = amount; 
        this.name = name; 
    }

    public double getAmount() {

        return amount; 
    }

    public String getName() {

        return name; 
    }

    public abstract double getValue();
    public abstract double getTotal(double amount);

    
    @Override
    public String toString() {

        return "Abstract Money{" + 
        "Name'" + name + '\'' + 
        ", Amount " + amount + 
        '}';  
    }
}