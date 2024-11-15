package PracticeDay.Task1;

public class Horse extends Animal{
    private String color;

    public Horse() {
    }

    public Horse(double weight, int age, char gender, String nickName, String color) {
        super(weight, age, gender, nickName);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return  super.toString() +
                "\ncolor: '" + color + "\n _____________________";
    }
}
