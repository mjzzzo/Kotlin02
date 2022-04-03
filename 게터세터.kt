package com.example.kotlin02.Day01

class User(_id: Int, _name: String, _age: Int){
    val id: Int = _id
    var name: String = _name
    var age: Int = _age
}

fun main(){
    val user = User(1, "Sean", 30)

    //user.name = 2  읽기 전용이므로 값 지정 불가
    val name = user.name


    user.age = 20

    println("name: $name, age: ${user.age}")
}