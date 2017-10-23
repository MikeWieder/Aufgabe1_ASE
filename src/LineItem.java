/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mike-
 */
public final class LineItem {
    
    final Money single;
    Money total;
    final String desc;
    String taxType;
    int amount;
    
    public LineItem(Money single, String desc, int amount, String taxType) {
        this.single = single;
        this.desc = desc;
        this.amount = amount;
        this.taxType = taxType;
        calcTotal();
//        System.out.println("Total: " + total);
    }
    
    public void calcTotal() {
        MoneyActions actions = new MoneyActions();
//        return actions.multiply(new Money(single.full,single.cents), amount);
        total = actions.multiply(new Money(single.full,single.cents), amount);
    }
    
    
}
