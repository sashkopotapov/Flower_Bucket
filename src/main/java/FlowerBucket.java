import java.util.ArrayList;

public class FlowerBucket {
    public ArrayList<Flower> bucket;

    public FlowerBucket(){
        this.bucket = new ArrayList <Flower>();
    }
    public void addFlower(Flower flower){
        this.bucket.add(flower);
    }
    public double price(){
        double price  = 0.0;
        for(Flower flower: bucket){
            price += flower.getPrice();
        }
        return price;
    }
    public Integer flowerAmount(Flower flower){
        int num = 0;
        for(Flower flow: this.bucket){
            if(flow == flower){num++;}
        }
        return num;
    }
//    public String toString(){
//        String flower = "";
//        flower += "Rose/s" + "-" + flowerAmount(new Rose);
//        flower += "Tulip/s" + "-" + flowerAmount(new Tulip);
//        flower += "Chamomile/s" + "-" + flowerAmount(new Chamomile);
//
//        return flower;
//    }

}
