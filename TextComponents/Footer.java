import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * 
 * Footer.java
 * 
 * @author Jade Vidal, Tajrin Abdullah
 * 
 * Footer panel with buttons(clear, save, generate, and switch mode.)
 */
public class Footer {

    /* Initialize variables */
    private JPanel footerPanel = null;
    private JButton clearBtn = null;
    private JButton saveBtn = null;
    private JButton generateBtn = null;
    private JButton modeBtn = null;
    private JButton exit = null; // Unused
    
    /* Colors */

    /* Light Mode Colors */
    private Color iceBlue = new Color(220, 234, 249); // #DCEAF9
    private Color darkText = new Color(40, 40, 50);    // gray

    /* Dark Mode Colors */
    private Color caramel = new Color(212, 175, 55); // #D4AF37
    private Color mocha = new Color(140, 111, 78);  // #8C6F4E

    /**
     * Default constructor.
     */
    public Footer() {
        this("Clear", "Save", "Generate", "Switch Mode");
    }

    /**
     * Constructor with parameters.
     * @param clearText the text for clear button
     * @param saveText the text for save button
     * @param generateText the text for generate button
     * @param switchMode the text for switch mode button
     */
    public Footer(String clearText, String saveText, String generateText, String switchMode) {

        footerPanel = new JPanel();
        footerPanel.setLayout(new FlowLayout());
        footerPanel.setBackground(iceBlue);

        clearBtn = new JButton(clearText);
        saveBtn = new JButton(saveText);
        generateBtn = new JButton(generateText);
        modeBtn = new JButton(switchMode);

        clearBtn.setForeground(iceBlue); 
        clearBtn.setBackground(Color.PINK); 
        clearBtn.setContentAreaFilled(false); 
        clearBtn.setOpaque(true); 
        clearBtn.setFocusPainted(false);

        saveBtn.setForeground(iceBlue); 
        saveBtn.setBackground(Color.PINK); 
        saveBtn.setContentAreaFilled(false); 
        saveBtn.setOpaque(true); 
        saveBtn.setFocusPainted(false);

        generateBtn.setForeground(iceBlue); 
        generateBtn.setBackground(Color.PINK); 
        generateBtn.setContentAreaFilled(false); 
        generateBtn.setOpaque(true); 
        generateBtn.setFocusPainted(false);

        modeBtn.setForeground(iceBlue); 
        modeBtn.setBackground(Color.PINK); 
        modeBtn.setContentAreaFilled(false); 
        modeBtn.setOpaque(true); 
        modeBtn.setFocusPainted(false);

        footerPanel.add(clearBtn);
        footerPanel.add(saveBtn);
        footerPanel.add(generateBtn);
        footerPanel.add(modeBtn);
    }

    /* Method that will help toggle between light and dark mode */
    public void toggleMode() {
        /* Toggles the background between light and dark mode colors. */
        if (footerPanel.getBackground().equals(iceBlue)) {

            /* Dark Mode */
            footerPanel.setBackground(caramel);
            
            clearBtn.setBackground(darkText);
            clearBtn.setForeground(mocha);

            saveBtn.setBackground(darkText);
            saveBtn.setForeground(mocha);

            generateBtn.setBackground(darkText);
            generateBtn.setForeground(mocha);

            modeBtn.setBackground(darkText);
            modeBtn.setForeground(mocha);

        } else {

            /* Light Mode */
            footerPanel.setBackground(iceBlue);

            clearBtn.setBackground(Color.PINK);
            clearBtn.setForeground(iceBlue);

            saveBtn.setBackground(Color.PINK);
            saveBtn.setForeground(iceBlue);

            generateBtn.setBackground(Color.PINK);
            generateBtn.setForeground(iceBlue);

            modeBtn.setBackground(Color.PINK);
            modeBtn.setForeground(iceBlue);
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