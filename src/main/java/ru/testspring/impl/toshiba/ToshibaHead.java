package ru.testspring.impl.toshiba;

import org.springframework.stereotype.Component;
import ru.testspring.interfaces.Head;

@Component
public class ToshibaHead implements Head{
    public void calc() {
        System.out.println("Toshiba head");
    }
}
