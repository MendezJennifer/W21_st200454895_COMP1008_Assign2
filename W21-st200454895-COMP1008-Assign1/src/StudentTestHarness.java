/** Class StudentTestHarness: contains main method, creates Student objects based on Student class
 * Lab: Week 2
 * Author: Jennifer Mendez
 *Date: 28/Jan/2021
 *Time: 6:50 pm
 */

public class StudentTestHarness
{
    public static void main(String[] args)
    {
        //Instantiate new Student object
        Student student1= new Student("Jennifer", "Mendez", 200454895 );

        System.out.println("Student 1 Information");
        System.out.printf("Name: %s, %s %n", student1.getFName(),student1.getLName());
        System.out.printf("Student Number: %d %n", student1.getStudentNumber());
    }
}

