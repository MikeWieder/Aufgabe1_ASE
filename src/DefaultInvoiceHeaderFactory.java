
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
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
public class DefaultInvoiceHeaderFactory {
    
    public InvoiceHeader buildHeader(Receiver receiver) {
        Random random = new Random();
        LocalDateTime now = LocalDateTime.now();
        return new InvoiceHeader(now, random.nextInt(10000),receiver);
    }
    
}
