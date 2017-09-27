package ru.testspring.impl.robot;

import ru.testspring.interfaces.Hand;
import ru.testspring.interfaces.Head;
import ru.testspring.interfaces.Leg;
import ru.testspring.interfaces.Robot;

public class ModelT1000 implements Robot {

    private Leg leg;
    private Head head;
    private Hand hand;

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    ModelT1000(){

    }

    ModelT1000(Leg leg, Head head, Hand hand){
        this.hand=hand;
        this.leg=leg;
        this.head=head;
    }

    public void action() {

        head.calc();
        hand.catchSomething();
        leg.go();
    }

    public void dance() {

        System.out.println("Hello T1000");
    }
}
