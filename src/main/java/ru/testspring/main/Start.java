package ru.testspring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.testspring.impl.robot.ModelT1000;
import ru.testspring.interfaces.Robot;
import ru.testspring.lessonaop.bussiness.BussinessAOP;

public class Start {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("configuration/ApplicationContext1.xml");
//        ModelT1000 robot = (ModelT1000)context.getBean("t1000");
        /*Robot robot1 = (ModelT1000) context.getBean("model1");
        Robot robot2 = (ModelT1000) context.getBean("model2");
        robot1.action();
        robot2.action();*/
        BussinessAOP bussiness = (BussinessAOP)context.getBean("bussinessAOP");
        double val = bussiness.getDouble();
    }
}
