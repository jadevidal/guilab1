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
 * @author Tajrin Abdullah, Jade Vidal
 * 
 * Panel with title label.
 */
public class Header {

    /* Panle/Label Variable */
    private JPanel headerPanel = null;
    private JLabel titleLabel = null;

    /* Colors */
    Color lavender    = new Color(185, 176, 214); // #B9B0D6

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
        headerPanel.setBackground(lavender);

        titleLabel = new JLabel(title, SwingConstants.CENTER);
        titleLabel.setFont(titleLabel.getFont().deriveFont(Font.BOLD, 18f));
        titleLabel.setForeground(Color.WHITE);
        headerPanel.add(titleLabel);
    }

    /* Method that will help toggle between light and dark mode */
    public void toggleMode() {
        // Toggles the background between light and dark mode colors.
        if (headerPanel.getBackground().equals(lavender)) {
            headerPanel.setBackground(chocoBrown);
        } else {
            headerPanel.setBackground(lavender);
        }
    }

    /* Return elements so we can access their attributes. */
    public JPanel getHeaderPanel() {
        return headerPanel;
    }    

    public JLabel getTitleLabel() {
        return titleLabel;
    }

}