package FlexibleCash;

public class CalculateTaxThailand implements CalculateTax{

    @Override
    public double calculate(double purchase){
        purchase = purchase + (purchase*0.07);
        return purchase;
    }

}
