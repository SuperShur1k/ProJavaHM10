package org.example.lesson10.hm10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentTester {
    public static void main(String[] args) {
        Student one = new Student("Sasha", 20, "Programmer-Engineer");
        Student two = new Student("Lena", 21, "Agronomist");
        Student three = new Student("Alesha", 24, "Designer");
        Student four = new Student("Vova", 21, "Tester");

        List<Student> students = new ArrayList<>(
                Arrays.asList(one, two, three, four)
        );

//        task1
        System.out.println(students);

        students.sort(Student::compareTo);

        System.out.println(students);

//        task2

        students.sort(Student.ageAndMajorComp);

        System.out.println(students);
    }
}
