package com.scaler.lldmodule2.designpatterns.prototypeandregistry;

public class Client {
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        initRegistry(registry);

        Student jane = registry.get("aug22Intermediate").clone();
        jane.setName("Jane Doe");
        jane.setAge(20);
        jane.setPsp(85);
        System.out.println(jane);

        Student john = registry.get("aug22Advanced").clone();
        john.setName("John Doe");
        john.setAge(30);
        john.setPsp(99);
        System.out.println(john);
    }

    public static void initRegistry(StudentRegistry registry) {
        Student aug22IntermediatePrototype = new Student();
        aug22IntermediatePrototype.setBatchName("Aug22 Intermediate");
        aug22IntermediatePrototype.setAvgBatchPsp(90);
        registry.add("aug22Intermediate", aug22IntermediatePrototype);

        IntelligentStudent aug22AdvancedPrototype = new IntelligentStudent();
        aug22AdvancedPrototype.setBatchName("Aug22 Advanced");
        aug22AdvancedPrototype.setAvgBatchPsp(95);
        aug22AdvancedPrototype.setIq(180);
        registry.add("aug22Advanced", aug22AdvancedPrototype);
    }
}
