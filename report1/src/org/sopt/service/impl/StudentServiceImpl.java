package org.sopt.service.impl;

import org.sopt.model.Student;
import org.sopt.model.builder.StudentBuilder;
import org.sopt.service.Studentservice;

public class StudentServiceImpl implements Studentservice {
    @Override
    public Student getByStudentIdx(String StudentId) {
        //Builder롤 객체 생성해서 반환
        return new StudentBuilder().setStudentID(StudentId).build();
    }
}
