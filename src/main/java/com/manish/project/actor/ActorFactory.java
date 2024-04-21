package com.manish.project.actor;

import com.manish.project.component.*;
import com.manish.project.utils.position.Position2D;
import com.manish.project.utils.position.RandomPosition;

public class ActorFactory {
    public static Actor createActor(ActorEnum actorEnum){
        Actor actor = new Actor();

        switch (actorEnum){
            case SimpleRectActor -> {
                actor.addComponent(new PositionComponent(new RandomPosition(), actor));
                actor.addComponent(new RectComponent(actor));
            }

            case CameraActor -> {
                actor.addComponent(new PositionComponent(
                        new Position2D(0, 0), actor
                ));
                actor.addComponent(new CameraComponent(actor));
            }
            case GridActor -> {
                actor.addComponent(new GridComponent(false, actor));
            }
            case CircleActor -> {
                actor.addComponent(new PositionComponent(new RandomPosition(), actor));
                actor.addComponent(new CircleComponent(40, actor));
            }
        }

        return actor;
    }
}
