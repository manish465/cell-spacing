package com.manish.project.scene;

import com.manish.project.actor.Actor;

import java.awt.*;
import java.util.List;
import java.util.UUID;

public abstract class Scene {
    private final UUID sceneID;
    private final String sceneName;
    protected List<Actor> actors;

    public Scene(String sceneName) {
        sceneID = UUID.randomUUID();
        this.sceneName = sceneName;
    }

    public void start() {
        for (Actor actor : actors) {
            actor.start();
        }
    }

    public void addGameObjectToScene(Actor actor) {
        actors.add(actor);
    }

    public UUID getSceneID() {
        return sceneID;
    }

    public String getSceneName() {
        return sceneName;
    }

    public abstract void render(Graphics g);
    public abstract void update();
}
