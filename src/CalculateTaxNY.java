public class CalculateTaxNY implements CalculateTax{

    @Override
    public double calculate(double purchase){
        if (purchase > 100) purchase = purchase + (purchase*0.08);
        return purchase;
    }
}
