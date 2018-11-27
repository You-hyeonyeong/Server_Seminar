package org.sopt.model.builder;

import org.sopt.model.Professor;

public class ProfessorBuilder {
    private String professernumber;
    private String professername;
    private String professerdepartment;
    private String professerphone;
    private String professersubject;

    public ProfessorBuilder setProfessernumber(String professernumber) {
        this.professernumber = professernumber;
        return this;
    }

    public ProfessorBuilder setProfessername(String professername) {
        this.professername = professername;
        return this;
    }

    public ProfessorBuilder setProfesserdepartment(String professerdepartment) {
        this.professerdepartment = professerdepartment;
        return this;
    }

    public ProfessorBuilder setProfesserphone(String professerphone) {
        this.professerphone = professerphone;
        return this;
    }

    public ProfessorBuilder setProfessersubject(String professersubject) {
        this.professersubject = professersubject;
        return this;
    }

    public Professor build() {
        return new Professor(professernumber,professername, professerdepartment, professerphone, professersubject);
    }
}
