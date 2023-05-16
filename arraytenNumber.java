import java.util.*;
class ss
{
    public static void main(String Arr[])
    {
       
        int arr[]=new int[10],i;
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter 10 number : ");
        for(i=1;i<=10;i++)
        {
            arr[i]=ob.nextInt();
        }
        System.out.print(" you Entered numbers : ");

        for(i=1;i<=10;i++)
        {
            System.out.print(arr[i]);
        }
    }
}