import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class SceneFrame{
    private JFrame frame= new JFrame();;
    private Container c=frame.getContentPane();
    private DrawingCanvas scene1= new DrawingCanvas();
    
    public void setUpGUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setTitle("Midterm Project");
        frame.add(scene1);

        // Make the frame visible after all components are added
        frame.setVisible(true);

    }

}
