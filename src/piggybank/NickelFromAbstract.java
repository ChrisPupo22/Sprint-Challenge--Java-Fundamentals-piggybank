package piggybank;

public class NickelFromAbstract extends AbstractMoney {

    public NickelFromAbstract(int amount) {

        super(amount);
        value = 0.05; 
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