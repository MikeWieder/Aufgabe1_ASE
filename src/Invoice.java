
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
    
    public Invoice(ArrayList<LineItem> itemList, InvoiceHeader header) {
        this.itemList = itemList;
        this.header = header;
    }
    
    public Money calcTotal() {
        MoneyActions action = new MoneyActions();
        Money inter = new Money(0,0);
        for(LineItem i : itemList) {
            inter = action.add(i.total,inter);
        }
        return inter;
    }
    
}
