package edu.plu.cs.farkle.guitest;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PFont;

/**
 * Created by Matt on 2/22/2016.
 */
public class Button {

    PApplet p;
    int x,y,w,h;
    int color;
    public String text;
    PFont font;
    int fontSize;
    boolean depressed;

    public Button(PApplet p, int x, int y, int w, int h, String text, PFont font)
    {
        this.p = p;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.text = text;
        color = p.color(220);
        this.font = font;
        fontSize = (int)(w/4.0);
    }

    private void update()
    {
        //if the mouse is over the button
        if (p.mouseX > x && p.mouseX < x+w && p.mouseY > y && p.mouseY < y+h)
        {
            //highlight the button
            color = p.color(255);

            //check if the mouse button is down
            //System.out.println(p.mouseClicked());


        }
        else
        {
            color = p.color(220);
        }
    }

    /**
     * Returns true if x and y are inside the button
     */
    public boolean isClicked(int x, int y){
        return (x > this.x && x < this.x+this.w && y > this.y && y < this.y+this.h);
    }
    public void draw()
    {
        this.update();
        p.fill(color);
        p.rect(x,y,w,h);
        p.fill(0);
        p.textAlign(PConstants.CENTER);
        p.textSize(fontSize);
        p.text(text, x+w/2,y+h/2+(int)(fontSize*.3));
    }
}
