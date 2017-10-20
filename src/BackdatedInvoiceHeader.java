
import java.time.LocalDateTime;
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
public class BackdatedInvoiceHeader extends InvoiceHeader {
    
    public BackdatedInvoiceHeader(LocalDateTime date, int invoiceNumber, Receiver receiver) {
        super(date, invoiceNumber, receiver);
    }
    
}
