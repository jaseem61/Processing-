import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int gapY = HEIGHT / 5;
    public static final int DIAMETER = 10;

    public static final int speedBall1=1;

    public static final int speedBall2=2;

    public static final int speedBall3=3;

    public static final int speedBall4=4;


    private int startX=0;

    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawFourBalls();
    }



    private void drawFourBalls() {
        ellipse(startX, gapY, DIAMETER,DIAMETER);
        ellipse(startX*speedBall2,2* gapY, DIAMETER,DIAMETER);
        ellipse(startX*speedBall3,  3* gapY, DIAMETER,DIAMETER);
        ellipse(startX*speedBall4,4* gapY, DIAMETER,DIAMETER);
        startX+=speedBall1;
    }


}
