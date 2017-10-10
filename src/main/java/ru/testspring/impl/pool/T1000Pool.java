package ru.testspring.impl.pool;

import ru.testspring.interfaces.Robot;
import ru.testspring.interfaces.RobotPool;

import java.util.Collection;
import java.util.Map;

public class T1000Pool implements RobotPool {

    private Map<String,Robot> robotCollection;

    public T1000Pool(Map<String,Robot> robotCollection){
        this.robotCollection = robotCollection;
    }

    public Map<String,Robot> getRobotCollection() {
        return robotCollection;
    }

    public void action(){
        if(robotCollection == null) return;
        for(Map.Entry<String,Robot> entry: robotCollection.entrySet()){
            System.out.println(entry.getKey());
            entry.getValue().action();
        }
    }
}
