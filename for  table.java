import java.util.Scanner;
class Demo
{
    public static void main(String Arr[])
    {
        int n=1,table,r;
        Scanner ob = new Scanner(System.in);
        System.out.print("enter table no . ");
        table= ob.nextInt();

        for(n=1;n<=10;n++);
        {
            r= n*table;
            System.out.println(table+"X"+n+"="+r);
        }
        
    }
}