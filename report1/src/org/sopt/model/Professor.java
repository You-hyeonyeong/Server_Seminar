package org.sopt.model;


import org.sopt.model.Department;

public class Professor extends Department {
    private String profrssornumber;
    private String profrssorname;
    private String profrssordepartment;
    private String profrssorphonenumber;
    private String profrssorsubject;

    public  Professor() {

    }
    public Professor(String profrssornumber, String profrssorname, String profrssordepartment, String profrssorphonenumber, String profrssorsubject) {
        this.profrssornumber = profrssornumber;
        this.profrssorname = profrssorname;
        this.profrssordepartment = profrssordepartment;
        this.profrssorphonenumber = profrssorphonenumber;
        this.profrssorsubject = profrssorsubject;
    }


    public String getProfrssornumber() {
        return profrssornumber;
    }

    public void setProfrssornumber(String profrssornumber) {
        this.profrssornumber = profrssornumber;
    }

    public String getProfrssorname() {
        return profrssorname;
    }

    public void setProfrssorname(String profrssorname) {
        this.profrssorname = profrssorname;
    }

    public String getProfrssordepartment() {
        return profrssordepartment;
    }

    public void setProfrssordepartment(String profrssordepartment) {
        this.profrssordepartment = profrssordepartment;
    }

    public String getProfrssorphonenumber() {
        return profrssorphonenumber;
    }

    public void setProfrssorphonenumber(String profrssorphonenumber) {
        this.profrssorphonenumber = profrssorphonenumber;
    }

    public String getProfrssorsubject() {
        return profrssorsubject;
    }

    public void setProfrssorsubject(String profrssorsubject) {
        this.profrssorsubject = profrssorsubject;
    }


    @Override
    public String toString() {
        return "Professor{" +
                "profrssornumber='" + profrssornumber + '\'' +
                ", profrssorname='" + profrssorname + '\'' +
                ", profrssordepartment='" + profrssordepartment + '\'' +
                ", profrssorphonenumber='" + profrssorphonenumber + '\'' +
                ", profrssorsubject='" + profrssorsubject + '\'' +
                '}';
    }
}
