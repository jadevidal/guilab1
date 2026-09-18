import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * 
 * Footer.java
 * 
 * @author Tajrin Abdullah, Jade Vidal
 * 
 * Footer panel with buttons(clear, save, generate, switch mode)
 */
public class Footer {

    private JPanel footerPanel = null;
    private JButton clearBtn = null;
    private JButton saveBtn = null;
    private JButton generateBtn = null;
    private JButton modeBtn = null;
    private JButton exit = null;
    
    /* Colors */

    /* Light Mode Colors */
    Color iceBlue = new Color(220, 234, 249); // #DCEAF9

    /* Dark Mode Colors */
    Color caramel = new Color(212, 175, 55); // #D4AF37
    

    /**
     * Default constructor.
     */
    public Footer() {
        this("Clear", "Save", "Generate", "Switch Mode");
    }

    /**
     * Constructor with parameters.
     * @param clearText
     * @param saveText
     * @param generateText
     */
    public Footer(String clearText, String saveText, String generateText, String switchMode) {

        footerPanel = new JPanel();
        footerPanel.setLayout(new FlowLayout());
        footerPanel.setBackground(iceBlue);

        clearBtn = new JButton(clearText);
        saveBtn = new JButton(saveText);
        generateBtn = new JButton(generateText);
        modeBtn = new JButton(switchMode);
        exit = new JButton("Exit");

        footerPanel.add(clearBtn);
        footerPanel.add(saveBtn);
        footerPanel.add(generateBtn);
        footerPanel.add(modeBtn);
    }

    /* Method that will help toggle between light and dark mode */
    public void toggleMode() {
        // Toggles the background between light and dark mode colors.
        if (footerPanel.getBackground().equals(iceBlue)) {
            footerPanel.setBackground(caramel);
        } else {
            footerPanel.setBackground(iceBlue);
        }
    }

    /* Setter methods */
    public void setClearButton(String text) {
        clearBtn.setText(text);
    }

    public void setSaveButton(String text) {
        saveBtn.setText(text);
    }

    public void setGenerateButton(String text) {
        generateBtn.setText(text);
    }

    public void setModeButton(String text) {
        modeBtn.setText(text);
    }

    /* Getter methods */
    public JPanel getFooterPanel() {
        return footerPanel;
    }

    public JButton getClearButton() {
        return clearBtn;
    }

    public JButton getSaveButton() {
        return saveBtn;
    }

    public JButton getGenerateButton() {
        return generateBtn;
    }

    public JButton getModeButton() {
        return modeBtn;
    }
}