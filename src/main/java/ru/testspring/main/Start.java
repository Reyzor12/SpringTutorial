package ru.testspring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.testspring.impl.robot.ModelT1000;

public class Start {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("configuration/ApplicationContext.xml");
        ModelT1000 robot = (ModelT1000)context.getBean("t1000");
        robot.action();

        ModelT1000 robot1 = (ModelT1000)context.getBean("t1000Empty");
        robot1.action();

        ModelT1000 robot2=(ModelT1000)context.getBean("t1000Full");
        robot2.action();
    }
}
