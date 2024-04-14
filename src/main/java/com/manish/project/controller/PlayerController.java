package com.manish.project.controller;

import com.manish.project.input.KeyInput;
import com.manish.project.input.ScrollInput;

import java.awt.event.KeyEvent;

public class PlayerController implements Controller{
    @Override
    public boolean isControllerUp() {
        return KeyInput.get().isKeyPressed(KeyEvent.VK_W);
    }

    @Override
    public boolean isControllerDown() {
        return KeyInput.get().isKeyPressed(KeyEvent.VK_S);
    }

    @Override
    public boolean isControllerLeft() {
        return KeyInput.get().isKeyPressed(KeyEvent.VK_A);
    }

    @Override
    public boolean isControllerRight() {
        return KeyInput.get().isKeyPressed(KeyEvent.VK_D);
    }

    @Override
    public boolean isControllerZoomIn() {
        return ScrollInput.get().getWheelRotation() < 0;
    }

    @Override
    public boolean isControllerZoomOut() {
        return ScrollInput.get().getWheelRotation() > 0;
    }
}
