package ru.testspring.impl.sony;

import org.springframework.stereotype.Component;
import ru.testspring.interfaces.Hand;

@Component
public class SonyHand implements Hand {


    public void catchSomething() {
        System.out.println("Sony hand");
    }

}
