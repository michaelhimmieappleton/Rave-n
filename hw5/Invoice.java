package hws.hw5;

import java.util.ArrayList;

/**
 * Creates invoice for order.
 *
 * @author Michael Appleton
 * @version 03-07-25
 */
public class Invoice {
    private ArrayList<Order> orders;

    /**
     * Constructor.
     *
     */
    public Invoice() {
        orders = new ArrayList<Order>();
    }

    /**
     * Add order to list.
     *
     * @param order The order.
     */
    public void addOrder(Order order) {
        orders.add(order);
    }


    /**
     * Returns the order of in invoice (unless its out of bounds).
     *
     * @param i The wanted index.
     * @return The order (or null if its out of bounds).
     */
    public Order getOrder(int i) {
        if (i >= 0 && i < orders.size()) {
            return orders.get(i);
        } else {
            return null;
        }
    }

    /**
     * Returns the price of the invoice.
     *
     * @return The price.
     */
    public double getPrice() {
        double totalCost = 0.0;
        for (Order order : orders) {
            totalCost += order.getPrice();
        }
        return totalCost;
    }

    /**
     * Gets the servings of invoice.
     *
     * @return The servings.
     */
    public int getServes() {
        if (orders.isEmpty()) {
            return 0;
        }
        int minServes = orders.get(0).getServes();
        for (Order order : orders) {
            int serves = order.getServes();
            if (serves < minServes) {
                minServes = serves;
            }
        }
        return minServes;
    }

    /**
     * Returns the number of orders in invoice.
     *
     * @return Number of invoices.
     */
    public int size() {
        return orders.size();
    }
}
