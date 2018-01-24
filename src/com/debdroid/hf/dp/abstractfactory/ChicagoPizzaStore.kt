package com.debdroid.hf.dp.abstractfactory

class ChicagoPizzaStore : PizzaStore() {
    val ingredientFactory: PizzaIngredientFactory = ChicagoPizzaIngredientFactory()

    override fun createPizza(type: String): Pizza? {
        when (type) {
            "cheese" -> {
                val pizza = CheesePizza(ingredientFactory)
                pizza.name = "Chicago Style Cheese Pizza"
                return pizza
            }
            "veggie" -> {
                val pizza = VeggiePizza(ingredientFactory)
                pizza.name = "Chicago Style Veggie Pizza"
                return pizza
            }
            "clam" -> {
                val pizza = VeggiePizza(ingredientFactory)
                pizza.name = "Chicago Style clam Pizza"
                return pizza
            }
            "pepperoni" -> {
                val pizza = VeggiePizza(ingredientFactory)
                pizza.name = "Chicago Style pepperoni Pizza"
                return pizza
            }
            else -> return null
        }
    }
}