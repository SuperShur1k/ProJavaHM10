package org.example.lesson10.hm10;

import java.util.Comparator;

public class Student implements Comparable<Student>{
    //task1
//     Создайте класс Student с полями
//     String name
//     int age
//     String major
//
//     Добавьте геттеры/сеттеры и конструктор со всеми полями
//     Сделайте так, чтобы коллекции студентов могли без компаратора сортироваться по имени

    private String name;
    private int age;
    private String major;

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public int compareTo(Student student) {
        return name.compareTo(student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                '}';
    }

//    task2
//    Отсортируйте коллекцию студентов по убыванию возраста и по возрастанию специальности (major)

    public static Comparator<Student> ageAndMajorComp = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            int compAge = Integer.compare(o1.age, o2.age);
            if (compAge != 0){
                return compAge;
            }
            return o1.getMajor().compareTo(o2.getMajor());
        }
    };

}
