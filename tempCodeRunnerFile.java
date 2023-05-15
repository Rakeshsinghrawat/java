import java.util.Scanner;
class Calculater
{
   public static void main(String arr[])
   {
    Scanner ob=new Scanner(System.in);
    int n1,n2,r;
    char c;
    System.out.println("enter 1st no : ");
    n1=ob.nextInt();

    System.out.println("enter 2nd no : ");
    n2=ob.nextInt();

    System.out.println("enter opretor : ");
    c =ob.next().charAt(0);
    switch (c) 
    {
        case '+':
          r=n1+n2;
          System.out.println("sum="+r);  
        break;

        case '-':
          r=n1-n2;
          System.out.println("sub="+r); 
        break;

        case '*':
          r=n1*n2;
          System.out.println("multiply="+r); 
        break;
        
        case '%':
          r=n1%n2;
          System.out.println("reminder="+r); 
        break;

        case '/':
          r=n1-n2;
          System.out.println("sub="+r); 
        break;
    
        default:
        System.out.println("invalid"); 
        break;
    }
   }
}