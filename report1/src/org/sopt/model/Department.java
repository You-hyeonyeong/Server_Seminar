package org.sopt.model;

public class Department extends University {
    private String departmentnumber;
    private String departmentname;
    private String departmentphonenumber;
    private String departmenttype;


    public Department() {

    }
    public Department(String departmentnumber, String departmentname, String departmentphonenumber,String departmenttype) {
        this.departmentnumber = departmentnumber;
        this.departmentname = departmentname;
        this.departmentphonenumber = departmentphonenumber;
        this.departmenttype = departmenttype;
    }

    public String getDepartmentnumber() {
        return departmentnumber;
    }

    public void setDepartmentnumber(String departmentnumber) {
        this.departmentnumber = departmentnumber;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getDepartmentphonenumber() {
        return departmentphonenumber;
    }

    public void setDepartmentphonenumber(String departmentphonenumber) {
        this.departmentphonenumber = departmentphonenumber;
    }

    public String getdepartmenttype() {
        return departmenttype;
    }

    public void setdepartmenttype(String departmenttype) {
        this.departmenttype = departmenttype;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentnumber='" + departmentnumber + '\'' +
                ", departmentname='" + departmentname + '\'' +
                ", departmentphonenumber='" + departmentphonenumber + '\'' +
                ", departmenttype='" + departmenttype + '\'' +
                '}';
    }
}
