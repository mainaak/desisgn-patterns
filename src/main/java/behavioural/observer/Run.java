package behavioural.observer;

import behavioural.observer.items.Item;
import behavioural.observer.items.Perfume;
import behavioural.observer.notifier.Notifier;

public class Run {

    public static void main(String[] args) {
        Notifier notifier = Notifier.getInstance("item");
        Item perfume1 = new Perfume(1752, 500);
        System.out.println("Current price of perfume 1: " + perfume1.salesPrice);
        Item perfume2 = new Perfume(1232, 150);
        System.out.println("Current price of perfume 2: " + perfume2.salesPrice);
        Item perfume3 = new Perfume(1, 1150);
        System.out.println("Current price of perfume 3: " + perfume3.salesPrice);
        Item perfume4 = new Perfume(72, 999);
        System.out.println("Current price of perfume 4: " + perfume4.salesPrice);
        notifier.subscribe(perfume1, perfume2, perfume3, perfume4);
        notifier.unsubscribe(1);
        notifier.areItemsAvailable();
    }
}
