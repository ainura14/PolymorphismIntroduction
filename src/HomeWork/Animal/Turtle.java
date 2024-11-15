package HomeWork.Animal;

public class Turtle extends Animal{
    public Turtle(String name, int age, int child) {
        super(name, age, child);
    }

    @Override
    public String toString() {
        return "Turtle{}";
    }
    void swim(){
        System.out.println("Turtle can run just slowly!");
    }
}
