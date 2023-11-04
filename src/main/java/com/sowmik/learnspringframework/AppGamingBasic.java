package com.sowmik.learnspringframework;

import com.sowmik.learnspringframework.game.MarioGame;
import com.sowmik.learnspringframework.game.GameRunner;
import com.sowmik.learnspringframework.game.SuperContraGame;

public class AppGamingBasic {
    public static void main(String[] args) {
        //var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}
