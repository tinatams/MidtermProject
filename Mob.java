import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class Mob implements Entity, DrawingObject{
    // basic stuff
    private int x;
    private int y;
    private double scale;
    private int version;
    private int speed;

    private boolean drawable; 
    private HealthBar health= new HealthBar(this);

    public Mob(int x, int y, double scale) {
        this.x = x;
        this.y = y;
        this.scale = scale;
        version = 1;
        speed = 10;

        drawable = true;
    }

    public void takeDamage(int amount){
        health.setCurrentHealth(health.getCurrentHealth()-amount); 
    }

    public int getHealth(){
        return health.getCurrentHealth();
    }

    public HealthBar getHealthBar(){
        return health;
    }

    public void setDrawable(boolean newSet){
        drawable = newSet;
    }

    public boolean getDrawable(){
        return drawable;
    }

    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();

        g2d.scale(-1, 1);
        g2d.translate(-68, 60);

        // if (health.getCurrentHealth() <= 0){
        //     drawable = false;
        // }

        // if (version == 60){
        //     version = 1;
        // } 
        
        // if (version <= 30){
        //     drawFrame3(g2d);
        // } else if (version < 60){
        //     drawFrame1(g2d);
        // } 

        //version++;

        drawDyingFrame3(g2d);
        g2d.setTransform(reset);
    }

    public void update(KeyEvent e){
        int code = e.getKeyCode();

    }

    public void drawFrame1(Graphics2D g2d){
        RenderingHints rh = new RenderingHints( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh); //makes the rendering smoother

        AffineTransform reset = g2d.getTransform();
        g2d.translate(-220, -130); //this sets the original placement
        g2d.translate(-x, y); //moves it to where it wants to be on screen
        g2d.scale(scale, scale);

        // base color body
        Path2D.Double baseBlob = new Path2D.Double();
        baseBlob.moveTo(285, 422);
        baseBlob.curveTo(269.7, 415.8, 210, 383, 249.7, 291.8);
        baseBlob.curveTo(294.7, 166.3, 371.4, 163, 395.6, 162.5);
        baseBlob.curveTo(422.9, 161.2, 442.7, 168.7, 457.3, 175.8);
        baseBlob.curveTo(486, 184.4, 500.1, 170.3, 506.2, 155.3);
        baseBlob.curveTo(511.2, 142.4, 522.4, 146, 523.2, 165.2);
        baseBlob.curveTo(530.7, 187, 518.7, 214, 510.46, 222.3);
        baseBlob.curveTo(538.3, 258, 558, 303.3, 562.85, 335.3);
        baseBlob.curveTo(569.4, 385, 538.6, 412.5, 512.6, 423.7 );
        baseBlob.curveTo(444, 444, 323.7, 439, 285, 422);
        baseBlob.closePath();

        g2d.setColor(new Color(255,87,87));
        g2d.fill(baseBlob);

        //body color 2
        Path2D.Double midBlob = new Path2D.Double();
        midBlob.moveTo(314.4, 420.6);
        midBlob.curveTo(250, 403, 240.7, 359, 258, 305.4);
        midBlob.curveTo(277.8, 239, 321, 189, 364, 180);
        midBlob.curveTo(404.3, 169, 440, 179.5, 456.1, 189.6);
        midBlob.curveTo(481.5, 192.5, 488.9, 185.2, 496.3, 180.5);
        midBlob.curveTo(503.8, 175.5, 504.7, 167.8, 510.5, 164.04);
        midBlob.curveTo(519.83, 161.7, 521.3, 168.84, 518.24, 177.65);
        midBlob.curveTo(517.8, 197.4, 505.5, 214.8, 498, 227.2);
        midBlob.curveTo(556, 312, 565.4, 362, 525.5, 403.8);
        midBlob.curveTo(493, 429.6, 390, 435.7, 314.4, 420.6);
        midBlob.closePath();

        g2d.setColor(new Color(255, 145, 77));
        g2d.fill(midBlob);


        //highlights
        AffineTransform beforeRotate = g2d.getTransform();
        g2d.rotate(Math.toRadians(59),338.8, 213.4);
        g2d.translate(-30,-13);

        Ellipse2D.Double highlight1 = new Ellipse2D.Double(353.9,189.6,22.1,54.9);
        g2d.setColor(new Color(255, 189, 89));
        g2d.fill(highlight1);

        g2d.setTransform(beforeRotate);
        Ellipse2D.Double highlight2 = new Ellipse2D.Double(380,182,9.3,9.5);
        g2d.fill(highlight2);

        // eyes
        Ellipse2D.Double rEye1 = new Ellipse2D.Double(318.6, 253.9, 33.8, 64.3);
        Ellipse2D.Double lEye1 = new Ellipse2D.Double(408.1, 253.9, 33.8, 64.3);
        g2d.setColor(new Color(159, 23, 23));
        g2d.fill(rEye1);
        g2d.fill(lEye1);

        // eyes highlights
        Ellipse2D.Double rEye2 = new Ellipse2D.Double(320.4, 267.7, 15, 28.6);
        Ellipse2D.Double lEye2 = new Ellipse2D.Double(410, 267.7, 15, 28.6);
        g2d.setColor(Color.WHITE);
        g2d.fill(rEye2);
        g2d.fill(lEye2);

        // mouth
        Ellipse2D.Double mouth = new Ellipse2D.Double(362.3, 322.8, 20.4, 23.3);
        g2d.setColor(new Color(159, 23, 23));
        g2d.fill(mouth);

        g2d.setTransform(reset);
    }

    public void drawFrame2(Graphics2D g2d){
        RenderingHints rh = new RenderingHints( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh); //makes the rendering smoother

        AffineTransform reset = g2d.getTransform();
        g2d.translate(-220, -130); //this sets the original placement
        g2d.translate(-x, y); //moves it to where it wants to be on screen
        g2d.scale(scale, scale);

        //base color body
        Path2D.Double baseBlob = new Path2D.Double();
        baseBlob.moveTo(349.7, 433);
        baseBlob.curveTo(294.4, 433.7, 237, 418, 236, 332.2);
        baseBlob.curveTo(242, 284, 264.6, 229.7, 292.4, 190.9);
        baseBlob.curveTo(320, 153.4, 367.6, 127.4, 429.8, 146.7);
        baseBlob.curveTo(451, 139.3, 446.5, 112.4, 452.2, 113.8);
        baseBlob.curveTo(458.5, 111, 469.2, 127, 468.7, 161.2);
        baseBlob.curveTo(493.5, 161, 497.1, 132.6, 504.4, 130.5);
        baseBlob.curveTo(519.1, 122.5, 519, 185.6, 499, 206.6);
        baseBlob.curveTo(521.6, 238.5, 553, 311.3, 548.6, 342.5);
        baseBlob.curveTo(551, 380.6, 521, 422.5, 481.5, 427.7);
        baseBlob.curveTo(448.4, 433, 397.8, 441.3, 349.7, 433);

        g2d.setColor(new Color(255,87,87));
        g2d.fill(baseBlob);

        //fill mid tones
        Path2D.Double midColor = new Path2D.Double();
        midColor.moveTo(352, 423.4);
        midColor.curveTo(259.2, 423.3, 235, 368, 254, 298.5);
        midColor.curveTo(282.2, 206.7, 319, 165.5, 373.6, 154.7);
        midColor.curveTo(398.3, 151.6, 416.5, 156.1, 436.7, 159.3);
        midColor.lineTo(426.3, 158.8);
        midColor.curveTo(434, 155.6, 447.5, 149.4, 452.3, 129.3);
        midColor.curveTo(466.8, 111.4, 463.2, 161, 457.9, 173.5);
        midColor.curveTo(497.2, 173.6, 495.1, 136.2, 508.7, 140.7);
        midColor.curveTo(511.6, 162.9, 498.6, 188.7, 486.6, 207.9);
        midColor.curveTo(505.4, 239.7, 554.8, 323.2, 529, 375.7);
        midColor.curveTo(508.8, 414.5, 485.6, 418.2, 436, 423.9);
        midColor.curveTo(416.4, 425.4, 375, 428.3, 352, 423.4);
        midColor.closePath();

        g2d.setColor(new Color(255, 145, 77));
        g2d.fill(midColor);

        //highlights
        Path2D.Double highlight1 = new Path2D.Double();
        highlight1.moveTo(306.6,207.8);
        highlight1.curveTo(302.7, 200.3, 327.3, 170.5, 349.9, 179.8);
        highlight1.curveTo(363.7, 194.95, 318.5, 225.5, 306.6, 207.8);

        Ellipse2D.Double highlight2 = new Ellipse2D.Double(360.2, 170.5, 12, 10);
        g2d.setColor(new Color(255, 189, 89));
        g2d.fill(highlight1);
        g2d.fill(highlight2);

        // eyes
        Ellipse2D.Double rEye1 = new Ellipse2D.Double(314.5, 237.4, 33.8, 64.3);
        Ellipse2D.Double lEye1 = new Ellipse2D.Double(404.1, 237.4, 33.8, 64.3);
        g2d.setColor(new Color(159, 23, 23));
        g2d.fill(rEye1);
        g2d.fill(lEye1);

        // eyes highlights
        Ellipse2D.Double rEye2 = new Ellipse2D.Double(316.4, 251.1, 15, 28.6);
        Ellipse2D.Double lEye2 = new Ellipse2D.Double(406, 251.1, 15, 28.6);
        g2d.setColor(Color.WHITE);
        g2d.fill(rEye2);
        g2d.fill(lEye2);

        // mouth
        Ellipse2D.Double mouth = new Ellipse2D.Double(358.3, 306.3, 20.4, 23.3);
        g2d.setColor(new Color(159, 23, 23));
        g2d.fill(mouth);

        g2d.setTransform(reset);
    }

    public void drawFrame3(Graphics2D g2d) {
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh); //makes the rendering smoother

        AffineTransform reset = g2d.getTransform();
        g2d.translate(-220, -130); //this sets the original placement
        g2d.translate(-x, y); //moves it to where it wants to be on screen
        g2d.scale(scale, scale);

        //base color body
        Path2D.Double baseBlob = new Path2D.Double();
        baseBlob.moveTo(289.3, 428);
        baseBlob.curveTo(236.5, 412.5, 195.8, 373, 249, 287.4);
        baseBlob.curveTo(278.4, 239.2, 324.5, 186.5, 419.8, 195);
        baseBlob.curveTo(452.3, 195, 462.8, 216.2, 491, 201.7);
        baseBlob.curveTo(499, 197.2, 505, 180.9, 509.8, 179.4);
        baseBlob.curveTo(521.1, 173.2, 520.1, 205.8, 519.9, 212.6);
        baseBlob.curveTo(519.83, 223.4, 515.66, 231.3, 513.04, 237);
        baseBlob.curveTo(526, 251.13, 556.2, 276.66, 581.1, 348.4);
        baseBlob.curveTo(582.6, 383.6, 567.8, 407.6, 527.7, 425);
        baseBlob.curveTo(452, 446.6, 315, 435, 289, 428);
        baseBlob.closePath();

        g2d.setColor(new Color(255, 87, 87));
        g2d.fill(baseBlob);

        //fill mid tones
        Path2D.Double midColor = new Path2D.Double();
        midColor.moveTo(295.7, 421.4);
        midColor.curveTo(184, 391, 262.7, 259, 330.5, 223.6);
        midColor.curveTo(382.1, 194.7, 441.2, 210.8, 462.8, 218.1);
        midColor.curveTo(497, 217.7, 502.7, 193.2, 509.3, 194.6);
        midColor.curveTo(525.8, 192.5, 504.2, 235.8, 495.8, 246.1);
        midColor.curveTo(492.9, 251.32, 497.25, 256.06, 502.76, 251.47);
        midColor.lineTo(505.93, 248.2);
        midColor.curveTo(535, 275.9, 569.1, 335.3, 567.4, 360.9);
        midColor.curveTo(565, 393.3, 549, 404, 518.7, 419.7);
        midColor.curveTo(441.6, 432.8, 386.4, 436, 295.7, 421.4);
        midColor.closePath();

        g2d.setColor(new Color(255, 145, 77));
        g2d.fill(midColor);

        //highlights
        Path2D.Double highlight1 = new Path2D.Double();
        highlight1.moveTo(306.7, 257.3);
        highlight1.curveTo(299.5, 245.6, 346.3, 216.1, 358.5, 225.3);
        highlight1.curveTo(356.5, 243.6, 317, 262.1, 306.7, 257.3);
        highlight1.closePath();

        Ellipse2D.Double highlight2 = new Ellipse2D.Double(366, 214, 10, 7);
        g2d.setColor(new Color(255, 189, 89));
        g2d.fill(highlight1);
        g2d.fill(highlight2);

        //eyes
        Ellipse2D.Double rEye1 = new Ellipse2D.Double(306, 275.3, 33.8, 64.3);
        Ellipse2D.Double lEye1 = new Ellipse2D.Double(395.6, 275.3, 33.8, 64.3);
        g2d.setColor(new Color(159, 23, 23));
        g2d.fill(rEye1);
        g2d.fill(lEye1);

        //eyes highlights
        Ellipse2D.Double rEye2 = new Ellipse2D.Double(307.9, 289, 15, 28.6);
        Ellipse2D.Double lEye2 = new Ellipse2D.Double(397.5, 289, 15, 28.6);
        g2d.setColor(Color.WHITE);
        g2d.fill(rEye2);
        g2d.fill(lEye2);

        //mouth
        Ellipse2D.Double mouth = new Ellipse2D.Double(349.8, 344.1, 20.4, 23.3);
        g2d.setColor(new Color(159, 23, 23));
        g2d.fill(mouth);

        g2d.setTransform(reset);
    }

    public void drawDyingFrame1(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh); //makes the rendering smoother

        AffineTransform reset = g2d.getTransform();
        g2d.translate(-220, -130); //this sets the original placement
        g2d.translate(-x, y); //moves it to where it wants to be on screen
        g2d.scale(scale, scale);

        //base color body
        Path2D.Double baseBlob = new Path2D.Double();
        baseBlob.moveTo(316, 421.7);
        baseBlob.curveTo(210, 397.7, 252.6, 234, 326.6, 158.6);
        baseBlob.curveTo(368, 125, 409, 125.9, 446.3, 146.3);
        baseBlob.curveTo(462.9, 136.3, 458.5, 119.6, 466.4, 118.6);
        baseBlob.curveTo(476.4, 115.1, 478.3, 148, 476.96, 160.16);
        baseBlob.curveTo(502.75, 150.2, 500.4, 129, 507.6, 129.2);
        baseBlob.curveTo(522.8, 121.9, 519.9, 196.6, 500.7, 206.4);
        baseBlob.curveTo(541.5, 286.7, 570.7, 377.5, 493, 417.8);
        baseBlob.curveTo(456, 429, 377, 437.7, 316, 421.7);
        baseBlob.closePath();

        g2d.setColor(new Color(255,87,87));
        g2d.fill(baseBlob);

        //fill mid tones
        Path2D.Double midColor = new Path2D.Double();
        midColor.moveTo(313.4, 411);
        midColor.curveTo(205.5, 375.8, 298, 170.2, 355.9, 156.2);
        midColor.lineTo(355.4, 155.3);
        midColor.curveTo(376.8, 143.5, 428.6, 140, 459.3, 172.8);
        midColor.curveTo( 503.4, 172, 495.2, 136.9, 511.7, 148.9);
        midColor.curveTo(513.3, 169.3, 496.6, 194.6, 489.4, 209.2);
        midColor.curveTo(530.6, 289.4, 534.5, 329.5, 527, 358.5);
        midColor.curveTo(519.5, 377.7, 507, 420.8, 430.7, 418.9);
        midColor.curveTo(391, 422, 348, 419.7, 313.4, 411);
        midColor.closePath();

        Path2D.Double midColor2 = new Path2D.Double();
        midColor2.moveTo(451.8, 150.6);
        midColor2.curveTo(460.5, 145.5, 462.6, 130.4, 469.2, 133.5);
        midColor2.curveTo(476.4, 134.7, 471.1, 158.3, 469.8, 160.74);
        midColor2.curveTo(464.3, 161.2, 456.8, 156.3, 451.8, 150.6);
         
        g2d.setColor(new Color(255, 145, 77));
        g2d.fill(midColor);
        g2d.fill(midColor2);

        //highlights
        Path2D.Double highlight1 = new Path2D.Double();
        highlight1.moveTo(325.5, 199);
        highlight1.curveTo(346.9, 208.6, 375.5, 181.4, 368.7, 170);
        highlight1.curveTo(354.9, 156.6, 314, 182.3, 325.5, 199);
        highlight1.closePath();

        Ellipse2D.Double highlight2 = new Ellipse2D.Double(380, 158.9, 10.5, 8.8);
        g2d.setColor(new Color(255, 189, 89));
        g2d.fill(highlight1);
        g2d.fill(highlight2);

        //mouth
        Ellipse2D.Double mouth = new Ellipse2D.Double(373.5, 294.7, 20.4, 23.3);
        g2d.setColor(new Color(159, 23, 23));
        g2d.fill(mouth);

        g2d.setTransform(reset);
    }

    public void drawDyingFrame2(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh); //makes the rendering smoother

        AffineTransform reset = g2d.getTransform();
        g2d.translate(-220, -130); //this sets the original placement
        g2d.translate(-x, y); //moves it to where it wants to be on screen
        g2d.scale(scale, scale);

        //base color body
        Path2D.Double baseBlob = new Path2D.Double();
        baseBlob.moveTo(296.6, 432.4);
        baseBlob.curveTo(153, 415, 203, 302, 293.8, 231);
        baseBlob.curveTo(353.6, 195.5, 458.7, 186.4, 527, 243.3);
        baseBlob.curveTo(580, 290, 662.3, 386.6, 546, 426.3);
        baseBlob.curveTo(481, 442, 381, 444, 296.6, 432.4);
        g2d.setColor(new Color(255,87,87));
        g2d.fill(baseBlob);

        //midColor
        Path2D.Double midColor = new Path2D.Double();
        midColor.moveTo(300, 424.8);
        midColor.curveTo(168.3, 404, 230.8, 300, 291.9, 249.5);
        midColor.curveTo(352.3, 206.5, 459, 198.2, 526.6, 260.1);
        midColor.curveTo(573.7, 306.6, 632.3, 383.5, 535.8, 420);
        midColor.curveTo(459, 433, 368.2, 433, 300, 424.8);
        midColor.closePath();
        
        midColor.closePath();
        g2d.setColor(new Color(255, 145, 77));
        g2d.fill(midColor);

        g2d.translate(0, 10);
        Path2D.Double highlight1 = new Path2D.Double();
        highlight1.moveTo(304.3, 259.1);
        highlight1.curveTo(320.6, 265.2, 358.1, 238.6, 351.5, 229.8);
        highlight1.curveTo(339.4, 219.8, 294.2, 248.8 ,304.3, 259.1);
        highlight1.closePath();

        
        Path2D.Double highlight2 = new Path2D.Double();
        highlight2.moveTo(359.8, 230.5);
        highlight2.curveTo(355.9, 228.4, 363.4, 220.1, 368.75, 222.95);
        highlight2.curveTo(371.42, 229.95, 362.2, 231.8, 359.8, 230.5);
        highlight2.closePath();

        g2d.setColor(new Color(255, 189, 89));
        g2d.fill(highlight1);
        g2d.fill(highlight2);

        g2d.setTransform(reset);
    }

    public void drawDyingFrame3(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh); //makes the rendering smoother

        AffineTransform reset = g2d.getTransform();
        g2d.translate(-220, -130); //this sets the original placement
        g2d.translate(-x, y); //moves it to where it wants to be on screen
        g2d.scale(scale, scale);

        //base color body
        Ellipse2D.Double base1 = new Ellipse2D.Double(354.4, 329.3, 180, 90);
        Ellipse2D.Double base2 = new Ellipse2D.Double(224.5, 352, 180, 90);
        Ellipse2D.Double base3 = new Ellipse2D.Double(354.4, 397, 143.9, 72);
        Ellipse2D.Double base4 = new Ellipse2D.Double(467.5, 352, 108, 54);

        g2d.setColor(new Color(255,87,87));
        g2d.fill(base1);
        g2d.fill(base2);
        g2d.fill(base3);
        g2d.fill(base4);

        // MID COLOR
        Ellipse2D.Double mid1 = new Ellipse2D.Double(244.2, 358.2, 143.8, 65.8);
        Ellipse2D.Double mid2 = new Ellipse2D.Double(367, 333.1, 154.5, 73.2);
        Ellipse2D.Double mid3 = new Ellipse2D.Double(364.5, 395.7, 122.3, 60.7);
        Ellipse2D.Double mid4 = new Ellipse2D.Double(480.9, 356.2, 87.1, 39.5);
        Ellipse2D.Double mid5 = new Ellipse2D.Double(370, 389.1, 46.3, 22.7);    

        g2d.setColor(new Color(255, 145, 77));
        g2d.fill(mid1);
        g2d.fill(mid2);
        g2d.fill(mid3);
        g2d.fill(mid4);
        g2d.fill(mid5);

        //HIGHLIGHTS
        Path2D.Double highlight1 = new Path2D.Double();
        highlight1.moveTo(257.3, 388.6);
        highlight1.curveTo(267.46, 391.26, 287.2, 380.8, 283.44, 374.2);
        highlight1.curveTo(275.34, 369.26, 249.84, 383.9, 257.3, 388.6);
        highlight1.closePath();

        highlight1.moveTo(383, 364.7);
        highlight1.curveTo(377.3, 361.43, 402.8, 345, 409.77, 351.4);
        highlight1.curveTo(413.74, 358.44, 391.23, 369.64, 383, 364.7);
        highlight1.closePath();

        g2d.setColor(new Color(255, 189, 89));
        g2d.fill(highlight1);
        g2d.fill(highlight1);

        g2d.setTransform(reset);
    }
}
