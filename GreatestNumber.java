import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int first = input.nextInt();

        System.out.print("Input the 2nd number: ");
        int second = input.nextInt();

        System.out.print("Input the 3rd number: ");
        int third = input.nextInt();

        int greatest = first;

        if (second > greatest) {
            greatest = second;
        }

        if (third > greatest) {
            greatest = third;
        }

        System.out.println("The greatest: " + greatest);

        input.close();
    }
}