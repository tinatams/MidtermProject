
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

public class SceneStarter {
    public static void main(String[] args) {
        Player user = new Player("user");
        Player npc = new Player("npc");
        JFrame frame = new JFrame();
        frame.setSize(800,600);
        frame.setVisible(true);
        Container c=frame.getContentPane();


        KeyHandler kh = new KeyHandler();
        
        frame.addKeyListener(kh);

        while (true) {
        if (kh.punch==true){ //and the hit box 
            Punch.animate(user);
            Punch.damage(npc);
            c.setBackground(Color.red);
            System.out.println("punch");

        }

        if (kh.kick == true){
            Kick.animate(user);
            Kick.damage(npc); 
            c.setBackground(Color.black);
        }

        if (kh.fireball == true){
            Fireball.animate(user);
            Fireball.damage(npc);
            c.setBackground(Color.BLUE);
        }

        }

    }
}