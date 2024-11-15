package PracticeDay.Task1;

public class Sheep extends Animal{
    public Sheep() {
    }

    public Sheep(double weight, int age, char gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return super.toString() + "\n++++++++++++++++++++";
    }
}
