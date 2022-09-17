package oop;

public class MultpleInterface {
    public static void main(String[] args) {
        Child child=new Child();
        child.looksLike();
        child.behaviour();

    }
}
interface Father{
    void looksLike();
}
interface Mother{
    void behaviour();
}
class Child implements Father,Mother{
    public void looksLike(){
        System.out.println("Looking like father");
    }
    public void behaviour(){
        System.out.println("Behave like mother");
    }

}
