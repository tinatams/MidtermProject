import java.awt.*;
import javax.swing.*;

public class SceneFrame{
    private JFrame frame= new JFrame();;
    private Container c=frame.getContentPane();
    private P1 scene1= new P1();
    private P2 scene2= new P2();

    //hit box boundary, for collisions with slime
    private int mobTopBoundary;
    private int mobBottomBoundary;

    
    public void setUpGUI() throws Exception{
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setTitle("Midterm Project");

        Player user = new Player("user");
        Player npc = new Player("npc");
        Container c = frame.getContentPane();
        KeyHandler kh = new KeyHandler();
        
        frame.addKeyListener(kh);   

        










        while (true) {
        if (kh.punch==true){ //and the hit box <-- to set up the hitboxes we can go like && player location less than mob*Boundary [meaning it is in within the boundary]
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
