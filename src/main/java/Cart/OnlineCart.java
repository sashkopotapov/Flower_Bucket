package Cart;

import main.FlowerBucket;

public class OnlineCart implements Cart{
    @Override
    public void proceed(FlowerBucket fb, double discount) {
        fb.setPrice(discount);
    }


}
