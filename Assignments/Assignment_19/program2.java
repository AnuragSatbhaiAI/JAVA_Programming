/////////////////////////////////////////////////////////////////////////////////////////
//
//  2.Write a program to check given year is leap year or not.
//
//////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : Logic
//  Function Name  : displayGread
//  Description    : Display gread from its marks.
//  Input          : int
//  Output         : void
//  Author         : Anurag Gopal Satbhai
//  Date           : 03/11/25
//
//////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void displayGread(int marks)
   {
        if(marks >= 90)                                     // Business Logic
        {
            System.out.println("O");
        }
        else if (marks >= 80  && marks < 90)
        {
            System.out.println("A+");
        }
        else if (marks >= 70  && marks < 80)
        {
            System.out.println("A");
        }
        else if (marks >= 60  && marks < 70)
        {
            System.out.println("B");
        }
        else if (marks >= 50  && marks < 60)
        {
            System.out.println("C");
        }
        else
        {
            System.out.println("F");
        }
   }
}

//////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program2
//  Description    : Entry point for the application.
//
//////////////////////////////////////////////////////////////////////////////////////////

public class program2
{
    public static void main (String args[])
    {
        Logic obj = new Logic();
        obj.displayGread(85);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////
//
//      Output : 
//      A+
//
//////////////////////////////////////////////////////////////////////////////////////////


