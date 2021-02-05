import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

/** Class StudentTestHarness: contains main method, creates Student objects based on Student class
 * COMP1008:Lab 2
 * Author: Jennifer Mendez
 *Date: 04/Feb/2021
 *Time: 10:23 pm
 */


public class StudentTestHarness
{
    public static void main(String[] args)
    {
        Student student1= new Student("Jennifer","Mendez",200454895);
        System.out.println("Student 1");
        System.out.println("Name: " +student1.getFName()+ " " + student1.getLName());
        System.out.println("Student Number: "+student1.getStudentNum());
    }
}
