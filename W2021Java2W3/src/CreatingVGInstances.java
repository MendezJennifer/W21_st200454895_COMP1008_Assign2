/** Class CreatingVGInstances: contains main method, instantiates VideoGame objects based on VideoGame class
 * Java2: Week 3
 * Author: Jennifer Mendez
 *Date: 4/Feb/2021
 *Time: 10:50 AM
 */

import java.util.ArrayList;
import java.util.Arrays;

public class CreatingVGInstances
{
    public static void main(String[] args)
    {
        ArrayList<String> unchartedGenres = new ArrayList<>();
        unchartedGenres.addAll(Arrays.asList("Adventure","Puzzle"));

        VideoGame vGame1= new VideoGame("Uncharted",unchartedGenres, "M","PlayStation");

    }
}
