package com.islands.gdx.things;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public abstract class Thing {
    int x;
    int y;

    public Thing(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void update();
    public abstract void draw(ShapeRenderer shape);
}
