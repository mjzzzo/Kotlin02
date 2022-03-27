package com.example.kotlin02.Day01

class Pen {
    var color: String = "Black"
    var owner: String = "없음"
    var price: Int = 500

    constructor(color: String, owner: String, price: Int) {
        this.color = color
        this.owner = owner
        this.price = price
    }

    constructor(color: String, price: Int) {
        this.color = color
        this.price = price
    }

    constructor(price: Int) {
        this.price = price
    }
}

fun main() {
    val pen1 = Pen("Blue", "Kim", 1000)
    val pen2 = Pen("Unknown",500)
    val pen3 = Pen(3000)

    println("pen1의 색, 주인, 가격 = ${pen1.color}, ${pen1.owner}, ${pen1.price}")
    println("pen2의 색, 주인, 가격 = ${pen2.color}, ${pen2.owner}, ${pen2.price}")
    println("pen3의 색, 주인, 가격 = ${pen3.color}, ${pen3.owner}, ${pen3.price}")
}
