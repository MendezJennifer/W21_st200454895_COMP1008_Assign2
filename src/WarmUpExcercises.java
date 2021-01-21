/*
Jennifer Mendez
 */

public class WarmUpExcercises
{
    public static void main(String[] args)
    {
        //Loop goes from 100 to 0 in steps of -5
        //If number is divisible by 20, display JAVA
        System.out.println("Challenge 1 & 3");
        for (int i = 100; i>-1; i-=5)
        {
            if(i%20==0)
                System.out.println(i+" Java");
            else
                System.out.println(i);
        }

        //Loop goes from 0 to 100 in steps of 10
        //If number is divisible by 20, display JAVA
        System.out.println("\nChallenge 2 & 3");
        for (int j = 0; j<101; j+=10)
        {
            //Shorter way of doing the if/else loop
            System.out.println(j%20==0?j+" JAVA":j);
        }

    }
}
