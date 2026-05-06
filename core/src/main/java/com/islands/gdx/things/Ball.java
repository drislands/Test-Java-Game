package com.islands.gdx.things;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Ball extends Thing {
    int size;
    int xSpeed;
    int ySpeed;

    public Ball(int x, int y, int size, int xSpeed, int ySpeed) {
        super(x,y);
        this.size = size;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void update() {
        x += xSpeed;
        y += ySpeed;
        if(x-size < Math.abs(xSpeed) || x+size > Gdx.graphics.getWidth() - Math.abs(xSpeed)) {
            xSpeed = -xSpeed;
        }
        if(y-size < Math.abs(ySpeed) || y+size > Gdx.graphics.getHeight() - Math.abs(ySpeed)) {
            ySpeed = -ySpeed;
        }
    }

    @Override
    public void draw(ShapeRenderer shape) {
        shape.circle(x,y,size);
    }
}
