package HomeWork.Animal;

public class Shark extends Animal{
    public Shark(String name, int age, int child) {
        super(name, age, child);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    void attack(){
        System.out.println("Shark can attack, be careful!");
    }

}
