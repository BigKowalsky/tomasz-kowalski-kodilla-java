package com.kodilla.kodillapatterns.strategy;

public class AggressivePredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Aggressive predictor] Buy stock of XYZ";
    }
}