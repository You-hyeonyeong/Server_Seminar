package org.sopt.model;

import org.sopt.model.Department;

public class Student extends Department {
    private String studentID ;
    private String studentname ;
    private int studentgrade;
    private String studentdepartment;
    private String studentemail;
    private String studentaddress;
    private int studentage;
    private String studentstate;

    public Student(String studentID, String studentname, int studentgrade, String studentdepartment, String studentemail, String studentaddress, int studentage, String studentstate) {
        this.studentID = studentID;
        this.studentname = studentname;
        this.studentgrade = studentgrade;
        this.studentdepartment = studentdepartment;
        this.studentemail = studentemail;
        this.studentaddress = studentaddress;
        this.studentage = studentage;
        this.studentstate =studentstate;
    }

    public Student() {
    }


    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getStudentgrade() {
        return studentgrade;
    }

    public void setStudentgrade(int studentgrade) {
        this.studentgrade = studentgrade;
    }

    public String getStudentdepartment() {
        return studentdepartment;
    }

    public void setStudentdepartment(String studentdepartment) {
        this.studentdepartment = studentdepartment;
    }

    public String getStudentemail() {
        return studentemail;
    }

    public void setStudentemail(String studentemail) {
        this.studentemail = studentemail;
    }

    public String getStudentaddress() {
        return studentaddress;
    }

    public void setStudentaddress(String studentaddress) {
        this.studentaddress = studentaddress;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    public String getStudentstate() {
        return studentstate;
    }

    public void setStudentstate(String studentstate) {
        this.studentstate = studentstate;
    }

    public void hello() {
        System.out.println("안녕하세요 저는 "+ studentname + "이고" +  studentdepartment + "입니다.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", studentname='" + studentname + '\'' +
                ", studentgrade=" + studentgrade +
                ", studentdepartment='" + studentdepartment + '\'' +
                ", studentemail='" + studentemail + '\'' +
                ", studentaddress='" + studentaddress + '\'' +
                ", studentage=" + studentage +
                ", studentstate='" + studentstate + '\'' +
                '}';
    }
}
