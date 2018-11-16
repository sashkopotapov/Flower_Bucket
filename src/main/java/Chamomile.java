public class Chamomile extends Flower {
    public boolean medical;
    public Chamomile(Integer price, String color, Integer lengthOfStem, String odor,
                     String countryOfOrigin, boolean medical) {
        super(price, color, lengthOfStem, odor, countryOfOrigin);
        this.medical = medical;
    }
    public String toString(){
        return "Chamomile/s";
    }
}
