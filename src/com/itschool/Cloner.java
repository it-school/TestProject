package com.itschool;

public class Cloner implements Cloneable
{
    Integer value;

    public Cloner(Integer value)
    {
        this.value = value;
    }

    public Integer getValue()
    {
        return value;
    }

    public void setValue(Integer value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return value.toString();
    }

    @Override
    public Cloner clone()
    {
        return new Cloner(this.value);
    }
}
