package com.islands.gdx.things;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Ball extends Thing {
    int size;
    int xSpeed;
    int ySpeed;

    int paddleImpactValue = 1;

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

    @Override
    public int getTop() {
        return y + size;
    }

    @Override
    public int getLeft() {
        return x - size;
    }

    @Override
    public int getRight() {
        return x + size;
    }

    @Override
    public int getBottom() {
        return y - size;
    }

    public void checkCollision(Paddle paddle) {
        if(overlaps(paddle)) {
            ySpeed = -ySpeed;
            switch(paddle.movingDirection()) {
                case 1 -> xSpeed += paddleImpactValue;
                case -1 -> xSpeed -= paddleImpactValue;
            }
        }
    }

    public void checkCollision(Block block) {
        if(overlaps(block)) {
            ySpeed = -ySpeed;
            block.destroyed = true;
        }
    }
}
