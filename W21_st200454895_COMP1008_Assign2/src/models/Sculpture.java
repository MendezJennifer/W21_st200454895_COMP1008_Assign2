/** Class models.models.Sculpture: blueprint for models.models.Sculpture objects, extends Artwork class, contains material and height
 * COMP1008:Assignment 2
 * Author: Jennifer Mendez
 *Date: 01/April/2021
 *Time: 1:23 pm
 */

package models;

public class Sculpture extends Artwork
{
    private String sculptureMaterial;
    private double sculptureHeight;

    public Sculpture(int artID, String artTitle, String artAuthor, int artCreationDate, String ArtCategory, double artPrice, String ArtStatus, String sculptureMaterial, double sculptureHeight) {
        super(artID, artTitle, artAuthor, artCreationDate, ArtCategory, artPrice, ArtStatus);
        setSculptureMaterial(sculptureMaterial);
        setSculptureHeight(sculptureHeight);
    }

    /**
     * Method that ensures all the sculptures are classified under the Sculpture category
     * @param ArtCategory
     */
    public void setSculptureCategory(Object ArtCategory)
    {
        if(ArtCategory.equals("Sculpture"))
            this.ArtCategory=ArtCategory;
        else
            throw new IllegalArgumentException("Please select Sculpture as the category for this object");
    }

    /**
     * Method that ensures the sculpture material is at least 2 characters long and begins with an uppercase letter, and doesn't contain numeric characters
     * @param sculptureMaterial
     */
    public void setSculptureMaterial(String sculptureMaterial)
    {
        sculptureMaterial=sculptureMaterial.trim();
        if(sculptureMaterial.length()>=2 && !sculptureMaterial.matches(".*\\d.*"))
            this.sculptureMaterial = sculptureMaterial.substring(0,1).toUpperCase()+sculptureMaterial.substring(1);
        else
            throw new IllegalArgumentException("Sculpture material must be at least two characters long, and cannot contain numeric characters.");
    }

    /**
     * Method that ensures sculpture height is greater than zero
     * @param sculptureHeight
     */
    public void setSculptureHeight(double sculptureHeight)
    {
        if(sculptureHeight<=0)
            throw new IllegalArgumentException("Sculpture height must be greater than zero.");
        this.sculptureHeight = sculptureHeight;
    }

    public String getSculptureMaterial()
    {
        return sculptureMaterial;
    }

    public double getSculptureHeight()
    {
        return sculptureHeight;
        //return String.format("%.2f m",sculptureHeight);
    }
}
