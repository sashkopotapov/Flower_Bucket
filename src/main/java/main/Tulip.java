package main;

public class Tulip extends Flower {
    public boolean opened;
    public Tulip(Integer price, String color, Integer lengthOfStem, String odor,
                 String countryOfOrigin, boolean opened) {
        super(price, color, lengthOfStem, odor, countryOfOrigin);
        this.opened = opened;
    }
    public String toString(){
        return "main.Tulip/s";
    }
}
