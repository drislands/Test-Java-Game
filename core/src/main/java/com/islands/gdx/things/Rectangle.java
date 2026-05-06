package com.islands.gdx.things;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public abstract class Rectangle extends Thing {
    int w;
    int h;

    public Rectangle(int x, int y, int w, int h) {
        super(x, y);
        this.w = w;
        this.h = h;
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
