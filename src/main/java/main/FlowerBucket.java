package main;

import java.util.ArrayList;

public class FlowerBucket {
    public ArrayList<Flower> bucket;
    public double price;

    public FlowerBucket(){
        this.bucket = new ArrayList <Flower>();
    }
    public void addFlower(Flower flower){
        this.bucket.add(flower);
        this.price += flower.getPrice();
    }
    public double getPrice(){
       return this.price;
    }
    public void setPrice(double discount){
        this.price = discount * price;
    }

    public Integer flowerAmount(Flower flower){
        Class theClass = flower.getClass();
        int num = 0;
        for(Flower flow: bucket){
            if(flow.getClass() == theClass ){num++;}
        }
        return num;
    }
    public String toString(){

        String flower = "Bucket cntains:\n";
        flower += "Rose/s" + " - " + flowerAmount(new Rose(0," ",
                0, " ", " ", false)).toString()+"\n";
        flower += "Tulip/s" + " - " + flowerAmount(new Tulip(0," ",
                0, " ", " ", false)).toString()+"\n";
        flower += "Chamomile/s" + " - " + flowerAmount(new Chamomile(0," ",
                0, " ", " ", false)).toString()+"\n";

        return flower;
    }


}
