import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class SceneCanvas extends JComponent {
    Mob pleaseLord = new Mob(100,120,0.5);

    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh); //makes the rendering smoother

        pleaseLord.draw(g2d);
    }

    public void update(KeyEvent e){
        pleaseLord.update(e);
    }


}
