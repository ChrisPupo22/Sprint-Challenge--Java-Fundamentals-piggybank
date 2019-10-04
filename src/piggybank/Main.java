package piggybank; 

import java.util.*;
import java.text.DecimalFormat;


public class Main {

    DecimalFormat fp = new DecimalFormat("$###,###.00"); 

    public static void main(String[] args) {

        //DOLLAR 
        DollarFromAbstract dollar = new DollarFromAbstract(1); 
        DollarFromAbstract bigDollar = new DollarFromAbstract(5); 

        //QUARTER
        QuarterFromAbstract quarter = new QuarterFromAbstract(1); 

        //DIME
        DimeFromAbstract dime = new DimeFromAbstract(1); 
        DimeFromAbstract bigDime = new DimeFromAbstract(7); 

        //NICKEL
        NickelFromAbstract nickel = new NickelFromAbstract(3); 
        
        //PENNY 
        PennyFromAbstract penny = new PennyFromAbstract(10); 
        
        //System.out.println(bigDollar.getTotal());

        //PIGGY BANK CREATION 
        ArrayList<AbstractMoney> piggyBank = new ArrayList<>(); 
        piggyBank.add(dollar);
        piggyBank.add(bigDollar); 
        piggyBank.add(quarter);
        piggyBank.add(dime);
        piggyBank.add(bigDime);
        piggyBank.add(nickel);
        piggyBank.add(penny);

        //INITIAL OUTPUT
        //System.out.println(piggyBank);

        //ClEANER OUTPUT
         
        System.out.println("***Clean Output***");
        piggyBank.forEach(m -> System.out.println(m));
        //piggyBank.forEach(m -> System.out.println("total: " + m.getTotal())); 

        //Tried to be fancy and figure it out in a 1 liner...failed miserably
        //double finalTotal = piggyBank.sort((m1, m2) -> m1.getTotal() + m2.getTotal());
        // System.out.println("final Total: " + finalTotal); 
        
        double finalTotal = 0;
            for(AbstractMoney m: piggyBank)
            {
                finalTotal = finalTotal + m.getTotal();
            }
        System.out.println("The piggy bank holds: $" + finalTotal + 0);
    }
}