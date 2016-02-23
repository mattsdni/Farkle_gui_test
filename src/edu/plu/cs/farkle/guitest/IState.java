package edu.plu.cs.farkle.guitest;


import controlP5.ControlEvent;

/**
 * Created by Matt on 5/11/2015.
 */
public interface IState
{
    void Update(double elapsedTime);

    void Draw();

    void OnEnter();

    void OnExit();

    void mouseClicked();

    void receiveControlEvents(ControlEvent event);

}
