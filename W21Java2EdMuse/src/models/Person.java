package models;

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;

public class Person
{
    private String firstName,lastName,address;
    private LocalDate birthday;

    public Person(String firstName, String lastName, String address, LocalDate birthday)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setBirthday(birthday);
    }

    /**
     * This returns person's age in years based on their birthday and the current date
     * @return
     */
    public int getAge()
    {
        return Period.between(birthday,LocalDate.now()).getYears();
    }

    /**
     * First name needs to be comprised of alphabetic characters, starting with an upper case letter
     * @param firstName
     */
    public void setFirstName(String firstName)
    {
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        //setting a pattern, first character must be uppercase A to Z, the rest must be lowercase a to z
        if(firstName.matches("[A-Z][a-z]*"))
        {
            this.firstName = firstName;
        }
        else
            throw new IllegalArgumentException("First Name must start with an upper case letter and only contain alphabetic characters");
    }

    /**
     * Last name needs to be comprised of alphabetic characters, starting with an upper case letter
     * @param lastName
     */
    public void setLastName(String lastName)
    {
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1);
        //setting a pattern, first character must be uppercase A to Z, the rest must be lowercase a to z
        if(lastName.matches("[A-Z][a-z]*"))
        {
            this.lastName = lastName;
        }
        else
            throw new IllegalArgumentException("Last Name must start with an upper case letter and only contain alphabetic characters");
    }

    public void setAddress(String address)
    {
        address=address.trim();
        if(address.length()>=5 && address.length()<=30)
        {
            this.address = address;
        }
        else
            throw new IllegalArgumentException("Address must be 5 to 30 characters");
    }

    public void setBirthday(LocalDate birthday)
    {
        if (birthday.isAfter(LocalDate.now()))
            throw new IllegalArgumentException("birthday cannot be in the future");
        this.birthday = birthday;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getAddress()
    {
        return address;
    }

    public LocalDate getBirthday()
    {
        return birthday;
    }

}


