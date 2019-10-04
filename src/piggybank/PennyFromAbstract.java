package piggybank;


public class PennyFromAbstract extends AbstractMoney {

    public PennyFromAbstract(String name, double amount) {

        super(name, amount);
    }

    @Override
    public double getValue() {

        return 0.01; 
    }

    @override
    public double getTotal(double amount) {

        return amount * 0.01; 
    }
}