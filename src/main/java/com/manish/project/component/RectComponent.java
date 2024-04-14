package com.manish.project.component;

import java.awt.*;

public class RectComponent extends Component {
    public RectComponent() {
        super();
    }

    @Override
    public void start() {

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 50, 50);
    }

    @Override
    public void update() {

    }
}
