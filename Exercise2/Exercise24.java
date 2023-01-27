import java.util.Scanner;

public class Ex24{
    public static void main(String[] args) {
        int a,b,temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A , B");
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println("Before swapping: a = "+a+", b = "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = "+a+", b = "+b);
    }
}