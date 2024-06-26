package com.manish.project.component;

import com.manish.project.actor.Actor;
import com.manish.project.setting.Constant;
import com.manish.project.utils.position.Position;

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
        g.fillRect((int) position.getX(), (int) position.getY(), Constant.TILE_WIDTH, Constant.TILE_HEIGHT);
    }

    @Override
    public void update() {
    }
}
