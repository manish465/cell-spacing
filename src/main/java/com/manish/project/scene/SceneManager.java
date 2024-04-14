package com.manish.project.scene;

import java.util.ArrayList;
import java.util.List;

public class SceneManager {
    private static SceneManager sceneManager;
    private List<Scene> scenes;
    private Scene currentScene;

    private SceneManager(){
        scenes = new ArrayList<>();
        currentScene = new DefaultScene("default");

        scenes.add(currentScene);
    }

    public static SceneManager get(){
        if(sceneManager == null){
            sceneManager = new SceneManager();
        }
        return sceneManager;
    }

    public Scene getCurrentScene() {
        return currentScene;
    }
}
