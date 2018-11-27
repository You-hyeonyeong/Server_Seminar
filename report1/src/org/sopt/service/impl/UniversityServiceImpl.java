package org.sopt.service.impl;

import org.sopt.model.University;
import org.sopt.model.builder.UniversityBuilder;
import org.sopt.service.UniversityService;

public class UniversityServiceImpl implements UniversityService {
    @Override
    public University getUniversityByName(String universityname){
        return new UniversityBuilder().setUniversityname(universityname).build();
    }
}
