import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawingComponent extends JComponent{
    private int width;
    private int height;
    private Color backgroundColor;
    private Square square;

    public DrawingComponent(int w, int h, Color c){
        width = w;
        height = h;
        backgroundColor = c;
        square = new Square(100, 250, 150, Color.ORANGE);
        setPreferredSize(new Dimension(width, height));
    }

    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        Rectangle2D.Double background = new Rectangle2D.Double(0, 0, width, height);
        g2d.setColor(backgroundColor);
        g2d.fill(background);

        square.draw(g2d);
    }

    public void setBackgroundColor(Color bgColor){
        backgroundColor = bgColor;
    }

    public Square getSquare(){
        return square;
    }

}
