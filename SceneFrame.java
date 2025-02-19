import java.awt.*;
import javax.swing.*;

public class SceneFrame{
    private JFrame frame= new JFrame();;
    private Container c=frame.getContentPane();
    private P1 scene1= new P1();
    private P2 scene2= new P2();
    
    public void setUpGUI() throws Exception{
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setTitle("Midterm Project");
        while(true){
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

        // Make the frame visible after all components are added
        

    }

}
