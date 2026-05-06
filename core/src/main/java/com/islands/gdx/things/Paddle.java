package com.islands.gdx.things;

import com.badlogic.gdx.Gdx;

public class Paddle extends Rectangle {

    public Paddle(int x, int y, int w, int h) {
        super(x, y, w, h);
    }

    @Override
    public void update() {
        x = Gdx.input.getX() - (w/2);
    }
}
