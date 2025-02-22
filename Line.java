import java.awt.*;

public class Line implements DrawingObject {
    public int x1,y1,x2,y2;
    float thickness;
    Color color;

    public Line(int x1, int y1, int x2, int y2, float thickness, Color color) {
        this.color = color;
        this.thickness= thickness;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public void draw(Graphics2D g2d){
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.drawLine(x1, y1, x2, y2);
    };

}