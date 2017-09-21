package ru.testspring.impl.robot;

import ru.testspring.interfaces.Hand;
import ru.testspring.interfaces.Head;
import ru.testspring.interfaces.Leg;
import ru.testspring.interfaces.Robot;

public class ModelT1000 implements Robot {

    private Leg leg;
    private Head head;
    private Hand hand;

    ModelT1000(){

    }

    ModelT1000(Leg leg, Head head, Hand hand){
        this.hand=hand;
        this.leg=leg;
        this.head=head;
    }

    public void fire() {

        head.calc();
        hand.catchSomething();
        leg.go();
    }

    public void dance() {

        System.out.println("Hello");
    }
}
