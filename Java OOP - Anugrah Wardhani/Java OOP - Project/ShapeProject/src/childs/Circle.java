package childs;

import parents.Shape;

public class Circle extends Shape {
    private double radius;

    //Constructor
    public Circle(){

    }

    public Circle(double radius, String color){
        setColor(color);
        this.radius = radius;
    }

    // Getter dan Setter
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    //Override dan implementasi method abstract getArea for Circle
    @Override
    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }

}
