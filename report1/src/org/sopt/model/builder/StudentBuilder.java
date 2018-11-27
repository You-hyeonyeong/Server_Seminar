package org.sopt.model.builder;

import org.sopt.model.Student;

public class StudentBuilder {

    private String studentID ;
    private String studentname ;
    private int studentgrade;
    private String studentdepartment;
    private String studentemail;
    private String studentaddress;
    private int studentage;
    private String studentstate;

    public StudentBuilder setStudentID(final String studentID) {
        this.studentID = studentID;
        return this;
    }

    public StudentBuilder setStudentname(final String studentname) {
        this.studentname = studentname;
        return this;
    }

    public StudentBuilder setStudentgrade(final int studentgrade) {
        this.studentgrade = studentgrade;
        return this;
    }

    public StudentBuilder setStudentdepartment(final String studentdepartment) {
        this.studentdepartment = studentdepartment;
        return this;
    }

    public StudentBuilder setStudentemail(final String studentemail) {
        this.studentemail = studentemail;
        return this;
    }

    public StudentBuilder setStudentaddress(final String studentaddress) {
        this.studentaddress = studentaddress;
        return this;
    }

    public StudentBuilder setStudentage(final int studentage) {
        this.studentage = studentage;
        return this;
    }

    public StudentBuilder setStudentstate(final String studentstate) {
        this.studentstate = studentstate;
        return this;
    }

    public Student build() { return  new Student(studentID, studentname, studentgrade, studentdepartment, studentemail,studentaddress, studentage,studentstate);}
}
