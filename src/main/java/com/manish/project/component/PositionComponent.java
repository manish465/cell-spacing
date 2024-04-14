package com.manish.project.component;

import com.manish.project.actor.Actor;
import com.manish.project.utils.Position;

import java.awt.*;

public class PositionComponent extends Component{
    private final Position position;

    public PositionComponent(double x, double y, Actor actor) {
        super(actor);
        this.position = new Position(x, y);
    }

    @Override
    public void start() {

    }

    @Override
    public void render(Graphics g) {

    }

    @Override
    public void update() {
        position.setY(position.getY() + 0.2);
        position.setX(position.getX() + 0.2);
    }

    public Position getPosition() {
        return position;
    }
}
