package com.era.edu.generic.boot.service;

import com.era.edu.generic.boot.entity.ZhuanYeJiHua;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;


@Service
public class ZhuanYeJiHuaService {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	private static String ZHUAN_YE_JI_HUA_LOAD_SQL = null;

	static {
		StringBuffer sbuf = new StringBuffer();
		  sbuf.append("SELECT ");   
		  sbuf.append("    fjh.fjh_nf AS jh_nf,");          //年份
		  //sbuf.append("    jh.jh_zyid,");          //专业唯一ID
		  sbuf.append("    fjh.fjh_yxdm AS jh_yxdm,");          //院校代码
		  sbuf.append("    fjh.fjh_kldm AS jh_kldm,");          //科类代码
		  sbuf.append("    fjh.fjh_zydh AS jh_zydh,");          //学校专业编号
		  sbuf.append("    fjh.fjh_zydhmc AS jh_zydhmc,");          //学校专业名称
		  sbuf.append("    fjh.fjh_zydhmczj AS jh_zydhmc_zj,");          //学校专业名称描述
		  sbuf.append("    fjh.fjh_zydm AS jh_zydm,");          //国家专业代码
		  sbuf.append("    fjh.fjh_zydmmc AS jh_zymc,");          //国家专业名称*
		  sbuf.append("    fjh.fjh_pcdm AS jh_pcdm,");          //批次信息
		  sbuf.append("    fjh.fjh_yxdh AS jh_yxbh_s,");          //省报考院校编号
		  sbuf.append("    fjh.fjh_wydm AS jh_wyyzdm,");          //外语语种
		  sbuf.append("    fjh.fjh_xzdm AS jh_xzdm,");          //学制
		  sbuf.append("    fjh.fjh_sfbz AS jh_sfbz,");          //学费
		  sbuf.append("    fjh.fjh_jhs AS jh_zsjhs,");          //计划人数
		  sbuf.append("    fjh.fjh_zybz AS jh_zybz_s,");          //志愿备注
		  //sbuf.append("    jh.jh_xszsjhs,");          //学校总计划人数
		  sbuf.append("    fjh.fjh_yxbz AS jh_yxbz,");          //院校备注
		  sbuf.append("    fjh.fjh_status AS jh_status,");          //计划状态
		  sbuf.append("    fjh.fjh_wymc AS stwy_wymc,");          //外语名称
		  sbuf.append("    stpc.stpc_pcmc,");          //批次名称
		  sbuf.append("    fjh.fjh_xb AS jhx_xb,");          //性别限制
		  sbuf.append("    fjh.fjh_xbbz AS jhx_xbbz,");          //性别限制备注
		  sbuf.append("    fjh.fjh_sg1 AS jhx_sg1,");          //身高限制1
		  sbuf.append("    fjh.fjh_sg1bz AS jhx_sg1bz,");          //身高限制1备注
		  sbuf.append("    fjh.fjh_sg2 AS jhx_sg2,");          //身高限制2
		  sbuf.append("    fjh.fjh_sg2bz AS jhx_sg2bz,");          //身高限制1备注
		  //sbuf.append("    jhx.jhx_ld,");          //连读
		  sbuf.append("    fjh.fjh_hzbx AS jhx_hzbx,");          //中外合资办学
		  //sbuf.append("    jhx.jhx_gsf,");          //高收费
		  sbuf.append("    fjh.fjh_ykb AS jhx_ykb,");          //预科班
		  sbuf.append("    fjh.fjh_mz AS jhx_mz,");          //民族限制
		  sbuf.append("    fjh.fjh_smxz AS jhx_smxz,");          //色盲限制
		  sbuf.append("    fjh.fjh_slxz AS jhx_slxz,");          //视力限制
		  //sbuf.append("    jhx.jhx_status,");          //状态
		  sbuf.append("    ffs.ffs_nf01,");          //年份
		  sbuf.append("    ffs.ffs_flag01,");          //状态
		  sbuf.append("    CASE ffs.ffs_flag01 WHEN 0 THEN NULL ELSE ffs.ffs_lqrs01 END AS jhf_zsjhs01,");          //专业计划数
		  sbuf.append("    CASE ffs.ffs_flag01 WHEN 0 THEN NULL ELSE ffs.ffs_zgfs01 END AS jhf_zgfs01,");          //最高分数
		  sbuf.append("    CASE ffs.ffs_flag01 WHEN 0 THEN NULL ELSE ffs.ffs_zdfs01 END AS jhf_zdfs01,");          //最低分数
		  sbuf.append("    CASE ffs.ffs_flag01 WHEN 0 THEN NULL ELSE ffs.ffs_zdwc01 END AS jhf_zdwc01,");          //最低位次
		  sbuf.append("    ffs.ffs_nf02,");          //年份
		  sbuf.append("    ffs.ffs_flag02,");          //状态
		  sbuf.append("    CASE ffs.ffs_flag02 WHEN 0 THEN NULL ELSE ffs.ffs_lqrs02 END AS jhf_zsjhs02,");          //专业计划数
		  sbuf.append("    CASE ffs.ffs_flag02 WHEN 0 THEN NULL ELSE ffs.ffs_zgfs02 END AS jhf_zgfs02,");          //最高分数
		  sbuf.append("    CASE ffs.ffs_flag02 WHEN 0 THEN NULL ELSE ffs.ffs_zdfs02 END AS jhf_zdfs02,");          //最低分数
		  sbuf.append("    CASE ffs.ffs_flag02 WHEN 0 THEN NULL ELSE ffs.ffs_zdwc02 END AS jhf_zdwc02,");          //最低位次
		  sbuf.append("    ffs.ffs_nf03,");          //年份
		  sbuf.append("    ffs.ffs_flag03,");          //状态
		  sbuf.append("    CASE ffs.ffs_flag03 WHEN 0 THEN NULL ELSE ffs.ffs_lqrs03 END AS jhf_zsjhs03,");          //专业计划数
		  sbuf.append("    CASE ffs.ffs_flag03 WHEN 0 THEN NULL ELSE ffs.ffs_zgfs03 END AS jhf_zgfs03,");          //最高分数
		  sbuf.append("    CASE ffs.ffs_flag03 WHEN 0 THEN NULL ELSE ffs.ffs_zdfs03 END AS jhf_zdfs03,");          //最低分数
		  sbuf.append("    CASE ffs.ffs_flag03 WHEN 0 THEN NULL ELSE ffs.ffs_zdwc03 END AS jhf_zdwc03,");          //最低位次
		  sbuf.append("    sc.sc_status,");          //收藏状态
		  sbuf.append("    (Exists (SELECT ti_yhid FROM tb_tianbao where ti_yhid=:yhid AND LOCATE(fjh.fjh_pcdm,ti_pcdm) > 0 ");
		  sbuf.append("        AND ti_yxdm = fjh.fjh_yxdm AND ti_yxbh = fjh.fjh_yxdh ");
		  sbuf.append("        AND (ti_zydh1=fjh.fjh_zydh OR ti_zydh2=fjh.fjh_zydh OR ti_zydh3=fjh.fjh_zydh OR ti_zydh4=fjh.fjh_zydh OR");
		  sbuf.append("             ti_zydh5=fjh.fjh_zydh OR ti_zydh6=fjh.fjh_zydh OR ti_zydh7=fjh.fjh_zydh OR ti_zydh8=fjh.fjh_zydh OR ti_zydh9=fjh.fjh_zydh))) AS tianbao ");
		  sbuf.append(" FROM tb_fin_jh AS fjh");
		  sbuf.append("   LEFT JOIN tb_set_waiyu AS stwy ON fjh.fjh_wydm = stwy.stwy_wydm");
		  sbuf.append("   LEFT JOIN tb_set_pici AS stpc ON fjh.fjh_pcdm = stpc.stpc_pcdm");
		  sbuf.append("   LEFT JOIN tb_fin_fs AS ffs ON fjh.fjh_yxdm = ffs.ffs_yxdm AND fjh.fjh_zydm = ffs.ffs_zydm AND fjh.fjh_kldm = ffs.ffs_kldm");
//		  sbuf.append("   LEFT JOIN tb_shoucang AS sc ON sc.sc_yxdm = jh.jh_yxdm AND sc.sc_status = 1 AND sc.sc_zyid = jh.jh_zyid AND sc_yhid = :yhid");
		  sbuf.append(" WHERE fjh.fjh_yxdm = :yxdm ");
		  sbuf.append("   AND fjh.fjh_kldm = :kldm ");
		  sbuf.append(" ORDER BY fjh.fjh_yxdh, fjh.fjh_pcdm, jh_zydh");

		ZHUAN_YE_JI_HUA_LOAD_SQL = sbuf.toString();
	};

