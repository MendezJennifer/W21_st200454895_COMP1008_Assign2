package models;

import models.GroceryItem;

import java.util.ArrayList;

public class Purchases
{
    private ArrayList<GroceryItem> shoppingCart;

    public Purchases()
    {
        shoppingCart=new ArrayList<>();

    }

    /**
     * This method will add a models.GroceryItem to the shopping cart
     * @param groceryItem
     */
    public void addGroceryItem(GroceryItem groceryItem)
    {
        shoppingCart.add(groceryItem);
    }

    /**
     * This method will return the total price of all purchases
     * @return
     */
    public double getTotalPrice()
    {
        double totalPrice=0;
        for(GroceryItem groceryItem:shoppingCart)
            totalPrice+= groceryItem.getPrice();

        return totalPrice;
    }
}
