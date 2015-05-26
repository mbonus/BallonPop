package com.bohn.ballonpop.buffs;

import android.graphics.Canvas;
import android.graphics.Paint;

import com.bohn.ballonpop.GameObject;
import com.bohn.ballonpop.GamePanel;

/**
 * Created by bohn on 21-05-2015.
 */
public abstract class Buff extends GameObject {
    protected int r = 20;
    protected Paint paint;
    protected double dy = 5;

    public void update () {
        super.y += dy+dy*0.06;
    }
    public void draw(Canvas canvas) {

    }

    public boolean shouldRemove() {
        return super.y > GamePanel.HEIGHT + this.r;
    }
}
