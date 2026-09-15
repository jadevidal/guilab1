import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class StoryGenerator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createAndShowGUI);
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
        // Addign a event for the update method so the text is set to the greeting text field.
        header.getUpdateButton().addActionListener(e -> 
            center.getDisplayLabel().setText(header.getGreetingField().getText())
        );

        // Clear all test from textArea when clearBtn is clicked.
        footer.getClearButton().addActionListener(e -> 
            center.getTextArea().setText("")
        );

        // Exit the application.
        footer.getExitButton().addActionListener(e -> 
            System.exit(0)
        );

        frame.setVisible(true);
        
    }
}

