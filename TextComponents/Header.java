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
 * @author Jade Vidal, Tajrin Abdullah
 * 
 * Panel with title label with customized color modes. 
 * The title uses RichJLabel hack.
 */
public class Header {

    /* Panle/Label Variable */
    private JPanel headerPanel = null;
    private RichJLabel titleLabel = null;

    /* Light Mode Colors */
    private Color lavender = new Color(185, 176, 214); // #B9B0D6
    private Color periWhite = new Color(237, 235, 250); // #EDEBFA
    private Color blushPink = new Color(230, 180, 195); // #E6B4C3
    private Color rosePink = new Color(214, 176, 185); // #D6B0B9
    private Color tealBlue = new Color(176, 205, 200); // #B0CDC8
    private Color dustyTeal = new Color(170, 195, 205); // #AAC3CD
    private Color deepTeal = new Color(60, 120, 115); // #3C7873
    private Color sageTeal = new Color(175, 205, 190); // #AFCDBE


    /* Dark Mode Colors */
    private Color caramel = new Color(212, 175, 55); // #D4AF37
    private Color mocha = new Color(140, 111, 78);  // #8C6F4E
    private Color chocoBrown = new Color(75, 46, 30);   // #4B2E1E
    private Color blackText = new Color(26,26,23);      // #1A1A17

    /**
     * Default Constructor
     */
    public Header() { this("Story Generator"); }
    
    
    /**
     * Constructor with parameter
     * @param title title of the story/program
     */
    public Header(String title) {
        // Create a panel with a centered flow layout.
        headerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        headerPanel.setBackground(lavender);

        titleLabel = new RichJLabel(title, 0);
        titleLabel.setLeftShadow(1,1, tealBlue);
        titleLabel.setRightShadow(1,2, rosePink);
        titleLabel.setForeground(periWhite);
        titleLabel.setFont(titleLabel.getFont().deriveFont(Font.BOLD, 18f));
        headerPanel.add(titleLabel);
    }

    /* Method that will help toggle between light and dark mode */
    public void toggleMode() {

        if (headerPanel.getBackground().equals(lavender)) {

            /* Dark Mode */
            headerPanel.setBackground(chocoBrown);
            titleLabel.setLeftShadow(1,1, mocha);
            titleLabel.setRightShadow(1,2, blackText);
            titleLabel.setForeground(caramel);

        } else {
            /* Light Mode */
            headerPanel.setBackground(lavender);
            titleLabel.setLeftShadow(1,1, tealBlue);
            titleLabel.setRightShadow(1,2, rosePink);
            titleLabel.setForeground(periWhite);
        }
    }

    /* 
      Return elements so we can access their attributes.
      Getter Methods
    */
    public JPanel getHeaderPanel() {
        return headerPanel;
    }    

    public JLabel getTitleLabel() {
        return titleLabel;
    }

}