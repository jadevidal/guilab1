import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
    Author: Prof. Autorino

    Header.java

    Panel with a label and a textfield nested in a scrollpane.
*/
public class Header {
    private JPanel headerPanel = null;
    private JLabel greetingLabel = null;
    private JTextField greetingField = null;
    private JButton updateBtn = null;

    public Header() {
        // Create a panel with a centered flow layout.
        headerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        greetingLabel = new JLabel("Greeting:");
        headerPanel.add(greetingLabel);

        greetingField = new JTextField(20);
        greetingField.setText("Hello, World!");
        headerPanel.add(greetingField);

        updateBtn = new JButton("Submit");
        headerPanel.add(updateBtn);
    }

    /* return elements so we can access their attributes. */
    public JPanel getHeaderPanel() {
        return headerPanel;
    }    

    public JLabel getGreetingLabel() {
        return greetingLabel;
    }

    public JTextField getGreetingField() {
        return greetingField;
    }

    public JButton getUpdateButton() {
        return updateBtn;
    }
}