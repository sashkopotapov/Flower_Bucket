package Cart;

public class DiscoutDecorator extends CartDecorator {
    public DiscoutDecorator(Cart decoratedCart) {
        super(decoratedCart);
    }

    @Override
    public void proceed() {
        decoratedCart.proceed();
        setDiscount(decoratedCart);
    }

    private void setDiscount(Cart decoratedCart){
        System.out.println("Dicount equal - 20%");
    }

}

