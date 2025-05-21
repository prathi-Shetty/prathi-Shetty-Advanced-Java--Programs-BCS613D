/*5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and display the concerned color whenever the specific tab is selected in the Pan*/
package fiVe;

import java.awt.Color;
import javax.swing.*;

public class CMYTabbedPane {

    public CMYTabbedPane() {
        // Create a JFrame with title
        JFrame frame = new JFrame("CMY Tabs");

        // Create three panels for the colors Cyan, Magenta, Yellow
        JPanel cyanPanel = new JPanel();
        JPanel magentaPanel = new JPanel();
        JPanel yellowPanel = new JPanel();

        // Set background colors for each panel
        cyanPanel.setBackground(Color.CYAN);
        magentaPanel.setBackground(Color.MAGENTA);
        yellowPanel.setBackground(Color.YELLOW);

        // Create a tabbed pane and set its bounds (position and size)
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(50, 50, 300, 300);

        // Add the colored panels to the tabbed pane with appropriate tab labels
        tabbedPane.add("CYAN", cyanPanel);
        tabbedPane.add("MAGENTA", magentaPanel);
        tabbedPane.add("YELLOW", yellowPanel);

        // Add the tabbed pane to the frame
        frame.add(tabbedPane);

        // Set frame size, layout, visibility, and close operation
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // Create the GUI in the event-dispatching thread for thread safety
        SwingUtilities.invokeLater(() -> new CMYTabbedPane());
    }
}
