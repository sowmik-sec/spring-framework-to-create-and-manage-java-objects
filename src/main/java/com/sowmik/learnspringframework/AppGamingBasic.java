package com.sowmik.learnspringframework;

import com.sowmik.learnspringframework.game.MarioGame;
import com.sowmik.learnspringframework.game.GameRunner;

public class AppGamingBasic {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
