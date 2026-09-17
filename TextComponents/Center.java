import java.awt.BorderLayout;
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

//TODO: SET UP THE QUESTIONS AND TEXTS

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
        objectField = new JTextField(object, 15);
        questionPanel.add(objectLabel);
        questionPanel.add(objectField);

        /* Color Name */
        colorLabel = new JLabel("   Favorite color:");
        colorField = new JTextField(color, 15);
        questionPanel.add(colorLabel);
        questionPanel.add(colorField);

        /* Big Number */
        numberLabel = new JLabel("   A big number:");
        numberField = new JTextField(number, 15);
        questionPanel.add(numberLabel);
        questionPanel.add(numberField);


        /* Place Name */
        placeLabel = new JLabel("   Name a place:");
        placeField = new JTextField(place, 15);
        questionPanel.add(placeLabel);
        questionPanel.add(placeField);

        /* Sound Type */
        soundLabel = new JLabel("   Type of sound:");
        soundField = new JTextField(sound, 15);
        questionPanel.add(soundLabel);
        questionPanel.add(soundField);

        /* Character Name */
        characterLabel = new JLabel("   Name a character:");
        characterField = new JTextField(character, 15);
        questionPanel.add(characterLabel);
        questionPanel.add(characterField);

        /* Add question panel on center panel */
        centerPanel.add(questionPanel, BorderLayout.CENTER);

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
    public void setCenterPanel(JPanel centerPanel) {
        this.centerPanel = centerPanel;
    }

    public void setQuestionPanel(JPanel questionPanel) {
        this.questionPanel = questionPanel;
    }

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
