/** Class Student: blueprint for Student objects, contains: first and last name, and student number
 * Lab: Week 2
 * Author: Jennifer Mendez
 *Date: 28/Jan/2021
 *Time: 6:50 pm
 */

public class Student
{
    //State
    private String fName;
    private String lName;
    private int studentNumber;

    //Constructor (takes 3 arguments)
    public Student(String fName, String lName, int studentNumber)
    {
        //call the setter in the constructor, so it validates the value before allowing it to be created
        setFName(fName);
        setLName(lName);
        setStudentNumber(studentNumber);
    }

    public String getFName()
    {
        return fName;
    }

    /**
     * Method that validates that the argument is "Jennifer", the correct student fName
     * @param fName - String that represents the student's first name
     */
    public void setFName(String fName)
    {
        if(fName.equalsIgnoreCase("Jennifer"))
            this.fName=fName;
        else
            throw new IllegalArgumentException("Invalid first name, use: Jennifer");
    }

    public String getLName()
    {
        return lName;
    }

    /**
     * Method that validates that the argument is "Mendez", the correct student lName
     * @param lName - String that represents the student's last name
     */
    public void setLName(String lName)
    {
        if(lName.equalsIgnoreCase("Mendez"))
            this.lName=lName;
        else
            throw new IllegalArgumentException("Invalid last name, use: Mendez");
    }

    public int getStudentNumber()
    {
        return studentNumber;
    }

    /**
     * Method that validates that the argument is "200454895", the correct student number
     * @param studentNumber - String that represents the student's number
     */
    public void setStudentNumber(int studentNumber)
    {
        if(studentNumber==200454895)
            this.studentNumber = studentNumber;
        else
            throw new IllegalArgumentException("Invalid student number, use: 200454895");
    }

}
