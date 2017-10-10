package ru.testspring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.testspring.impl.converyor.RobotT1000Conveyor;
import ru.testspring.impl.pool.T1000Pool;
import ru.testspring.impl.robot.ModelT1000;
import ru.testspring.interfaces.Robot;
import ru.testspring.interfaces.RobotConveyor;
import ru.testspring.interfaces.RobotPool;

public class Start {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("configuration/ApplicationContext.xml");
//        ModelT1000 robot = (ModelT1000)context.getBean("t1000");
        T1000Pool t1000Pool = (T1000Pool) context.getBean("t1000Pool");
        t1000Pool.action();
    }
}
