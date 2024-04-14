package com.manish.project.input;

import javax.swing.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class ScrollInput implements MouseWheelListener {
    private static ScrollInput scrollInput;

    private int wheelRotation;
    Timer timer;

    private ScrollInput(){
        wheelRotation = 0;
        timer = new Timer(30, e -> wheelRotation = 0);
    }

    public static ScrollInput get(){
        if(ScrollInput.scrollInput == null){
            ScrollInput.scrollInput = new ScrollInput();
        }

        return ScrollInput.scrollInput;
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        wheelRotation = e.getWheelRotation();
        timer.restart();
    }

    public int getWheelRotation() {
        return wheelRotation;
    }
}
