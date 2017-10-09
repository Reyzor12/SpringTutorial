package ru.testspring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.testspring.impl.converyor.RobotT1000Conveyor;
import ru.testspring.impl.robot.ModelT1000;
import ru.testspring.interfaces.Robot;
import ru.testspring.interfaces.RobotConveyor;

public class Start {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("configuration/ApplicationContext.xml");
//        ModelT1000 robot = (ModelT1000)context.getBean("t1000");
        RobotConveyor conveyor = (RobotConveyor) context.getBean("t1000conveyor");

        Robot terminator1 = conveyor.createRobot();
        Robot terminator2 = conveyor.createRobot();
        Robot terminator3 = conveyor.createRobot();

        System.out.println(terminator1);
        System.out.println(terminator2);
        System.out.println(terminator3);

    }
}
