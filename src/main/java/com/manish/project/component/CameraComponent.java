package com.manish.project.component;

import com.manish.project.actor.Actor;
import com.manish.project.controller.Controller;
import com.manish.project.controller.PlayerController;
import com.manish.project.utils.Position;

import java.awt.*;

public class CameraComponent extends Component{
    private final Position position;
    private final Controller controller;
    private double zoom;
    private double speed;

    public CameraComponent(Actor actor) {
        super(actor);
        this.position = actor.getComponent(PositionComponent.class).getPosition();
        this.controller = new PlayerController();
        this.speed = 1.0;
        this.zoom = 1.0;
    }

    @Override
    public void start() {

    }

    @Override
    public void render(Graphics2D g) {
        g.translate(position.getX(), position.getY());
        g.scale(zoom, zoom);
    }

    @Override
    public void update() {
        if (controller.isControllerUp()){
            position.setY(position.getY() + speed);
        }

        if(controller.isControllerDown()){
            position.setY(position.getY() - speed);
        }

        if(controller.isControllerRight()){
            position.setX(position.getX() + speed);
        }

        if(controller.isControllerLeft()){
            position.setX(position.getX() - speed);
        }

        if(controller.isControllerZoomIn()){
            zoom *= 1.1;
        }

        if(controller.isControllerZoomOut()){
            zoom /= 1.1;
        }
    }
}
