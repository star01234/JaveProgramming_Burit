import java.util.Scanner;
public class Exercise26
{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("number 1 : ");
double a = scan.nextFloat();
System.out.print("number 2 : ");
double b = scan.nextFloat();
double result = (a-b)*(a+b);
System.out.println("A =?" + a);
System.out.println("B =?" + b);
System.out.println("(" + a + " - " + b + ")(" + a + " + " + b + ") = " + result);
}
}