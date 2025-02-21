import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class SceneCanvas extends JComponent {
    Player user= new Player(0,-50);

    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh); //makes the rendering smoother

        user.draw(g2d);
    }

    public void update(KeyEvent e){
        user.update(e);
    }


}