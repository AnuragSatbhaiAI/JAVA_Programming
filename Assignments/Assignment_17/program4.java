/////////////////////////////////////////////////////////////////////////////////////////
//
//  4.Write a program to find minimum of three numbers.
//
//////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : Logic
//  Function Name  : findMin
//  Description    : It finds the minimum number in between three numbers.
//  Input          : int
//  Output         : void
//  Author         : Anurag Gopal Satbhai
//  Date           : 03/11/25
//
//////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void findMin(int a, int b, int c)
    {

        if((a < b) && (a < c))
        {
            System.out.println("Minimum number is " + a);
        }
        else if ((b < a) && (b < c))
        {
            System.out.println("Minimum number is " + b);
        }
        else if ((c < a) && (c < b))
        {
            System.out.println("Minimum number is " + c);
        }
        else 
        {
            System.out.println("Equal numbers");
        }

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
        obj.findMin(3,7,2);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////
//
//      Output : 
//      Minimum number is 2
//
//////////////////////////////////////////////////////////////////////////////////////////


