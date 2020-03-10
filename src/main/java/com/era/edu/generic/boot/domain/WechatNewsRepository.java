package com.era.edu.generic.boot.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface WechatNewsRepository extends CrudRepository<WechatNews,Integer> {
//    @Query(value="select* from major_simplify where father_id=?;",nativeQuery = true)
//    ArrayList<MajorSimplify> findByFatherId(String code);
}
