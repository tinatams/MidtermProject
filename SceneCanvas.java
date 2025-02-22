import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class SceneCanvas extends JComponent {
    Player user= new Player(0,-50);
    Mob npc = new Mob(40,270, 0.5);
    boolean ableAttack = false;

    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh); //makes the rendering smoother

        user.draw(g2d);
        if (npc.getDrawable()){
            npc.draw(g2d);  
        } 
    }

    public void update(KeyEvent e){
        user.update(e);
        npc.update(e);

        if(user.getX() < -300){
            ableAttack = true;
        }

        int code = e.getKeyCode();

        if (code == KeyEvent.VK_Z && ableAttack){
            Kick.damage(npc);
        } else if (code == KeyEvent.VK_X && ableAttack){
            Punch.damage(npc);
        } else if (code == KeyEvent.VK_C && ableAttack){
            Fireball.damage(npc);
        }
        
        System.out.print(npc.getHealth());
    }


}