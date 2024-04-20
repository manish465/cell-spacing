package com.manish.project.component;

import com.manish.project.actor.Actor;
import com.manish.project.utils.Position;

import java.awt.*;

public class RectComponent extends Component {
    private final Position position;

    public RectComponent(Actor actor) {
        super(actor);
        position = this.getActor().getComponent(PositionComponent.class).getPosition();
    }

    public void start() {

    }

    @Override
    public void render(Graphics2D g) {
        g.setColor(Color.BLUE);
        g.fillRect((int) position.getX(), (int) position.getY(), 50, 50);
    }

    @Override
    public void update() {
    }
}
