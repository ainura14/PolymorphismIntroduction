package PracticeDay.Task2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Eagle("White", 12, Gender.MALE),
                new Shark("Black", 13, Gender.FEMALE),
                new Turtle("White", 4, Gender.MALE)
        };

        Shark[] shark = {
                new Shark("Blue", 2, Gender.MALE),
                new Shark("White", 3, Gender.FEMALE),
                new Shark("Grey", 4, Gender.FEMALE)
        };

        findByColor(animals, Gender.MALE);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        findByGender(animals,Gender.FEMALE);

//        for (Shark shark1 : shark) {
//            System.out.println(shark1);
//            System.out.println("____________________");
//        }
    }


    public static void findByColor(Animal[] animals, Gender gender){
        boolean islaik = false;
        for (Animal animal : animals){
            if(animal.getColor().equals("White")){
                islaik = true;
                System.out.println("Animal which have white color.");
                System.out.println(animal.toString());
            }
            if(!islaik){
                System.out.println("Can't find this color!");
            }
        }
    }

    public static void findByGender(Animal[] animals, Gender gender){
        boolean islike = false;
        for (Animal animal : animals) {
            if(animal.getGender().equals(gender.FEMALE)){
                islike = true;
                System.out.println("Animal with female gender: ");
                System.out.println(animal.toString());
            }else if(animal.getGender().equals(gender.MALE)){
                islike = true;
                System.out.println("Animal with male gender: ");
                System.out.println(animal.toString());
            }
        }
        if(!islike){
            System.out.println("Can not found this animal with this gender");
        }

    }
}
