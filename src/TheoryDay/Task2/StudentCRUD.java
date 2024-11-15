package TheoryDay.Task2;

import java.util.Arrays;

public class StudentCRUD extends Student {
    private Student[] dataBaseStudents = new Student[0];
    private int size = 0;

    public String add(Student newStudent) {
        dataBaseStudents = Arrays.copyOf(dataBaseStudents, size + 1);
        dataBaseStudents[size] = newStudent;
        size++;
        return "Successfully saved student!";
    }

    public String add(Student[] newStudents) {
        for (Student newStudent : newStudents) {
            add(newStudent);
        }
        return "Successfully saved students!";
    }

    public Student[] getAll() {
        return dataBaseStudents;
    }

    public String updateStudent(long id, Student newStudent) {
        Student foundStudents = null;

        // 1 - method
        for (int i = 0; i < dataBaseStudents.length; i++) {
            if (dataBaseStudents[i].getId() == id) {
                foundStudents = dataBaseStudents[i];
                break;
            }
        }
        // 2 - method
//        for (Student student : dataBaseStudents){
//            if(student.getId() == id){
//                foundStudents = student;
//                break;
//            }
//        }

        //Array de koldonulat
//        for (int i = 0; i < dataBaseStudents.length; i++) {
//            if(dataBaseStudents[i].getId() == id){
//                newStudent.setId(dataBaseStudents[i].getId());
//                dataBaseStudents[i] = newStudent;
//            }
//        }
        if (foundStudents != null) {

            foundStudents.setName(newStudent.getName());
            foundStudents.setGender(newStudent.getGender());
            foundStudents.setAge(newStudent.getAge());
            return "Student with id: " + id + " successfully updated!";
        } else {
            return "Student with id: " + id + "not found!";
        }

    }

// 2 - method update
//    public String updateStudent(long id, Student newStudent) {
//
//        for (Student student : dataBaseStudents) {
//            if (student.getId() == id) {
//                student.setName(newStudent.getName());
//                student.setGender(newStudent.getGender());
//                student.setAge(newStudent.getAge());
//                return "Student with id: " + id + " successfully updated!";
//            }
//        }
//        return "Student with id: " + id + "not found!";
//    }
}

