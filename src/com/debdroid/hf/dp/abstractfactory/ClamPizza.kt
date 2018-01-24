package com.debdroid.hf.dp.abstractfactory

class ClamPizza(val ingredientFactory: PizzaIngredientFactory) : Pizza() {
    override fun prepare() {
        println("Preparing $name Pizza...")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
        clam = ingredientFactory.createClam()
    }
}