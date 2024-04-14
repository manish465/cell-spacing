package com.manish.project.display;

import com.manish.project.setting.Constant;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    private final Renderer renderer;

    public Panel(){
        super();
        renderer = new Renderer();
        setPreferredSize(new Dimension(Constant.WINDOW_WIDTH, Constant.WINDOW_HEIGHT));
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        renderer.renderActor(g);
        g.dispose();
    }
}
