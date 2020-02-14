package com.train;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tickets tickets = new Tickets();
        //請問老師使用while(true)是否不好
        while (true){
            System.out.print("請輸入欲購買張數：");
            tickets.setTotal(scanner.nextInt());
            if (tickets.total == -1) {
                System.out.print("下次再來");
                break;
            }
            System.out.print("請輸入欲購買來回票張數：");
            tickets.setRoundTickets(scanner.nextInt());
            if(tickets.total >= tickets.roundTickets){
                tickets.printPrice();
            }else {
                System.out.println("來回票不可多於購買票數");
            }

        }
    }
}
