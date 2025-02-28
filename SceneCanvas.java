import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.geom.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class SceneCanvas extends JComponent {
    // put this so that it initializes inside of constructor;
    Player user= new Player(0,-50);
    Mob npc = new Mob(40,270, 0.5);
    HealthBar npcHealth = npc.getHealthBar();
    HealthBar userHealth = user.getHealthBar();
    boolean ableAttack = false;
    boolean scheduleAttack = false;

    Fire fireBall = new Fire(0.3,150,346);

    Random rand = new Random();
    

    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh); //makes the rendering smoother

        user.draw(g2d);
        
        AffineTransform reset = g2d.getTransform();
        g2d.scale(-1, 1);
        userHealth.draw(g2d);
        g2d.setTransform(reset);

        npcHealth.draw(g2d);

        if (npc.getDrawable()){
            npc.draw(g2d);
            fireBall.draw(g2d);  
        } 

        if (!scheduleAttack && (npc.dead()!= true)){
            scheduleAttack();
        }
    }

    public void update(KeyEvent e){
        user.update(e);
        npc.update(e);

        if(user.getX() < -270){
            ableAttack = true;
        }
        else{
            ableAttack = false;
        }

        int code = e.getKeyCode();

        if (code == KeyEvent.VK_Z && ableAttack){
            Kick.damage(npc);
        } else if (code == KeyEvent.VK_X && ableAttack){
            Punch.damage(npc);
        } else if (code == KeyEvent.VK_C && ableAttack){
            Fireball.damage(npc);
        }

        if (npc.getHealth() <= 0){
            npc.setVersion(181);
            npc.dead();
        }

    }

    public void scheduleAttack(){
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            @Override 
            public void run(){
                if (npc.dead() != true){
                    fireBall.setAttacking(true);
                    npc.setVersion(61); 
                    if (ableAttack) Fireball.damage(user);
                    scheduleAttack = false;
                }
            }
        };

        int randomInterval = (rand.nextInt(10-3) + 3)*1000;
        timer.schedule(task, randomInterval );
        scheduleAttack = true;

        Timer timer2 = new Timer();
        TimerTask task2 = new TimerTask(){
            @Override 
            public void run(){
                if (npc.dead() != true){
                    fireBall.setDrawable(true);
                }
            }
        };

        timer2.schedule(task2, (randomInterval - 1000));

    }

}