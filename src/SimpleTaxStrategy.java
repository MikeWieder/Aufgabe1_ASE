public class SimpleTaxStrategy implements TaxStrategy {

    double taxRate = 0.19;

    @Override
    public Money calculateTax(Invoice invoice) {
        Money tax = new Money(0,0);
        MoneyActions actions = new MoneyActions();
      /*  for(LineItem i : invoice.itemList) {
            actions.add(tax,actions.multiply(i.total,taxRate)); //Get NetSum from Invoice and multiply with taxRate, return Money Object
        }*/
        return actions.multiply(invoice.calcNetTotal(), taxRate);
        
    }
}
