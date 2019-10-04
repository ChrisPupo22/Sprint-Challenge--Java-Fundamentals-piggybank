package piggybank;

public class DollarFromAbstract extends AbstractMoney {

    public DollarFromAbstract(String name, double amount) {

        super(name, amount);
    }

    @Override
    public double getValue() {

        return 1.00; 
    }

    @override
    public double getTotal(double amount) {

        return amount * 1.00; 
    }
}