import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class SceneCanvas extends JComponent {
    Player user= new Player(0,-50);
    Mob npc = new Mob(40,270, 0.5);
    HealthBar npcHealth = npc.getHealthBar();
    boolean ableAttack = false;

    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh); //makes the rendering smoother

        user.draw(g2d);
        npcHealth.draw(g2d);
        if (npc.getDrawable()){
            npc.draw(g2d);  
        } 
    }

    public void update(KeyEvent e){
        user.update(e);
        npc.update(e);

        if(user.getX() < -300){
            ableAttack = true;
            // need to find a way to make a timer for this so that when an action is committed it starts
            // a timer of something and then after a certain amount of time the player can attack again.
        }

        int code = e.getKeyCode();

        if (code == KeyEvent.VK_Z && ableAttack){
            Kick.damage(npc);
            ableAttack = false;
        } else if (code == KeyEvent.VK_X && ableAttack){
            Punch.damage(npc);
            ableAttack = false;
        } else if (code == KeyEvent.VK_C && ableAttack){
            Fireball.damage(npc);
            ableAttack = false;
        }
    }


}