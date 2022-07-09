public class Main {
    public static void main(String args[]){
        
        Circle circle = new Circle("red", 3);
        System.out.println(circle.CalculateArea());
        circle.display();
        
        Square square = new Square("blue", 5, 5);
        System.out.println(square.CalculateArea());
        square.display();
        
        Rectangle rectangle = new Rectangle("voilet", 6, 5);
        System.out.println(rectangle.CalculateArea());
        rectangle.display();
        
        Triangle triangle = new Triangle("Green", 7, 15);
        System.out.println(triangle.CalculateArea());
        triangle.display();
    }
    
}
