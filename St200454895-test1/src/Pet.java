/** Class Pet blueprint: Pet objects, contains:
 * Exam 1
 * Author: Jennifer Mendez
 *Date: 11/Fec/2021
 */


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
}


