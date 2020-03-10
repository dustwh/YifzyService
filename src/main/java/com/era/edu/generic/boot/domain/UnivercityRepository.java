package com.era.edu.generic.boot.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UnivercityRepository extends CrudRepository<Univercity,String> {
    @Query(value="select * from univercity where dx_yxdm=?",nativeQuery = true)
    Univercity findByDxYxdm(String schoolCode);
}
