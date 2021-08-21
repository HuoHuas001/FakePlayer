package com.ddf.fakeplayer.util;

public class Vec2 {
    public static final Vec2 ZERO = new Vec2();
    public float x, y;

    public Vec2() {
        this(0.0f, 0.0f);
    }

    public Vec2(Vec2 vec2) {
        this(vec2.x, vec2.y);
    }

    public Vec2(float _x, float _y) {
        this.x = _x;
        this.y = _y;
    }
}