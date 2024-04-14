package com.manish.project.engine;

import com.manish.project.display.Panel;
import com.manish.project.display.Window;
import com.manish.project.scene.SceneManager;

public class GameEngine {

    private boolean running;

    private final Window window;
    private final Panel panel;

    public GameEngine() {
        panel = new Panel();
        window = new Window(panel);
    }

    public void start() {
        running = true;
        window.startWindow();

        new Thread(new GameLoop(this, panel)).start();
    }

    public void dispose() {
        System.out.println(" || Game closed || ");
    }

    public void update(){
        SceneManager.get().getCurrentScene().update();
    }

    public boolean isRunning() {
        return running;
    }
}
