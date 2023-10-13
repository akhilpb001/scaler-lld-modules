package com.scaler.lldmodule2.designpatterns.builder;

public class Client {
    public static void main(String[] args) throws InvalidParameterException {
        Student student = Student.getBuilder()
                .setName("Akhil")
                .setAge(30)
                .setPsp(99.0)
                .setUnivName("NITC")
                .build();

//        Student student2 = Student.getBuilder()
//                .setName("John")
//                .setAge(120).build();

        System.out.println(student);
    }
}
