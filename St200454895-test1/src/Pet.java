/** Class Pet blueprint: Pet objects, contains:
 * Exam 1
 * Author: Jennifer Mendez
 *Date: 11/Fec/2021
 */

import java.util.Arrays;
import java.util.List;

public class Pet
{
    private String name;
    private String type;
    private int age;
    private String colour;

    public Pet(String name, String type, int age, String colour) {
        setName(name);
        setType(type);
        setAge(age);
        setColour(colour);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public void setName(String name) {
        name=name.trim();
        if(name.length()>=2)
            this.name = name;
        else
            throw new IllegalArgumentException("Name must be at least 2 characters.");
    }

    public void setType(String type) {
        type=type.toLowerCase();
         List<String> validPetTypes= Arrays.asList("dog", "cat", "bird", "reptile", "fish");
         if(validPetTypes.contains(type))
            this.type = type;
         else
             throw new IllegalArgumentException(type+ " pet type is invalid, please select one of the following: "+validPetTypes);
    }

    public void setAge(int age) {
        if(age>=0 && age<=60)
            this.age = age;
        else
            throw new IllegalArgumentException("Pet age should be between 0 and 60 years.");
    }

    public void setColour(String colour) {
        colour=colour.toLowerCase();
        List<String> validPetColours= Arrays.asList("yellow", "brown", "black", "blue", "red", "white", "grey");
        if(validPetColours.contains(colour))
            this.colour = colour;
        else
            throw new IllegalArgumentException(colour+" colour is invalid, please select one of the following: "+validPetColours);
    }

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

    public String movesBy()
    {
        type=type.toLowerCase();
        switch (type)
        {
            case "dog":
                return "walks or runs";
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

    public boolean hasFur()
    {
        return type.equalsIgnoreCase("dog") || type.equalsIgnoreCase("cat");
    }

    public String toString()
    {
        return name +" is a " + age +" year(s) old "+ colour + " " + type;
    }


}


