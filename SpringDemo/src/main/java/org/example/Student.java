package org.example;

//xml- based  (constructor-args) dependency injection
public class Student implements Designation{

    private int year;
    public Student(int year)
    {
        this.year = year;
    }

    public void duty()
    {
        System.out.println("My duty is to study");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
