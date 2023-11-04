package com.sowmik.learnspringframework;

import com.sowmik.learnspringframework.game.MarioGame;
import com.sowmik.learnspringframework.game.GameRunner;
import com.sowmik.learnspringframework.game.PacmanGame;
import com.sowmik.learnspringframework.game.SuperContraGame;

public class AppGamingBasic {
    public static void main(String[] args) {
        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
