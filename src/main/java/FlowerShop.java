
import Cart.DiscoutDecorator;
import Cart.Cart;
import Cart.OnlineCart;
import Payment.CCard;
import Payment.Cash;
import Payment.Context;

public class FlowerShop {
    public static void main(String[] args) {
        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlower(new Rose(12,"Blue",
                35, "Smooth", "Netherlands", false));
        System.out.println(bucket.toString());
        Cart cart = new DiscoutDecorator(new OnlineCart());
        cart.proceed();
        Pay("cash", bucket.getPrice());
    }

    public static void Pay(String way, double amount){
        if(way == "cash"){
            Context context = new Context(new Cash());
            context.executeStrategy(amount);
        }else if(way == "ccard"){
            Context context = new Context(new CCard());
            context.executeStrategy(amount);
        }
    }
}
