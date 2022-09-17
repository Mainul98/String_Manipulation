package oop;
//MyEncapsulation
public class Dress {
    public int price;
    private String brand;
    private String color;
    private String size;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void main(String[] args) {
        Dress shirt1=new Dress();
        shirt1.setBrand("Richman");
        shirt1.setSize("XL");
        shirt1.setColor("Blue");

        Dress shirt2=new Dress();
        shirt2.setBrand("Richman");
        shirt2.setSize("XXL");
        shirt2.setColor("Maroon");

        System.out.println(shirt1.getBrand());
        System.out.println( shirt1.getSize());
        System.out.println(shirt1.getColor());

        System.out.println(shirt2.getBrand());
        System.out.println( shirt2.getSize());
        System.out.println(shirt2.getColor());

    }
}
class MyDress{
    public static void main(String[] args) {
        Dress shirt=new Dress();
        shirt.price=500;
        shirt.price=600;
        System.out.println(shirt.price);
    }


}
