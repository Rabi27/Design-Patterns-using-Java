public class PizzaFactory extends AbstractFactory {

    public Pizza getPizza(String pizzatype) {

        if (pizzatype.equalsIgnoreCase("Spicy")) {
            return new Spicy();
        }
        else if(pizzatype.equalsIgnoreCase("Veggie")){
            return new VeggiePizza();
        }
        else if(pizzatype.equalsIgnoreCase("Chicken Tikka")){
            return new ChickenTikka();
        }
        return null;
    }

    public Sandwich getSandwich(String sandwichtype){
        return null;
    }
}
