package com.islands.gdx.things;

import com.badlogic.gdx.Gdx;

public class Paddle extends Rectangle {

    int lastX;
    int velocity = 0;

    public Paddle(int x, int y, int w, int h) {
        super(x, y, w, h);
        lastX = x;
    }

    @Override
    public void update() {
        x = Gdx.input.getX() - (w/2);
        velocity = x - lastX;
        lastX = x;
    }

    /**
     * Returns 1 if moving right, -1 if moving left, 0 if standing still.
     */
    public int movingDirection() {
        return Integer.compare(velocity,0);
    }
}
