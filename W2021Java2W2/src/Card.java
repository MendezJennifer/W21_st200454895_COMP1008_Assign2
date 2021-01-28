/** Class Card: blueprint for Card objects, contains: faceName and suit
* Week2: Building Classes
* Author: Jennifer Mendez
*Date: 28/Jan/2021
*Time: 10:50 am
*/

//import statements
import java.util.Arrays;
import java.util.List;

//Class declaration
public class Card
{
    //State
    private String faceName;
    private String suit;

    /**
     * This constructor takes 2 arguments, one for the face name and
     * one for the suit.  The value of the card assumes that aces
     * are high and will dynamically establish the card value
     * when the getCardValue() method is run
     *
     * The constructor must be the same name as the class (including the upper case first letter)
     * The constructor does NOT have a return type
     */
    public Card(String faceName, String suit)
    {
        //call the setter in the constructor, so it validates the value before allowing it to be created
        setFaceName(faceName);
        setSuit(suit);
    }

    public String getFaceName()
    {
        return faceName;
    }

    /**
     * This returns a list of valid face names in lower case
     * @return
     */
    public static List<String> getFaceNames()
    {
        return Arrays.asList("two","three","four", "five","six","seven","eight","nine","ten","jack","queen","king","ace");
    }

    /**
     * This method will validate that the argument is in the collection of "two","three","four", "five","six","seven","eight","nine","ten","jack","queen","king","ace" and set the instance variable
     * @param faceName - this is a String to represent the name of the card
     * */
    public void setFaceName(String faceName)
    {
        faceName = faceName.toLowerCase();
        //Note: when using a list, or array make the name plural so you know there is more than one
        List<String> faceNames = getFaceNames();
        if(faceNames.contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException(faceName+ " is not valid, use "+faceNames);
        this.faceName=faceName;
    }


    public String getSuit()
    {
        return suit;
    }

    public static  List<String> getSuits()
    {
        return Arrays.asList("hearts","diamonds","spades","clubs");
    }


    /**
     * This method will validate that the argument is in the collection of "hearts","diamonds","spades","clubs" and set the instance variable
     * @param suit
     */
    public void setSuit(String suit)
    {
        //convert the value to lower case
        suit=suit.toLowerCase();
        //Create the list of valid suits, if the object is not valid throw an exception
        List<String> validSuits = getSuits();
        if(validSuits.contains(suit)) //the comparison is case sensitive
            this.suit = suit;
        else
            throw new IllegalArgumentException(suit + " is not valid. Use one of " +validSuits);
    }


    /**
     * This method will return the String "red" if the card's suit is hearts or diamonds, "black" otherwise
     * @return CardColor - this is a String
     */
    public String obtainCardColor()
    {
        if(suit.equalsIgnoreCase("hearts")||suit.equalsIgnoreCase("diamonds"))
            return"red";
        else
            return "black";
    }

    /**
     * This method will return the value of the card. 2=2, 3=3,...,9=9,10=10,jack=11, queen=12, king=13, ace=14
     * @return
     */
    public int obtainFaceValue()
    {
        //The first face name in the list (position 0) is "two", so we add 2 to the index of each card to obtain the actual value of the card
        return getFaceNames().indexOf(faceName) + 2;
    }

    //Use toString method to return the state of your Card (else, when printing it will print the memory location of Card)
    public String toString()
    {
        return faceName + " of " + suit;
    }

}
