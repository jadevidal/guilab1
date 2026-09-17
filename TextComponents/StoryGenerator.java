import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

//TODO: Incorporate Hcks 1 and 4 (use colors) 
public class StoryGenerator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(StoryGenerator::createAndShowGUI);
    }

    public static void createAndShowGUI() {
        // Main Window
        JFrame frame = new JFrame("Text Components");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 350);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout(10, 10));

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

            System.out.println("|======= User Inputs =======|");
            
            System.out.println("Object: " + center.getObject());
            System.out.println("Color: " + center.getColor());
            System.out.println("Number: " + center.getNumber());
            System.out.println("Place: " + center.getPlace());
            System.out.println("Sound: " + center.getSound());
            System.out.println("Character: " + center.getCharacter());

            System.out.println("|===========================|");
        });


        // Clear button clears the textfields
        footer.getClearButton().addActionListener(e -> {
            center.setObject("");
            center.setColor("");
            center.setNumber("");
            center.setPlace("");
            center.setSound("");
            center.setCharacter("");
        });


        // Generate button prints the story into system out
        footer.getGenerateButton().addActionListener(e -> {
            String story = center.getCharacter() + " woke up alone in the middle of nowhere. " +
                           "He looked to his left and saw a half-decayed wooden sign that read, " +
                           "\"20 miles left until " + center.getPlace() + ".\" " +
                           center.getCharacter() + " walked through the " +
                           center.getColor() + "-tinted, misty forest until he heard " +
                           center.getSound() + " all around him. " +
                           "He increased his pace, trying not to panic, as footsteps grew louder behind him. " +
                           "He turned abruptly to check, but found nothing. " +
                           "His worry eased, but before he turned back, a blunt " +
                           center.getObject() + " hit him from behind. " +
                           "As he fell to the ground, he saw the figures of " +
                           center.getNumber() + " creatures standing silently behind " +
                           "the person holding the " + center.getObject() + ".";

            System.out.println("|===== Generated Story =====|");
            System.out.println(story);
            System.out.println("|===========================|");
        });
        frame.setVisible(true);
        
    }
}

