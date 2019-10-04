package piggybank;

public class DollarFromAbstract extends AbstractMoney {

    public DollarFromAbstract(int amount) {

        super(amount);
        value = 1.00; 
    }

    @Override
    public double getValue() {

        return value; 
    }
}