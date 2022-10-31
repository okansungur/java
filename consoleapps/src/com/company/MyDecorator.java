package com.company;

 interface Shape {
    void draw();
}

 class Rectanglem implements Shape {

    // Overriding the method
    @Override public void draw()
    {
        System.out.println("Shape: Rectangle");
    }
}
class Circlem implements Shape {

    @Override
    public void draw()
    {
        System.out.println("Shape: Circle");
    }
}

 abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape)
    {
        this.decoratedShape = decoratedShape;
    }



    public void draw() {
        decoratedShape.draw(); }
}

 class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}



public class MyDecorator {


    public static void main(String args[]) {
        Shape circle = new Circlem();

        Shape redCircle = new RedShapeDecorator(new Circlem());

        Shape redRectangle = new RedShapeDecorator(new Rectanglem());
      //  System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

    }

}
