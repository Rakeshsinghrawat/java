import java.util.Scanner;
class Main
{
    public static void main(String arr[])
    {
        char ch;
        Scanner ob = new Scanner(System.in);

        System.out.print("enter string . ");
        ch = ob.nextLine().charAt(0);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
           System.out.print("vowel ");
        }

        else
        {
           System.out.print("consonent ");
        }
    }
}