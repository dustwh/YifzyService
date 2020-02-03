package com.era.edu.generic.boot.domain;

import org.springframework.data.repository.CrudRepository;

public interface StuevaRepository extends CrudRepository<Stueva,Integer> {
    Stueva findByStuId(int stuId);
}
