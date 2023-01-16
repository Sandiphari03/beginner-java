import java.lang.*;
import java.util.Scanner;
 class Expression
{
    public static void main (String args[])
    {
        float a,b,c,s;
        System.out.println("Enter the value ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        s = (a + b + c) / 2;
        System.out.println( "sis of the triangle "+s);

    }
}