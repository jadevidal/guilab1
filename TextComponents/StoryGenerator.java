import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * 
 * StoryGenerator.java
 * 
 * @author Tajrin Abdullah, Jade Vidal
 * 
 */
public class StoryGenerator {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StoryGenerator::createAndShowGUI);
    }

    public static void createAndShowGUI() {
        // Main Window
        JFrame frame = new JFrame("Text Components");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout(10, 0));

        /* Header Panel */
        Header header = new Header();
        frame.add(header.getHeaderPanel(), BorderLayout.NORTH);
        
        /* Center Panel */
        Center center = new Center();
        frame.add(center.getCenterPanel(), BorderLayout.CENTER);
        
        /* Footer Panel */
        Footer footer = new Footer();
        frame.add(footer.getFooterPanel(), BorderLayout.SOUTH);

        /* Event Listeners */

        // Save button prints the user's inputs into system out.
        footer.getSaveButton().addActionListener(e -> {

            System.out.println("\n|======= User Inputs =======|"); 

            System.out.println("Object: " + center.getObjectField().getText());
            System.out.println("Color: " + center.getColorField().getText());
            System.out.println("Number: " + center.getNumberField().getText());
            System.out.println("Place: " + center.getPlaceField().getText());
            System.out.println("Sound: " + center.getSoundField().getText());
            System.out.println("Character: " + center.getCharacterField().getText()); 
            
            System.out.println("|===========================|\n");
        });

        // Clear button clears the textfields
        footer.getClearButton().addActionListener(e -> {
            center.setObjectField("");
            center.setColorField("");
            center.setNumberField("");
            center.setPlaceField("");
            center.setSoundField("");
            center.setCharacterField("");
        });

        // Generate button prints the story into system out
        footer.getGenerateButton().addActionListener(e -> { 
            String generateStory = "\n" + center.getCharacterField().getText() + " woke up alone in the middle of nowhere. " +
                           "He looked\nto his left and saw a half-decayed wooden sign\nthat read, " +
                           "\"20 miles left until " + center.getPlaceField().getText() + ".\"\n\n" +
                           center.getCharacterField().getText() + " walked through the " +
                           center.getColorField().getText() + "-tinted, misty \nforest until he heard " +
                           center.getSoundField().getText() + " all around him.\n\n" +
                           
                           "He increased his pace, trying not to panic, as\nfootsteps grew louder behind him. " +
                           "He turned\nabruptly to check, but found nothing.\n\n" +

                           "His worry eased, but before he turned back, a blunt\n" +
                           center.getObjectField().getText() + " hit him from behind.\n" +
                           "\nAs he fell to the ground, he saw the figures of " +
                           center.getNumberField().getText() + " creatures\nstanding silently behind " +
                           "the person holding the " + center.getObjectField().getText() + ".\n"; 
            
            System.out.println("\n|===== Generated Story =====|");
            System.out.println(generateStory);
            System.out.println("|===========================|\n");
        });

        // Switch mode from light mode to dark mode and vice versa
        footer.getModeButton().addActionListener(e -> {
            header.toggleMode();
            center.toggleMode();
            footer.toggleMode();
        });
        frame.setVisible(true);
        
    }
}

