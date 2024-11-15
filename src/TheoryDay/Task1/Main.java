package TheoryDay.Task1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Person programmer = new Programmer();
        Person dancer = new Dancer();
        Person singer = new Singer();
        Person[] people = {person, programmer, dancer, singer};
        for(Person person1 : people){
            person1.walk();
        }
    }
}
