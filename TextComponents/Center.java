import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * Center.java
 * 
 * @author Tajrin Abdullah
 * 
 */
public class Center {

    /* Panel variables */
    private JPanel centerPanel = null;
    private JPanel questionPanel = null;

    /* Text Label variables */
    private JLabel objectLabel = null;
    private JLabel colorLabel = null;
    private JLabel numberLabel = null;
    private JLabel placeLabel = null;
    private JLabel soundLabel = null;
    private JLabel characterLabel = null;

    /* Text Field variables */
    private JTextField objectField = null;
    private JTextField colorField = null;
    private JTextField numberField = null;
    private JTextField placeField = null;
    private JTextField soundField = null;
    private JTextField characterField = null;

    /* Colors */

    /* Light Mode Colors */
    Color periWhite   = new Color(237, 235, 250); // #EDEBFA
    Color darkText    = new Color(40, 40, 50);    // gray

    /* Dark Mode Colors */
    Color mocha       = new Color(140, 111, 78);  // #8C6F4E
    Color blackText   = new Color(26,26,23);      // #1A1A17

    /**
     * Default Constructor
     */
    public Center(){ 
        this("book", "grey", "159","Stohess District", "whispering", "Levi");
    }

    /**
     * Constructor with parameters
     * @param object the object name
     * @param color the color name
     * @param number the number
     * @param place the name of place
     * @param sound the name of the type of sound
     * @param character the name of a character
     */
    public Center(String object, String color, String number, String place, String sound, String character) {

        centerPanel = new JPanel(new BorderLayout(10, 10));
        /* 
           Code logic from official docs:
           https://docs.oracle.com/javase/tutorial/uiswing/layout/grid.html
        */
        questionPanel = new JPanel(new GridLayout(6,2, 5, 5));
    

        /* Object Name */
        objectLabel = new JLabel("   Name an object: ");
        objectLabel.setForeground(darkText);
        objectField = new JTextField(object, 15);
        questionPanel.add(objectLabel);
        questionPanel.add(objectField);

        /* Color Name */
        colorLabel = new JLabel("   Favorite color:");
        colorLabel.setForeground(darkText);
        colorField = new JTextField(color, 15);
        questionPanel.add(colorLabel);
        questionPanel.add(colorField);

        /* Big Number */
        numberLabel = new JLabel("   A big number:");
        numberLabel.setForeground(darkText);
        numberField = new JTextField(number, 15);
        questionPanel.add(numberLabel);
        questionPanel.add(numberField);

        /* Place Name */
        placeLabel = new JLabel("   Name a place:");
        placeLabel.setForeground(darkText);
        placeField = new JTextField(place, 15);
        questionPanel.add(placeLabel);
        questionPanel.add(placeField);

        /* Sound Type */
        soundLabel = new JLabel("   Type of sound:");
        soundLabel.setForeground(darkText);
        soundField = new JTextField(sound, 15);
        questionPanel.add(soundLabel);
        questionPanel.add(soundField);

        /* Character Name */
        characterLabel = new JLabel("   Name a character:");
        characterLabel.setForeground(darkText);
        characterField = new JTextField(character, 15);
        questionPanel.add(characterLabel);
        questionPanel.add(characterField);

        // Apply background styling to both panels to ensure complete color fill (Default is light mode)
        centerPanel.setBackground(periWhite);
        questionPanel.setBackground(periWhite);

        /* Add question panel on center panel */
        centerPanel.add(questionPanel, BorderLayout.CENTER);

    }

    /* Method that will help toggle between light and dark mode */
    public void toggleMode() {
        // Toggles the background and text colors between light and dark mode colors.
        if (centerPanel.getBackground().equals(periWhite)) {
            centerPanel.setBackground(mocha);
            questionPanel.setBackground(mocha);
        } else {
            centerPanel.setBackground(periWhite);
            questionPanel.setBackground(periWhite);
        }

        // Update text color to match with the current background color
        Color textColor = Color.BLACK; // Default to black
        if (centerPanel.getBackground().equals(periWhite)) {
            textColor = darkText;
        } else {
            textColor = blackText;
        }

        // Applies the text color to all labels in the question panel.
        objectLabel.setForeground(textColor);
        colorLabel.setForeground(textColor);
        numberLabel.setForeground(textColor);
        placeLabel.setForeground(textColor);
        soundLabel.setForeground(textColor);
        characterLabel.setForeground(textColor);
    }

    /* Getters */
    public JPanel getCenterPanel() {
        return centerPanel;
    }

    public JPanel getQuestionPanel() {
        return questionPanel;
    }

    public JTextField getObjectField() {
        return objectField;
    }

    public JTextField getColorField() {
        return colorField;
    }

    public JTextField getNumberField() {
        return numberField;
    }

    public JTextField getPlaceField() {
        return placeField;
    }

    public JTextField getSoundField() {
        return soundField;
    }

    public JTextField getCharacterField() {
        return characterField;
    }

    /* Setters */

    public void setObjectField(String object) {
        objectField.setText(object);
    }

    public void setColorField(String color) {
        colorField.setText(color);
    }

    public void setNumberField(String number) {
        numberField.setText(number);
    }

    public void setPlaceField(String place) {
        placeField.setText(place);
    }

    public void setSoundField(String sound) {
        soundField.setText(sound);
    }

    public void setCharacterField(String character) {
        characterField.setText(character);
    }
}
