/////////////////////////////////////////////////////////////////////////////////////////
//
//  4.Write a program to find the sum of even and odd digits seperately in a number.
//
//////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : Logic
//  Function Name  : sumOfEvenOddDigits
//  Description    : It gives sum of odd and even digits separately.
//  Input          : int
//  Output         : void
//  Author         : Anurag Gopal Satbhai
//  Date           : 03/11/25
//
//////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void sumOfEvenOddDigits(int num)
    {
        int iDigit = 0;
        int iSumEven = 0;
        int iSumOdd = 0;

        while(num > 0)
        {
            iDigit = num % 10;
            
            if((iDigit % 2) == 0)
            {
                iSumEven = iSumEven + iDigit;
            }
            else
            {
                iSumOdd = iSumOdd + iDigit;
            }
            
            num = num / 10;
        }

        System.out.println("Even digit sum = " + iSumEven);

        System.out.println("Odd digit sum = " + iSumOdd);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program4
//  Description    : Entry point for the application.
//
//////////////////////////////////////////////////////////////////////////////////////////

public class program4
{
    public static void main (String args[])
    {
        Logic obj = new Logic();
        obj.sumOfEvenOddDigits(123456);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////
//
//      Output : 
//      Even digit sum = 12
//      Odd digit sum = 9
//
//////////////////////////////////////////////////////////////////////////////////////////

