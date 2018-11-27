package org.sopt.model.builder;

import org.sopt.model.University;

public class UniversityBuilder {
    private int universitynumber;
    private String universityname;
    private String universityphonenumber;
    private String universityaddress;

    public UniversityBuilder setUniversitynumber(int universitynumber) {
        this.universitynumber = universitynumber;
        return this;
    }

    public UniversityBuilder setUniversityname(String universityname) {
        this.universityname = universityname;
        return this;
    }

    public UniversityBuilder setUniversityphonenumber(String universityphonenumber) {
        this.universityphonenumber = universityphonenumber;
        return this;
    }

    public UniversityBuilder setUniversityaddress(String universityaddress) {
        this.universityaddress = universityaddress;
        return this;
    }

    public University build() {
        return new University(universitynumber, universityaddress, universityname,universityphonenumber);
    }
}
