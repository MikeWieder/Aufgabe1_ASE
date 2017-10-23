public class SimpleTaxStrategy implements TaxStrategy {

    int taxRate = 19;

    @Override
    public Money calculateTax(Invoice invoice) {
        Money tax = new Money(0,0);
        MoneyActions actions = new MoneyActions();
        for(LineItem i : invoice.itemList) {
            actions.add(tax,actions.multiply(i.total,taxRate));
        }
        return tax;
    }
}
