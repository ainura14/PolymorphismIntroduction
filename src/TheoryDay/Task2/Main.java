package TheoryDay.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
        static StudentCRUD studentCRUD = new StudentCRUD();

        static Scanner scannerNumber = new Scanner(System.in);
        static Scanner scannerForLine = new Scanner(System.in);

    public static void main(String[] args) {

//        Student student1 = new Student("Ainura", 19, 'F');
//        Student student2 = new Student("Aidana", 20, 'F');
//        Student student3 = new Student("Uulcan", 21, 'F');
//        Student student4 = new Student("Dauren", 14, 'M');

        while (true) {
            System.out.println("""
                      Commands: 
                    Press to 1 or Add: Add new student
                    Press to 2 or add all: Add new Students
                    Press to 3 or getAll: Get all Students
                    """);


            String command = scannerForLine.nextLine();

            switch (command.toLowerCase()) {
                case "1", "add" -> {
                    Student student = setUpStudentInfo(new Student());
                    String result = studentCRUD.add(student);
                    System.out.println(result);
                }
                case "2", "addAll" -> {
                    System.out.println("Enter amount of students: ");
                    var amountStudents = scannerNumber.nextInt();

                    Student[] newStudentsArray = new Student[amountStudents];

                    //1 - method
//                for (int i = 0; i < amountStudents; i++) {

                    //2 - method
                    for (int i = 0; i < newStudentsArray.length; i++) {
                        Student student = setUpStudentInfo(new Student());
                        newStudentsArray[i] = student;
                    }
                    var result = studentCRUD.add(newStudentsArray);
                    System.out.println(result);
                }
                case "3", "getAll" -> {
                    Student[] allStudents = studentCRUD.getAll();
                    System.out.println(Arrays.toString(allStudents));
                }
            }

        }
    }

    //1 - method
//    public static Student setUpStudentInfo(){
//        System.out.println("Write student name: ");
//        var name = scannerForLine.nextLine();
//
//        System.out.println("Write student gender: ");
//        var gender = scannerForLine.next().charAt(0);
//
//        System.out.println("Write student age: ");
//        var age = scannerNumber.nextInt();
//
//        Student student = new Student(name, age, gender);
//        var result = studentCRUD.add(student);
//
//        return student;
//    }

    //2 - Method
    public static Student setUpStudentInfo(Student student) {
        System.out.println("Write student name: ");
        student.setName(scannerForLine.nextLine());

        System.out.println("Write student gender: ");
        student.setGender(new Scanner(System.in).next().charAt(0));

        System.out.println("Write student age: ");
        student.setAge(scannerNumber.nextInt());

        return student;
    }
}
