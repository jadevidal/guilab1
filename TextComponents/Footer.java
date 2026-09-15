import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
   Author: Prof. Autorino
  
   Footer.java
 
   Simple swing based component buttons in a Flowlayout.
*/
public class Footer {
    private JPanel footerPanel = null;
    private JButton clearBtn = null;
    private JButton exit = null;

    public Footer() {

        footerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));

        clearBtn = new JButton("Clear");
        exit = new JButton("Exit");

        footerPanel.add(clearBtn);
        footerPanel.add(exit);
    }

    public JPanel getFooterPanel() {
        return footerPanel;
    }

    public JButton getClearButton() {
        return clearBtn;
    }

    public JButton getExitButton() {
        return exit;
    }

}