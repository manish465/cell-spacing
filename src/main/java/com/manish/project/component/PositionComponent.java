package com.manish.project.component;

import com.manish.project.actor.Actor;
import com.manish.project.utils.position.Position;

import java.awt.*;

public class PositionComponent extends Component{
    private final Position position;

    public PositionComponent(Position position, Actor actor) {
        super(actor);
        this.position = position;
    }

    @Override
    public void start() {

    }

    @Override
    public void render(Graphics2D g) {

    }

    @Override
    public void update() {
    }

    public Position getPosition() {
        return position;
    }
}
