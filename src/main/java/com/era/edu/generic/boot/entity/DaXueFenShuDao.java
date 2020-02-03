package com.era.edu.generic.boot.entity;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 *
 * 基本设定信息DAO
 */
public interface DaXueFenShuDao extends CrudRepository<DaXueFenShu, Integer> {


	@Query("from DaXueFenShu where id.dxf_yxdm=?1 and id.dxf_kldm=?2 order by id.dxf_yxbh_s, id.dxf_pcdm")
	public List<DaXueFenShu> loadPiciInfosOfDaXueFenShu(String yxdm, String kldm);
}
