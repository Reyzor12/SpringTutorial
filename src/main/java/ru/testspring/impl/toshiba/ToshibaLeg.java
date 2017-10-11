package ru.testspring.impl.toshiba;

import org.springframework.stereotype.Component;
import ru.testspring.interfaces.Leg;

@Component
public class ToshibaLeg implements Leg {
    public void go() {
        System.out.println("Toshiba leg");
    }
}
