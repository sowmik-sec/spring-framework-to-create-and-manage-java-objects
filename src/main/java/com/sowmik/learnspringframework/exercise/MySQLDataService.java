package com.sowmik.learnspringframework.exercise;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements Dataservice{
    @Override
    public int[] retrieveData() {
        return new int[] {1,2,3,4,5};
    }
}
