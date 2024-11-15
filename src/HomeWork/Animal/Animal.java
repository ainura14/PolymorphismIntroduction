package HomeWork.Animal;

public class Animal {
    private String name;
    private int age;
    private int child;

    public Animal() {
    }

    public Animal(String name, int age, int child) {
        this.name = name;
        this.age = age;
        this.child = child;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", child=" + child +
                '}';
    }
    void sound(){}
}
