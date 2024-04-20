package com.manish.project.actor;

import com.manish.project.component.CameraComponent;
import com.manish.project.component.GridComponent;
import com.manish.project.component.PositionComponent;
import com.manish.project.component.RectComponent;
import com.manish.project.utils.Position;

public class ActorFactory {
    public static Actor createActor(ActorEnum actorEnum){
        Actor actor = new Actor();

        switch (actorEnum){
            case SimpleRectActor -> {
                actor.addComponent(new PositionComponent(new Position(), actor));
                actor.addComponent(new RectComponent(actor));
            }

            case CameraActor -> {
                actor.addComponent(new PositionComponent(
                        new Position(0, 0), actor
                ));
                actor.addComponent(new CameraComponent(actor));
            }
            case GridActor -> {
                actor.addComponent(new GridComponent(actor));
            }
        }

        return actor;
    }
}
