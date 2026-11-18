import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class AppointmentForm implements ActionListener {

    // The text boxes
    JTextField nameField = new JTextField();
    JTextField genderField = new JTextField();
    JTextField phoneField = new JTextField();
    JTextField dobField = new JTextField();
    JTextField appointmentField = new JTextField();

    // The save button
    JButton saveButton = new JButton("Save");

    public AppointmentForm() {
        JFrame frame = new JFrame("Appointment Form");
        frame.setSize(400, 330);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels (x, y, width, height)
        JLabel nameLabel = new JLabel("Full Name:");
        nameLabel.setBounds(20, 20, 130, 25);
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20, 60, 130, 25);
        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneLabel.setBounds(20, 100, 130, 25);
        JLabel dobLabel = new JLabel("Date of Birth:");
        dobLabel.setBounds(20, 140, 130, 25);
        JLabel appointmentLabel = new JLabel("Appointment Date:");
        appointmentLabel.setBounds(20, 180, 130, 25);

        // Text boxes
        nameField.setBounds(160, 20, 200, 25);
        genderField.setBounds(160, 60, 200, 25);
        phoneField.setBounds(160, 100, 200, 25);
        dobField.setBounds(160, 140, 200, 25);
        appointmentField.setBounds(160, 180, 200, 25);

        // Button
        saveButton.setBounds(160, 230, 100, 30);
        saveButton.addActionListener(this);

        // Add everything to the window
        frame.add(nameLabel);
        frame.add(genderLabel);
        frame.add(phoneLabel);
        frame.add(dobLabel);
        frame.add(appointmentLabel);
        frame.add(nameField);
        frame.add(genderField);
        frame.add(phoneField);
        frame.add(dobField);
        frame.add(appointmentField);
        frame.add(saveButton);

        frame.setVisible(true);
    }

    // This runs when the Save button is clicked
    public void actionPerformed(ActionEvent e) {
        try {
            // true means: add to the end of the file instead of replacing it
            FileWriter writer = new FileWriter("appointments.txt", true);

            writer.write("Full Name: " + nameField.getText() + "\n");
            writer.write("Gender: " + genderField.getText() + "\n");
            writer.write("Phone Number: " + phoneField.getText() + "\n");
            writer.write("Date of Birth: " + dobField.getText() + "\n");
            writer.write("Appointment Date: " + appointmentField.getText() + "\n");
            writer.write("-------------------------\n");

            writer.close();

            JOptionPane.showMessageDialog(null, "Saved!");

            // Clear the boxes
            nameField.setText("");
            genderField.setText("");
            phoneField.setText("");
            dobField.setText("");
            appointmentField.setText("");

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Could not save the file.");
        }
    }

    public static void main(String[] args) {
        new AppointmentForm();
    }
}