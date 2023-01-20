import java.util.Scanner;

public class inputData2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = input.nextLine();
        System.out.print("Your surename");
        int surename = input.nextInt();
        System.out.print("Your nickname");
        int nickname = input.nextInt();
        System.out.print("Your studentID");
        int studentID = input.nextInt();
        System.out.print("Enter major: ");
        int major = input.nextInt();
       
        int id = input.nextInt();
        input.close();

    }
}
