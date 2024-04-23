package com.manish.project.component;

import com.manish.project.actor.Actor;
import com.manish.project.controller.Controller;
import com.manish.project.controller.PlayerController;
import com.manish.project.utils.position.Position;

import java.awt.*;

public class CameraComponent extends Component{
    private final Position position;
    private final Controller controller;
    private double zoom;
    private final double moveSpeed;
    private final double zoomSpeed;

    public CameraComponent(Actor actor) {
        super(actor);
        this.position = actor.getComponent(PositionComponent.class).getPosition();
        this.controller = new PlayerController();
        this.zoom = 1.0;
        this.moveSpeed = 5;
        this.zoomSpeed = 1.1;
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
            position.setY(position.getY() + moveSpeed);
        }

        if(controller.isControllerDown()){
            position.setY(position.getY() - moveSpeed);
        }

        if(controller.isControllerRight()){
            position.setX(position.getX() + moveSpeed);
        }

        if(controller.isControllerLeft()){
            position.setX(position.getX() - moveSpeed);
        }

        if(controller.isControllerZoomIn()){
            zoom *= zoomSpeed;
        }

        if(controller.isControllerZoomOut()){
            zoom /= zoomSpeed;
        }
    }
}
