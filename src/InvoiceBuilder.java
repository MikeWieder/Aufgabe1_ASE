
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mike-
 */
public class InvoiceBuilder {
    
        ArrayList<LineItem> itemList = new ArrayList<>();

        public InvoiceBuilder() {
            
        }
        
        public void addLineItem(Money single, String desc, int amount) {
            itemList.add(new LineItem(single,desc,amount));
        }
        
        public Invoice build() {
            return new Invoice(itemList);
        }
    
}
