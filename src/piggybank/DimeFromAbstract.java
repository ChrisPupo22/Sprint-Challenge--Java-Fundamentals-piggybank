package piggybank; 

public class DimeFromAbstract extends AbstractMoney {

    public DimeFromAbstract(String name, double amount) {

        super(name, amount);
    }

    @Override
    public double getValue() {

        return 0.10; 
    }

    @override
    public double getTotal(double amount) {

        return amount * 0.10; 
    }
}

