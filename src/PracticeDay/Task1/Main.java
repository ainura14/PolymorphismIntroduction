package PracticeDay.Task1;

public class Main {
    public static void main(String[] args) {
        Sheep sheep1 = new Sheep(30.34, 3, 'F', "Cot");
        Sheep sheep2 = new Sheep(30.34, 3, 'F', "Cot");
        Sheep sheep3 = new Sheep(30.34, 3, 'F', "Cot");

        Sheep sheep4 = new Sheep(30.34, 3, 'F', "Cot");

        Cow cow1 = new Cow(12.3, 2, 'M', "Fat");
        Cow cow2 = new Cow(12.3, 2, 'M', "Fat");
        Cow cow3 = new Cow(12.3, 2, 'M', "Fat");
        Cow cow4 = new Cow(12.3, 2, 'M', "Fat");
        Cow cow5 = new Cow(12.3, 2, 'M', "Fat");

        Cow cow6 = new Cow(12.3, 2, 'M', "Fat");

        Horse horse1 = new Horse(56.4, 4, 'F', "Das", "Grey");
        Horse horse2 = new Horse(56.4, 4, 'F', "Das", "Grey");

        Horse horse3 = new Horse(56.4, 4, 'F', "Das", "Grey");

        Sheep[] sheep_1 = new Sheep[]{sheep1, sheep2, sheep3};
        Cow[] cow_1 = new Cow[]{cow1, cow2,cow3, cow4,cow5};
        Horse[] horse_1 = new Horse[]{horse1, horse2};
        Farm farm1 = new Farm("Bishkek", "Kasim", cow_1, horse_1, sheep_1);

        Sheep[] sheep_ = new Sheep[]{sheep4};
        Cow[] cow_ = new Cow[]{cow5};
        Horse[] horse_ = new Horse[]{horse3};
        Farm farm2 = new Farm("Talas", "Kadyr", cow_, horse_, sheep_);

        System.out.println(farm1.toString());
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println(farm2.toString());

//        Sheep[] sheep_1 = {
//                new Sheep(30.34, 3, 'F', "Cot"),
//                new Sheep(20.0, 1, 'M', "Toc"),
//                new Sheep(12.4, 3, 'F', "Cot"),
//        };
    }
}
