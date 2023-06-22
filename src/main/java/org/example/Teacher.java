package org.example;

public class Teacher extends Staff{
    public Teacher(String name) {
        super(name);
    }
    public void teachCourse(Course course) {
        System.out.println("Teaching course: " + course.getName());
    }

}
