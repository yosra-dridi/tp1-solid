package com.directi.training.isp.exercise_refactored;

// Door interface turned into a client-specific interface that provides the very basic functionalities of any door
// which are locking, unlocking, opening and closing
public abstract class Door
{
    protected boolean _locked;
    protected boolean _opened;

    public void lock()
    {
        _locked = true;
    }

    
    public void unlock()
    {
        _locked = false;
    }

    
    public void open()
    {
        if (!_locked) {
            _opened = true;
        }
    }

    public void close()
    {
        _opened = false;
    }
}
