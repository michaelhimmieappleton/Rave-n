package hws.hw5;

/**
 * Class for Items, their price, name, description, etc.
 *
 * @author Michael Appleton
 * @version 03-07-25
 */
public class Item {
    private double price;
    private int serves;
    private String description;

    /**
     * The Constructor.
     *
     * @param description Description of the food.
     * @param serves The amount of people it serves.
     * @param price The price of said food.
     */
    public Item(String description, int serves, double price) {
        this.description = description;
        this.serves = serves;
        this.price = price;
    }

    /**
     * Copy Constructor.
     *
     * @param other Creates alias.
     */
    public Item(Item other) {
        this(other.description, other.serves, other.price);
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getServes() {
        return serves;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setServes(int serves) {
        this.serves = serves;
    }

    /**
     * Returns a string and format with description, price, and servings.
     *
     * @return The formatted description, price, and servings.
     */
    public String toString() {
        return String.format("%s for %d at $%5.2f", description, serves, price);
    }
}
