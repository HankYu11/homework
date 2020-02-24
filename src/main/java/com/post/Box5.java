package com.post;

public class Box5 {
    float length = 39.5f;
    float width = 27.5f;
    float height = 23f;

    public boolean validate(float length,float width,float height) {
        return(length <= this.length && width <= this.width && height <= this.height);
    }
}
