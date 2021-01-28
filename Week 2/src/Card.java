/** Class Card: blueprint for Card objects, contains: first name, last name, balance, account number
 * Week2: Building Classes
 * Author: Jennifer Mendez
 *Date: 28/Jan/2021
 *Time: 10:50 am
 */

//Class declaration
public class Card
{
    //State
    private String faceName;
    private String suit;

    //Constructor: remember, it must have the EXACT same name as the class
    //The value of the card assumes that Aces are high and will dynamically establish the card value when getCardValue() method is run
    public Card()
    {}

    public Card(String faceName, String suit)
    {
        this.faceName=faceName;
        this.suit=suit;
    }

}
