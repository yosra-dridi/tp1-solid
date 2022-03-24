package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck implements IDuck
{
    private boolean _on = false;

     public void quack()
    {
        turnOn();
        System.out.println("Electronic duck quack...");
    }

    public void swim() throws DuckIsOffException
    {
        turnOn();
        System.out.println("Electronic duck swim...");
    }

    public void turnOn()
    {
        this._on = true;
    }

    public void turnOff()
    {
        this._on = false;
    }

}
