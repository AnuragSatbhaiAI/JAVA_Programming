/////////////////////////////////////////////////////////////////////////////////////////
//
//  1.Write a program to check whether a number is prime or not.
//
//////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : Logic
//  Function Name  : checkPrime
//  Description    : It checks whether the given number is prime or not.
//  Input          : int
//  Output         : void
//  Author         : Anurag Gopal Satbhai
//  Date           : 03/11/25
//
//////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkPrime(int num)
    {
        if(num < 0)
        {
            num = -num;
        }

        int iCnt = 0,iCount = 0;

        for(iCnt = 2; iCnt <= (num/2); iCnt++)
        {
            if((num % iCnt) == 0)
            {
                iCount++;
            }
        }

        if(iCount == 0)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Not prime number");
        }

    }
}

//////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program1
//  Description    : Entry point for the application.
//
//////////////////////////////////////////////////////////////////////////////////////////

public class program1
{
    public static void main (String args[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////
//
//      Output : 
//      Prime number
//
//////////////////////////////////////////////////////////////////////////////////////////


