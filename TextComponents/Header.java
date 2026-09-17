import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * 
 * Header.java
 * 
 * @author Tajrin Abdullah
 * 
 * Panel with title label.
 */
public class Header {
    private JPanel headerPanel = null;
    private JLabel titleLabel = null;

    /**
     * Default Constructor
     */
    public Header(){
        this("Story Generator");
    }
    
    /**
     * Constructor with param
     * @param title title of the story/program
     */
    public Header(String title) {
        // Create a panel with a centered flow layout.
        headerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));

        titleLabel = new JLabel(title, SwingConstants.CENTER);
        titleLabel.setFont(titleLabel.getFont().deriveFont(Font.BOLD, 18f));
        headerPanel.add(titleLabel);
    }

    /* Return elements so we can access their attributes. */
    public JPanel getHeaderPanel() {
        return headerPanel;
    }    

    public JLabel getTitleLabel() {
        return titleLabel;
    }

}