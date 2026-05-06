package com.islands.gdx;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.islands.gdx.things.Ball;
import com.islands.gdx.things.Paddle;
import com.islands.gdx.things.Thing;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms.
 */
public class Main extends ApplicationAdapter {
    ShapeRenderer shape;
    Ball ball;
    Paddle paddle;

    @Override
    public void create() {
        shape = new ShapeRenderer();
        ball = new Ball(300,300,15,2,6);
        paddle = new Paddle(50,20,80,5);
    }

    @Override
    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        shape.begin(ShapeRenderer.ShapeType.Filled);

        ball.checkCollision(paddle);
        ball.update();
        ball.draw(shape);
        paddle.update();
        paddle.draw(shape);

        shape.end();
    }
}
