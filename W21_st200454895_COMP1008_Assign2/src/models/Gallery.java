/** Class models.models.Gallery: blueprint for models.models.Gallery objects, composed of Artwork objects
 * COMP1008:Assignment 2
 * Author: Jennifer Mendez
 *Date: 01/April/2021
 *Time: 1:23 pm
 */

package models;

import java.util.ArrayList;
import java.util.Locale;

public class Gallery
{
    private ArrayList<Artwork> gallery;
    private Object ArtStatus;

    /**
     * Constructor: create instance of Gallery class and initialize it with all the Artwork objects
     */
    public Gallery()
    {
        gallery=new ArrayList<>();
    }

    public void addArtwork(Sculpture sculpture)
    {
        gallery.add(sculpture);
    }
    public void addArtwork(Painting painting)
    {
        gallery.add(painting);
    }
    public int countArtInventory()
    {
        return gallery.size();
    }

    public double calculateArtInventoryValue()
    {
        double totalArtValue=0;
        for(Artwork artwork:gallery)
            totalArtValue+=artwork.getArtPrice();
        return totalArtValue;
    }

    public ArrayList<Artwork> getArtByAuthor(String author)
    {
        author=author.toLowerCase();
        ArrayList<Artwork> artByAuthor=new ArrayList<>();
        for(Artwork artwork:gallery)
            if(artwork.getArtAuthor().toLowerCase().contains(author))
                artByAuthor.add(artwork);
        return artByAuthor;
    }


    public ArrayList<Artwork> getArtByCat(String cat)
    {
        ArrayList<Artwork> artByCat=new ArrayList<>();
        for (Artwork artwork:gallery)
            if (artwork.getArtCategory().equalsIgnoreCase(cat))
                artByCat.add(artwork);
        return artByCat;
    }

    public ArrayList<Artwork> getArtByDate(int date1, int date2)
    {
        ArrayList<Artwork> artByDate=new ArrayList<>();
        for(Artwork artwork:gallery)
            if(artwork.getArtCreationDate()>=date1 && artwork.getArtCreationDate()<=date2)
                artByDate.add(artwork);
        return artByDate;
    }

    public ArrayList<Artwork> getArtByStatus(String status)
    {
        status=status.substring(0,1).toUpperCase()+status.substring(1).toLowerCase();
        ArrayList<Artwork> artByStatus=new ArrayList<>();
        for(Artwork artwork:gallery)
            if(artwork.getArtStatus().equals(status))
                artByStatus.add(artwork);
        return artByStatus;
    }

    public String toString()
    {
        return String.format("We have %d artworks worth $%.2f",countArtInventory(),calculateArtInventoryValue());
    }


}
