package com.mypackage.springbootassignment.models;

public class Appointment {
    private int id;
    private String date;
    private String docName;
    private String specialization;

    public Appointment(int id, String date, String docName, String specialization) {
        this.id = id;
        this.date = date;
        this.docName = docName;
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
