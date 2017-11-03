
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mike-
 */
public class Invoice {
    
    final ArrayList<LineItem> itemList;
    InvoiceHeader header;
    TaxStrategy taxStrategy;
    
    public Invoice(ArrayList<LineItem> itemList, InvoiceHeader header, TaxStrategy taxStrategy) {
        this.itemList = itemList;
        this.header = header;
        this.taxStrategy = taxStrategy;
    }
    
    public Money calcNetTotal() {
        MoneyActions action = new MoneyActions();
        Money inter = new Money(0,0);
        for(LineItem i : itemList) {
            inter = action.add(i.total,inter);
        }
        return inter;
    }

    public Money calcGrossTotal() {
        MoneyActions actions = new MoneyActions();
        Money netTotal = calcNetTotal();
        Money tax = taxStrategy.calculateTax(this);
        System.out.println(tax);
        return actions.add(netTotal, tax);
    }

}
