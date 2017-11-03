
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mike-
 */
public class Journal {
    
    HashMap invoiceJournal = new HashMap();
    
    public void addInvoice(Invoice invoice) {
        invoiceJournal.put(invoice.header.invoiceNumber,invoice);
    }
    
    public Invoice getInvoice(int invoiceNumber) {
        return (Invoice)invoiceJournal.get(invoiceNumber);
    }
    
}