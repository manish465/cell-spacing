package com.manish.project.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

public class KeyInput implements KeyListener {
    private static KeyInput keyInput;
    private boolean[] keyPressed;

    private KeyInput(){
        keyPressed = new boolean[350];
        Arrays.fill(keyPressed, false);
    }

    public static KeyInput get(){
        if(KeyInput.keyInput == null){
            KeyInput.keyInput = new KeyInput();
        }

        return KeyInput.keyInput;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        KeyInput.keyInput.keyPressed[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        KeyInput.keyInput.keyPressed[e.getKeyCode()] = false;
    }

    public boolean isKeyPressed(int keyCode) {
        return keyPressed[keyCode];
    }
}
