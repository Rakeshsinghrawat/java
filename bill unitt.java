import java.util.Scanner;
class Main
{
    public static void main(String arr[])
    {
        int u,a;
        Scanner ob = new Scanner(System.in);

        System.out.print("enter 1st no . ");
        u = ob.nextInt();

        

        if(u>0 && u<=50)
        {
           a=0;
           System.out.print("ammount = "+a); 
        }
        else if(u>50 && u<=200)
        {
         a=u*5;
           System.out.print("ammount = "+a); 
        }
        else if(u>200 && u<=500)
        {
         a=u*8;
           System.out.print("ammount = "+a); 
        }


         else
        {
         a=u*10;
           System.out.print("ammount = "+a); 
        }
        

    }
}