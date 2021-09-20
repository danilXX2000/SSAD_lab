package com.company.patern;

import java.util.ArrayList;
import java.util.List;

public class NBA {

    List<IObserver<Game>> listObservers;

    public NBA() {
        this.listObservers = new ArrayList<>();
    }

    public void subscribe(IObserver<Game> observer) {
        listObservers.add(observer);
    }

    public void unSubscribe(IObserver<Game> observer) {
        listObservers.remove(observer);
    }

    public void notify(Game game) {
        listObservers.forEach(observer -> observer.update(game));
    }

}

