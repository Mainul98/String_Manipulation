package oop;

public class ProductSell {
    public int vat;
    public ProductSell(int vat){
        this.vat=vat;
    }
    public int getPrice(int price){
        price+=(price*vat/100);
        return price;
    }
    public static void main(String[] args) {
        ProductSell shirt=new ProductSell(15);
        int totalPrice= shirt.getPrice(100);
        System.out.println(totalPrice);
        ProductSell pizza=new ProductSell(7);
         totalPrice= shirt.getPrice(700);
        System.out.println(totalPrice);
    }
}

