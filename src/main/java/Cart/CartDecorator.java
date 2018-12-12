package Cart;

import main.FlowerBucket;

public abstract class CartDecorator implements Cart {
    protected Cart decoratedCart;

    public CartDecorator(Cart cartDecorated){
        this.decoratedCart = cartDecorated;
    }

    public void proceed(FlowerBucket bucket, double discount){
        decoratedCart.proceed(bucket, discount);
    }


}
