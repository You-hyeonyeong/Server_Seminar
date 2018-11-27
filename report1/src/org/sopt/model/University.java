package org.sopt.model;

public class University {
    private int universitynumber;
    private String universityname;
    private String universityphonenumber;
    private String universityaddress;

    public University(int universitynumber, String universityname, String universityphonenumber, String universityaddress) {
        this.universitynumber = universitynumber;
        this.universityname = universityname;
        this.universityphonenumber = universityphonenumber;
        this.universityaddress = universityaddress;
    }
    public University() {

    }

    public int getUniversitynumber() {
        return universitynumber;
    }

    public void setUniversitynumber(int universitynumber) {
        this.universitynumber = universitynumber;
    }

    public String getUniversityname() {
        return universityname;
    }

    public void setUniversityname(String universityname) {
        this.universityname = universityname;
    }

    public String getUniversityphonenumber() {
        return universityphonenumber;
    }

    public void setUniversityphonenumber(String universityphonenumber) {
        this.universityphonenumber = universityphonenumber;
    }

    public String getUniversityaddress() {
        return universityaddress;
    }

    public void setUniversityaddress(String universityaddress) {
        this.universityaddress = universityaddress;
    }

    @Override
    public String toString() {
        return "University{" +
                "universitynumber=" + universitynumber +
                ", universityname='" + universityname + '\'' +
                ", universityphonenumber='" + universityphonenumber + '\'' +
                ", universityaddress='" + universityaddress + '\'' +
                '}';
    }
}
