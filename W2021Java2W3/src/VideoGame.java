/** Class VideoGame: blueprint for VideoGame objects, contains: name, genre, ageRating, console
 * Java2: Week 3
 * Author: Jennifer Mendez
 *Date: 4/Feb/2021
 *Time: 10:50 AM
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VideoGame
{
    private String name;
    private ArrayList<String> genre;
    private String ageRating;
    private String console;

    public VideoGame(String name, ArrayList<String> genre, String ageRating, String console)
    {
        setName (name);
        setGenre (genre);
        setAgeRating (ageRating);
        setConsole (console);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        if (name.length()>=2)
            this.name = name;
        else
            throw new IllegalArgumentException("Name must be longer than 2 characters");
    }

    public ArrayList<String> getGenre()
    {
        return genre;
    }

    /**
     * This method will return a list of all known genres
     * @return
     */
    public static ArrayList<String> getAllGenres()
    {
        ArrayList<String> genres = new ArrayList<>();
        genres.add("Horror");
        genres.add("FPS");
        genres.add("Puzzle");
        genres.add("Sports");
        genres.add("Adventure");
        genres.add("Point and Click");
        genres.add("4x Strategy");
        return genres;
    }

    /**
     * This will validate that the argument contains genres from a  recognized list of valid genres
     * @param genres
     */
    public void setGenre(ArrayList<String> genres)
    {
        ArrayList<String> validGenres=getAllGenres();
        for(String genre: genres)
        {
            if (!validGenres.contains(genre))
                throw new IllegalArgumentException(genre+" is not valid. Valid options are: "+validGenres);
        }
        this.genre = genres;
    }

    public String getAgeRating()
    {
        return ageRating;
    }

    public void setAgeRating(String ageRating)
    {
        List<String> ageRatingValues= Arrays.asList("E","M","18+","T","R","13+","E10+","G");
        if (ageRatingValues.contains(ageRating))
            this.ageRating = ageRating;
        else
            throw new IllegalArgumentException(ageRating + " is not valid. Options are: "+ageRatingValues);
    }

    public String getConsole()
    {
        return console;
    }

    public void setConsole(String console)
    {
        List<String> consoleNames = Arrays.asList("GameBoy","PlayStation","Sega","PC");
        if(consoleNames.contains(console))
            this.console = console;
        else
            throw new IllegalArgumentException(console+" is not valid. Options are: "+consoleNames);
    }
}

