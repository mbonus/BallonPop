package com.bohn.ballonpop;

/**
 * Created by QQ on 26-05-2015.
 */
public class Lines {
    private float x, y, x1, y1, px, py;
    private float tmpx, tmpy;
    public Lines(float x, float y, float x1, float y1){
        tmpx = x;
        tmpy = y;
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
    }
    public float getX(){return this.x;}
    public float getY() {return this.y;}
    public float getX1(){return this.x1;}
    public float getY1(){return this.y1;}

    public void update(){
        int len = -20;

        line_point(tmpx, tmpy, this.x1, this.y1, 20);
        this.x = this.x1;
        this.y = this.y1;
        this.x1 = px;
        this.y1 = py;
    }

    public void line_point(float x1, float y1, float x2, float y2, int distance){
        float vx = x2 - x1;
        float vy = y2 - y1;
        float mag = (float)Math.sqrt(vx*vx + vy*vy);
        vx /= mag;
        vy /= mag;
        px = (int)((float)x1 + vx * (mag + distance));
        py = (int)((float)y1 + vy * (mag + distance));
    }

    public boolean shouldRemove() {
        return (this.y > GamePanel.HEIGHT + 50) || (this.y < 0) || this.x > GamePanel.WIDTH+50 || this.x < 0;
    }
}
