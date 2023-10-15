package com.scaler.lldmodule2.designpatterns.prototypeandregistry;

public class IntelligentStudent extends Student {
    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent() {
    }

    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "iq=" + iq +
                "} " + super.toString();
    }
}
