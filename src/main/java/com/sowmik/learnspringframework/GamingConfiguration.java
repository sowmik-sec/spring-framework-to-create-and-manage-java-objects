package com.sowmik.learnspringframework;

import com.sowmik.learnspringframework.game.GameRunner;
import com.sowmik.learnspringframework.game.GamingConsole;
import com.sowmik.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game() {
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }
}
