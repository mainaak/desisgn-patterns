package behavioural.observer.notifier;

import behavioural.observer.items.Item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Notifier {

    static Notifier getInstance(String category) {
        if (category.equals("item")) return ItemNotifier.getInstance();
        throw new IllegalArgumentException("This category does not exist.");
    }

    Map<String, List<Item>> DB = new HashMap<>();

    void subscribe(Item item);

    void subscribe(Item ...items);

    void unsubscribe(int itemId);

    void notifySubscribers();

    boolean areItemsAvailable();
}
