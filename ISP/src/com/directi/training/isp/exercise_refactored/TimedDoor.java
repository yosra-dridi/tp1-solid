package com.directi.training.isp.exercise_refactored;

//Since TimedDoor is now implementing only client-specific interfaces, 
//it won't have to provide implementation for method it does need (proximityCallback() or SensorClient interface)
public class TimedDoor extends Door implements TimerClient
{
    private static final int TIME_OUT = 100;

    public TimedDoor(Timer timer)
    {
        timer.register(TIME_OUT, this);
    }
    
    public void timeOutCallback()
    {
        _locked = true;
    }
}
