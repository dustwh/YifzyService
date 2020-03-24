package com.era.edu.generic.boot.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UnivRepository extends CrudRepository<Univ,String> {
    @Query(value="select * from univercity where dx_yxdm=?",nativeQuery = true)
    Univ findByDxYxdm(String schoolCode);
}
