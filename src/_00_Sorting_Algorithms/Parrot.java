package _00_Sorting_Algorithms;

public class Parrot extends Bird{
    public String food(){
        return "peas";
    }
    public void fly(){
        super.fly();
        System.out.println("wheeeee");
    }
    public void speak() {
    	System.out.println("I am a parrot");
    }
}