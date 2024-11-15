package PracticeDay.Task1;

public class Animal {
    private double weight;
    private int age;
    private char gender;
    private String nickName;

    public Animal() {
    }

    public Animal(double weight, int age, char gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return  "\nweight: " + weight +
                "\nage: " + age +
                "\ngender:" + gender +
                "\nnickName: " + nickName;
    }
}
