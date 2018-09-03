package com.mypackage.springbootassignment.models;

public class Doctor {

    private int docId;
    private String docName, specialization;

    public Doctor(int docId, String docName, String specialization) {
        this.docId = docId;
        this.docName = docName;
        this.specialization = specialization;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
