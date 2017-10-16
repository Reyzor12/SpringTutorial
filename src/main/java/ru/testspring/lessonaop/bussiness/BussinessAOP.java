package ru.testspring.lessonaop.bussiness;

import org.springframework.stereotype.Component;

@Component
public class BussinessAOP {

    public int getInt(){
        return 5;
    }

    public double getDouble(){
        return 5.1;
    }
}
