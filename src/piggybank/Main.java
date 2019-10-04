package piggybank; 

import java.util.*;


public class Main {

    public static void main(String[] args) {

        //DOLLAR 
        DollarFromAbstract dollar = new DollarFromAbstract("Dollar", 1.00); 
        DollarFromAbstract bigDollar = new DollarFromAbstract("Dollar", 5.00); 

        //QUARTER
        QuarterFromAbstract quarter = new QuarterFromAbstract("Quarter", 1.00); 

        //DIME
        DimeFromAbstract dime = new DimeFromAbstract("Dime", 1.00); 
        DimeFromAbstract bigDime = new DimeFromAbstract("Dime", 7.00); 

        //NICKEL
        NickelFromAbstract nickel = new NickelFromAbstract("Nickel", 3.00); 
        
        //PENNY 
        PennyFromAbstract penny = new PennyFromAbstract("Penny", 10.00); 


        //PIGGY BANK CREATION 
        ArrayList<AbstractMoney> piggyBank = new ArrayList<>(); 
        piggyBank.add(dollar);
        piggyBank.add(bigDollar); 
        piggyBank.add(quarter);
        piggyBank.add(dime);
        piggyBank.add(bigDime);
        piggyBank.add(nickel);
        piggyBank.add(penny);

        System.out.println(piggyBank);
        
    }
}