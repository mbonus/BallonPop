package com.bohn.ballonpop;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by bohn on 18-05-2015.
 */
public class ExplosionFragment extends GameObject {
    float r;
    int color;
    public ExplosionFragment(int x, int y, int dx, int dy, float r, int color) {
        super.dx = dx;
        super.dy = dy;
        super.x = x;
        super.y = y;
        this.r = r;
        this.color = color;
    }

    public float getR() {
        return this.r;
    }

    public void update() {
        super.x += super.dx;
        super.y += super.dy;
        if (this.r > 0) {
            this.r -= 0.1;
        }
    }

    public void draw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(color);
        paint.setAntiAlias(true);
        canvas.drawCircle(super.x,super.y,this.r,paint);
    }


}
