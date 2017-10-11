package ru.testspring.impl.sony;

import ru.testspring.interfaces.Hand;

public class SonyHand implements Hand {

    private String color;

    public void catchSomething() {
        System.out.println("Sony hand");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
