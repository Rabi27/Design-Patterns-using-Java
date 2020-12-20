interface Color {

    void fill();
}


class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Red");
    }
}

class Green implements Color{
    @Override
    public void fill() {
        System.out.print("Inside Green");
    }
}


class Blue implements Color{
    @Override
    public void fill() {
        System.out.print("Inside Blue");
    }
}