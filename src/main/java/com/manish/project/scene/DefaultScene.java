package com.manish.project.scene;

import com.manish.project.actor.Actor;
import com.manish.project.actor.ActorEnum;
import com.manish.project.actor.ActorFactory;

import java.awt.*;

public class DefaultScene extends Scene {
    public DefaultScene(String sceneName) {
        super(sceneName);
        actors.add(ActorFactory.createActor(ActorEnum.SimpleRectActor));
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
