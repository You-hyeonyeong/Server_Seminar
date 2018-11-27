package org.sopt;

import org.sopt.model.*;
import org.sopt.model.builder.DepartmentBuilder;
import org.sopt.model.builder.ProfessorBuilder;
import org.sopt.model.builder.StudentBuilder;
import org.sopt.model.builder.UniversityBuilder;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //제네릭 사용해 학생 타입 ArrayList 생성
        final ArrayList<Department> departmentArrayList = new ArrayList<>();

        //3개의 객체 생성
        final Department department1 = new DepartmentBuilder().setDepartmentname("컴퓨터과학과").setDepartmentnumber("11").setDepartmenttype("환경과학대").build();
        final Department department2 = new DepartmentBuilder().setDepartmentname("경영학과").setDepartmentnumber("33").setDepartmenttype("경영대").build();
        final Department department3 = new DepartmentBuilder().setDepartmentname("생명과학과").setDepartmentnumber("55").setDepartmenttype("보건복지대").build();

        departmentArrayList.add(department1);
        departmentArrayList.add(department2);
        departmentArrayList.add(department3);

        for(final Department d : departmentArrayList) {
            System.out.println(d);
        }

        final ArrayList<Professor> professorArrayList = new ArrayList<>();

        final Professor Professor1 = new ProfessorBuilder().setProfessername("김은화").setProfessernumber("1").setProfesserdepartment("컴퓨터").setProfessersubject("모바일프로그래밍").build();
        final Professor Professor2 = new ProfessorBuilder().setProfessername("이중호").setProfessernumber("2").setProfesserdepartment("컴퓨터").setProfessersubject("인공지능").build();
        final Professor Professor3 = new ProfessorBuilder().setProfessername("이완주").setProfessernumber("3").setProfesserdepartment("컴퓨터").setProfessersubject("데이터베이스").build();

        professorArrayList.add(Professor1);
        professorArrayList.add(Professor2);
        professorArrayList.add(Professor3);

        for (final Professor p : professorArrayList) {
            System.out.println(p.toString());
        }

        final ArrayList<University> universityArrayList = new ArrayList<>();

        final University university1 = new UniversityBuilder().setUniversityname("서울").setUniversitynumber(1).setUniversityaddress("용인시").build();
        final University university2 = new UniversityBuilder().setUniversityname("고려").setUniversitynumber(1).setUniversityaddress("대전시").build();
        final University university3 = new UniversityBuilder().setUniversityname("연세").setUniversitynumber(1).setUniversityaddress("청주시").build();

        universityArrayList.add(university1);
        universityArrayList.add(university2);
        universityArrayList.add(university3);

        for (final University u : universityArrayList) {
            System.out.println(u.toString());
        }

        final ArrayList<Student> studentArrayList = new ArrayList<>();

        final Student student1 = new StudentBuilder().setStudentname("김수미").setStudentgrade(2).setStudentaddress("금천구청").build();
        final Student student2 = new StudentBuilder().setStudentname("노연우").setStudentgrade(3).setStudentaddress("잠실").build();
        final Student student3 = new StudentBuilder().setStudentname("서지혜").setStudentgrade(1).setStudentaddress("대구").build();

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        for (final Student s : studentArrayList) {
            System.out.println(s.toString());
        }




    }




}
