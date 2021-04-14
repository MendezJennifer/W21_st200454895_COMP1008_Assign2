/** Class models.models.Artwork: blueprint for models.models.Artwork objects, contains: title, artAuthor, creationDate, category, price, status, image
 * COMP1008:Assignment 2
 * Author: Jennifer Mendez
 *Date: 01/April/2021
 *Time: 1:23 pm
 */

package models;
import javafx.scene.image.Image;
import java.time.Year;

public class Artwork
{
    private int artID;
    private String artTitle,artAuthor;
    private int artCreationDate;
    public Object ArtCategory;
    private double artPrice;
    public Object ArtStatus;
    private Image artImage;

    public Artwork(int artID,String artTitle, String artAuthor, int artCreationDate, String ArtCategory,double artPrice,String ArtStatus)
    {
        setArtID(artID);
        setArtTitle(artTitle);
        setArtAuthor(artAuthor);
        setArtCreationDate(artCreationDate);
        setArtCategory(ArtCategory);
        setArtPrice(artPrice);
        setArtStatus(ArtStatus);
    }
    public Artwork(String artTitle, String artAuthor, int artCreationDate, double artPrice,String ArtStatus)
    {
        setArtTitle(artTitle);
        setArtAuthor(artAuthor);
        setArtCreationDate(artCreationDate);
        setArtPrice(artPrice);
        setArtStatus(ArtStatus);
    }

    /**
     * Method that ensures the artId is greater than zero
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
     * Method that ensures the author name is at least 2 characters long and begins with an uppercase letter
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
     * Method that ensures the argument only contains valid status
     * @param ArtStatus
     */
    public void setArtStatus(Object ArtStatus)
    {
        this.ArtStatus = ArtStatus.toString();
    }

    /**
     * Method that ensures the argument only contains valid categories
     * @param ArtCategory
     */
    public void setArtCategory(Object ArtCategory)
    {
        this.ArtCategory=ArtCategory.toString();
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

    public String getArtStatus()
    {
        return ArtStatus.toString();
    }

    public int getArtCreationDate()
    {
        return artCreationDate;
    }

    public String getArtCategory()
    {return ArtCategory.toString();}

    public double getArtPrice()
    {
        return artPrice;
    }

    public String toString()
    {
        return String.format("%s by %s",artTitle,artAuthor);
    }

}
