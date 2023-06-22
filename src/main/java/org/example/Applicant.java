package org.example;

public class Applicant {
    private String name;
    private int age;
    private String admissionStatus = "pending";

    public Applicant(String name, int age) {
        this.name = name;
        this.age = age;
        this.admissionStatus = admissionStatus;
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

    public String getAdmissionStatus() {
        return admissionStatus;
    }

    public void setAdmissionStatus(String admissionStatus) {
        this.admissionStatus = admissionStatus;
    }
}
