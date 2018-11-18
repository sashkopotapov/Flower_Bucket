package Payment;

public class Cash implements Strategy{
    @Override
    public void Pay(double sum){
        System.out.println("Paying $" + sum +" by cash");
    }
}
