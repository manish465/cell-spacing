package com.manish.project.component;

import com.manish.project.actor.Actor;
import com.manish.project.setting.Constant;
import com.manish.project.utils.Grid;
import com.manish.project.utils.Tile;

import java.awt.*;

public class GridComponent extends Component{
    private final Grid grid;
    private boolean show;

    public GridComponent(boolean show, Actor actor) {
        super(actor);
        this.show = show;
        grid = new Grid();
    }

    @Override
    public void start() {

    }

    @Override
    public void render(Graphics2D g) {
        Tile[][] tiles = grid.getTiles();

        g.setColor(show ? Color.GRAY : Color.WHITE);
        g.setStroke(new BasicStroke(2));
        for(int i=0; i < grid.getHeight(); i++){
            for(int j=0; j < grid.getWidth(); j++){
                g.drawRect(
                        (Constant.TILE_WIDTH * (i - grid.getWidth() / 2)),
                        (Constant.TILE_HEIGHT * (j - grid.getHeight() / 2)),
                        (int) tiles[i][j].getSize().getWidth(),
                        (int) tiles[i][j].getSize().getHeight()
                );
            }
        }
    }

    @Override
    public void update() {

    }

    public void setShow(boolean show) {
        this.show = show;
    }
}
