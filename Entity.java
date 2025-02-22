import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public interface Entity extends DrawingObject{
    public void draw(Graphics2D g2d);
    public void update(KeyEvent e);
    public void takeDamage(int amount);
}