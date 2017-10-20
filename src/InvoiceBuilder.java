
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
        InvoiceHeader header;

        public InvoiceBuilder() {
            
        }
        
        public void addLineItem(Money single, String desc, int amount) {
            itemList.add(new LineItem(single,desc,amount));
        }
        
        public void addHeader(InvoiceHeader header) {
            this.header = header;
        }
        
        public Invoice build() {
            return new Invoice(itemList, header);
        }
    
}
