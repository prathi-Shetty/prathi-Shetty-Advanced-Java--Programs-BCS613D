/*5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display them on console whenever the 
countries are selected on the list.*/
package fiVe;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CountryListDisplay extends JFrame {

    private JList<String> countryList;

    public CountryListDisplay() {
        // Create the model to hold the list of countries
        DefaultListModel<String> listModel = new DefaultListModel<>();

        // Add country names to the model
        listModel.addElement("USA");
        listModel.addElement("India");
        listModel.addElement("Vietnam");
        listModel.addElement("Canada");
        listModel.addElement("Denmark");
        listModel.addElement("France");
        listModel.addElement("Great Britain");
        listModel.addElement("Japan");
        listModel.addElement("Africa");
        listModel.addElement("Greenland");
        listModel.addElement("Singapore");

        // Create the JList component and set the model
        countryList = new JList<>(listModel);

        // Add a ListSelectionListener to handle selection events
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Avoid triggering multiple times during adjusting
                if (!e.getValueIsAdjusting()) {
                    // Get selected values and print to console
                    List<String> selectedValuesList = countryList.getSelectedValuesList();
                    System.out.println("Selected Countries: " + selectedValuesList);
                }
            }
        });

        // Add the JList to a scroll pane (good practice for long lists)
        JScrollPane scrollPane = new JScrollPane(countryList);
        add(scrollPane);

        // Set up the JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Country List - JList Example");
        this.setSize(300, 250);
        this.setLocationRelativeTo(null); // Center the frame on screen
        this.setVisible(true);
    }

    public static void main(String[] args) {
        // Run the Swing application
        new CountryListDisplay();
    }
}
