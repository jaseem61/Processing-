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

    private int positionBall1=0;
    private int positionBall2=0;
    private int positionBall3=0;
    private int positionBall4=0;


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
        ellipse(positionBall1, gapY, DIAMETER,DIAMETER);
        ellipse(positionBall2,2* gapY, DIAMETER,DIAMETER);
        ellipse(positionBall3,  3* gapY, DIAMETER,DIAMETER);
        ellipse(positionBall4,4* gapY, DIAMETER,DIAMETER);
        positionBall1+=speedBall1;
        positionBall2+=speedBall2;
        positionBall3+=speedBall3;
        positionBall4+=speedBall4;
    }


}
