public class Circle extends Shape{
    int radius;
    final double pi = 3.14;
    public Circle(String color, int radius){
        super(color);
        this.radius = radius;
    }
    @Override
    public double CalculateArea(){
        return pi*this.radius*this.radius;
    }
    @Override
    public double CalculatePerimeter(){
        return 2*pi*this.radius;
    }
    @Override
    public void display(){
        System.out.println("This is a " +super.color + " circle");
    }

}
