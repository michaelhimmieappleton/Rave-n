package hws.hw5;

/**
 * Creates order of the wanted Item.
 *
 * @author Michael Appleton
 * @version 03-07-25
 */
public class Order {
    private int number;
    private Item item;

    /**
     * Constructor.
     *
     * @param number The quantity wanted.
     * @param item The wanted item.
     */
    public Order(int number, Item item) {
        this.number = number;
        this.item = new Item(item.getDescription(),
             item.getServes(), item.getPrice());
    }

    /**
     * Copy Constructor.
     *
     * @param other Creates alias.
     */
    public Order(Order other) {
        this(other.number, other.item);
    }

    public String getDescription() {
        return item.getDescription();
    }

    public int getNumber() {
        return number;
    }

    public double getPrice() {
        return item.getPrice() * number;
    }

    public int getServes() {
        return item.getServes() * number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Returns number of item ordered.
     *
     * @return The number of items order.
     */
    public String toString() {
        return String.format("%d orders of %s", number, item);
    }
}
