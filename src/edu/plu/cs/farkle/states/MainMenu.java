package edu.plu.cs.farkle.states;

import edu.plu.cs.farkle.guitest.Button;
import edu.plu.cs.farkle.guitest.IState;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PFont;
import processing.core.PImage;

/**
 * Created by Matt on 7/7/2015.
 */
public class MainMenu extends PApplet implements IState
{
    PApplet p;
    PFont font;
    boolean[] downKeys;
    Button b1;

    /**
     * Constructs the state
     * @param p a referece to the parent PApplet.
     */
    public MainMenu(PApplet p, PFont font, boolean[] downKeys)
    {
        this.p = p;
        this.font = font;
        this.downKeys = downKeys;
        b1 = new Button(p,100,100,300,100,"Start", font);
    }

    @Override
    /**
     * Calculates physics, animations, and any other actions that happen.
     */
    public void Update(double elapsedTime)
    {
        for (int i = 0; i < downKeys.length; i++)
        {
            if (downKeys[i])
            {
                if((char)i == 'w')
                {

                }

            }
        }
    }

    @Override
    /**
     * Displays everything to the screen.
     */
    public void Draw()
    {
        p.background(35, 49, 63);
        b1.draw();
    }

    @Override
    /**
     * Sets up any variables needed for the duration of the state.
     */
    public void OnEnter()
    {

    }

    @Override
    /**
     * Cleans up and executes any final tasks before leaving the state.
     */
    public void OnExit()
    {

    }

}
