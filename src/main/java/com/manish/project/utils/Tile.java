package com.manish.project.utils;

import com.manish.project.setting.Constant;

public class Tile {
    private final Size size;

    public Tile(){
        size = new Size(Constant.TILE_WIDTH, Constant.TILE_HEIGHT);
    }

    public Size getSize() {
        return size;
    }
}
