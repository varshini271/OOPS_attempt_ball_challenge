import processing.core.PApplet;

public class Circle2{

    public static int x3=0,x4=0;
    public static final int DIAMETER = 10;
    public static final int HEIGHT = 420;
    PApplet pApplet;
    public Circle2(PApplet pApplet) {
        this.pApplet=pApplet;
    }
    public void drawCircle() {
        pApplet.ellipse(x3,3*HEIGHT/5, DIAMETER, DIAMETER);
        x3+=3;
        pApplet.ellipse(x4,4*HEIGHT/5, DIAMETER, DIAMETER);
        x4+=4;
    }
}
