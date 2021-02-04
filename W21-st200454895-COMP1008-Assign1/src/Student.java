/** Class Student: blueprint for Student objects, contains: first and last name, and student number
 * Lab: Week 2
 * Author: Jennifer Mendez
 *Date: 28/Jan/2021
 *Time: 6:50 PM
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
     * Method that validates that the first name is longer than 2 characters
     * @param fName - String that represents the student's first name
     */
    public void setFName(String fName)
    {
        if(fName.length()<=2)
            this.fName=fName;
        else
            throw new IllegalArgumentException("First name must be longer than 2 characters");
    }

    public String getLName()
    {
        return lName;
    }

    /**
     * Method that validates that the last name is longer than 2 characters
     * @param lName - String that represents the student's last name
     */
    public void setLName(String lName)
    {
        if(lName.length()<=2)
            this.lName=lName;
        else
            throw new IllegalArgumentException("Last name must be longer than 2 characters");
    }

    public int getStudentNumber()
    {
        return studentNumber;
    }

    /**
     * Method that validates that the student number has nine digits
     * @param studentNumber - String that represents the student's number
     */
    public void setStudentNumber(int studentNumber)
    {
        if(studentNumber>99999999 && studentNumber<1000000000)
            this.studentNumber = studentNumber;
        else
            throw new IllegalArgumentException("Invalid student number, must be between 100000000 and 999999999");
    }

}
