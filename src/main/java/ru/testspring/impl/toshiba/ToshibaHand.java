package ru.testspring.impl.toshiba;

import ru.testspring.interfaces.Hand;

public class ToshibaHand implements Hand {
    public void catchSomething() {
        System.out.println("Toshiba hand");
    }
}
