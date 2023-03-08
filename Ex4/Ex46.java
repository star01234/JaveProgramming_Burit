import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int x = input.nextInt();
        int y = (x*x)+(2*x)+10;
        System.out.println("result = " + y);
    }
}