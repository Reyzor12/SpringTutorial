package ru.testspring.impl.toshiba;

import org.springframework.stereotype.Component;
import ru.testspring.interfaces.Hand;

@Component
public class ToshibaHand implements Hand {
    public void catchSomething() {
        System.out.println("Toshiba hand");
    }
}
