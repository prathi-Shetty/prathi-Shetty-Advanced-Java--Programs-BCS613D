/*4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by implementing the 
event handling mechanism with addActionListener( ).*/  
package foUr;

import java.awt.event.*;  // Import for event handling
import javax.swing.*;     // Import for Swing components

// Class to demonstrate image buttons with event handling
public class ImageButtonEventDemo {

    JLabel label;  // Label to display which button was pressed

    // Constructor to set up the GUI
    ImageButtonEventDemo() {
        // Create a new JFrame container with a title
        JFrame frame = new JFrame("Image Button Example");

        // Initialize and position the label
        label = new JLabel();
        label.setBounds(50, 20, 300, 30);  // x, y, width, height

        // Load image icons from the specified file paths
        ImageIcon icon1 = new ImageIcon("/home/student/22cs107/digiclock.jpeg"); // Digital Clock Image
        ImageIcon icon2 = new ImageIcon("/home/student/22cs107/hrglass.jpeg");   // Hour Glass Image

        // Create first button with Digital Clock image
        JButton btn1 = new JButton(icon1);
        btn1.setBounds(50, 70, 150, 100);  // x, y, width, height
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");  // Update label text
            }
        });

        // Create second button with Hour Glass image
        JButton btn2 = new JButton(icon2);
        btn2.setBounds(220, 70, 150, 100);
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");  // Update label text
            }
        });

        // Add components to the frame
        frame.add(label);
        frame.add(btn1);
        frame.add(btn2);

        // Set frame properties
        frame.setSize(450, 250);           // Window size
        frame.setLayout(null);             // Absolute positioning
        frame.setVisible(true);            // Make the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Exit app on close
    }

    // Main method to run the program
    public static void main(String[] args) {
        new ImageButtonEventDemo();  // Create an instance to show GUI
    }
}
