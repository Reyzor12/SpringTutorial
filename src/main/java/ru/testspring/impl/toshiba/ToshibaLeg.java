package ru.testspring.impl.toshiba;

import ru.testspring.interfaces.Leg;

public class ToshibaLeg implements Leg {
    public void go() {
        System.out.println("Toshiba leg");
    }
}
