/** Class StudentRecord blueprint: RepairTicket objects, contains:
 * Exam 1
 * Author: Jennifer Mendez
 *Date: 11/Fec/2021
 */

public class Example
{
    public static void main(String[] args)
    {
        //Ex 1: Loop that will display the numbers from 100 to 0 going in steps of -5
        System.out.println("\nExample 1");
        for(int i=100;i>-1;i-=5)
        {
            System.out.println(i);
        }

        //Ex 2: Loop that will display the numbers from 0 to 100 going in steps of 10
        //EX 3: Display the word Java beside numbers that are divisible by 20
        System.out.println("\nExample 2 & 3");
        for(int i=0;i<101;i+=10)
        {
            System.out.println(i%20==0? i + " Java" : i);
        }

        //Challenge 4 - make a method
        System.out.println("\nChallenge 4");
        System.out.println("timeToSki(31) = " + timeToSki(31));
        System.out.println("timeToSki(30) = " + timeToSki(30));

        //Challenge 5 - make a method
        System.out.println("\nChallenge 5");
        snowFalling(5);
    }

    public static boolean timeToSki(int snowDepth)
    {
        return snowDepth>30;
    }

    public static void snowFalling(int size)
    {
        // Outer loop to print each of the rows
        for (int row = 1; row <= size; row++)
        {  // row = 1, 2, 3, ..., size
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++)
            {  // col = 1, 2, 3, ..., size
                if (row + col <= size + 1) {
                    System.out.print("*");
                }
            }
            // Print a newline after printing all the columns
            System.out.println();
        }
    }

}
