package com.manish.project.scene;

import java.awt.*;

public class DefaultScene extends Scene {
    public DefaultScene(String sceneName) {
        super(sceneName);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 50, 50);
    }

    @Override
    public void update() {

    }
}
