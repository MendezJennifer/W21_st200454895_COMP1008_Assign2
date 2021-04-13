/** Class models.models.Painting: blueprint for models.models.Painting objects, extends Artwork class, contains technique and type
 * COMP1008:Assignment 2
 * Author: Jennifer Mendez
 *Date: 01/April/2021
 *Time: 1:23 pm
 */

package models;

public class Painting extends Artwork
{
    private String paintingTechnique,paintingType;

    public Painting(int artID, String artTitle, String artAuthor, int artCreationDate, String ArtCategory, double artPrice, String ArtStatus, String paintingTechnique, String paintingType) {
        super(artID, artTitle, artAuthor, artCreationDate, ArtCategory, artPrice, ArtStatus);
        setPaintingTechnique(paintingTechnique);
        setPaintingType(paintingType);
    }

    /**
     * Method that ensures all the paintings are classified under the Painting category
     * @param ArtCategory
     */
    public void setPaintingCategory(Object ArtCategory)
    {
        if(ArtCategory.equals("Painting"))
            this.ArtCategory=ArtCategory;
        else
            throw new IllegalArgumentException("Please select Painting as the category for this object");
    }

    /**
     * Method that ensures the painting technique is at least 2 characters long and begins with an uppercase letter, and doesn't contain numeric characters
     * @param paintingTechnique
     */
    public void setPaintingTechnique(String paintingTechnique)
    {
        paintingTechnique=paintingTechnique.trim();
        if(paintingTechnique.length()>=2 && !paintingTechnique.matches(".*\\d.*"))
            this.paintingTechnique = paintingTechnique.substring(0,1).toUpperCase()+paintingTechnique.substring(1);
        else
            throw new IllegalArgumentException("Painting technique must be at least two characters long, and cannot contain numeric characters.");
    }

    /**
     * Method that ensures the painting type is at least 2 characters long and begins with an uppercase letter, and doesn't contain numeric characters
     * @param paintingType
     */
    public void setPaintingType(String paintingType)
    {
        paintingType=paintingType.trim();
        if(paintingType.length()>=2 && !paintingType.matches(".*\\d.*"))
            this.paintingType = paintingType.substring(0,1).toUpperCase()+paintingType.substring(1);
        else
            throw new IllegalArgumentException("Painting type must be at least two characters long, and cannot contain numeric characters.");
    }

    public String getPaintingTechnique()
    {
        return paintingTechnique;
    }

    public String getPaintingType()
    {
        return paintingType;
    }
}
