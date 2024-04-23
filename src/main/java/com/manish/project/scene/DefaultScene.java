package com.manish.project.scene;

import com.manish.project.actor.Actor;
import com.manish.project.actor.ActorEnum;
import com.manish.project.actor.ActorFactory;

import java.awt.*;
import java.util.List;

public class DefaultScene extends Scene {
    public DefaultScene(String sceneName) {
        super(sceneName);

        actors.addAll(List.of(
                ActorFactory.createActor(ActorEnum.SimpleRectActor),
                ActorFactory.createActor(ActorEnum.SimpleRectActor),
                ActorFactory.createActor(ActorEnum.SimpleRectActor)
        ));
    }

    @Override
    public void render(Graphics2D g) {
        actors.forEach(actor -> actor.render(g));
    }

    @Override
    public void update() {
        actors.forEach(Actor::update);
    }
}
