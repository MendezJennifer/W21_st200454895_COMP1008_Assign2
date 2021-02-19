import java.util.Arrays;
import java.util.List;

public class GroceryItem
{
    private String name;
    private double price;
    private String category;

    public GroceryItem(String name, double price, String category)
    {
        setName(name);
        setPrice(price);
        setCategory(category);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        if(name.length()>=2)
            this.name = name;
        else
            throw new IllegalArgumentException("Name must be at least 2 characters long.");
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        if (price>0 && price <=150)
            this.price = price;
        else
            throw new IllegalArgumentException("Price must be between 0-150 exclusive");
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        List<String> categories = Arrays.asList("meat","diary","eggs", "fruits","vegetables","herbs");
        if(categories.contains(category.toLowerCase()))
            this.category = category;
        else
            throw new IllegalArgumentException(category+" is an invalid category, please use: " + categories);
    }
}
