package org.example;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Principal principal = new Principal("Olumide");
        Teacher teacher = new Teacher("Kolawole");
        new NonAcademicStaff("Chidinma");
        Student student = new Student("Amaka");
        Course course = new Course("Mathematics");
        Applicant applicant = new Applicant("Mayowa",20);





        principal.admitApplicant(applicant);
        principal.expelStudent(student);
        teacher.teachCourse(course);
        student.takeCourse(course);
//        applicant.getAge(age);
        System.out.println(applicant.getAge());
    }
}
