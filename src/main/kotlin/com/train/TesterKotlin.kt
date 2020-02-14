package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("欲購買張數：")
    val total = scanner.nextInt()
    print("欲購買來回票張數：")
    val roundTickets = scanner.nextInt()
    val t1 = TicketsKT(total, roundTickets)
    t1.printPrice()
}

class TicketsKT(val total: Int, val roundTickets : Int){
    val price = 1000*(total - roundTickets) + 900*roundTickets*2
    fun printPrice(){
        println("共"+price)
    }
}