
package com.mycompany.prjunittestingprog1b;

import java.util.Scanner;

public class Guessing extends Words
{
    public boolean TestWord(String strGuess)
    {
        String strInput = strGuess.toLowerCase();
        int count = this.getWords().length;
        for(int x = 0; x<count; x++)
        {
            if(strInput.equals(this.getWords()[x]))// inheritence
            {
                return true;
            }
        }
        return false;
    }
    public void getData()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your guess: ");
        String strGuess = scan.nextLine();
        if(this.TestWord(strGuess))
        {
            System.out.print("Well done, you got it right");
        }
        else
        {
            System.err.print("Good luck next time");
        }
    }
}
