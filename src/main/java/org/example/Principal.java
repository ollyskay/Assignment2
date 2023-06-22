package org.example;

public class Principal extends Staff {
    public Principal(String name) {
        super(name);
    }
    public void admitApplicant(Applicant applicant) {
        if (applicant.getAge() >= 18) {
            applicant.setAdmissionStatus("admitted");
            System.out.println("Admitting applicant: " + applicant.getName());
        } else {
            System.out.println("Applicant does not meet the age requirement for admission.");
        }

    }

    public void expelStudent(Student student) {
        System.out.println("Expelling student: " + student.getName());
    }
}


