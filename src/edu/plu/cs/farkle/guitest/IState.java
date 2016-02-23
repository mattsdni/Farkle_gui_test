package edu.plu.cs.farkle.guitest;



/**
 * Created by Matt on 5/11/2015.
 */
public interface IState
{
    public void Update(double elapsedTime);

    public void Draw();

    public void OnEnter();

    public void OnExit();

}
