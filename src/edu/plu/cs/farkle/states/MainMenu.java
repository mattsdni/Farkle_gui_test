package edu.plu.cs.farkle.states;

import edu.plu.cs.farkle.guitest.Button;
import edu.plu.cs.farkle.guitest.IState;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PFont;
import processing.core.PImage;

import java.util.LinkedList;

/**
 * Created by Matt on 7/7/2015.
 */
public class MainMenu extends PApplet implements IState
{
    PApplet p;
    PFont font;
    boolean[] downKeys;
    LinkedList<Button> buttons;

    /**
     * Constructs the state
     * @param p a referece to the parent PApplet.
     */
    public MainMenu(PApplet p, PFont font, boolean[] downKeys)
    {
        this.p = p;
        this.font = font;
        this.downKeys = downKeys;
        buttons = new LinkedList<>();
        buttons.add(new Button(p,100,100,300,100,"Start", font));
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
        buttons.forEach(Button::draw);
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

    @Override
    /**
     * Called when mouse clicked. Receives mouse x and y
     */
    public void sendClick(int x, int y) {
        for (Button b : buttons){
            if (b.isClicked(x,y)){
                System.out.println(b.text);
            }
        }
    }

}
