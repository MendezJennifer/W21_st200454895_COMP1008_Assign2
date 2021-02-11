/** Class Pet blueprint: Pet objects, contains:  name, type, age, colour
 * Exam 1
 * Author: Jennifer Mendez
 * Student Number: 200454895
 *Date: 11/Fec/2021
 * Time: 11:13 AM
 */

import java.util.Arrays;
import java.util.List;

public class Pet
{
    private String name;
    private String type;
    private int age;
    private String colour;

    public Pet(String name, String type, int age, String colour)
    {
        setName(name);
        setType(type);
        setAge(age);
        setColour(colour);
    }

    //Getters
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getType()
    {
        return type;
    }

    public String getColour()
    {
        return colour;
    }

    //Setters with validation
    /**
     * Validates that name is at least 2 characters long
     * @param name
     */
    public void setName(String name)
    {
        name=name.trim();
        if(name.length()>=2)
            this.name = name;
        else
            throw new IllegalArgumentException("Name must be at least 2 characters long.");
    }

    /**
     * Validates that type is from a valid list of pet types
     * @param type
     */
    public void setType(String type)
    {
        type=type.toLowerCase();
         List<String> validPetTypes= Arrays.asList("dog", "cat", "bird", "reptile", "fish");
         if(validPetTypes.contains(type))
            this.type = type;
         else
             throw new IllegalArgumentException(type+ " is an invalid pet type, please select one of the following pet types: "+validPetTypes);
    }

    /**
     * Validates that age is between 0 and 60 years
     * @param age
     */
    public void setAge(int age)
    {
        if(age>=0 && age<=60)
            this.age = age;
        else
            throw new IllegalArgumentException("Pet age should be between 0 and 60 years.");
    }

    /**
     * Validates that color is from a valid list of colors
     * @param colour
     */
    public void setColour(String colour)
    {
        colour=colour.toLowerCase();
        List<String> validPetColours= Arrays.asList("yellow", "brown", "black", "blue", "red", "white", "grey");
        if(validPetColours.contains(colour))
            this.colour = colour;
        else
            throw new IllegalArgumentException(colour+" is an invalid colour, please select one of the following colours: "+validPetColours);
    }

    /**
     * Returns a sound based on the animal type
     * @return
     */
    public String speak()
    {
        type=type.toLowerCase();
        switch (type)
        {
            case "dog":
                return "woof woof";
            case "cat":
                return "meow meow";
            case "bird":
                return "chirp chirp";
            case "reptile":
                return "hiss";
            case "fish":
                return "<swimming sound>";
            default:
                return "Invalid pet";
        }
    }

    /**
     * Returns a move based on the animal type
     * @return
     */
    public String movesBy()
    {
        type=type.toLowerCase();
        switch (type)
        {
            case "dog":
            case "cat":
                return "walks or runs";
            case "bird":
                return "flies";
            case "reptile":
                return "slither or walk";
            case "fish":
                return "swim";
            default:
                return "Invalid pet";
        }
    }

    /**
     * Determines if pet has fur based on animal type
     * @return
     */
    public boolean hasFur()
    {
        return type.equalsIgnoreCase("dog") || type.equalsIgnoreCase("cat");
    }

    /**
     * Returns String with pet information
     * @return
     */
    public String toString()
    {
        return name +" is a " + age +" year(s) old "+ colour + " " + type;
    }


}


