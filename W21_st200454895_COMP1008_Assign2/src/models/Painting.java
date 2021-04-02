/** Class models.models.Painting: blueprint for models.models.Painting objects, extends Artwork class, contains technique and type
 * COMP1008:Assignment 2
 * Author: Jennifer Mendez
 *Date: 01/April/2021
 *Time: 1:23 pm
 */

package models;

import java.util.ArrayList;

public class Painting extends Artwork
{
    private String paintingTechnique,paintingType;

    public Painting(int artID, String artTitle, String artAuthor, ArrayList<String> artStatus, int artCreationDate, double artPrice, String paintingTechnique, String paintingType) {
        super(artID, artTitle, artAuthor, artStatus, artCreationDate, artPrice);
        setPaintingTechnique(paintingTechnique);
        setPaintingType(paintingType);
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
