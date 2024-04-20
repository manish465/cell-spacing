package com.manish.project.utils;

public class Grid {

    private final Tile[][] tiles2D;

    public Grid(){
        tiles2D = new Tile[200][200];
        initializeTiles();
    }

    private void initializeTiles() {
        for(int i=0; i < tiles2D.length; i++){
            for(int j=0; j < tiles2D[0].length; j++){
                tiles2D[i][j] = new Tile();
            }
        }
    }

    public Tile[][] getTiles(){
        return tiles2D;
    }

    public int getWidth(){
        return tiles2D[0].length;
    }

    public int getHeight(){
        return tiles2D.length;
    }
}
