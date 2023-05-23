package behavioural.observer.notifier;

import behavioural.observer.items.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemNotifier implements Notifier {

    private final List<Item> subscribers;

    private static volatile ItemNotifier itemNotifier;

    public boolean areItemsAvailable = true;

    public static ItemNotifier getInstance() {
        if (itemNotifier == null) {
            synchronized (ItemNotifier.class) {
                if (itemNotifier == null) itemNotifier = new ItemNotifier();
            }
        }
        return itemNotifier;
    }

    private ItemNotifier() {
        ArrayList<Item> list = new ArrayList<>();
        Notifier.DB.put("item", list);
        subscribers = list;
    }


    @Override
    public void subscribe(Item item) {
        subscribers.add(item);
    }

    @Override
    public void subscribe(Item... items) {
        for (Item item : items) this.subscribe(item);
    }

    @Override
    public void unsubscribe(int itemId) {
        subscribers.removeIf(item -> item.id == itemId);
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(Item::instillAvailability);
    }

    @Override
    public boolean areItemsAvailable() {
        if (!areItemsAvailable) return false;
        notifySubscribers();
        return true;
    }
}
