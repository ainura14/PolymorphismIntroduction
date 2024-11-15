package HomeWork.Animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Eagle("Eagle", 2, 4),
                new Shark("Shark", 3, 4),
                new Turtle("Turtle", 2, 13)
        };
        for (Animal animal : animals) {
            if(animal instanceof Shark){
                ((Shark) animal).attack();
            } else if (animal instanceof Turtle){
                ((Turtle) animal).swim();
            } else if (animal instanceof Eagle) {
                ((Eagle) animal).fly();
            }
        }

        for (Animal animal : animals) {
            System.out.println("The class of this animal is: " + animal.getClass().getSimpleName());
        }

        Shark[] sharks = new Shark[1];
        Turtle[] turtles = new Turtle[1];
        Eagle[] eagles = new Eagle[1];

        for (Animal animal : animals) {
            if (animal instanceof Shark){
                sharks[0] = (Shark) animal;
            } else if (animal instanceof Turtle) {
                turtles[0] = (Turtle) animal;
            }else if (animal instanceof Eagle){
                eagles[0] = (Eagle) animal;
            }
        }

        System.out.println("Sharks array contains: " + sharks[0].getClass().getSimpleName());
        System.out.println("Turtles array contains: " + turtles[0].getClass().getSimpleName());
        System.out.println("Eagles array contains: " + eagles[0].getClass().getSimpleName());
    }
}
