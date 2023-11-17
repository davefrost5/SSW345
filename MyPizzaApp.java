public class MyPizzaApp {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: MyPizzaApp <franchise> <pizzaKind>");
            return;
        }

        String franchise = args[0];
        String pizzaKind = args[1];

        PizzaStore pizzaStore;

        // Instantiate the appropriate PizzaStore based on the franchise
        if ("NYPizzaStore".equalsIgnoreCase(franchise)) {
            pizzaStore = new NYPizzaStore();
        } else if ("ChicagoPizzaStore".equalsIgnoreCase(franchise)) {
            pizzaStore = new ChicagoPizzaStore();
        }
         else {
            System.out.println("Invalid franchise");
            return;
        }

        // Order the pizza
        pizzaStore.orderPizza(pizzaKind);
    }
}