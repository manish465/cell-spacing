package com.manish.project.scene;

import com.manish.project.actor.Actor;
import com.manish.project.actor.ActorEnum;
import com.manish.project.actor.ActorFactory;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Scene {
    private final UUID sceneID;
    private final String sceneName;
    protected List<Actor> actors;

    public Scene(String sceneName) {
        sceneID = UUID.randomUUID();
        this.sceneName = sceneName;
        actors = new ArrayList<>();

        actors.add(ActorFactory.createActor(ActorEnum.CameraActor));
    }

    public void addActorToScene(Actor actor) {
        actors.add(actor);
    }

    public UUID getSceneID() {
        return sceneID;
    }

    public String getSceneName() {
        return sceneName;
    }

    public abstract void render(Graphics2D g);
    public abstract void update();

    // TODO : removeActor
}
