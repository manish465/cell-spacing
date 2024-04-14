package com.manish.project.display;

import com.manish.project.input.KeyInput;
import com.manish.project.input.MouseInput;
import com.manish.project.input.ScrollInput;

import javax.swing.*;

public class Window {
    private final JFrame frame;

    public Window(Panel panel){
        frame = new JFrame();
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);

        frame.addMouseMotionListener(MouseInput.get());
        frame.addMouseListener(MouseInput.get());
        frame.addKeyListener(KeyInput.get());
        frame.addMouseWheelListener(ScrollInput.get());
    }

    public void startWindow(){
        frame.setVisible(true);
    }
}
