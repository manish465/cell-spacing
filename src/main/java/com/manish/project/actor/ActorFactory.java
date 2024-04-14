package com.manish.project.actor;

import com.manish.project.component.PositionComponent;
import com.manish.project.component.RectComponent;

public class ActorFactory {
    public static Actor createActor(ActorEnum actorEnum){
        Actor actor = new Actor();

        switch (actorEnum){
            case SimpleRectActor -> {
                actor.addComponent(new PositionComponent(100, 100, actor));
                actor.addComponent(new RectComponent(actor));
            }

            case GridActor -> {}
            case CameraActor -> {}
        }

        return actor;
    }
}
