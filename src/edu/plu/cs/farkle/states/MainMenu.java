package edu.plu.cs.farkle.states;

import controlP5.ControlEvent;
import controlP5.ControlFont;
import controlP5.ControlP5;
import edu.plu.cs.farkle.guitest.Button;
import edu.plu.cs.farkle.guitest.FarkleGUI;
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
    ControlFont uifont;
    ControlP5 ui;
    boolean[] downKeys;
    //LinkedList<Button> buttons;
    int bg_color;

    /**
     * Constructs the state
     * @param p a referece to the parent PApplet.
     */
    public MainMenu(PApplet p, ControlP5 ui, PFont font, boolean[] downKeys)
    {
        this.p = p;
        this.font = font;
        this.ui = ui;
        this.downKeys = downKeys;
        //buttons = new LinkedList<>();
        //buttons.add(new Button(p,100,100,300,100,"Start", font));
        bg_color = p.color(35, 49, 63);
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
        p.background(bg_color);
        //buttons.forEach(Button::draw);
        p.fill(200);
    }

    @Override
    /**
     * Sets up any variables needed for the duration of the state.
     */
    public void OnEnter()
    {
        uifont = new ControlFont(font,(int)(p.width/4.0));

        ui.addButton("newgame")
                .setBroadcast(false)
                .setValue(0)
                .setPosition(350,100)
                .setSize(250, 100)
                .setColorBackground(p.color(180))
                .setColorForeground(p.color(220))
                .setColorActive(p.color(140))
                .setColorLabel(p.color(0))
                .setCaptionLabel("New Game")
                .setBroadcast(true)
                .getCaptionLabel()
                .setFont(font)
                .toUpperCase(false)
                .setSize(36)
                .align(ControlP5.CENTER, ControlP5.CENTER)
        ;

        ui.addTextfield("input")
                .setPosition(20,100)
                .setSize(200,40)
                .setFont(new ControlFont(font, 24))
                .setFocus(true)
                .setLabel("bob")
                //.setColor(color(255,0,0))
        ;

        ui.addTextfield("textValue")
                .setPosition(20,170)
                .setSize(200,40)
                //.setFont(uifont)
                .setAutoClear(false)
        ;

        ui.addBang("clear")
                .setPosition(240,170)
                .setSize(80,40)
                .getCaptionLabel().align(ControlP5.CENTER, ControlP5.CENTER)
        ;

        ui.addTextfield("default")
                .setPosition(20,350)
                .setAutoClear(false)
        ;

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
     * Called when mouse clicked. (Mouse button is depressed, and then released)
     */
    public void mouseClicked() {

    }

    /**
     * Receives ui events like button presses
     * @param event
     */
    public void receiveControlEvents(ControlEvent event)
    {
        if (event.getController().getName().equals("newgame"))
        {
            //FarkleGUI.stateMachine.setState("mainmenu");
            bg_color = p.color(100,100,100);
        }
    }

}
