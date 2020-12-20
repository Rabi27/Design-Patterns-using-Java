public class Demo {

    public static void main(String[] args){
        AbstractFactory pizzafactory = FactoryProducer.getFactory("Pizza");
        Pizza pizzaA = pizzafactory.getPizza("Spicy");
        Pizza pizzaB = pizzafactory.getPizza("Veggie");
        Pizza pizzaC = pizzafactory.getPizza("Chicken Tikka");

        pizzaA.prepare();
        pizzaB.prepare();
        pizzaC.prepare();

        AbstractFactory sandwichfactory = FactoryProducer.getFactory("Sandwich");
        Sandwich sdA = sandwichfactory.getSandwich("Tikka");
        Sandwich sdB = sandwichfactory.getSandwich("Veggie");
        Sandwich sdC = sandwichfactory.getSandwich("Cheese");

        sdA.packing();
        sdB.packing();
        sdC.packing();
    }
}
