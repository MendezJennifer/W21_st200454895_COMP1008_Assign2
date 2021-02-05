/** Class Student: blueprint for Student objects, contains: first name, last name, student number
 * COMP1008:Lab 2
 * Author: Jennifer Mendez
 *Date: 04/Feb/2021
 *Time: 10:23 pm
 */

public class Student
{
    private String fName;
    private String lName;
    private int studentNum;

    public Student(String fName, String lName, int studentNum)
    {
        setFName(fName);
        setlName(lName);
        setStudentNum(studentNum);
    }

    public String getFName()
    {
        return fName;
    }

    /**
     * Method that ensures the first name is at least 2 characters long
     * @param fName
     */
    public void setFName(String fName)
    {
        if (fName.length()>=2)
            this.fName = fName;
        else
            throw new IllegalArgumentException("First Name must be at least two characters.");
    }

    public String getLName()
    {
        return lName;
    }

    /**
     * Method that ensures the last name is at least 2 characters long
     * @param lName
     */
    public void setlName(String lName)
    {
        if (lName.length()>=2)
            this.lName = lName;
        else
            throw new IllegalArgumentException("Last Name must be at least two characters.");
    }

    public int getStudentNum()
    {
        return studentNum;
    }

    /**
     * Methos that ensures the student number is 9 digits long
     * @param studentNum
     */
    public void setStudentNum(int studentNum)
    {
        if (studentNum>=100000000 && studentNum<1000000000)
            this.studentNum = studentNum;
        else
            throw new IllegalArgumentException("Student number must be between 100000000 and 999999999");
    }
}
