public class ComplexTaxStrategy implements TaxStrategy{

    double defaultRate = 0.19;
    double reducedRate = 0.07;
    double taxRate = defaultRate;

    @Override
    public Money calculateTax(Invoice invoice) {
        Money tax = new Money(0,0);
        MoneyActions actions = new MoneyActions();
        for(LineItem i : invoice.itemList) {
            if("A".equals(i.taxType)) taxRate = reducedRate; else taxRate = defaultRate; 
           tax = actions.add(tax,actions.multiply(i.total,taxRate));
        }
        return tax;
    }
}
