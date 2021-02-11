import java.util.ArrayList;

public class Purchases
{
    private ArrayList<GroceryItem> shoppingCart;

    public Purchases()
    {
        shoppingCart=new ArrayList<>();

    }

    /**
     * This method will add a GroceryItem to the shopping cart
     * @param groceryItem
     */
    public void addGroceryItem(GroceryItem groceryItem)
    {
        shoppingCart.add(groceryItem);
    }
}
