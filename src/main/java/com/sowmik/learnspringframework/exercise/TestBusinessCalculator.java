package com.sowmik.learnspringframework.exercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBusinessCalculator {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(BusinessCalculationService.class)) {
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
