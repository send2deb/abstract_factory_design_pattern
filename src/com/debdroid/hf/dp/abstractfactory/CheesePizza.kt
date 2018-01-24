package com.debdroid.hf.dp.abstractfactory

class CheesePizza(val ingredientFactory: PizzaIngredientFactory) : Pizza() {
    override fun prepare() {
        println("Preparing $name...")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
    }
}