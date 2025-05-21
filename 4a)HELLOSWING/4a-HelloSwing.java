/*4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing Programming in Blue color plain font with font size of 32 using Jframe and Jlabel*/
package foUr;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class HelloSwing {

    // Constructor to create GUI
    HelloSwing() {
        // Create a new JFrame container with a title
        JFrame jfrm = new JFrame("A Simple Swing Application");

        // Set the frame size (width, height)
        jfrm.setSize(600, 120);

        // Terminate the program when the frame is closed
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel with the welcome message
        JLabel jlab = new JLabel(" Hello! VI C , Welcome to Swing Programming!");

        // Set font for the label (Font family, style, size)
        jlab.setFont(new Font("Verdana", Font.PLAIN, 32));

        // Set the text color to blue
        jlab.setForeground(new Color(0, 0, 255));

        // Add the label to the frame
        jfrm.add(jlab);

        // Make the frame visible
        jfrm.setVisible(true);
    }

    // Main method to run the application
    public static void main(String[] args) {
        // Run the GUI construction on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new HelloSwing();
            }
        });
    }
}
