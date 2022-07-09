public class Triangle extends Shape{
    int height;
    int base;
       
    public Triangle(String color, int height, int base){
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public double CalculateArea(){
        return (this.height*this.base)/2;
    }

    @Override
    public double CalculatePerimeter(){
        return ((this.height+this.base)+Math.sqrt(this.height^2+this.base^2));
    }

    @Override
    public void display(){
        System.out.println("This is a " + super.color + " triangle");
    }

}
