
import java.time.LocalDateTime;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mike-
 */
public class BackdatedInvoiceHeaderFactory {
    
    public InvoiceHeader buildHeader(Receiver receiver) {
        Random random = new Random();
        LocalDateTime now = LocalDateTime.now();
        now.minusDays(10);
        return new InvoiceHeader(now, random.nextInt(10000),receiver);
    }
    
}
