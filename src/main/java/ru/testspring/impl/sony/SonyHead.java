package ru.testspring.impl.sony;

import org.springframework.stereotype.Component;
import ru.testspring.interfaces.Head;

@Component
public class SonyHead implements Head{
    public void calc() {
        System.out.println("Sony head");
    }
}
