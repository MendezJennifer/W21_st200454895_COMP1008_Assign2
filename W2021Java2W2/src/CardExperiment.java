/** Class CardExperiment: Contains main method, Creates a new Card object based on the Card class
 * Week2: Building Classes
 * Author: Jennifer Mendez
 *Date: 28/Jan/2021
 *Time: 10:50 am
 */


import java.util.ArrayList;
import java.util.Scanner;

public class CardExperiment
{
    public static void main(String[] args)
    {
        //Datatype    variable name   calling the constructor and passing in System.in
        Scanner       keyboard        = new Scanner(System.in);
        Card          aceOfSpades     =new Card("ace","spades");
        Card          jesseOfMid      =new Card("ten","hearts");
        //Card          jesseOfMid      =new Card("Jesse","Midladjy "); test the constructor

        //jesseOfMid.setSuit("hearts"); //set to a valid input
        //jesseOfMid.setSuit("Fred"); //set to an invalid input, this will throw the exception created in the Card class

        System.out.println(aceOfSpades);
        System.out.println(jesseOfMid);

        //print with format, %s if for returning a String, %d is for returning an integer, %f is for decimals (%.2f shows 2 numbers after the decimal point), %n is for nwe line
        System.out.printf("%s is a %s card with a value of %d %n", aceOfSpades, aceOfSpades.obtainCardColor(), aceOfSpades.obtainFaceValue());
        System.out.printf("%s is a %s card with a value of %d %n", jesseOfMid, jesseOfMid.obtainCardColor(), jesseOfMid.obtainFaceValue());

        //Create an instance of DeckOfCards
        DeckOfCards deck = new DeckOfCards();
        System.out.println(deck);
    }
}
