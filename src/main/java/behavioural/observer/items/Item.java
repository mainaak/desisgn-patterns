package behavioural.observer.items;

public abstract class Item {

    public int id;

    public int salesPrice;

    public abstract void instillAvailability();

    protected void removeAvailability() {
        salesPrice = Integer.MAX_VALUE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        return id == item.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
