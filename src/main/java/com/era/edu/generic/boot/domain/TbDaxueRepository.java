package com.era.edu.generic.boot.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TbDaxueRepository extends CrudRepository<TbDaxue,String> {

    @Query(value="select dx_yxmc from tb_daxue where dx_yxdm=?;",nativeQuery = true)
    String getNameById(String dxYxdm);
}