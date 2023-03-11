import java.awt.*;
import java.awt.geom.*;


public class Square {

    private double x;
    private double y;
    private double size;
    private Color color;


    public Square(double x, double y, double s, Color c){
        this.x = x;
        this.y = y;
        size = s;
        color = c;
    }

    public void draw(Graphics2D g2d){
        Rectangle2D.Double square = new Rectangle2D.Double(x, y, size, size);
        g2d.setColor(color);
        g2d.fill(square);


    }

    public void adjustX(double distance){
        x += distance;
        
    }
}