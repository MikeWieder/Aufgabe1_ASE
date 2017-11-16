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
    
    Money total;
    String taxType;
    int amount;
    Article article;
    
    public LineItem(Money single, String desc, int amount, String taxType, Article article) {
        this.article = article;
        this.amount = amount;
        this.taxType = taxType;
        calcNetTotal();
//        System.out.println("Total: " + total);
    }
    
    public void calcNetTotal() {
        MoneyActions actions = new MoneyActions();
//        return actions.multiply(new Money(single.full,single.cents), amount);
        total = actions.multiply(new Money(article.price.full,article.price.cents), amount);
    }
    
    
}
