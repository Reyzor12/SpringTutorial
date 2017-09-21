package ru.testspring.impl.sony;

import ru.testspring.interfaces.Hand;

public class SonyHand implements Hand {
    public void catchSomething() {
        System.out.println("Sony hand");
    }
}
