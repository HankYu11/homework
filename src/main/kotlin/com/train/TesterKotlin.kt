package com.train


fun main(args: Array<String>) {
    var total = 0
    var roundTickets : Int
    var ticketKT : TicketsKT
    while(true){
        print("欲購買張數：")
        total = readLine()!!.toInt()
        if(total == -1) {
            print("下次再來")
            break
        }
        print("欲購買來回票張數：")
        roundTickets = readLine()!!.toInt()
        if(total <= roundTickets){
            println("訂票數不得小於來回票數")
            continue
        }
        ticketKT = TicketsKT(total,roundTickets)
        ticketKT.printPrice()
    }

}

class TicketsKT(val total: Int, val roundTickets : Int){
    val price = 1000*(total - roundTickets) + 900*roundTickets*2

    fun printPrice(){
        println("共"+price)
    }
}