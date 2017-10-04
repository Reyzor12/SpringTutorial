package ru.testspring.impl.robot;

import ru.testspring.interfaces.Hand;
import ru.testspring.interfaces.Head;
import ru.testspring.interfaces.Leg;
import ru.testspring.interfaces.Robot;

public class ModelT1000 implements Robot {

    private Leg leg;
    private Head head;
    private Hand hand;

    private String color;
    private int year;
    private boolean soundEnable;

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
        super();
        this.hand=hand;
        this.leg=leg;
        this.head=head;
    }

    ModelT1000(Leg leg, Head head, Hand hand, String color, int year, boolean soundEnable){
        super();
        this.hand = hand;
        this.leg=leg;
        this.head=head;
        this.color=color;
        this.year=year;
        this.soundEnable=soundEnable;
    }

    ModelT1000(String color, int year, boolean soundEnable){
        super();
        this.color=color;
        this.year=year;
        this.soundEnable=soundEnable;
    }

    public void action() {

        head.calc();
        hand.catchSomething();
        leg.go();
        System.out.println(color);
        System.out.println(year);
        System.out.println(soundEnable);
    }

    public void dance() {

        System.out.println("Hello T1000");
    }

    public void init(){
        System.out.println("INIT");
    }

    public void destroy(){
        System.out.println("DESTROY");
    }

    public void initScopeSingleton(){
        System.out.println("INIT SINGLETON");
    }

    public void destroyScopeSingleton(){
        System.out.println("DESTROY SINGLETON");
    }

    public void initScopePrototype(){
        System.out.println("INIT PROTOTYPE");
    }

    public void destroyScopePrototype(){
        System.out.println("DESTROY PROTOTYPE");
    }
}
