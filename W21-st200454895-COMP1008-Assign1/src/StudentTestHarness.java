/** Class StudentTestHarness: contains main method, creates Student objects based on Student class
 * COMP1008:Lab 2
 * Author: Jennifer Mendez
 *Date: 04/Feb/2021
 *Time: 10:23 pm
 */

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTestHarness
{
    public static void main(String[] args)
    {
        //Create Array list with student 1 interests
        ArrayList<String> newInterests=new ArrayList<>();
        newInterests.addAll(Arrays.asList("Cooking","Reading"));

        //Instantiate student 1
        Student student1= new Student("Jennifer","Mendez",200454895, newInterests);

        //Print student 1 information
        System.out.println("Student 1");
        System.out.println("Name: " +student1.getFName()+ " " + student1.getLName());
        System.out.println("Student Number: "+student1.getStudentNum());
        System.out.println("Interests: "+ newInterests);
    }
}
