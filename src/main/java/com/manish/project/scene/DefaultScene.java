package com.manish.project.scene;

import com.manish.project.actor.Actor;
import com.manish.project.component.RectComponent;

import java.awt.*;

public class DefaultScene extends Scene {
    public DefaultScene(String sceneName) {
        super(sceneName);

        Actor rectActor = new Actor();
        rectActor.addComponent(new RectComponent());
        actors.add(rectActor);
    }

    @Override
    public void render(Graphics g) {
        actors.forEach(actor -> actor.render(g));
    }

    @Override
    public void update() {
        actors.forEach(Actor::update);
    }
}
