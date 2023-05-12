import java.util.Scanner;
class Main
{
    public static void main(String Arr[])
    {
        int n=1,table,r;
        Scanner ob = new Scanner(System.in);
        System.out.print("enter table no . ");
        table= ob.nextInt();

        while(n<=10)
        {
            r= n*table;
            System.out.println(table+"X"+n+"="+r);
            n++;
        }
    }
}