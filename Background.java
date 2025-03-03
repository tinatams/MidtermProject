/**
    Health Bar Class
 
	@author Martina Amale M. Llamas (242648); Zoe Angeli G. Uy (246707)
	@version March 3, 2025
	
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
**/

import java.awt.*;
import java.awt.geom.*;

public class Background{
    public void draw(Graphics2D g2d){
        
        Rectangle2D.Double column1_lava= new Rectangle2D.Double(-61.53,229.66,600,180);

        Rectangle2D.Double lava= new Rectangle2D.Double(0,340.39,800,236.61);
        Rectangle2D.Double platform= new Rectangle2D.Double(0,450.59,800,180);
        Rectangle2D.Double up_platform= new Rectangle2D.Double(386.29,0,276.17,126.16);
        Rectangle2D.Double up_platform2= new Rectangle2D.Double(658.21,0,81.79,91.16);
        Triangle up_slant= new Triangle(662,86,41,41);
        Triangle up_slant2= new Triangle(739.46,-74.33,165.33,165.33);
        Triangle up_slant3= new Triangle(258.25,-37.37,128.79,128.79);
        Rectangle2D.Double h1_lava= new Rectangle2D.Double(54.15,394.97,45.98,6.11);
        Rectangle2D.Double h2_lava= new Rectangle2D.Double(129.8,358.4,45.98,6.11);
        Rectangle2D.Double h3_lava= new Rectangle2D.Double(137.44,428.25,45.98,6.11);
        Rectangle2D.Double h4_lava= new Rectangle2D.Double(186.18,381.9,45.98,6.11);
        Rectangle2D.Double h5_lava= new Rectangle2D.Double(229.35,404.14,45.98,4.08);
        Rectangle2D.Double h6_lava= new Rectangle2D.Double(249.78,367.87,45.98,6.11);
        Rectangle2D.Double h7_lava= new Rectangle2D.Double(307.86,390.05,45.98,4.08);
        Rectangle2D.Double h8_lava= new Rectangle2D.Double(326.61,416.78,45.98,4.08);
        Rectangle2D.Double h9_lava= new Rectangle2D.Double(366.65,376.97,45.98,4.08);
        Rectangle2D.Double h10_lava= new Rectangle2D.Double(518.64,361.45,45.98,6.11);
        Rectangle2D.Double h11_lava= new Rectangle2D.Double(394.9,411.09,45.98,4.08);
        Rectangle2D.Double h12_lava= new Rectangle2D.Double(444.62,372.9,40.98,4.08 );
        Rectangle2D.Double h13_lava= new Rectangle2D.Double(441.14,425.36,45.98,6.11);
        Rectangle2D.Double h14_lava= new Rectangle2D.Double(470.38,388.01,40.98,4.08);
        Rectangle2D.Double h15_lava= new Rectangle2D.Double(569.75,419.75,45.98,4.08);
        Rectangle2D.Double h16_lava= new Rectangle2D.Double(508.09,431.05,45.98,6.11);
        Rectangle2D.Double h17_lava= new Rectangle2D.Double(560.38,394.97,45.98,4.08);
        Rectangle2D.Double h18_lava= new Rectangle2D.Double(610.36,363.8,40.98,4.08);
        Rectangle2D.Double h19_lava= new Rectangle2D.Double(649.37,376.02,45.98,6.11);
        Rectangle2D.Double h20_lava= new Rectangle2D.Double(647.28,427.23,40.98,4.08);
        Rectangle2D.Double h21_lava= new Rectangle2D.Double(723.17,361.45,40.98,6.11);
        Rectangle2D.Double h22_lava= new Rectangle2D.Double(695.34,398.03,33.14,4.08);
        Rectangle2D.Double h23_lava= new Rectangle2D.Double(741.21,431.62,40.98,6.11);
        Rectangle2D.Double h24_lava= new Rectangle2D.Double(394.9,350.09,45.98,4.08);
        Rectangle2D.Double h25_lava= new Rectangle2D.Double(21.21,421.62,40.98,6.11);
        Rectangle2D.Double h26_lava= new Rectangle2D.Double(16.21,370.62,40.98,6.11);

        Stone1 stone=new Stone1(410.25,112.16);
        Stone1 stone1=new Stone1(390.25,112.16);
        Stone1 stone2=new Stone1(375.64,95.16);
        Stone1 stone3=new Stone1(397.64,95.16);
        Stone1 stone4=new Stone1(419.64,95.16);
        
        Stone1 stone5=new Stone1(456.45,112.16);
        Stone1 stone6=new Stone1(478.45,112.16);
        Stone1 stone7=new Stone1(500.45,112.16);
        Stone1 stone8=new Stone1(522.45,112.16);
        Stone1 stone9=new Stone1(544.45,112.16);
        Stone1 stone10=new Stone1(566.45,112.16);
        Stone1 stone11=new Stone1(588.45,112.16);

        Stone1 stone12=new Stone1(610.45,112.16);
        Stone1 stone13=new Stone1(632.45,112.16);
        Stone2 rock3=new Stone2(668.45,95.16);

        Stone1 stone14=new Stone1(608.45,95.16);
        Stone1 stone15=new Stone1(630.45,95.16);
        Stone1 stone16=new Stone1(652.45,95.16);

        Stone1 stone17=new Stone1(668.45,80.16);
        Stone1 stone18=new Stone1(690.45,80.16);
        Stone1 stone19=new Stone1(712.45,80.16);
        

        Stone2 rock=new Stone2(375.82,81.66);
        Stone2 rock1=new Stone2(441.82,112.16);
        Stone2 rock2=new Stone2(385.64,107.66);

    AffineTransform originalTransform = g2d.getTransform();

    g2d.translate(500, -25);
    originalTransform=g2d.getTransform();
    g2d.rotate(Math.toRadians(90),(-61.53+600/2),(229.66+180/2));
    g2d.setColor(new Color(200, 96, 78));
    g2d.fill(column1_lava);
    g2d.setTransform(originalTransform);

    g2d.translate(-500, 25);

    originalTransform=g2d.getTransform();
    
    g2d.rotate(Math.toRadians(90),(-61.53+600/2),(229.66+180/2));
    g2d.setColor(new Color(200, 96, 78));
    g2d.fill(column1_lava);
    g2d.setTransform(originalTransform);

    
    g2d.setColor(new Color(200, 96, 78));
    g2d.fill(lava);
    g2d.setColor(new Color(71, 19, 66));
    g2d.fill(platform);

    originalTransform = g2d.getTransform();

    g2d.setColor(new Color(71, 19, 66));
    g2d.fill(up_platform);
    g2d.fill(up_platform2);

    g2d.rotate(Math.toRadians(90),(662+41/2),(86+41/2));
    up_slant.draw(g2d,new Color(71, 19, 66));
    g2d.setTransform(originalTransform);

    g2d.rotate(Math.toRadians(90),(739.46+165.33/2),(-74.33+165.33/2));
    up_slant2.draw(g2d,new Color(71, 19, 66));
    g2d.setTransform(originalTransform);

    g2d.rotate(Math.toRadians(-180),(258.25+128.79/2),(-37.37+128.79/2));
    up_slant3.draw(g2d,new Color(71, 19, 66));
    g2d.setTransform(originalTransform);
    
    g2d.rotate(Math.toRadians(-180),(375.64+27/2),(95.16+18/2));
    stone2.draw(g2d);
    g2d.setTransform(originalTransform);
    
    rock.draw(g2d);
    rock1.draw(g2d);
    stone.draw(g2d);
    stone1.draw(g2d);
    stone3.draw(g2d);
    rock2.draw(g2d);
    stone4.draw(g2d);
    stone5.draw(g2d);
    stone6.draw(g2d);
    stone7.draw(g2d);
    stone8.draw(g2d);
    stone9.draw(g2d);
    stone10.draw(g2d);
    stone11.draw(g2d);
    stone12.draw(g2d);
    stone13.draw(g2d);
    stone14.draw(g2d);
    stone15.draw(g2d);
    stone16.draw(g2d);
    rock3.draw(g2d);

    stone17.draw(g2d);
    stone18.draw(g2d);
    stone19.draw(g2d);

    g2d.rotate(Math.toRadians(-180),(478.45+27/2),(119.16+18/2));
    stone6.draw(g2d);
    g2d.setTransform(originalTransform);

    g2d.rotate(Math.toRadians(-180),(500.45+27/2),(119.16+18/2));
    stone7.draw(g2d);
    g2d.setTransform(originalTransform);

    g2d.rotate(Math.toRadians(-180),(566.45+27/2),(119.16+18/2));
    stone10.draw(g2d);
    g2d.setTransform(originalTransform);

    g2d.translate(-350, -50);
    originalTransform = g2d.getTransform();
    g2d.setColor(new Color(71, 19, 66));
    g2d.fill(up_platform);
    g2d.fill(up_platform2);

    g2d.rotate(Math.toRadians(90),(662+41/2),(86+41/2));
    up_slant.draw(g2d,new Color(71, 19, 66));
    g2d.setTransform(originalTransform);

    g2d.rotate(Math.toRadians(90),(739.46+165.33/2),(-74.33+165.33/2));
    up_slant2.draw(g2d,new Color(71, 19, 66));
    g2d.setTransform(originalTransform);

    g2d.rotate(Math.toRadians(-180),(258.25+128.79/2),(-37.37+128.79/2));
    up_slant3.draw(g2d,new Color(71, 19, 66));
    g2d.setTransform(originalTransform);
    
    g2d.rotate(Math.toRadians(-180),(375.64+27/2),(95.16+18/2));
    stone2.draw(g2d);
    g2d.setTransform(originalTransform);
    
    rock.draw(g2d);
    rock1.draw(g2d);
    stone.draw(g2d);
    stone1.draw(g2d);
    stone3.draw(g2d);
    rock2.draw(g2d);
    stone4.draw(g2d);
    stone5.draw(g2d);
    stone6.draw(g2d);
    stone7.draw(g2d);
    stone8.draw(g2d);
    stone9.draw(g2d);
    stone10.draw(g2d);
    stone11.draw(g2d);
    stone12.draw(g2d);
    stone13.draw(g2d);
    stone14.draw(g2d);
    stone15.draw(g2d);
    stone16.draw(g2d);
    rock3.draw(g2d);

    stone17.draw(g2d);
    stone18.draw(g2d);

    g2d.rotate(Math.toRadians(-180),(478.45+27/2),(119.16+18/2));
    stone6.draw(g2d);
    g2d.setTransform(originalTransform);

    g2d.rotate(Math.toRadians(-180),(500.45+27/2),(119.16+18/2));
    stone7.draw(g2d);
    g2d.setTransform(originalTransform);

    g2d.rotate(Math.toRadians(-180),(566.45+27/2),(119.16+18/2));
    stone10.draw(g2d);
    g2d.setTransform(originalTransform);

    g2d.translate(350, 50);
    
    g2d.setColor(new Color(252, 174, 25));
    g2d.fill(h1_lava);
    g2d.fill(h2_lava);
    g2d.fill(h3_lava);
    g2d.fill(h4_lava);
    g2d.fill(h5_lava);
    g2d.fill(h6_lava);
    g2d.fill(h7_lava);
    g2d.fill(h8_lava);
    g2d.fill(h9_lava);
    g2d.fill(h10_lava);
    g2d.fill(h11_lava);
    g2d.fill(h12_lava);
    g2d.fill(h13_lava);
    g2d.fill(h14_lava);
    g2d.fill(h15_lava);
    g2d.fill(h16_lava);
    g2d.fill(h17_lava);
    g2d.fill(h18_lava);
    g2d.fill(h19_lava);
    g2d.fill(h20_lava);
    g2d.fill(h21_lava);
    g2d.fill(h22_lava);
    g2d.fill(h23_lava);
    g2d.fill(h24_lava);
    g2d.fill(h25_lava);
    g2d.fill(h26_lava);
    
    }
}

 
