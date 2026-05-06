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
    List<Thing> things = new ArrayList<>();

    @Override
    public void create() {
        shape = new ShapeRenderer();
        things.add(new Ball(50,50,15,5,5));
        things.add(new Paddle(50,20,40,5));
    }

    @Override
    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        shape.begin(ShapeRenderer.ShapeType.Filled);
        for(Thing thing : things) {
            thing.update();
            thing.draw(shape);
        }
        shape.end();
    }
}
