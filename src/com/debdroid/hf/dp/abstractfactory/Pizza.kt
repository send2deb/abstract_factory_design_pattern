package com.debdroid.hf.dp.abstractfactory

import sun.text.normalizer.UTF16.append



abstract class Pizza {
    var name: String = ""
    var dough: Dough? = null
    var sauce: Sauce? = null
    var veggies: Array<Veggies> = arrayOf()
    var cheese: Cheese? = null
    var pepperoni: Pepperoni? = null
    var clam: Clams? = null

    abstract fun prepare()

    fun bake() {
        println("Bake for 30 minutes at 350")
    }

    open fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    fun box() {
        println("Putting the pizza in official PizzaStore box")
    }

    override fun toString(): String {
        val result = StringBuffer()
        result.append("---- $name ----\n")
        if (dough != null) {
            result.append(dough)
            result.append("\n")
        }
        if (sauce != null) {
            result.append(sauce)
            result.append("\n")
        }
        if (cheese != null) {
            result.append(cheese)
            result.append("\n")
        }
        if (veggies != null) {
            for (i in 0 until veggies.size) {
                result.append(veggies[i])
                if (i < veggies.size - 1) {
                    result.append(", ")
                }
            }
            result.append("\n")
        }
        if (clam != null) {
            result.append(clam)
            result.append("\n")
        }
        if (pepperoni != null) {
            result.append(pepperoni)
            result.append("\n")
        }
        return result.toString()
    }
}