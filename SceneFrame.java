import java.awt.*;
import javax.swing.*;

public class SceneFrame{
    private JFrame frame= new JFrame();;
    private Container c=frame.getContentPane();
    private P1 scene1= new P1(0,0);
    private P2 scene2= new P2(0,0);
    
    public void setUpGUI() throws Exception{
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setTitle("Midterm Project");

        Player user = new Player("user");
        Player npc = new Player("npc");
        Container c=frame.getContentPane();
        KeyHandler kh = new KeyHandler();
        
        frame.addKeyListener(kh);
        while (true) {
        if (kh.punch==true){ //and the hit box 
            Punch.animate(user);
            Punch.damage(npc);
            c.setBackground(Color.red);
        }
        else if (kh.kick == true){
            Kick.animate(user);
            Kick.damage(npc); 
            c.setBackground(Color.black);
        }
        else if (kh.fireball == true){
            Fireball.animate(user);
            Fireball.damage(npc);
            c.setBackground(Color.BLUE);
        }
        else{
            frame.add(scene1);
            frame.setVisible(true);
            Thread.sleep(300);
            frame.remove(scene1);
            frame.revalidate();
            frame.repaint();
            
            frame.add(scene2);
            Thread.sleep(300);
            frame.setVisible(true);
            frame.remove(scene2);
            frame.revalidate();
            frame.repaint();
        }
        }
        

    }

}
