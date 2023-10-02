package com.example.demo.game;

public class GameRunner {
    GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game=game;
    }

    public void run() {
        game.up();
        game.left();
        game.right();
        game.down();
    }
}
