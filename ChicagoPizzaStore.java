public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if ("pepperoni".equalsIgnoreCase(pizzaType)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        } else if ("clam".equalsIgnoreCase(pizzaType)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if ("veggie".equalsIgnoreCase(pizzaType)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        }

        return pizza;
    }
}