import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * 
 * Footer.java
 * 
 * @author Tajrin Abdullah, Jade Vidal
 * 
 * Footer panel with buttons(clear, save, generate)
 */
public class Footer {

    private JPanel footerPanel = null;
    private JButton clearBtn = null;
    private JButton saveBtn = null;
    private JButton generateBtn = null;
    private JButton exit = null;

    /**
     * Default constructor.
     */
    public Footer() {
        this("Clear", "Save", "Generate");
    }

    /**
     * Constructor with parameters.
     * @param clearText
     * @param saveText
     * @param generateText
     */
    public Footer(String clearText, String saveText, String generateText) {

        footerPanel = new JPanel();
        footerPanel.setLayout(new FlowLayout());

        clearBtn = new JButton(clearText);
        saveBtn = new JButton(saveText);
        generateBtn = new JButton(generateText);
        exit = new JButton("Exit");

        footerPanel.add(clearBtn);
        footerPanel.add(saveBtn);
        footerPanel.add(generateBtn);
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
}