/*5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and display the concerned color whenever the specific tab is selected in the Pan.*/
package fiVe;

import java.awt.Color;
import javax.swing.*;

public class TabbedPaneExample {
    JFrame f;

    TabbedPaneExample() {
        // Create a new JFrame
        f = new JFrame("Tabbed Pane Example");

        // Create three panels and set different background colors
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.setBackground(Color.BLUE);   // Panel 1: Blue
        p2.setBackground(Color.RED);    // Panel 2: Red
        p3.setBackground(Color.GREEN);  // Panel 3: Green

        // Create a TabbedPane
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 200, 200);

        // Add tabs to the tabbed pane with labels and panels
        tp.add("BLUE", p1);   // First tab
        tp.add("RED", p2);    // Second tab
        tp.add("GREEN", p3);  // Third tab

        // Add tabbed pane to the frame
        f.add(tp);

        // Set frame size and layout
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true); // Display the frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
    }

    public static void main(String[] args) {
        // Run the program
        new TabbedPaneExample();
    }
}
