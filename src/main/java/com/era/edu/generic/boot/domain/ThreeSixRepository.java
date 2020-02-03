package com.era.edu.generic.boot.domain;

//import org.springframework.data.repository.CrudRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface ThreeSixRepository extends JpaRepository<ThreeSix,Integer> {

    @Query(value="select count(*) from threesixdata where schoolname like ? and score>=? and score<=?;",nativeQuery = true)
    int getQueryNumbers(String schoolname,int score_min,int score_max);

    @Query(value="select * from threesixdata where schoolname like ? and score>=? and score<=? limit ?,30;",nativeQuery = true)
    ArrayList<ThreeSix> getQuery(String schoolname,int score_min,int score_max,int offset);

    @Query(value="select count(*) from threesixdata where father_major in (:majors) and province in (:province) and score>=:score_min and score<=:score_max",nativeQuery=true)
    int getQueryByMajorNumbers(@Param("majors") String[] majors, @Param("province") String [] province,@Param("score_min") int score_min,@Param("score_max") int score_max);

    @Query(value="select * from threesixdata where father_major in (:majors) and province in (:province) and score>=:score_min and score<=:score_max",nativeQuery = true)
    ArrayList<ThreeSix> getQuery2(@Param("majors") String[] majors, @Param("province") String [] province, @Param("score_min") int score_min, @Param("score_max") int score_max);

}