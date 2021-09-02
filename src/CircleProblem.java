import processing.core.PApplet;

public class CircleProblem extends PApplet {

    public static int x1=0,x2=0,x3=0,x4=0;
    public static final int DIAMETER = 10;
    public static final int WIDTH = 640;
    public static final int HEIGHT = 420;
    Circle1 circle1;
    Circle2 circle2;

    public static void main(String[] args) {
        PApplet.main("CircleProblem",args);}

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
        circle1=new Circle1(this);
        circle2=new Circle2(this);

    }
    @Override
    public void draw() {
        circle1.drawCircle();
        circle2.drawCircle();
    }

}
