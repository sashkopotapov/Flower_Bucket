package Payment;

public class Cash implements Strategy{
    @Override
    public void Pay(double sum){

        System.out.println("Paying $" + Math.round(sum) +" by cash");
    }
}
