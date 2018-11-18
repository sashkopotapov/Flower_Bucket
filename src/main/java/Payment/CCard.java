package Payment;

public class CCard implements Strategy{
    @Override
    public void Pay(double sum){
        System.out.println("Paying $" + sum +" by credit card");
    }
}
