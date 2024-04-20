package com.manish.project.display;

import com.manish.project.scene.SceneManager;

import java.awt.*;

public class Renderer {
    public void renderActor(Graphics2D g){
        SceneManager.get().getCurrentScene().render(g);
    }
}
