package ru.testspring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.testspring.impl.robot.ModelT1000;
import ru.testspring.interfaces.Robot;
import ru.testspring.lessonaop.bussiness.BussinessAOP;
import ru.testspring.lessonaop.bussiness.FileManager;

public class Start {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("configuration/ApplicationContext1.xml");
        FileManager fileManager = (FileManager)context.getBean("fileManager");
        fileManager.getExtensionCount("C:\\Windows\\System32");
        fileManager.getExtensionList("C:\\Windows");
    }
}
