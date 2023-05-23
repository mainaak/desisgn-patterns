package behavioural.observer.items;

public class Perfume extends Item {

    public Perfume(int id, int salesPrice) {
        super.id = id;
        super.salesPrice = salesPrice;
    }

    @Override
    public void instillAvailability() {
        System.out.println(this + " is now available in stores for " + salesPrice);
    }
}
