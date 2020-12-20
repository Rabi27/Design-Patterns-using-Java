interface Shape {
    void draw();
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Circle");
    }
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Rectangle");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Square");
    }
}