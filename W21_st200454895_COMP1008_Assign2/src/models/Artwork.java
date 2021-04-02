/** Class models.models.Artwork: blueprint for models.models.Artwork objects, contains: title, artAuthor, creationDate, category, price, status, image
 * COMP1008:Assignment 2
 * Author: Jennifer Mendez
 *Date: 01/April/2021
 *Time: 1:23 pm
 */

package models;
import javafx.scene.image.Image;

import java.text.NumberFormat;
import java.time.Year;
import java.util.ArrayList;
import java.util.Locale;


public class Artwork
{
    private int artID;
    private String artTitle,artAuthor;
    private ArrayList<String> artStatus;
    private int artCreationDate;
    private double artPrice;
    private Image artImage;

    public Artwork(int artID,String artTitle, String artAuthor, ArrayList<String> artStatus, int artCreationDate, double artPrice)
    {
        setArtID(artID);
        setArtTitle(artTitle);
        setArtAuthor(artAuthor);
        setArtCreationDate(artCreationDate);
        setArtPrice(artPrice);
        setArtStatus(artStatus);
        //setArtImage();
    }

    /**
     * Methos that ensures the artId is greater than zero
     * @param artID
     */
    public void setArtID(int artID)
    {
        if(artID<=0)
            throw new IllegalArgumentException("ID must be greater than zero.");
        this.artID=artID;
    }
    /**
     * Method that ensures the artTitle is at least 2 characters long and is in uppercase
     * @param artTitle
     */
    public void setArtTitle(String artTitle)
    {
        artTitle=artTitle.trim();
        if(artTitle.length()>=2)
            this.artTitle = artTitle.toUpperCase();
        else
            throw new IllegalArgumentException("Title must be at least two characters long.");
    }

    /**
     * Method that ensures the author name is at least 2 characters long and begins with an uppercase letter, and doesn't contain numeric characters
     * @param artAuthor
     */
    public void setArtAuthor(String artAuthor)
    {
        artAuthor=artAuthor.trim();
        if(artAuthor.length()>=2 && !artAuthor.matches(".*\\d.*"))
            this.artAuthor = artAuthor.substring(0,1).toUpperCase()+artAuthor.substring(1);
        else
            throw new IllegalArgumentException("Author name must be at least two characters long, and cannot contain numeric characters.");
    }

    /**
     * Method that will return a list of valid artwork categories
     * @return categories
     */
    public static ArrayList<String> obtainCategories()
    {
        ArrayList<String> categories=new ArrayList<>();
        categories.add("Painting");
        categories.add("Sculpture");

        return categories;
    }

    /**
     * Method that will return a list of valid artwork status
     * @return artStatus
     */
    public static ArrayList<String> obtainStatus()
    {
        ArrayList<String> status=new ArrayList<>();
        status.add("Sold");
        status.add("Display");
        status.add("Restoration");

        return status;
    }

    /**
     * Method that ensures the argument only contains valid status
     * @param status
     */
    public void setArtStatus(ArrayList<String> status)
    {
        ArrayList<String> validStatus=obtainStatus();
        for(String artStatus:status)
        {
            if (!validStatus.contains(artStatus))
                throw new IllegalArgumentException(artStatus + " is not valid. Please choose from the following list: "+validStatus);
        }
        this.artStatus = artStatus;
    }

    /**
     * Method that ensures the creation date cannot be set in the future
     * @param artCreationDate
     */
    public void setArtCreationDate(int artCreationDate)
    {
        if(artCreationDate > Year.now().getValue())
            throw new IllegalArgumentException("Creation date cannot be in the future.");
        this.artCreationDate = artCreationDate;
    }

    /**
     * Method that ensures the art price is greater than zero
     * @param artPrice
     */
    public void setArtPrice(double artPrice)
    {
        if(artPrice<=0)
            throw new IllegalArgumentException("Price must be greater than zero.");
        this.artPrice = artPrice;
    }

    /**
     * Method that uses the artID to establish the correct image to load
     */
    public void setArtImage()
    {
        String filePath=String.format("images/%d.jpg",artID);
        artImage=new Image(filePath);
    }

    public int getArtID()
    {
        return artID;
    }

    public String getArtTitle()
    {
        return artTitle;
    }

    public String getArtAuthor()
    {
        return artAuthor;
    }

    public ArrayList<String> getArtStatus()
    {
        return artStatus;
    }

    public int getArtCreationDate()
    {
        return artCreationDate;
    }

    public String getArtPrice()
    {
        return NumberFormat.getCurrencyInstance(Locale.CANADA).format(artPrice);
    }

    public Image getArtImage()
    {
        return artImage;
    }

}
