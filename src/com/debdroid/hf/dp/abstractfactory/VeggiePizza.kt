package com.debdroid.hf.dp.abstractfactory

class VeggiePizza (val ingredientFactory: PizzaIngredientFactory) : Pizza() {
    override fun prepare() {
        println("Preparing $name Pizza...")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
        veggies = ingredientFactory.createVeggies()
    }
}