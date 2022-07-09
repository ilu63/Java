public class Square extends Rectangle{
    
    
    public Square(String color, int length, int width){
        super(color, length, width);
    
    }

    @Override
    public void display(){
        System.out.println("This is a " + super.color + " square");
    }

}