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

    //下面的if有提示說用when寫，所以試著寫了，但不太理解這樣使用是否得宜
    when(box3.validate(length,width,height)){
        true -> println("Box3")
        false -> if(box5.validate(length,width,height)) println("Box5") else println("Too Big!")
    }

    if(box3.validate(length,width,height)){
        println("Box3")
    }else if(box5.validate(length,width,height)){
        println("Box5")
    }else{
        println("裝不下")
    }
}

class Box3 : Box(23f,14f,13f){
}

class Box5 : Box(39.5f,27.5f,23f){
}

open class Box(val length: Float,val width: Float,val height: Float){

    fun validate(length: Float,width:Float,height:Float) : Boolean{
        return(length <= this.length && width <= this.width && height <= this.height)
    }
}