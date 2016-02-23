package edu.plu.cs.farkle.guitest;

import processing.core.PApplet;
import processing.core.PFont;

/**
 * Created by admin on 2/22/16.
 */
public class FarkleGUI extends PApplet{

    public static void main(String args[])
    {
        PApplet.main(new String[]{"edu.plu.cs.farkle.guitest.FarkleGUI"});
    }
    // Run code at full screen using the default renderer

    public static StateMachine stateMachine;
    boolean[] downKeys = new boolean[256];
    int x = 0;
    PFont font;

    public void settings() {
        //make a 640x480px window
        size(640,480, FX2D);

        //start fullscreen
        //fullScreen(FX2D);
    }

    public void setup() {
        noStroke();
        fill(102);

        //sets the top bar text
        surface.setTitle("Farkle GUI Test");

        //load font
        String dir = System.getProperty("user.dir");
        font = createFont(dir+"/src//edu//plu//cs//farkle//data//arialbd.ttf",48);

        //initialize state machine
        stateMachine = new StateMachine();
        stateMachine.Put("mainmenu", new edu.plu.cs.farkle.states.MainMenu(this, font, downKeys));
    }

    public void draw() {
        stateMachine.Update();
        stateMachine.Render();
    }

    public void keyPressed()
    {
        if(keyCode==ESC || key == ESC)
        {
            key = 0;
            keyCode = 0;
        }
        if (key<256)
        {
            downKeys[key] = true;
        }

    }

    public void keyReleased()
    {
        if(keyCode==ESC || key == ESC)
        {
            key = 0;
            keyCode = 0;
        }
        if (key<256)
        {
            downKeys[key] = false;
        }
    }

    public void keyTyped()
    {
        if(keyCode==ESC || key == ESC)
        {
            key = 0;
            keyCode = 0;
        }
    }

    public void mouseClicked()
    {
        stateMachine.sendClick(mouseX,mouseY);
    }

}
