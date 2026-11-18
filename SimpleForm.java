import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleForm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Ask the questions
        System.out.print("Full Name: ");
        String name = input.nextLine();

        System.out.print("Gender: ");
        String gender = input.nextLine();

        System.out.print("Phone Number: ");
        String phone = input.nextLine();

        System.out.print("Date of Birth: ");
        String dob = input.nextLine();

        System.out.print("Appointment Date: ");
        String appointment = input.nextLine();

        // 2. Save the answers to a text file
        try {
            // true means: add to the end of the file instead of replacing it
            FileWriter writer = new FileWriter("appointments.txt", true);

            writer.write("Full Name: " + name + "\n");
            writer.write("Gender: " + gender + "\n");
            writer.write("Phone Number: " + phone + "\n");
            writer.write("Date of Birth: " + dob + "\n");
            writer.write("Appointment Date: " + appointment + "\n");
            writer.write("-------------------------\n");

            writer.close();

            System.out.println("Saved to appointments.txt");

        } catch (IOException e) {
            System.out.println("Could not save the file.");
        }
    }
}