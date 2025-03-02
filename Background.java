import java.awt.*;
import java.awt.geom.AffineTransform;

public class Background{
    public void draw(Graphics2D g2d){
        Crescent c=new Crescent(200,130);
        Crescent c1=new Crescent(240,190);
        Crescent c2=new Crescent(200,240);
        Crescent c3=new Crescent(240,300);
        Crescent c4=new Crescent(200,360);
        Square column1_lava= new Square(-61.53,229.66,600,180);
        Square h1_lava= new Square(54.15,394.97,45.98,6.11);
        Square h2_lava= new Square(129.8,358.4,45.98,6.11);
        Square h3_lava= new Square(137.44,428.25,45.98,6.11);
        Square h4_lava= new Square(186.18,381.9,45.98,6.11);
        Square h5_lava= new Square(229.35,404.14,45.98,4.08);
        Square h6_lava= new Square(249.78,367.87,45.98,6.11);
        Square h7_lava= new Square(307.86,390.05,45.98,4.08);
        Square h8_lava= new Square(326.61,416.78,45.98,4.08);
        Square h9_lava= new Square(366.65,376.97,45.98,4.08);
        Square h10_lava= new Square(518.64,361.45,45.98,6.11);
        Square h11_lava= new Square(394.9,411.09,45.98,4.08);
        Square h12_lava= new Square(444.62,372.9,40.98,4.08 );
        Square h13_lava= new Square(441.14,425.36,45.98,6.11);
        Square h14_lava= new Square(470.38,388.01,40.98,4.08);
        Square h15_lava= new Square(569.75,419.75,45.98,4.08);
        Square h16_lava= new Square(508.09,431.05,45.98,6.11);
        Square h17_lava= new Square(560.38,394.97,45.98,4.08);
        Square h18_lava= new Square(610.36,363.8,40.98,4.08);
        Square h19_lava= new Square(649.37,376.02,45.98,6.11);
        Square h20_lava= new Square(647.28,427.23,40.98,4.08);
        Square h21_lava= new Square(723.17,361.45,40.98,6.11);
        Square h22_lava= new Square(695.34,398.03,33.14,4.08);
        Square h23_lava= new Square(741.21,431.62,40.98,6.11);
        Square h24_lava= new Square(394.9,350.09,45.98,4.08);
        Square h25_lava= new Square(21.21,421.62,40.98,6.11);
        Square h26_lava= new Square(16.21,370.62,40.98,6.11);

        Square lava= new Square(0,340.39,800,236.61);
        Square platform= new Square(0,450.59,800,180);
        Square up_platform= new Square(386.29,0,276.17,126.16);
        Square up_platform2= new Square(658.21,0,81.79,91.16);
        Triangle up_slant= new Triangle(662,86,41,41);
        Triangle up_slant2= new Triangle(739.46,-74.33,165.33,165.33);
        Triangle up_slant3= new Triangle(258.25,-37.37,128.79,128.79);

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
    column1_lava.draw(g2d,new Color(200, 96, 78));
    g2d.setTransform(originalTransform);
    c.draw(g2d,new Color(252, 174, 25));
    c1.draw(g2d,new Color(252, 174, 25));
    c2.draw(g2d,new Color(252, 174, 25));
    c3.draw(g2d,new Color(252, 174, 25));
    c4.draw(g2d,new Color(252, 174, 25));

    g2d.translate(-500, 25);

    originalTransform=g2d.getTransform();
    
    g2d.rotate(Math.toRadians(90),(-61.53+600/2),(229.66+180/2));
    column1_lava.draw(g2d,new Color(200, 96, 78));
    g2d.setTransform(originalTransform);

    c.draw(g2d,new Color(252, 174, 25));
    c1.draw(g2d,new Color(252, 174, 25));
    c2.draw(g2d,new Color(252, 174, 25));
    c3.draw(g2d,new Color(252, 174, 25));
    c4.draw(g2d,new Color(252, 174, 25));
    
    lava.draw(g2d,new Color(200, 96, 78));
    platform.draw(g2d,new Color(71, 19, 66));
    h1_lava.draw(g2d,new Color(252, 174, 25));
    h2_lava.draw(g2d,new Color(252, 174, 25));
    h3_lava.draw(g2d,new Color(252, 174, 25));
    h4_lava.draw(g2d,new Color(252, 174, 25));
    h5_lava.draw(g2d,new Color(252, 174, 25));
    h6_lava.draw(g2d,new Color(252, 174, 25));
    h7_lava.draw(g2d,new Color(252, 174, 25));
    h8_lava.draw(g2d,new Color(252, 174, 25));
    h9_lava.draw(g2d,new Color(252, 174, 25));
    h10_lava.draw(g2d,new Color(252, 174, 25));
    h11_lava.draw(g2d,new Color(252, 174, 25));
    h12_lava.draw(g2d,new Color(252, 174, 25));
    h13_lava.draw(g2d,new Color(252, 174, 25));
    h14_lava.draw(g2d,new Color(252, 174, 25));
    h15_lava.draw(g2d,new Color(252, 174, 25));
    h16_lava.draw(g2d,new Color(252, 174, 25));
    h17_lava.draw(g2d,new Color(252, 174, 25));
    h18_lava.draw(g2d,new Color(252, 174, 25));
    h19_lava.draw(g2d,new Color(252, 174, 25));
    h20_lava.draw(g2d,new Color(252, 174, 25));
    h21_lava.draw(g2d,new Color(252, 174, 25));
    h22_lava.draw(g2d,new Color(252, 174, 25));
    h23_lava.draw(g2d,new Color(252, 174, 25));
    h24_lava.draw(g2d,new Color(252, 174, 25));
    h25_lava.draw(g2d,new Color(252, 174, 25));
    h26_lava.draw(g2d,new Color(252, 174, 25));

    originalTransform = g2d.getTransform();

    up_platform.draw(g2d,new Color(71, 19, 66));
    up_platform2.draw(g2d,new Color(71, 19, 66));

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
    up_platform.draw(g2d,new Color(71, 19, 66));
    up_platform2.draw(g2d,new Color(71, 19, 66));

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
    
    }
}