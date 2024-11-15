package PracticeDay.Task1;

import java.sql.SQLOutput;

public class Cow extends Animal{
    public Cow() {
    }

    public Cow(double weight, int age, char gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return super.toString() + "\n--------------------";
    }
}
