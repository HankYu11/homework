package com.train;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入欲購買張數：");
        int total = scanner.nextInt();
        System.out.print("請輸入欲購買來回票張數：");
        int roundtickets = scanner.nextInt();
        Tickets t1 = new Tickets(total,roundtickets);
        t1.printPrice();
    }
}
