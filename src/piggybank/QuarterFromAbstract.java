package piggybank;

public class QuarterFromAbstract extends AbstractMoney {

    public QuarterFromAbstract(int amount) {

        super(amount);
        value = 0.25; 
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