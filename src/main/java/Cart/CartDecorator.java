package Cart;

public class CartDecorator implements Cart {
    protected Cart decoratedCart;

    public CartDecorator(Cart cartDecorated){
        this.decoratedCart = cartDecorated;
    }

    public void proceed(){
        decoratedCart.proceed();
    }
}
