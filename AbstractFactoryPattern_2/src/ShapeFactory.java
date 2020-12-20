public class ShapeFactory extends AbstractFactory{
    public Shape getShape(String shape){

        if (shape == null){
            return null;
        }
        else if(shape.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if(shape.equalsIgnoreCase("Square")){
            return new Square();
        }
        else if(shape.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }

        return null;

    }

    Color getColor(String color){
        return null;
    }
}
