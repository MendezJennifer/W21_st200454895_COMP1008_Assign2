/** Test for Painting Class
 * COMP1008:Assignment 2
 * Author: Jennifer Mendez
 *Date: 01/April/2021
 *Time: 1:23 pm
 */

package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PaintingTest
{
    private Painting painting;

    @BeforeEach
    void setUp()
    {
        painting=new Painting(1,"LA KERMESSE OU NOCE AU VILLAGE","Pierre Paul Rubens", 1635, Painting.PAINTINGCAT,10000000, ArtStatus.Transit.toString(),"oil on canvas", "landscape");
    }


    @Test
    void setPaintingTechnique()
    {
        painting.setPaintingTechnique("chiaroscuro");
        assertEquals("Chiaroscuro",painting.getPaintingTechnique());
    }

    @Test
    void setPaintingTechniqueInvalidEmpty()
    {
        assertThrows(IllegalArgumentException.class,()->painting.setPaintingTechnique(""));
    }

    @Test
    void setPaintingTechniqueInvalidNumbers()
    {
        assertThrows(IllegalArgumentException.class,()->painting.setPaintingTechnique("133chiaroscuro"));
    }

    @Test
    void setPaintingTechniqueInvalidNumbersEnd()
    {
        assertThrows(IllegalArgumentException.class,()->painting.setPaintingTechnique("chiaroscuro34"));
    }

    @Test
    void setPaintingType()
    {
        painting.setPaintingType("illustration");
        assertEquals("Illustration",painting.getPaintingType());
    }

    @Test
    void setPaintingTypeInvalidEmpty()
    {
        assertThrows(IllegalArgumentException.class,()->painting.setPaintingType(""));
    }

    @Test
    void setPaintingTypeInvalidNumbers()
    {
        assertThrows(IllegalArgumentException.class,()->painting.setPaintingType("456illustration"));
    }

    @Test
    void setPaintingTypeInvalidNumbersEnd()
    {
        assertThrows(IllegalArgumentException.class,()->painting.setPaintingType("illustration567"));
    }
}