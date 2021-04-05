/** Test for Artwork Class
 * COMP1008:Assignment 2
 * Author: Jennifer Mendez
 *Date: 01/April/2021
 *Time: 1:23 pm
 */

package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArtworkTest
{
    private Artwork artwork;

    @BeforeEach
    void setUp()
    {
        artwork=new Artwork(1,"LA KERMESSE OU NOCE AU VILLAGE","Pierre Paul Rubens", 1635,ArtCategory.Painting, 10000000,ArtStatus.Display);
    }

    @Test
    void setArtID()
    {
        artwork.setArtID(1);
        assertEquals(1,artwork.getArtID());

    }

    @Test
    void setArtIDInvalidID()
    {
        assertThrows(IllegalArgumentException.class,()->artwork.setArtID(0));
    }

    @Test
    void setArtTitle()
    {
        artwork.setArtTitle("la kermesse");
        assertEquals("LA KERMESSE",artwork.getArtTitle());
    }

    @Test
    void setArtTitleInvalidEmpty()
    {
        assertThrows(IllegalArgumentException.class,()->artwork.setArtTitle(""));
    }

    @Test
    void setArtAuthor()
    {
        artwork.setArtAuthor("pierre Paul Rubens");
        assertEquals("Pierre Paul Rubens",artwork.getArtAuthor());
    }

    @Test
    void setArtAuthorInvalidEmpty()
    {
        assertThrows(IllegalArgumentException.class,()->artwork.setArtAuthor(""));
    }

    @Test
    void setArtAuthorInvalidNumbers()
    {
        assertThrows(IllegalArgumentException.class,()->artwork.setArtAuthor("12Pierre Paul"));
    }

    @Test
    void setArtAuthorInvalidNumbersEnd()
    {
        assertThrows(IllegalArgumentException.class,()->artwork.setArtAuthor("Pierre Paul45"));
    }

    @Test
    void setArtCreationDate()
    {
        artwork.setArtCreationDate(1936);
        assertEquals(1936,artwork.getArtCreationDate());
    }

    @Test
    void setArtCreationDateInvalidFuture()
    {
        assertThrows(IllegalArgumentException.class,()->artwork.setArtCreationDate(2031));
    }

    @Test
    void setArtCategory()
    {
        assertEquals("Painting",artwork.getArtCategory());
    }

    @Test
    void setArtStatus()
    {
        assertEquals("Display",artwork.getArtStatus());
    }

    @Test
    void setArtPrice()
    {
        artwork.setArtPrice(1200000);
        assertEquals(1200000, artwork.getArtPrice());
    }

    @Test
    void setArtPriceInvalid()
    {
        assertThrows(IllegalArgumentException.class,()->artwork.setArtPrice(-15));
    }

}