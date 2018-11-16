public class Flower {
    double price;
    String color;
    Integer lengthOfStem;
    String odor;
    String countryOfOrigin;
    public Flower(Integer price, String color, Integer lengthOfStem, String odor,
                  String countryOfOrigin){
        this.price = price;
        this.color = color;
        this.lengthOfStem = lengthOfStem;
        this.odor = odor;
        this.countryOfOrigin = countryOfOrigin;
    }
    public double getPrice(){
        return this.price;
    }

//    public static void discountPrice(Float discount){
//
//    }
}
