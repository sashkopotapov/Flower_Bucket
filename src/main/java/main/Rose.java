package main;

public class Rose extends Flower {

    public boolean spikes;

    public Rose(Integer price, String color, Integer lengthOfStem,
                String odor, String countryOfOrigin, boolean spikes) {
        super(price, color, lengthOfStem, odor, countryOfOrigin);
        this.spikes = spikes;

    }
    public String toString(){
        return "Rose/s";
    }


}
