package com.PostOffice

fun main(args: Array<String>) {
    val length:Float
    val width:Float
    val height:Float
    val box3 = Box3()
    val box5 = Box5()
    print("長：")
    length = readLine()!!.toFloat()
    print("寬：")
    width = readLine()!!.toFloat()
    print("高：")
    height = readLine()!!.toFloat()

    if(box3.validate(length,width,height)){
        println("Box3")
    }else if(box5.validate(length,width,height)){
        println("Box5")
    }else{
        println("裝不下")
    }
}

class Box3{
    val length = 23f
    val width = 14f
    val height = 13f

    fun validate(length: Float,width:Float,height:Float) : Boolean{
        return(length <= this.length && width <= this.width && height <= this.height)
    }
}

class Box5{
    val length = 39.5f
    val width = 27.5f
    val height = 23f

    fun validate(length: Float,width:Float,height:Float) : Boolean{
        return(length <= this.length && width <= this.width && height <= this.height)
    }
}