	/***
	 * 检索逻辑
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<ZhuanYeJiHua> getZhuanYeByYxdm(String nf, String yxdm, String kldm, String yhid, boolean canAccessData) {
		EntityManager em = entityManagerFactory.createEntityManager();
		try {
			int indexOfWhere = ZHUAN_YE_JI_HUA_LOAD_SQL.indexOf(" WHERE ");
			String searchSql = ZHUAN_YE_JI_HUA_LOAD_SQL.substring(0, indexOfWhere)
					+ "   LEFT JOIN tb_shoucang AS sc ON sc.sc_yxdm = fjh.fjh_yxdm AND sc.sc_zydm = fjh.fjh_zydm AND sc.sc_kldm = fjh.fjh_kldm AND sc.sc_status = 1 AND sc_yhid = :yhid"
					+ ZHUAN_YE_JI_HUA_LOAD_SQL.substring(indexOfWhere);
			Query query = em.createNativeQuery(searchSql, ZhuanYeJiHua.class);
			List<ZhuanYeJiHua> result = query.setParameter("yxdm", yxdm).setParameter("kldm", kldm).setParameter("yhid", yhid).getResultList();
			//.setParameter("nf", nf)
			
			if (!canAccessData) {
				for (ZhuanYeJiHua zy : result) {
					zy.setJhf_zdfs01(new Float(0));
					zy.setJhf_zdwc01(0);
					zy.setJhf_zsjhs01(0);
					zy.setJhf_zgfs01(new Float(0));
				}
			}
			return result;
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<ZhuanYeJiHua> getZhuanYeOfShouCang(String yhid, String kldm, boolean canAccessData) {
		EntityManager em = entityManagerFactory.createEntityManager();
		try {
			int indexOfWhere = ZHUAN_YE_JI_HUA_LOAD_SQL.indexOf(" WHERE ");
			String searchSql = ZHUAN_YE_JI_HUA_LOAD_SQL.substring(0, indexOfWhere)
					+ "    INNER JOIN tb_shoucang sc ON sc.sc_yxdm = fjh.fjh_yxdm AND sc.sc_zydm = fjh.fjh_zydm AND sc.sc_kldm = fjh.fjh_kldm AND sc.sc_status = 1 AND sc_yhid = :yhid"
					+ "  WHERE fjh.fjh_kldm = :kldm"
//					+ "  ORDER BY fjh.fjh_yxdm, fjh.fjh_yxdh,  fjh.fjh_pcdm,jhf_zdfs01 DESC ";
					+ "  ORDER BY fjh.fjh_yxdm, fjh.fjh_yxdh,  fjh.fjh_pcdm,sc.sc_order ASC ";
			Query query = em.createNativeQuery(searchSql, ZhuanYeJiHua.class);
			List<ZhuanYeJiHua> result = query.setParameter("yhid", yhid)
					.setParameter("kldm", kldm).getResultList();
			
			if (!canAccessData) {
				for (ZhuanYeJiHua zy : result) {
					zy.setJhf_zdwc01(0);
					zy.setJhf_zdfs01(new Float(0));
					zy.setJhf_zgfs01(new Float(0));
					zy.setJhf_zsjhs01(0);
				}
			}
			return result;
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}
}
