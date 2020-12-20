interface Sandwich {
    void packing();
}

class Cheese implements Sandwich{
    @Override
    public void packing() {
        System.out.println("Packing Cheese Sandwich");
    }
}

class Tikka implements Sandwich{
    @Override
    public void packing() {
        System.out.println("Packing Tikka Sandwich");
    }
}


class VeggieSandwich implements Sandwich{
    @Override
    public void packing() {
        System.out.println("Packing Veggie Sandwich");
    }
}
