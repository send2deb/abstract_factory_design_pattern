package com.debdroid.hf.dp.abstractfactory

fun main(args: Array<String>) {
    val nyStore: PizzaStore = NYPizzaStore()
    val chicagoStore: PizzaStore = ChicagoPizzaStore()

    var pizza: Pizza? = nyStore.orderPizza("pepperoni")
    println(pizza.toString())

    pizza = chicagoStore.orderPizza("cheese")
    println(pizza.toString())
}