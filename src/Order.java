import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Orderable> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(Orderable item) {
        items.add(item);
    }

    public double getTotalPrice() {
        return items.stream().mapToDouble(Orderable::getPrice).sum();
    }

    public void printOrderDetails() {
        for (Orderable item : items) {
            System.out.println(item.getDescription() + " - Цена: " + item.getPrice());
        }
        System.out.println("Итого: " + getTotalPrice());
    }
}