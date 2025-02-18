import java.util.*;
abstract class Animal{
    abstract void sound();
    abstract void eat();
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
    void eat(){
        System.out.println("Dog eats bones");
    }
}
public class AbstractKeyword {
    public static void main(String args[]){
        //abstract keyword
        Animal animal = new Dog();
        animal.sound();
        animal.eat();
        //break
        int a = 12;
        for(int i = 1;i<20;i++){
            if(i!=a){
                continue;
            }
            else{
                System.out.println("Found a");
                break;
            }
        }
        //switch, case, default
        String pet = "dog";
        switch(pet){
            case "cat":System.out.println("Meow");
                       break;
            case "dog":System.out.println("Bark");
                        break;
            default: System.out.println("Your pet is not present");
        }
        //if-else
        if(a==12) System.out.println("a is 12");
        else System.out.println("a IS NOT 12");
        char c = 'a';
        a = c;
        System.out.println("ASCCI Value of"+c+" is "+a);
    }
}
