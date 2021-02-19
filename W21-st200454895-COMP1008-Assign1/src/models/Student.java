package models; /** Class models.Student: blueprint for models.Student objects, contains: first name, last name, student number
 * COMP1008:Lab 2
 * Author: Jennifer Mendez
 *Date: 04/Feb/2021
 *Time: 10:23 pm
 */

import java.util.ArrayList;
public class Student
{
    private String fName;
    private String lName;
    private int studentNum;
    private ArrayList<String> studentInterests;

    public Student(String fName, String lName, int studentNum,ArrayList<String> studentInterests )
    {
        setFName(fName);
        setlName(lName);
        setStudentNum(studentNum);
        setStudentInterests(studentInterests);
    }

    public String getFName()
    {
        return fName;
    }

    /**
     * Method that ensures the first name is at least 2 characters long and begins with an uppercase letter
     * @param fName
     */
    public void setFName(String fName)
    {
        char firstLetter=fName.charAt(0);
        if (fName.length()>=2 && Character.isUpperCase(firstLetter))
            this.fName = fName;
        else
            throw new IllegalArgumentException("First Name must be at least two characters and begin with an uppercase letter.");
    }

    public String getLName()
    {
        return lName;
    }

    /**
     * Method that ensures the last name is at least 2 characters long and begins with an uppercase letter
     * @param lName
     */
    public void setlName(String lName)
    {
        char firstLetter=lName.charAt(0);
        if (lName.length()>=2 && Character.isUpperCase(firstLetter))
            this.lName = lName;
        else
            throw new IllegalArgumentException("Last Name must be at least two characters long and begin with an uppercase letter.");
    }

    public int getStudentNum()
    {
        return studentNum;
    }

    /**
     * Method that ensures the student number is 9 digits long
     * @param studentNum
     */
    public void setStudentNum(int studentNum)
    {
        if (studentNum>=100000000 && studentNum<1000000000)
            this.studentNum = studentNum;
        else
            throw new IllegalArgumentException("models.Student number must be between 100000000 and 999999999");
    }

    public ArrayList<String> getStudentInterests()
    {
        return studentInterests;
    }

    /**
     * Method that will return a list of valid student interests
     * @return interests
     */
    public static ArrayList<String> obtainInterests()
    {
        ArrayList<String> interests=new ArrayList<>();
        interests.add("Reading");
        interests.add("Hiking");
        interests.add("Dancing");
        interests.add("Cooking");
        interests.add("Coding");
        interests.add("Gaming");
        interests.add("Swimming");
        interests.add("Drawing");
        return  interests;
    }

    /**
     * Method that ensures the argument only contains interests from a valid list of interests
     * @param interests
     */
    public void setStudentInterests(ArrayList<String> interests)
    {
        ArrayList<String> validInterests = obtainInterests();
        for (String studentInterests:interests)
        {
            if (!validInterests.contains(studentInterests))
                throw new IllegalArgumentException(studentInterests + " is not valid. Please choose from the following list: "+validInterests);
        }
        this.studentInterests = studentInterests;
    }
}
