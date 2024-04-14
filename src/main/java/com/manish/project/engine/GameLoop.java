package com.manish.project.engine;

import com.manish.project.display.Panel;

public class GameLoop implements Runnable{
    private final GameEngine gameEngine;
    private final Panel panel;

    public GameLoop(GameEngine gameEngine, Panel panel) {
        this.gameEngine = gameEngine;
        this.panel = panel;
    }

    @Override
    public void run() {
        int FPS_SET = 120;
        int UPS_SET = 200;

        double timePerFrame = 1000000000.0 / FPS_SET;
        double timePerUpdate = 1000000000.0 / UPS_SET;

        long previousTime = System.nanoTime();

        int frames = 0;
        int updates = 0;
        long lastCheck = System.currentTimeMillis();

        double deltaU = 0;
        double deltaF = 0;

        while (gameEngine.isRunning()){
            long currentTime = System.nanoTime();

            deltaU += (currentTime - previousTime) / timePerUpdate;
            deltaF += (currentTime - previousTime) / timePerFrame;
            previousTime = currentTime;

            if (deltaU >= 1) {
                gameEngine.update();
                updates++;
                deltaU--;
            }

            if (deltaF >= 1) {
                panel.repaint();
                frames++;
                deltaF--;
            }

            if (System.currentTimeMillis() - lastCheck >= 1000) {
                lastCheck = System.currentTimeMillis();
                System.out.println("FPS: " + frames + " | UPS: " + updates);
                frames = 0;
                updates = 0;
            }
        }

        gameEngine.dispose();
    }
}
