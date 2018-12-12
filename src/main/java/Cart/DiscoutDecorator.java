package Cart;

import main.FlowerBucket;

public class DiscoutDecorator extends CartDecorator {
    public DiscoutDecorator(Cart decoratedCart) {
        super(decoratedCart);
    }

    @Override
    public void proceed(FlowerBucket bucket, double discount) {
        System.out.println("Original price - " + bucket.getPrice());
        decoratedCart.proceed(bucket, discount);
        setDiscount(decoratedCart);
        System.out.println("Final price - " + Math.round(bucket.getPrice()));
    }

    private void setDiscount(Cart decoratedCart){

        System.out.println("Standart dicount equals - 5%");

    }

}

