package com.scaler.lldmodule2.designpatterns.prototypeandregistry;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private double psp;
    private String batchName;
    private double avgBatchPsp;

    public Student() {
    }

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;
        this.batchName = student.batchName;
        this.avgBatchPsp = student.avgBatchPsp;
    }

    @Override
    public Student clone() {
        return new Student(this);
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

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                ", batchName='" + batchName + '\'' +
                ", avgBatchPsp=" + avgBatchPsp +
                '}';
    }

}
