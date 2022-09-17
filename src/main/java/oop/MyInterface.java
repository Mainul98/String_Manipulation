package oop;

public interface MyInterface{
    void drawShape();
}
class Rectangle implements MyInterface{
    public void drawShape(){
        System.out.println("Drawing rectangle");
    }
}
class Circle implements MyInterface{
    public void drawShape(){
        System.out.println("Drawing circle");
    }
}
class TestInterface{
    public static void main(String[] args) {
        MyInterface r=new Circle();
        r.drawShape();
    }
}
