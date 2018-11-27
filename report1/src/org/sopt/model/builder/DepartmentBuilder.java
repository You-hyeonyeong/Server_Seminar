package org.sopt.model.builder;

import org.sopt.model.Department;

public class DepartmentBuilder {
    private String  departmentnumber;
    private  String departmentname;
    private String departmentphone;
    private String departmenttype;

    public DepartmentBuilder setDepartmentnumber(String departmentnumber) {
        this.departmentnumber = departmentnumber;
        return this;
    }

    public DepartmentBuilder setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
        return this;
    }

    public DepartmentBuilder setDepartmentphone(String departmentphone) {
        this.departmentphone = departmentphone;
        return this;
    }

    public DepartmentBuilder setDepartmenttype(String departmenttype) {
        this.departmenttype = departmenttype;
        return this;
    }

    public Department build(){
        return  new Department(departmentname, departmentnumber,departmentphone,departmenttype);
    }
}
