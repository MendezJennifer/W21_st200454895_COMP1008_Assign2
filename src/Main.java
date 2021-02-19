public class Main
{
    public static void main(String[] args)
    {
        GroceryItem item1=new GroceryItem("carrots",4.79,"vegetables");
        GroceryItem item2=new GroceryItem("bread",2.89,"bread");

        Purchases shoppingCart = new Purchases();
        shoppingCart.addGroceryItem(item1);
        shoppingCart.addGroceryItem(item2);
    }
}
