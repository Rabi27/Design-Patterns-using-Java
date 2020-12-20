interface Pizza {

    void prepare();
}

class Spicy implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Spicy Pizza");
    }
}

class ChickenTikka implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Chicken Tikka Pizza");
    }
}


class VeggiePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Pizza");
    }
}


