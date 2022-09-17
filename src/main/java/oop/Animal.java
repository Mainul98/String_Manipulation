package oop;

public class Animal {
    public void talk(){
        System.out.println("Animal can't talk");
    }
    public void breeds(){
        System.out.println("Animal can breeds");
    }

    public static void main(String[] args) {
        Bird sparrow=new Bird();
        sparrow.talk();
        Parrot parrot=new Parrot();
        parrot.talk();
        Bird mayna=new Mayna();
        mayna.talk();
    }
}
class Bird extends Animal{
    public void talk(){
        System.out.println("Bird can't talk");
    }
}
class Parrot extends Bird{
    public void talk(){
        System.out.println("Parrot can talk");
    }
}
class Mayna extends Bird{
    public void talk(){
        System.out.println("Mayna can also talk");
    }
}

