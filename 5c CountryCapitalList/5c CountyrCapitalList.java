/*5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display the capital of the countries on
console whenever the countries are selected on the list.*/
package fiVe;

import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class CountryCapitalList extends JFrame {

    private JList<String> countryList;

    public CountryCapitalList() {
        // Map to store country-capital pairs
        Map<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Addis Ababa");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        // Create list model and add country names
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (String country : capitals.keySet()) {
            listModel.addElement(country);
        }

        // Initialize JList with the model
        countryList = new JList<>(listModel);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Add listener to detect selection changes
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {  // Ensure event fires once after selection
                    List<String> selectedCountries = countryList.getSelectedValuesList();
                    for (String country : selectedCountries) {
                        System.out.println("Capital of " + country + " is: " + capitals.get(country));
                    }
                }
            }
        });

        // Add the list inside a scroll pane
        add(new JScrollPane(countryList));

        // JFrame settings
        setTitle("Country and Capital");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center on screen
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create instance to run program
        new CountryCapitalList();
    }
}
