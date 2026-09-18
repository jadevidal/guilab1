import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

/**
 * A custom JLabel that supports drop shadows and other rich text effects 
 * based on Hack #2 from Swing Hacks.
 * 
 * RichJLabel.java 
 * 
 * @author Chris Adamson, Joshua Marinacci
 */
public class RichJLabel extends JLabel {

    private int tracking;
    // Constructor for RichJLabel which takes the text and tracking value(letterspace) as parameters.
    public RichJLabel(String text, int tracking) {
        super(text);
        this.tracking = tracking;
    }
    // Sets up the left shadow offset and color.
    private int left_x, left_y, right_x, right_y;
    private Color left_color, right_color;
    public void setLeftShadow(int x, int y, Color color) {
        left_x = x;
        left_y = y;
        left_color = color;
    }

    // Sets up the right shadow offset and color.
    public void setRightShadow(int x, int y, Color color) {
        right_x = x;
        right_y = y;
        right_color = color;
    }

    // Overriding getPreferredSize() for shadows and tracking.
    public Dimension getPreferredSize() {

        String text = getText();
        FontMetrics fm = this.getFontMetrics(getFont());
        int w = fm.stringWidth(text);

        w += (text.length()-1)*tracking;
        w += left_x + right_x;
        int h = fm.getHeight();
        h += left_y + right_y;
        return new Dimension(w,h);
    }

    // Overriding paintComponent() to draw shadows and main text.
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();

        g2.setRenderingHint(
            RenderingHints.KEY_TEXT_ANTIALIASING,
            RenderingHints.VALUE_TEXT_ANTIALIAS_ON
        );

        char[] chars = getText().toCharArray();
        FontMetrics fm = this.getFontMetrics(getFont());
        int h = fm.getAscent();

        int x = 0;
        // Draw each character with shadows and main text.
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            int w = fm.charWidth(ch) + tracking;
            g2.setColor(left_color);
            g2.drawString(String.valueOf(chars[i]), x - left_x, h - left_y);
            g2.setColor(right_color);
            g2.drawString(String.valueOf(chars[i]), x + right_x, h + right_y);
            g2.setColor(getForeground());
            g2.drawString(String.valueOf(chars[i]), x, h);
            x += w;
        }
        g2.dispose();
    }// end paintComponent()

}