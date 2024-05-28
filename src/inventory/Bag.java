package inventory;

import java.util.ArrayList;
import java.util.List;

public class Bag{
    private final List<Items> items;

    public Bag() {
        this.items = new ArrayList<>();
    }

    public void addItem(Items item) {
        for (Items i : items) {
            if (i.getName().equals(item.getName())) {
                i.setQuantity(i.getQuantity() + item.getQuantity());
                return;
            }
        }
        items.add(item);
    }

    public List<Items> getItems() {
        return new ArrayList<>(items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Itens na bolsa:\n");
        for (Items item : items) {
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }
}