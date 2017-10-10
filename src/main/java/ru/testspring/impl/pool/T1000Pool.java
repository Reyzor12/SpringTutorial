package ru.testspring.impl.pool;

import ru.testspring.interfaces.Robot;
import ru.testspring.interfaces.RobotPool;

import java.util.Collection;
import java.util.Map;

public class T1000Pool implements RobotPool {

    private Collection<Robot> robotCollection;

    public T1000Pool(Collection<Robot> robotCollection){
        super();
        this.robotCollection = robotCollection;
    }

    public Collection<Robot> getRobotCollection() {
        return robotCollection;
    }

    public void showRobot(){
        if(robotCollection == null) return;
        for(Robot robot: robotCollection){
            robot.action();
        }
    }
}
