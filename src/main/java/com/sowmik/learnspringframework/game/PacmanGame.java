package com.sowmik.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacmanGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Step up");
    }

    @Override
    public void down() {
        System.out.println("Step down");
    }

    @Override
    public void left() {
        System.out.println("Run to the left");
    }

    @Override
    public void right() {
        System.out.println("Run to the right");
    }
}
