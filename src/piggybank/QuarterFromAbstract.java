package piggybank;

public class QuarterFromAbstract extends AbstractMoney {

    public QuarterFromAbstract(String name, double amount) {

        super(name, amount);
    }

    @Override
    public double getValue() {

        return 1.00; 
    }

    @override
    public double getTotal(double amount) {

        return amount * 0.25; 
    }
}