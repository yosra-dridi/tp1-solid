package com.directi.training.isp.exercise_refactored;

// Since SensingDoor is now implementing only client-specific interfaces, 
//it won't have to provide implementation for method it does need (timeOutCallback() or TimerClient interface)
public class SensingDoor extends Door implements SensorClient
{
    public SensingDoor(Sensor sensor)
    {
        sensor.register(this);
    }
    
    public void proximityCallback()
    {
        _opened = true;
    }
}
