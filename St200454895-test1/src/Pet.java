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
    private String color;

    public Pet(String name, int age, String type, String color) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.color = color;
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

    public String getColor() {
        return color;
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

    public void setColor(String color) {
        color=color.toLowerCase();
        List<String> validPetColors= Arrays.asList("yellow", "brown", "black", "blue", "red", "white", "grey");
        if(validPetColors.contains(color))
            this.color = color;
        else
            throw new IllegalArgumentException(color+" color is invalid, please select one of the following: "+validPetColors);
    }
}


