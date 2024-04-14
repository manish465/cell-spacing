package com.manish.project.component;

import com.manish.project.actor.Actor;

import java.util.UUID;

public abstract class Component {
    private Actor actor;
    private final UUID componentID;

    public Component() {
        this.componentID = UUID.randomUUID();
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
    public abstract void update();
}
