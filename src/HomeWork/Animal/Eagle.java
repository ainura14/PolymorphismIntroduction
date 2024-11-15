package HomeWork.Animal;

public class Eagle extends Animal{
    public Eagle(String name, int age, int child) {
        super(name, age, child);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    void fly(){
        System.out.println("We know that eagle can fly even higher!");
    }
}
