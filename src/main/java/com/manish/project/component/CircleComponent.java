package com.manish.project.component;

import com.manish.project.actor.Actor;
import com.manish.project.utils.position.Position;

import java.awt.*;

public class CircleComponent extends Component{
    private final Position position;
    private double radius;

    public CircleComponent(double radius, Actor actor) {
        super(actor);
        this.position = actor.getComponent(PositionComponent.class).getPosition();
        this.radius = radius;
    }

    @Override
    public void start() {

    }

    @Override
    public void render(Graphics2D g) {
        g.setColor(Color.ORANGE);
        g.fillOval(
                (int) (position.getX() - radius),
                (int) (position.getY() - radius),
                (int) (2 * radius),
                (int) (2 * radius)
        );
    }

    @Override
    public void update() {

    }
}
