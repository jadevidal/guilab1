import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * 
 * Center.java
 * 
 * @author Tajrin Abdullah
 */
//TODO: SET UP THE QUESTIONS AND TEXTS
public class Center {
    private JPanel centerPanel = null;
    private JTextArea textArea = null;
    private JLabel displayLabel = null;

    public Center() {
        centerPanel = new JPanel(new BorderLayout(5, 5));


/* 
        textArea = new JTextArea(
            "This is a JTextArea.\n" +
            "You can type anything here.\n" +
            "It demonstrates a multi-line component."
        );
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        centerPanel.add(scrollPane, BorderLayout.CENTER);
    
*/
    }
    /* return elements so we can access their attributes. */
    public JPanel getCenterPanel() {
        return centerPanel;
    }

    public JTextArea getTextArea() {
        return textArea;
    }
}
