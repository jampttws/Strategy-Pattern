package FlexibleCash;

public class CalculateTaxCA implements CalculateTax{

    @Override
    public double calculate(double purchase){
        purchase = purchase + (purchase*0.075);
        return purchase;
    }

}
