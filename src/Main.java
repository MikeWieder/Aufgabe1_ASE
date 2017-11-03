
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mike-
 */
public class Main {
    
    public static void main(String[]args) {
        
        MoneyActions actions = new MoneyActions();
        
        Money m1 = new Money(10,00);
        Money m2 = new Money(29,66);
        Money m3 = new Money(79,129);
        
        InvoiceBuilder builder = new InvoiceBuilder();
//        builder.addLineItem(new LineItem(m1,"ABC",1,"A"));
//        builder.addLineItem(new LineItem(m1,"DEF",1,"B"));
//        builder.addLineItem(new LineItem(m1,"GHI",1,"B"));
//        builder.addLineItem(new LineItem(m1,"JKL",1,"A"));
        builder.addTaxStrategy(new SimpleTaxStrategy());

        Invoice invoice = null;
        try {
            invoice = builder.build();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(invoice.calcNetTotal());
        System.out.println(invoice.calcGrossTotal());



        //System.out.println(actions.multiply(m3,0.19));
//        Money m4 = new Money(12,888);
//        Money m5 = new Money (13,-347);
//        Money m6 = new Money(1871,87);
        
//        Money add = actions.add(m1,m2,m3);
//        Money mult = actions.multiply(m5, 2);
//        Money sub = actions.substrate(m1, m2);

//        System.out.println(actions.multiply(m6, 6865.86));

       /* InvoiceBuilder builder = new InvoiceBuilder();
        builder.addLineItem(m3, "Rick&Morty Season2", 2);
        builder.addLineItem(m1, "Pizza Hawaii", 5);
        Invoice i = builder.build();
        System.out.println(i.calcTotal()); */
        
    }
    
}
