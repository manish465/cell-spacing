package com.manish.project.input;

import com.manish.project.utils.position.Position;
import com.manish.project.utils.position.Position2D;

import javax.swing.event.MouseInputListener;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class MouseInput implements MouseInputListener {
    private static MouseInput mouseInput;

    private final Position position;
    private final boolean[] mouseButtonPressed;

    private MouseInput() {
        position = new Position2D(0, 0);

        mouseButtonPressed = new boolean[3];
        Arrays.fill(mouseButtonPressed, false);
    }

    public static MouseInput get(){
        if(MouseInput.mouseInput == null){
            MouseInput.mouseInput = new MouseInput();
        }

        return MouseInput.mouseInput;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        MouseInput.mouseInput.mouseButtonPressed[e.getButton() - 1] = true;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        MouseInput.mouseInput.mouseButtonPressed[e.getButton() - 1] = false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        MouseInput.mouseInput.position.setX(e.getX());
        MouseInput.mouseInput.position.setY(e.getY());
    }

    public Position getPosition() {
        return position;
    }

    public boolean isMouseButtonPressed(int mouseCode) {
        return mouseButtonPressed[mouseCode - 1];
    }
}
