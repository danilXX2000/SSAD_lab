package com.company.patern;

public class Fan implements IObserver{
    @Override
    public void update(Object data) {
        System.out.println(data.toString());
    }
}
