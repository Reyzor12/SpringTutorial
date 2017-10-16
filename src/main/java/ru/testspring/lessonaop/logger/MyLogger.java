package ru.testspring.lessonaop.logger;

import org.springframework.stereotype.Component;

@Component
public class MyLogger {

    public void printValue(Object obj){
        System.out.println("Value " + obj);
    }

    public void init(){
        System.out.println("Start");
    }
    public void end(){
        System.out.println("Finish");
    }
}
