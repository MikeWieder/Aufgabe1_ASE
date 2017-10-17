
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
public class MoneyActions {
    
    public Money add(Money ... moneyList) {
        int memFull = 0;
        int memCents = 0;
        for(Money m:moneyList) {
            memFull += m.full;
            memCents += m.cents;
        }
        return new Money(memFull,memCents); 
    }
    
    public Money substrate(Money m1, Money m2) {
        return new Money(m1.full - m2.full, m1.cents - m2.cents);
    }
    
    public Money multiply(Money m, int f) {
        return new Money(m.full*f,m.cents*f);
    }
    
    public Money multiply(Money m, double f) {
        int fi = (int)f;
        double fRest = f - (double)fi;
        System.out.println((int)(m.cents*f));
        return new Money((int)(m.full*fi),(int)(m.cents*f) + (int)((m.full*fRest)*100));
    }
}
