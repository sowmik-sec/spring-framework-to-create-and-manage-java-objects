package com.sowmik.learnspringframework.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@ComponentScan
public class BusinessCalculationService {
    private Dataservice dataservice;

    @Autowired
    public BusinessCalculationService(Dataservice dataservice) {
        this.dataservice = dataservice;
    }

    public int findMax() {
        return Arrays.stream(dataservice.retrieveData()).max().orElse(0);
    }
}
