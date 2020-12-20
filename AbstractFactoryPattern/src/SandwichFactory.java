public class SandwichFactory extends AbstractFactory {

    public Sandwich getSandwich(String sandwichtype) {

        if (sandwichtype.equalsIgnoreCase("Cheese")) {
            return new Cheese();
        }
        else if(sandwichtype.equalsIgnoreCase("Veggie")){
            return new VeggieSandwich();
        }
        else if(sandwichtype.equalsIgnoreCase("Tikka")){
            return new Tikka();
        }
        return null;
    }

    public Pizza getPizza(String pizzatype){
        return null;
    }
}
