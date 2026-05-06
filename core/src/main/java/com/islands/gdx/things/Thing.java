package com.islands.gdx.things;

import com.badlogic.gdx.Gdx;
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

    public abstract int getTop();
//    public abstract int getLeft();
//    public abstract int getRight();
    public abstract int getBottom();

    protected int invertY() {
        int mouseY = Gdx.input.getY();
        int height = Gdx.graphics.getHeight();

        return height - mouseY;
    }
}
