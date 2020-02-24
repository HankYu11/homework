package com.post;

public class Box3 {
    float length = 23f;
    float width = 14f;
    float height = 13f;

    public boolean validate(float length,float width,float height) {
        return(length <= this.length && width <= this.width && height <= this.height);
    }
}
