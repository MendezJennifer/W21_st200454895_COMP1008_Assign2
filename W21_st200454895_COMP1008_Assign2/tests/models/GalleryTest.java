/** Test for Gallery Class
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

class GalleryTest
{
    private Painting painting1;
    private Painting painting2;
    private Sculpture sculpture1;
    private Sculpture sculpture2;
    private Gallery gallery;
    private ArrayList<String> unchartedStatus;

    @BeforeEach
    void setUp()
    {
        painting1=new Painting(1,"LA KERMESSE OU NOCE AU VILLAGE","Pierre Paul Rubens", 1635, ArtCategory.Painting,10000000, ArtStatus.Sold,"oil on canvas", "landscape");
        painting2=new Painting(2,"A landscape with a sheperd and his flock","Pierre Paul Rubens", 1638, ArtCategory.Painting, 10004500, ArtStatus.Display,"oil on oak", "landscape");
        sculpture1=new Sculpture(3,"mercure volant","Jean de Bologne dit Giambologna",  1574, ArtCategory.Sculpture,100051, ArtStatus.Restoration,"Bronze", 1.80);
        sculpture2=new Sculpture(4,"abduction of a sabine woman","Jean de Bologne dit Giambologna",  1579, ArtCategory.Sculpture,100851, ArtStatus.Restoration, "marble", 4.10);
        gallery=new Gallery();
        gallery.addArtwork(painting1);
        gallery.addArtwork(painting2);
        gallery.addArtwork(sculpture1);
        gallery.addArtwork(sculpture2);
    }

    @Test
    void countArtInventory()
    {
        assertEquals(4,gallery.countArtInventory());
    }

    @Test
    void countArtInventoryEmpty()
    {
        Gallery gallery1=new Gallery();
        assertEquals(0,gallery1.countArtInventory());
    }
    @Test
    void calculateArtInventoryValue()
    {
        assertEquals(20205402.00, gallery.calculateArtInventoryValue(),0.001);
    }

    @Test
    void calculateArtInventoryValueEmpty()
    {
        Gallery gallery1=new Gallery();
        assertEquals(0,gallery1.calculateArtInventoryValue(),0.001);
    }

    @Test
    void getArtByAuthor()
    {
        ArrayList<Artwork> expResult= new ArrayList<>();
        expResult.add(painting1);
        expResult.add(painting2);

        assertEquals(expResult,gallery.getArtByAuthor("Rubens"));
    }

    @Test
    void getArtByCatPainting()
    {
        ArrayList<Artwork> expResult= new ArrayList<>();
        expResult.add(painting1);
        expResult.add(painting2);
        assertEquals(expResult, gallery.getArtByCat("Painting"));
    }

    @Test
    void getArtByCatSculpture()
    {
        ArrayList<Artwork> expResult= new ArrayList<>();
        expResult.add(sculpture1);
        expResult.add(sculpture2);
        assertEquals(expResult, gallery.getArtByCat("sculpture"));
    }

    @Test
    void getArtByCatEmpty()
    {
        ArrayList<Artwork> expResult= new ArrayList<>();
        assertEquals(expResult, gallery.getArtByCat("Book"));
    }

    @Test
    void getArtByDate()
    {
        ArrayList<Artwork> expResult= new ArrayList<>();
        expResult.add(painting1);
        expResult.add(painting2);
        assertEquals(expResult, gallery.getArtByDate(1634,1639));
    }

    @Test
    void getArtByDateEmpty()
    {
        ArrayList<Artwork> expResult= new ArrayList<>();
        assertEquals(expResult, gallery.getArtByDate(2012,2020));
    }

    @Test
    void getArtByStatus()
    {
        ArrayList<Artwork> expResult= new ArrayList<>();
        expResult.add(sculpture1);
        expResult.add(sculpture2);
        assertEquals(expResult, gallery.getArtByStatus("restoration"));
    }

    @Test
    void getArtByStatusEmpty()
    {
        ArrayList<Artwork> expResult= new ArrayList<>();
        assertEquals(expResult, gallery.getArtByStatus("vandalized"));
    }

    @Test
    void testToString()
    {
        assertEquals("We have 4 artworks worth $20205402.00", gallery.toString());
    }

    @Test
    void testToStringEmpty()
    {
        Gallery gallery1=new Gallery();
        assertEquals("We have 0 artworks worth $0.00", gallery1.toString());
    }
}