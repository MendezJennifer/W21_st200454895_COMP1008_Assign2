/** Test for Sculpture Class
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

class SculptureTest
{
    Sculpture sculpture;
    ArrayList<String> unchartedStatus;

    @BeforeEach
    void setUp()
    {
        unchartedStatus=new ArrayList<>();
        unchartedStatus.add("Display");

        sculpture=new Sculpture(2,"mercure volant","Jean de Bologne dit Giambologna", unchartedStatus, 1574, 100051, "Bronze", 1.80);
    }

    @Test
    void setSculptureMaterial()
    {
        sculpture.setSculptureMaterial("wood");
        assertEquals("Wood",sculpture.getSculptureMaterial());
    }

    @Test
    void setSculptureMaterialInvalidEmpty()
    {
        assertThrows(IllegalArgumentException.class,()->sculpture.setSculptureMaterial(""));
    }

    @Test
    void setSculptureMaterialInvalidNumbers()
    {
        assertThrows(IllegalArgumentException.class,()->sculpture.setSculptureMaterial("123wood"));
    }

    @Test
    void setSculptureMaterialInvalidNumbersEnd()
    {
        assertThrows(IllegalArgumentException.class,()->sculpture.setSculptureMaterial("wood35"));
    }

    @Test
    void setSculptureHeight()
    {
        sculpture.setSculptureHeight(2.67);
        assertEquals("2.67 m",sculpture.getSculptureHeight());
    }

    @Test
    void setSculptureHeightInvalid()
    {
        assertThrows(IllegalArgumentException.class,()->sculpture.setSculptureHeight(-12));
    }
}