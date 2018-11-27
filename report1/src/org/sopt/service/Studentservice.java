package org.sopt.service;

import org.sopt.model.Student;

public interface Studentservice {
    //학번으로 학생 조회
    Student getByStudentIdx(final String studentID);
}
