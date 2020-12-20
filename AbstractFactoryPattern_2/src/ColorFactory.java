public class ColorFactory extends AbstractFactory{
    public Color getColor(String color){

        if (color == null){
            return null;
        }
        else if(color.equalsIgnoreCase("Red")){
            return new Red();
        }
        else if(color.equalsIgnoreCase("Blue")){
            return new Blue();
        }
        else if(color.equalsIgnoreCase("Green")){
            return new Green();
        }

        return null;

    }
    Shape getShape(String shape){
        return null;
    }
}
