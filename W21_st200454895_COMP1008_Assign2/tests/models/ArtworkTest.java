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
    Artwork artwork;
    ArrayList<String> unchartedStatus;

    @BeforeEach
    void setUp()
    {
        unchartedStatus=new ArrayList<>();
        unchartedStatus.add("Display");

        artwork=new Artwork(1,"LA KERMESSE OU NOCE AU VILLAGE","Pierre Paul Rubens", unchartedStatus, 1635, 10000000);
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
    void setArtStatus()
    {
        assertEquals("Display",unchartedStatus.get(0));
    }

    @Test
    void setArtStatusInvalid()
    {
        ArrayList<String>wrongStatus=new ArrayList<>();
        wrongStatus.add("Stolen");
        assertThrows(IllegalArgumentException.class,()->artwork=new Artwork(1,"LA KERMESSE OU NOCE AU VILLAGE","Pierre Paul Rubens", wrongStatus, 1635, 10000000));
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
    void setArtPrice()
    {
        artwork.setArtPrice(1200000);
        assertEquals("$1,200,000.00", artwork.getArtPrice());
    }

    @Test
    void setArtPriceInvalid()
    {
        assertThrows(IllegalArgumentException.class,()->artwork.setArtPrice(-15));
    }

}