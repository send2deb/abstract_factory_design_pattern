package com.debdroid.hf.dp.abstractfactory

class NYPizzaStore : PizzaStore() {
    val ingredientFactory: PizzaIngredientFactory = NYPizzaIngredientFactory()

    override fun createPizza(type: String): Pizza? {
        when (type) {
            "cheese" -> {
                val pizza = CheesePizza(ingredientFactory)
                pizza.name = "New York Style Cheese Pizza"
                return pizza
            }
            "veggie" -> {
                val pizza = VeggiePizza(ingredientFactory)
                pizza.name = "New York Style Veggie Pizza"
                return pizza
            }
            "clam" -> {
                val pizza = VeggiePizza(ingredientFactory)
                pizza.name = "New York Style clam Pizza"
                return pizza
            }
            "pepperoni" -> {
                val pizza = VeggiePizza(ingredientFactory)
                pizza.name = "New York Style pepperoni Pizza"
                return pizza
            }
            else -> return null
        }
    }
}