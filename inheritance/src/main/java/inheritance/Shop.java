package inheritance;


public class Shop extends Reviewable implements ReviewableInterface {
    public Shop (String name, int price) {
        super();
        this.name = name;
        this.price = price;
    }
}
