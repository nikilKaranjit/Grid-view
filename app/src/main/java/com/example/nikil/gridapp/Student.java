package com.example.nikil.gridapp;

/**
 * Created by Nikil on 8/10/2016.
 */
public class Student {
    private String name;
    private String subject;
    private String course;
    private String addrss;

    public Student(String name, String subject, String course, String addrss) {
        this.name = name;
        this.subject = subject;
        this.course = course;
        this.addrss = addrss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddrss() {
        return addrss;
    }

    public void setAddrss(String addrss) {
        this.addrss = addrss;
    }
}
