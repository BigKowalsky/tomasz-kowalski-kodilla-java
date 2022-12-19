package com.kodilla.kodillapatterns3.observer.homework;

public interface Observable {

    void registerObserver(Observer observer);
    void notifyObservers();
    void removeObserver(Observer observer);
}
