import java.awt.*;
import java.awt.geom.*;

public class Mob {
    private int x;
    private int y;
    private double scale;

    public Mob(double scale, int x, int y) {
        this.x = x;
        this.y = y;
        this.scale = scale;
    }


    //idle frames: 
    public void drawFrame1(Graphics2D g2d){
        RenderingHints rh = new RenderingHints( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh); //makes the rendering smoother

        AffineTransform reset = g2d.getTransform();
        g2d.translate(-220, -130); //this sets the original placement
        g2d.translate(x, y); //moves it to where it wants to be on screen
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
        g2d.translate(-100, -50);

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

    public void drawFrame3(Graphics2D g2d){
        RenderingHints rh = new RenderingHints( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh); //makes the rendering smoother

        AffineTransform reset = g2d.getTransform();
        g2d.translate(-100, -50);

        //base color body
        Path2D.Double baseBlob = new Path2D.Double();
        baseBlob.moveTo(289.3,428);
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

        g2d.setColor(new Color(255,87,87)); 
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

        // //highlights
        Path2D.Double highlight1 = new Path2D.Double();
        highlight1.moveTo(306.7,257.3);
        highlight1.curveTo(299.5, 245.6, 346.3, 216.1, 358.5, 225.3);
        highlight1.curveTo(356.5, 243.6, 317, 262.1, 306.7, 257.3);
        highlight1.closePath();

        Ellipse2D.Double highlight2 = new Ellipse2D.Double(366, 214, 10, 7);
        g2d.setColor(new Color(255, 189, 89));
        g2d.fill(highlight1);
        g2d.fill(highlight2);

        // // eyes
        Ellipse2D.Double rEye1 = new Ellipse2D.Double(306, 275.3, 33.8, 64.3);
        Ellipse2D.Double lEye1 = new Ellipse2D.Double(395.6, 275.3, 33.8, 64.3);
        g2d.setColor(new Color(159, 23, 23));
        g2d.fill(rEye1);
        g2d.fill(lEye1);

        // // eyes highlights
        Ellipse2D.Double rEye2 = new Ellipse2D.Double(307.9, 289, 15, 28.6);
        Ellipse2D.Double lEye2 = new Ellipse2D.Double(397.5, 289, 15, 28.6);
        g2d.setColor(Color.WHITE);
        g2d.fill(rEye2);
        g2d.fill(lEye2);

        // // mouth
        Ellipse2D.Double mouth = new Ellipse2D.Double(349.8, 344.1, 20.4, 23.3);
        g2d.setColor(new Color(159, 23, 23));
        g2d.fill(mouth);

        // g2d.setTransform(reset);
    }


}