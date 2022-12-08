package com.example.weatherappkotlin

data class DataClassTest(val name : String , val age: Int) {

    override fun toString(): String {
        return "name: " +this.name+ " age:" + this.age
    }
}
