public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Pizza")) {
            return new PizzaFactory();
        } else if (choice.equalsIgnoreCase("Sandwich")) {
            return new SandwichFactory();
        }

        return null;
    }

}
