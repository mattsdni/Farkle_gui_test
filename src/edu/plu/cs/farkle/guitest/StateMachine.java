package edu.plu.cs.farkle.guitest;

import java.util.HashMap;

/**
 * Created by Matt on 5/11/2015.
 */
public class StateMachine
{
    public HashMap<String, IState> stateMap = new HashMap<String, IState>();
    public String currentState;

    private long startTime = System.currentTimeMillis();
    private long thisFrame;
    private long lastFrame = 0;
    public double timeElapsed = 0;

    public boolean minimized = false;

    public void Update()
    {
        thisFrame = System.currentTimeMillis()-startTime;
        timeElapsed = (thisFrame - lastFrame) / 1000.0;
        //System.out.println(timeElapsed);

        stateMap.get(currentState).Update(timeElapsed);
    }

    public void Render()
    {
        if (!minimized)
            stateMap.get(currentState).Draw();
        lastFrame = thisFrame;
    }

    public void Put(String stateName, IState state)
    {
        if (stateMap.size() > 0)
            stateMap.get(currentState).OnExit();
        stateMap.put(stateName, state);
        stateMap.get(stateName).OnEnter();
        currentState = stateName;
    }

    public void Remove(String stateName)
    {
        stateMap.get(currentState).OnExit();
        stateMap.remove(stateName);
    }

    public void setState(String stateName)
    {
        stateMap.get(currentState).OnExit();
        currentState = stateName;
        stateMap.get(currentState).OnEnter();
    }

    public void mouseClicked()
    {
        stateMap.get(currentState).mouseClicked();
    }

}
