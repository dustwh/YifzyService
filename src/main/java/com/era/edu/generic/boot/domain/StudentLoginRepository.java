package com.era.edu.generic.boot.domain;

import org.springframework.data.repository.CrudRepository;

public interface StudentLoginRepository extends CrudRepository<StudentLoginBean,Integer> {
    StudentLoginBean findByStuTel(String stu_tel);
}