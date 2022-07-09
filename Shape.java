public class Shape{
    String color;

    public Shape(String color){
        this.color = color;
    }
    public double CalculateArea(){
        return 0;
    }
    public double CalculatePerimeter(){
        return 0;
    }
    public void display(){
        System.out.println("This is a shape with color " + this.color);
    }
}

