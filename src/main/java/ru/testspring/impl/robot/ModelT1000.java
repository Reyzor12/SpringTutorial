package ru.testspring.impl.robot;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import ru.testspring.abstr.BaseModel;
import ru.testspring.interfaces.Hand;
import ru.testspring.interfaces.Head;
import ru.testspring.interfaces.Leg;

public class ModelT1000 extends BaseModel implements InitializingBean,DisposableBean {

    private String color;
    private int year;
    private boolean soundEnable;

    ModelT1000(){

    }

    ModelT1000(Head head, Hand hand, Leg leg){
        super(head, hand, leg);
    }

    ModelT1000(Head head, Hand hand, Leg leg, String color, int year, boolean soundEnable){
        super(head, hand, leg);
        this.color=color;
        this.year=year;
        this.soundEnable=soundEnable;
    }

    ModelT1000(String color, int year, boolean soundEnable){
        this.color=color;
        this.year=year;
        this.soundEnable=soundEnable;
    }

    public void action() {

        getHead().calc();
        getHand().catchSomething();
        getLeg().go();
        System.out.println(color);
        System.out.println(year);
        System.out.println(soundEnable);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnable() {
        return soundEnable;
    }

    public void setSoundEnable(boolean soundEnable) {
        this.soundEnable = soundEnable;
    }

    public void dance() {

        System.out.println("Hello T1000");
    }

    public void destroy() throws Exception {
        System.out.println(this + " destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println(this + " init");
    }
}
