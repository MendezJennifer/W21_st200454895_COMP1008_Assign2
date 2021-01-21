/*
Jennifer Mendez
 */

public class WarmUpExcercises
{
    public static void main(String[] args)
    {
        //Loop goes from 100 to 0 in steps of -5
        for (int i = 100; i>-1; i-=5)
        {
            if(i%20==0)
            {
                System.out.println(i+" Java");
            }
            else
                System.out.println(i);
        }

        /*
        //Loop goes from 0 to 100 in steps of 10
        for (int i = 0; i<101; i+=10)
        {
            System.out.println(i);
        }

         */
    }
}
