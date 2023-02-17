import java.util.Scanner;

public class Ex42{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter many Price");
    int n = input.nextInt();
    double sum = 0;
    do{
        System.out.println("Enter Price");
        double x = input.nextInt(n);
        sum = sum +x;
    }while(n>0);
    System.out.println("sum="+sum);
    }
}