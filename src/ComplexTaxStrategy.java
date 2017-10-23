public class ComplexTaxStrategy implements TaxStrategy{

    int defaultRate = 19;
    int reducedRate = 7;
    int taxRate = defaultRate;

    @Override
    public Money calculateTax(Invoice invoice) {
        Money tax = new Money(0,0);
        MoneyActions actions = new MoneyActions();
        for(LineItem i : invoice.itemList) {
            if(i.taxType == "A") taxRate = reducedRate;
            actions.add(tax,actions.multiply(i.total,taxRate));
        }
        return tax;
    }
}
