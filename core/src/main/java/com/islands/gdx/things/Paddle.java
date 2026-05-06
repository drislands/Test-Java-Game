package com.islands.gdx.things;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Paddle extends Thing {
    int w;
    int h;

    public Paddle(int x, int y, int w, int h) {
        super(x, y);
        this.w = w;
        this.h = h;
    }

    @Override
    public void update() {
        x = Gdx.input.getX() - (w/2);
        y = invertY()        - (h/2);
    }

    @Override
    public void draw(ShapeRenderer shape) {
        shape.rect(x,y,w,h);
    }

    @Override
    public int getTop() {
        return y + h;
    }

    @Override
    public int getLeft() {
        return x;
    }

    @Override
    public int getRight() {
        return x + w;
    }

    @Override
    public int getBottom() {
        return y;
    }
}
