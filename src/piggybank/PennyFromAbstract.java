package piggybank;


public class PennyFromAbstract extends AbstractMoney {

    public PennyFromAbstract(int amount) {

        super(amount);
        value = 0.01; 
    }

    @Override
    public double getValue() {

        return value; 
    }

    @override
    public double getTotal(int amount) {

        return amount * value; 
    }
}