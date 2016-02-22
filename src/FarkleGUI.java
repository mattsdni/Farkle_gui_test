import processing.core.PApplet;

/**
 * Created by admin on 2/22/16.
 */
public class FarkleGUI extends PApplet
{

    public static void main(String args[])
    {
        PApplet.main(new String[]{"FarkleGUI"});
    }
    // Run code at full screen using the default renderer

    int x = 0;

    public void settings() {
        size(400,400, FX2D);
    }

    public void setup() {
        background(0);
        noStroke();
        fill(102);
    }

    public void draw() {
        background(153);
        line(x, 0, width, height);
        x++;
    }

}
