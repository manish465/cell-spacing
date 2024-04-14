package com.manish.project.actor;

import com.manish.project.component.Component;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Actor {
    private final UUID actorID;
    private final List<Component> components;

    public Actor(){
        actorID = UUID.randomUUID();
        components = new ArrayList<>();
    }

    public <T extends Component> T getComponent(Class<T> componentClass) {
        for (Component c : components) {
            if (componentClass.isAssignableFrom(c.getClass())) {
                try {
                    return componentClass.cast(c);
                } catch (ClassCastException e) {
                    assert false : "Error: Casting component.";
                }
            }
        }

        return null;
    }

    public <T extends Component> void removeComponent(Class<T> componentClass) {
        for (int i=0; i < components.size(); i++) {
            Component c = components.get(i);
            if (componentClass.isAssignableFrom(c.getClass())) {
                components.remove(i);
                return;
            }
        }
    }

    public void addComponent(Component c) {
        this.components.add(c);
        c.setActor(this);
    }

    public void start() {
        for(int i=0; i < components.size(); i++) {
            components.get(i).start();
        }
    }

    public void render(Graphics g) {
        for(int i=0; i < components.size(); i++) {
            components.get(i).render(g);
        }
    }

    public void update() {
        for(int i=0; i < components.size(); i++) {
            components.get(i).update();
        }
    }

    public UUID getActorID() {
        return actorID;
    }
}
