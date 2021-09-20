package com.company.patern;

public class LA_Lakers implements IObserver<Game>{

    @Override
    public void update(Game data) {
        if (data.getComands().contains("LALakers")){
            System.out.println("I know what I am gonna do today.");
            System.out.println(data.toString());
        }
    }
}
