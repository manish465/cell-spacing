package com.manish.project.component;

import com.manish.project.actor.Actor;

import java.awt.*;
import java.util.UUID;

public abstract class Component {
    private Actor actor;
    private final UUID componentID;

    public Component(Actor actor) {
        this.componentID = UUID.randomUUID();
        this.actor = actor;
    }

    public UUID getComponentID() {
        return componentID;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public abstract void start();
    public abstract void render(Graphics g);
    public abstract void update();
}
