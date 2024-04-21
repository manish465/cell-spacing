package com.manish.project.utils.position;

import com.manish.project.setting.Constant;

public class RandomPosition extends Position{
    public RandomPosition(){
        this.x = Math.random() * Constant.WINDOW_WIDTH;
        this.y = Math.random() * Constant.WINDOW_HEIGHT;
    }
}
