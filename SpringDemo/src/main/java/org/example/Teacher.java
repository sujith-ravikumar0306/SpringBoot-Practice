package org.example;

//xml- based  (property) dependency injection
public class Teacher implements Designation{

    private String qualification;

    private Student student;

    public void duty()
    {
        System.out.println("My duty is to Teach");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
