package com.scaler.lldmodule2.designpatterns.builder;

public class Student {
    private String name;
    private int age;
    private String univName;
    private double psp;

    private Student(Builder builder) throws InvalidParameterException {
        if (builder.getName().isEmpty()) {
            throw new InvalidParameterException("Invalid parameter name. The name can't be empty.");
        }

        if (builder.getAge() > 100) {
            throw new InvalidParameterException("Invalid parameter age. The age can't be greater than 100.");
        }

        if (builder.getPsp() > 100.0) {
            throw new InvalidParameterException("Invalid parameter psp. The psp can't be greater than 100.");
        }

        this.name = builder.getName();
        this.age = builder.getAge() ;
        this.psp = builder.getPsp();
        this.univName = builder.getUnivName();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getUnivName() {
        return univName;
    }

    public double getPsp() {
        return psp;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", univName='" + univName + '\'' +
                ", psp=" + psp +
                '}';
    }

    static class Builder {
        private String name;
        private int age;
        private String univName;
        private double psp;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getUnivName() {
            return univName;
        }

        public Builder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Student build() throws InvalidParameterException {
            return new Student(this);
        }
    }
}
