package PracticeDay.Task2;

public class Shark extends  Animal{
    public Shark() {
    }

    public Shark(String color, int age, Gender gender) {
        super(color, age, gender);
    }

    @Override
    public String toString() {
        return "\n" + super.toString();
    }

    public void attack(){
        System.out.println("Shark can attack, it will be dangereous for your life!");
    }
}
