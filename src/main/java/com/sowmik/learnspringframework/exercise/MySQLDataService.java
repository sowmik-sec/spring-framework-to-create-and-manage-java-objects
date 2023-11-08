package com.sowmik.learnspringframework.exercise;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MySQLDataService implements Dataservice{
    @Override
    public int[] retrieveData() {
        return new int[] {1,2,3,4,5};
    }
}
