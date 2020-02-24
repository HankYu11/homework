package com.post;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float length;
        float width;
        float height;
        Box3 box3 = new Box3();
        Box5 box5 = new Box5();
        System.out.print("Please enter object's length:");
        length = scanner.nextFloat();
        System.out.print("Please enter object's width:");
        width = scanner.nextFloat();
        System.out.print("Please enter object's height:");
        height = scanner.nextFloat();
        if(box3.validate(length,width,height)){
            System.out.println("Box3");
        }else if(box5.validate(length,width,height)){
            System.out.println("Box5");
        }else{
            System.out.println("Too Big!");
        }
    }
}
