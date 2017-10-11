package ru.testspring.impl.sony;

import org.springframework.stereotype.Component;
import ru.testspring.interfaces.Leg;

@Component
public class SonyLeg implements Leg {
    public void go() {
        System.out.println("Sony leg");
    }
}
