package com.train;

public class Tickets {
    int total;
    int roundTickets;
    public Tickets(int total, int roundTickets){
        this.total = total;
        this.roundTickets = roundTickets;
    }

    public void printPrice(){
        int price = (total-roundTickets) * 1000 + (int)(1000*0.9)*roundTickets*2;
        System.out.println("票價共 " +  price +" 元" );
    }
}
