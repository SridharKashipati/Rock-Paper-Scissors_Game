package com.company;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        Random rand = new Random();
        int computer = 0;
        int you = 0;
        System.out.println("***Please have a note***");
        System.out.println("(0) Stands for Rock\n(1) Stands for Paper\n(2) Stands for Scissor");
        for (int i = 0; i<5; i++)
        {
            int comp = rand.nextInt(3);
            System.out.println("Select one Number from 0, 1 2");
            int human = sc.nextInt();
            System.out.println("Computer has selected: "+ comp);
            if (comp == 0 && human == 1)
            {
                System.out.println(" You won");
                you++;
            }
            else if (comp == 0 && human == 2)
            {
                System.out.println(" You lost");
                computer++;
            }
            else if (comp == 1 && human == 0)
            {
                System.out.println(" You lost");
                computer++;
            }
            else if (comp == 1 && human == 2)
            {
                System.out.println(" You won");
                you++;
            }
            else if (comp == 2 && human == 0)
            {
                System.out.println(" You won");
                you++;
            }
            else if (comp == 2 && human == 1)
            {
                System.out.println(" You lost");
                computer++;
            }
            else
            {
                System.out.println("It's a tie, both Computer and You selected the same...");
            }


        }
        System.out.println("The final score of Computer is: "+ computer +" and You scored : "+ you);
        if (computer > you)
        {
            System.out.println("Sorry, Finally Computer won!!. Better luck next time!!! ");

        }
        else
        {
            System.out.println("Congratulations finally You won!!!");
        }


    }
}
