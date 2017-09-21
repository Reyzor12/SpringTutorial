package ru.testspring.impl.sony;

import ru.testspring.interfaces.Leg;

public class SonyLeg implements Leg {
    public void go() {
        System.out.println("Sony leg");
    }
}
