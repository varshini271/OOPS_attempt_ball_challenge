import processing.core.PApplet;

public class Circle1 {

    public static int x1=0,x2=0;
    public static final int DIAMETER = 10;
    public static final int HEIGHT = 420;
    PApplet pApplet;
    public Circle1(PApplet pApplet) {
        this.pApplet=pApplet;
    }

    public void drawCircle() {
        pApplet.ellipse(x1,HEIGHT/5,DIAMETER,DIAMETER );
        x1++;
        pApplet.ellipse(x2,2*HEIGHT/5, DIAMETER, DIAMETER);
        x2=x2+2;
    }

}
