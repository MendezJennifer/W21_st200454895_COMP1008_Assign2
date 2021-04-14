/** Class models.models.Gallery: blueprint for models.models.Gallery objects, composed of Artwork objects
 * COMP1008:Assignment 2
 * Author: Jennifer Mendez
 *Date: 01/April/2021
 *Time: 1:23 pm
 */

package models;

import java.util.ArrayList;

public class Gallery
{
    private ArrayList<Artwork> gallery;

    /**
     * Constructor: create instance of Gallery class and initialize it with all the Artwork objects
     */
    public Gallery()
    {
        gallery=new ArrayList<>();
    }

    /**
     * Method to add artworks(paintings and sculptures) to the Gallery
     * @param artwork
     */
    public void addArtwork(Artwork artwork)
    {
        gallery.add(artwork);
    }

    /**
     * Methos to get an Artwork from the gallery
     * @param index
     * @return
     */
    public Artwork getArtwork(int index)
    {
        return gallery.get(index);
    }

    /**
     * Method to count the number of artworks inside the gallery
     * @return
     */
    public int countArtInventory()
    {
        return gallery.size();
    }

    /**
     * This method will calculate the total value of the artwork inventory
     * @return
     */
    public double calculateArtInventoryValue()
    {
        double totalArtValue=0;
        for(Artwork artwork:gallery)
            totalArtValue+=artwork.getArtPrice();
        return totalArtValue;
    }

    /**
     * This method will return ArrayList of artworks with the same author
     * @param author
     * @return
     */
    public ArrayList<Artwork> getArtByAuthor(String author)
    {
        author=author.toLowerCase();
        ArrayList<Artwork> artByAuthor=new ArrayList<>();
        for(Artwork artwork:gallery)
            if(artwork.getArtAuthor().toLowerCase().contains(author))
                artByAuthor.add(artwork);
        return artByAuthor;
    }

    /**
     * This method will return an ArrayList of artworks with the same category
     * @param cat
     * @return
     */
    public ArrayList<Artwork> getArtByCat(String cat)
    {
        ArrayList<Artwork> artByCat=new ArrayList<>();
        for (Artwork artwork:gallery)
            if (artwork.getArtCategory().equalsIgnoreCase(cat))
                artByCat.add(artwork);
        return artByCat;
    }

    /**
     * This method will return an ArrayList of artworks with a creation date between date1 and date2
     * @param date1
     * @param date2
     * @return
     */
    public ArrayList<Artwork> getArtByDate(int date1, int date2)
    {
        ArrayList<Artwork> artByDate=new ArrayList<>();
        for(Artwork artwork:gallery)
            if(artwork.getArtCreationDate()>=date1 && artwork.getArtCreationDate()<=date2)
                artByDate.add(artwork);
        return artByDate;
    }

    /**
     * This method will return an ArrayList of artworks with the same status
     * @param status
     * @return
     */
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
