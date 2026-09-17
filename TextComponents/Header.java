import java.awt.Color;
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
    private Color lavendar = new Color(185, 176, 214);

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
        headerPanel.setBackground(new Color(220, 234, 249));;

        titleLabel = new JLabel(title, SwingConstants.CENTER);
        titleLabel.setFont(titleLabel.getFont().deriveFont(Font.BOLD, 18f));
        titleLabel.setForeground(lavendar);
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