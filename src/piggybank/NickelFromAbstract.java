package piggybank;

public class NickelFromAbstract extends AbstractMoney {

    public NickelFromAbstract(String name, double amount) {

        super(name, amount);
    }

    @Override
    public double getValue() {

        return 0.05; 
    }

    @override
    public double getTotal(double amount) {

        return amount * 0.05; 
    }
}