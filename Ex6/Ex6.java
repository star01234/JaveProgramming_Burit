import java.util.Scanner;

public class Ex6 {
    // Method
    /**
     * Check number type and print out
     * 
     * @param num
     */
    // Ex1
    public void printType1(int num) {
        if (num == 0) {
            System.out.println(num + " is zero");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println(num + " is positive");
        }
    }

    // Ex2
    public void printType2(int number) {
        // TODO
        if (number == 0) {
            System.out.println("Zero");
        } else if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    // Ex3
    public void checkVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("This character is a vowel");
        } else {
            System.out.println("This character is not a vowel");
        }
    }

    // Ex4
    public void checkChar(char c) {
        if (c >= 66 && c <= 90) {
            System.out.println("This character is a Uppercase");
        } else if (c >= 97 && c <= 122) {
            System.out.println("This character is a Lowercase");
        } else if (c >= 48 && c <= 57) {
            System.out.println("This character is a number");
        } else {
            System.out.println("This character is not a letter");
        }
    }

    // Ex5
    public void isPositive(int num, Scanner input) {
        while (num <= 0) {
            System.out.println("Please, enter a positive number");
            num = input.nextInt();
        }
        System.out.println("Positive number");
    }

    // Ex6
    public void isOdd(int num, Scanner input) {
        do{
            
        }
    }

    // Ex 1,2,5
    public static void main(String[] args) {
        Ex6 ex = new Ex6();
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a number: ");
        int num = input.nextInt();
        // ex.printType1(num);
        // ex.printType2(num);
        ex.isPositive(num, input);
        // }

        // Ex 3-4
        // public static void main(String[] args) {
        // Ex6 ex = new Ex6();
        // Scanner input = new Scanner(System.in);
        // System.out.println("Please, enter a charactor");
        // String text = input.next();
        // char c = text.charAt(0);
        // // ex.checkVowel(c);
        // ex.checkChar(c);
        // }
    }
}