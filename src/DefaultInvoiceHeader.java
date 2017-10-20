
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
public class DefaultInvoiceHeader {
    
    Date date;
    int invoiceNumber;
    Receiver receiver;
    
    public DefaultInvoiceHeader(Date date, int invoiceNumber, Receiver receiver) {
        this.date = date;
        this.invoiceNumber = invoiceNumber;
        this.receiver = receiver;
    }
    
}
