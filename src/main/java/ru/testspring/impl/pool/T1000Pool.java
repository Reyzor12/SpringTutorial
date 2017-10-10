package ru.testspring.impl.pool;

import ru.testspring.interfaces.Robot;
import ru.testspring.interfaces.RobotPool;

import java.util.Collection;

public class T1000Pool implements RobotPool {

    private Collection<Robot> robotCollection;

    public void setRobotCollection(Collection<Robot> robotCollection){
        this.robotCollection = robotCollection;
    }

    public Collection<Robot> getRobotCollection() {
        return robotCollection;
    }

    public void action(){
        if(robotCollection == null) return;
        for(Robot robot:robotCollection){
            robot.action();
        }
    }
}
