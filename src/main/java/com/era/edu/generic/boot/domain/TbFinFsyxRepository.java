package com.era.edu.generic.boot.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.ArrayList;

public interface TbFinFsyxRepository extends CrudRepository<TbFinFsyx,String> {

//    @Query(value="select count(*) from threesixdata where schoolname like ? and score>=? and score<=?;",nativeQuery = true)
    @Query(value="select distinct(ffsx_yxdm),ffsx_zdfs01 from tb_fin_fsyx where ffsx_zdfs01<=? and ffsx_zdfs01>? and ffsx_nf01=2018 and ffsx_kldm=? order by ffsx_zdfs01 DESC limit 0,5;",nativeQuery = true)
    ArrayList<TbFinFsyx> getRecSchoolOldCE(Integer pointMax,Integer pointMin,String subjectCode);

    @Query(value="select distinct(ffsx_yxdm),ffsx_zdfs01 from tb_fin_fsyx where ffsx_zdfs01<=? and ffsx_zdfs01>? and ffsx_nf01=2018 order by ffsx_zdfs01 DESC limit 0,5;",nativeQuery = true)
    ArrayList<TbFinFsyx> getRecSchool(Integer pointMax,Integer pointMin);

    @Query(value="select distinct(ffsx_yxdm),ffsx_zdfs01 from tb_fin_fsyx where ffsx_zdfs01<=? and ffsx_zdfs01>? and ffsx_nf01=2018 and ffsx_kldm=? order by ffsx_zdfs01 ASC limit 0,5;",nativeQuery = true)
    ArrayList<TbFinFsyx> getRecSchoolOldCEASC(Integer pointMax,Integer pointMin,String subjectCode);

    @Query(value="select distinct(ffsx_yxdm),ffsx_zdfs01 from tb_fin_fsyx where ffsx_zdfs01<=? and ffsx_zdfs01>? and ffsx_nf01=2018 order by ffsx_zdfs01 ASC limit 0,5;",nativeQuery = true)
    ArrayList<TbFinFsyx> getRecSchoolASC(Integer pointMax,Integer pointMin);

}