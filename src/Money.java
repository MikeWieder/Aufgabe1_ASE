/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mike-
 */
public class Money {

    final int full;
    final int cents;
    
    public Money(int full, int cents) {
        while(cents >= 100){
            cents = cents -100;
            full++;
        }
        while(cents < 0) {
            cents = cents +100;
            full--;
        }
        this.full = full;
        this.cents = cents;
//        System.out.println("You have created " + full + " Euros and " + cents + " cents");
    }
    
    public String toString() {
        return "You have " + full + " Euros and " + cents + " cents";
    }
}
