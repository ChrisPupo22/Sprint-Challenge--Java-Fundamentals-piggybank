package piggybank; 

public class DimeFromAbstract extends AbstractMoney {

    public DimeFromAbstract(int amount) {

        super(amount);
        value = 0.10; 
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

