import java.util.Scanner;
class Main
{
    public static void main(String arr[])
    {
        int n1,n2,n3,n4;
        Scanner ob = new Scanner(System.in);

        System.out.print("enter 1st no . ");
        n1 = ob.nextInt();

         System.out.print("enter 2nd no . ");
        n2 = ob.nextInt();

         System.out.print("enter 3rd no . ");
        n3 = ob.nextInt();

         System.out.print("enter 4th no . ");
        n4 = ob.nextInt();

        if(n1>n2)
        {
           System.out.print("Maximum = "+n1); 
        }
        else if(n1>n3)
        {
           System.out.print("Maximum = "+n1); 
        }
        else if(n1>n4)
        {
           System.out.print("Maximum = "+n1); 
        }


         else if(n2>n1)
        {
           System.out.print("Maximum = "+n2); 
        }
        else if(n2>n3)
        {
           System.out.print("Maximum = "+n2); 
        }
        else if(n2>n4)
        {
           System.out.print("Maximum = "+n2); 
        }
        

         else if(n3>n2)
        {
           System.out.print("Maximum = "+n3); 
        }
        else if(n3>n1)
        {
           System.out.print("Maximum = "+n3); 
        }
        else if(n3>n4)
        {
           System.out.print("Maximum = "+n3); 
        }

         else if(n4>n2)
        {
           System.out.print("Maximum = "+n4); 
        }
        else if(n4>n1)
        {
           System.out.print("Maximum = "+n4); 
        }
        else
        {
           System.out.print("Maximum = "+n4); 
        }

    }
}