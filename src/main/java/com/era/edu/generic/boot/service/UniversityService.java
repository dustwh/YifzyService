package com.era.edu.generic.boot.service;

import com.era.edu.generic.boot.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;


@Service
public class UniversityService {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Autowired
	private DaXueFenShuDao daXueFenShuDao;


//	private static String UNIVERSITY_LOAD_BASE_SQL = null;
//
//	static {
//		StringBuffer sbuf = new StringBuffer();
//		sbuf.append("SELECT ");
//		sbuf.append("    dx.dx_yxdm,"); // 院校代码
//		sbuf.append("    dx.dx_yxmc,"); // 院校名称
//		sbuf.append("    dx.dx_yxmczj,"); // 院校名称后追加文字
//		sbuf.append("    dx.dx_pr_code,"); // 省id
//		sbuf.append("    dx.dx_ci_code,"); // 市id
//		sbuf.append("    dx.dx_zsfs,"); // 专业分配方式
//		sbuf.append("    dx.dx_t985,"); // 985
//		sbuf.append("    dx.dx_t211,"); // 211
//		sbuf.append("    dx.dx_tzy,"); // 中央部署
//		sbuf.append("    dx.dx_tmb,"); // 公办
//		sbuf.append("    dx.dx_tgb,"); // 民办
//		sbuf.append("    dx.dx_gfga,"); // 国防公安
//		sbuf.append("    dx.dx_ssmz,"); // 少数民族预科
//		sbuf.append("    dx.dx_yxlink,"); // 学校link
//		sbuf.append("    dx.dx_jhlink,"); // 招生计划link
//		sbuf.append("    dx.dx_jzlink,"); // 简章link
//		sbuf.append("    dx.dx_yxadd,"); // 院校地址
//		sbuf.append("    dx.dx_yxtel,"); // 院校电话
//		sbuf.append("    dx.dx_bzxx,"); // 备注信息
//		sbuf.append("    dx.dx_yxpm,"); // 院校排名
//		sbuf.append("    dx.dx_status,"); // 院校状态
//		sbuf.append("    stpr.stpr_name,"); // 省名称
//		sbuf.append("    stci.stci_name,"); // 市名称
//		sbuf.append("    dxf.ffsx_yxdh,");
//		sbuf.append("    dxf.ffsx_pcdm,");
//		sbuf.append("    dxf.ffsx_nf01,");
//		sbuf.append("    dxf.ffsx_flag01,");
//		sbuf.append("    CASE dxf.ffsx_flag01 WHEN 0 THEN NULL ELSE dxf.dxf_zsjhs01 END AS dxf_zsjhs01,"); // 专业计划数
//		sbuf.append("    CASE dxf.ffsx_flag01 WHEN 0 THEN NULL ELSE dxf.dxf_zgfs01 END AS dxf_zgfs01,"); // 最高分数
//		sbuf.append("    CASE dxf.ffsx_flag01 WHEN 0 THEN NULL ELSE dxf.dxf_zdfs01 END AS dxf_zdfs01,"); // 最低分数
//		sbuf.append("    CASE dxf.ffsx_flag01 WHEN 0 THEN NULL ELSE dxf.dxf_zdwc01 END AS dxf_zdwc01,"); // 最低位次
//		sbuf.append("    dxf.ffsx_nf02,");
//		sbuf.append("    dxf.ffsx_flag02,");
//		sbuf.append("    CASE dxf.ffsx_flag02 WHEN 0 THEN NULL ELSE dxf.dxf_zsjhs02 END AS dxf_zsjhs02,"); // 专业计划数
//		sbuf.append("    CASE dxf.ffsx_flag02 WHEN 0 THEN NULL ELSE dxf.dxf_zgfs02 END AS dxf_zgfs02,"); // 最高分数
//		sbuf.append("    CASE dxf.ffsx_flag02 WHEN 0 THEN NULL ELSE dxf.dxf_zdfs02 END AS dxf_zdfs02,"); // 最低分数
//		sbuf.append("    CASE dxf.ffsx_flag02 WHEN 0 THEN NULL ELSE dxf.dxf_zdwc02 END AS dxf_zdwc02,"); // 最低位次
//		sbuf.append("    dxf.ffsx_nf03,");
//		sbuf.append("    dxf.ffsx_flag03,");
//		sbuf.append("    CASE dxf.ffsx_flag03 WHEN 0 THEN NULL ELSE dxf.dxf_zsjhs03 END AS dxf_zsjhs03,"); // 专业计划数
//		sbuf.append("    CASE dxf.ffsx_flag03 WHEN 0 THEN NULL ELSE dxf.dxf_zgfs03 END AS dxf_zgfs03,"); // 最高分数
//		sbuf.append("    CASE dxf.ffsx_flag03 WHEN 0 THEN NULL ELSE dxf.dxf_zdfs03 END AS dxf_zdfs03,"); // 最低分数
//		sbuf.append("    CASE dxf.ffsx_flag03 WHEN 0 THEN NULL ELSE dxf.dxf_zdwc03 END AS dxf_zdwc03,"); // 最低位次
//		sbuf.append("    dxf.ffsx_nf04,");
//		sbuf.append("    dxf.ffsx_flag04,");
//		sbuf.append("    CASE dxf.ffsx_flag04 WHEN 0 THEN NULL ELSE dxf.dxf_zsjhs04 END AS dxf_zsjhs04,"); // 专业计划数
//		sbuf.append("    CASE dxf.ffsx_flag04 WHEN 0 THEN NULL ELSE dxf.dxf_zgfs04 END AS dxf_zgfs04,"); // 最高分数
//		sbuf.append("    CASE dxf.ffsx_flag04 WHEN 0 THEN NULL ELSE dxf.dxf_zdfs04 END AS dxf_zdfs04,"); // 最低分数
//		sbuf.append("    CASE dxf.ffsx_flag04 WHEN 0 THEN NULL ELSE dxf.dxf_zdwc04 END AS dxf_zdwc04"); // 最低位次
////		sbuf.append("    dxf.ffsx_nf05,");
////		sbuf.append("    dxf.ffsx_flag05,");
////		sbuf.append("    CASE dxf.ffsx_flag05 WHEN 0 THEN NULL ELSE dxf.dxf_zsjhs05 END AS dxf_zsjhs05,"); // 专业计划数
////		sbuf.append("    CASE dxf.ffsx_flag05 WHEN 0 THEN NULL ELSE dxf.dxf_zgfs05 END AS dxf_zgfs05,"); // 最高分数
////		sbuf.append("    CASE dxf.ffsx_flag05 WHEN 0 THEN NULL ELSE dxf.dxf_zdfs05 END AS dxf_zdfs05,"); // 最低分数
////		sbuf.append("    CASE dxf.ffsx_flag05 WHEN 0 THEN NULL ELSE dxf.dxf_zdwc05 END AS dxf_zdwc05"); // 最低位次
//		sbuf.append(" FROM tb_daxue AS dx");
//		sbuf.append(" LEFT JOIN tb_set_province AS stpr ON dx.dx_pr_code = stpr.stpr_code");
//		sbuf.append(" LEFT JOIN tb_set_city AS stci ON dx.dx_ci_code = stci.stci_code");
//		sbuf.append(" LEFT JOIN (SELECT");
//		sbuf.append("                T1.ffsx_yxdm AS dxf_yxdm,");
//		sbuf.append("                T1.ffsx_yxdh AS ffsx_yxdh,");
//		sbuf.append("                T1.ffsx_pcdm AS ffsx_pcdm,");
//		sbuf.append("                T1.ffsx_nf01 AS ffsx_nf01,");
//		sbuf.append("                T1.ffsx_flag01 AS ffsx_flag01,");
//		sbuf.append("                T1.ffsx_lqrs01 AS dxf_zsjhs01,");
//		sbuf.append("                T1.ffsx_zgfs01 AS dxf_zgfs01,");
//		sbuf.append("                T1.ffsx_zdfs01 AS dxf_zdfs01,");
//		sbuf.append("                T1.ffsx_zdwc01 AS dxf_zdwc01,");
//		sbuf.append("                T1.ffsx_nf02 AS ffsx_nf02,");
//		sbuf.append("                T1.ffsx_flag02 AS ffsx_flag02,");
//		sbuf.append("                T1.ffsx_lqrs02 AS dxf_zsjhs02,");
//		sbuf.append("                T1.ffsx_zgfs02 AS dxf_zgfs02,");
//		sbuf.append("                T1.ffsx_zdfs02 AS dxf_zdfs02,");
//		sbuf.append("                T1.ffsx_zdwc02 AS dxf_zdwc02,");
//		sbuf.append("                T1.ffsx_nf03 AS ffsx_nf03,");
//		sbuf.append("                T1.ffsx_flag03 AS ffsx_flag03,");
//		sbuf.append("                T1.ffsx_lqrs03 AS dxf_zsjhs03,");
//		sbuf.append("                T1.ffsx_zgfs03 AS dxf_zgfs03,");
//		sbuf.append("                T1.ffsx_zdfs03 AS dxf_zdfs03,");
//		sbuf.append("                T1.ffsx_zdwc03 AS dxf_zdwc03,");
//		sbuf.append("                T1.ffsx_nf04 AS ffsx_nf04,");
//		sbuf.append("                T1.ffsx_flag04 AS ffsx_flag04,");
//		sbuf.append("                T1.ffsx_lqrs04 AS dxf_zsjhs04,");
//		sbuf.append("                T1.ffsx_zgfs04 AS dxf_zgfs04,");
//		sbuf.append("                T1.ffsx_zdfs04 AS dxf_zdfs04,");
//		sbuf.append("                T1.ffsx_zdwc04 AS dxf_zdwc04");
//		sbuf.append("              FROM tb_fin_fsyx T1");
//		sbuf.append("              WHERE ffsx_pcdm = (");
//		sbuf.append("                  SELECT MIN(ffsx_pcdm) FROM tb_fin_fsyx");
//		sbuf.append("                  WHERE ffsx_yxdm = T1.ffsx_yxdm");
//		sbuf.append("                      AND ffsx_kldm = :kldm AND ffsx_lxdm = 0 AND ffsx_pcdm > 2 \n");
//		sbuf.append("                      --additionPartForFsyx1 \n");
//		sbuf.append("                      )");
//		sbuf.append("                AND T1.ffsx_kldm = :kldm AND T1.ffsx_lxdm = 0 AND T1.ffsx_pcdm > 2 \n");
//		sbuf.append("                      --additionPartForFsyx2 \n");
//		sbuf.append("                 ) AS dxf ");
//		sbuf.append("      ON dx.dx_yxdm = dxf.dxf_yxdm");
//
//		UNIVERSITY_LOAD_BASE_SQL = sbuf.toString();
//	};

	/***
	 * 检索逻辑
	 *
	 * @return
	 */
//	@SuppressWarnings("unchecked")
//	@Transactional(readOnly = true)
//	public List<University> getSortedAllUniversities(String kldm, String yhid) {
//		String innerSelectForDaxue =
//				" ((SELECT * FROM tb_daxue WHERE dx_status = 1 AND dx_t985=1 ORDER BY dx_yxpm limit 100) "
//				+ " UNION (SELECT * FROM tb_daxue WHERE dx_status = 1 AND dx_t211=1 ORDER BY dx_yxpm limit 100) "
//	//			+ " UNION (SELECT * FROM tb_daxue WHERE dx_status = 1 AND dx_tzy=1 ORDER BY dx_yxpm limit 5)"
//	//			+ " UNION (SELECT * FROM tb_daxue WHERE dx_status = 1 AND dx_ssmz=1 ORDER BY dx_yxpm limit 5)"
//	//			+ " UNION (SELECT * FROM tb_daxue WHERE dx_status = 1 AND dx_gfga=1 ORDER BY dx_yxpm limit 5)"
//				+ " UNION (SELECT * FROM tb_daxue WHERE dx_status = 1 ORDER BY dx_yxpm limit 100)) ";
//		EntityManager em = entityManagerFactory.createEntityManager();
//		try {
//			int indexOfFrom = UNIVERSITY_LOAD_BASE_SQL.indexOf(" FROM ");
//			int indexOfDaXue = UNIVERSITY_LOAD_BASE_SQL.indexOf(" tb_daxue", indexOfFrom);
//			String searchSql = UNIVERSITY_LOAD_BASE_SQL.substring(0, indexOfFrom)
//					+ ", sc.sc_status FROM " + innerSelectForDaxue + UNIVERSITY_LOAD_BASE_SQL.substring(indexOfDaXue + 9);
//			searchSql = searchSql
//					+ " LEFT JOIN tb_shoucang sc ON sc.sc_yxdm = dx.dx_yxdm AND sc.sc_kldm = :kldm"
//					+ " AND sc.sc_status = 0 AND sc.sc_zydm = 0"
//					+ " AND sc.sc_yxdh = dxf.ffsx_yxdh AND sc.sc_pcdm = dxf.ffsx_pcdm"
//					+ " AND sc_yhid = :yhid"
//					+ " WHERE dx.dx_status = 1" + " ORDER BY dx.dx_yxpm";
//
//			searchSql = searchSql.replace("--additionPartForFsyx1", "");
//			searchSql = searchSql.replace("--additionPartForFsyx2", "");
//			Query query = em.createNativeQuery(searchSql, University.class);
//			List<University> res = query.setParameter("kldm", kldm).setParameter("yhid", yhid).getResultList();
//			return res;
//		} finally {
//			if (em != null) {
//				em.close();
//			}
//		}
//	}

//	/***
//	 * 检索逻辑
//	 *
//	 * @return
//	 */
//	@SuppressWarnings("unchecked")
//	@Transactional(readOnly = true)
//	public List<University> getSortedSpecifiedTypeUniversities(String kldm, String yhid, Integer type) {
//		String whereConditionForType = "";
//		switch (type) {
//		case 0:
//			// 985
//			whereConditionForType = " AND dx.dx_t985=1";
//			break;
//		case 1:
//			// 211
//			whereConditionForType = " AND dx.dx_t211=1";
//			break;
//		case 2:
//			// 中央部署
//			whereConditionForType = " AND dx.dx_tzy=1";
//			break;
//		case 3:
//			// 少数民族
//			whereConditionForType = " AND dx.dx_ssmz=1";
//			break;
//		case 4:
//			// 国防公安
//			whereConditionForType = " AND dx.dx_gfga=1";
//			break;
//		default:
//			break;
//		}
//		EntityManager em = entityManagerFactory.createEntityManager();
//		try {
//			int indexOfFrom = UNIVERSITY_LOAD_BASE_SQL.indexOf(" FROM ");
//			String searchSql = UNIVERSITY_LOAD_BASE_SQL.substring(0, indexOfFrom)
//					+ ", sc.sc_status " + UNIVERSITY_LOAD_BASE_SQL.substring(indexOfFrom);
//			searchSql = searchSql
//					+ " LEFT JOIN tb_shoucang sc ON sc.sc_yxdm = dx.dx_yxdm AND sc.sc_kldm = :kldm"
//					+ " AND sc.sc_status = 0 AND sc.sc_zydm = 0"
//					+ " AND sc.sc_yxdh = dxf.ffsx_yxdh AND sc.sc_pcdm = dxf.ffsx_pcdm"
//					+ " AND sc_yhid = :yhid "
//					+ " WHERE dx.dx_status = 1" + whereConditionForType + " ORDER BY dx.dx_yxpm";
//			searchSql = searchSql.replace("--additionPartForFsyx1", "");
//			searchSql = searchSql.replace("--additionPartForFsyx2", "");
//			Query query = em.createNativeQuery(searchSql, University.class);
//			List<University> res = query.setParameter("kldm", kldm).setParameter("yhid", yhid).getResultList();
//			return res;
//		} finally {
//			if (em != null) {
//				em.close();
//			}
//		}
//	}


	private static final String SEARCH_SQL_FOR_SINGLE_UNIVERSITY =
			"    SELECT"
			+ "        dx.dx_yxdm,"
			+ "        dx.dx_yxmc,"
			+ "        dx.dx_yxmczj,"
			+ "        dx.dx_pr_code,"
			+ "        dx.dx_ci_code,"
			+ "        dx.dx_zsfs,"
			+ "        dx.dx_t985,"
			+ "        dx.dx_t211,"
			+ "        dx.dx_tzy,"
			+ "        dx.dx_tmb,"
			+ "        dx.dx_tgb,"
			+ "        dx.dx_gfga,"
			+ "        dx.dx_ssmz,"
			+ "        dx.dx_yxlink,"
			+ "        dx.dx_jhlink,"
			+ "        dx.dx_jzlink,"
			+ "        dx.dx_yxadd,"
			+ "        dx.dx_yxtel,"
			+ "        dx.dx_bzxx,"
			+ "        dx.dx_yxpm,"
			+ "        dx.dx_status,"
			+ "        stpr.stpr_name,"
			+ "        stci.stci_name,"
			+ "        null AS ffsx_yxdh,"
			+ "        null AS ffsx_pcdm,"
			+ "        null AS ffsx_nf01,"
			+ "        null AS ffsx_flag01,"
			+ "        null AS dxf_zsjhs01,"
			+ "        null AS dxf_zgfs01,"
			+ "        null AS dxf_zdfs01,"
			+ "        null AS dxf_zdwc01,"
			+ "        null AS ffsx_nf02,"
			+ "        null AS ffsx_flag02,"
			+ "        null AS dxf_zsjhs02,"
			+ "        null AS dxf_zgfs02,"
			+ "        null AS dxf_zdfs02,"
			+ "        null AS dxf_zdwc02,"
			+ "        null AS ffsx_nf03,"
			+ "        null AS ffsx_flag03,"
			+ "        null AS dxf_zsjhs03,"
			+ "        null AS dxf_zgfs03,"
			+ "        null AS dxf_zdfs03,"
			+ "        null AS dxf_zdwc03,"
			+ "        null AS ffsx_nf04,"
			+ "        null AS ffsx_flag04,"
			+ "        null AS dxf_zsjhs04,"
			+ "        null AS dxf_zgfs04,"
			+ "        null AS dxf_zdfs04,"
			+ "        null AS dxf_zdwc04,"
			+ "        sc.sc_status  "
			+ "    FROM"
			+ "        tb_daxue AS dx "
			+ "    LEFT JOIN"
			+ "        tb_set_province AS stpr "
			+ "            ON dx.dx_pr_code = stpr.stpr_code "
			+ "    LEFT JOIN"
			+ "        tb_set_city AS stci "
			+ "            ON dx.dx_ci_code = stci.stci_code "
			+ "    LEFT JOIN"
			+ "            tb_shoucang sc "
			+ "                ON sc.sc_yxdm = dx.dx_yxdm "
			+ "                AND sc.sc_kldm = :kldm "
			+ "                AND sc.sc_status = 0 "
			+ "                AND sc.sc_zydm = 0 "
			+ "                AND sc_yhid = :yhid  "
			+ "        WHERE"
			+ "            dx.dx_status = 1  "
			+ "            AND dx.dx_yxdm = :yxdm";

	@Transactional(readOnly = true)
	public University getUniversityById(String kldm, String yxdm, String yhid, boolean canAccessData) {
		EntityManager em = entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNativeQuery(SEARCH_SQL_FOR_SINGLE_UNIVERSITY, University.class);
			University result = (University) query.setParameter("kldm", kldm)
					.setParameter("yxdm", yxdm).setParameter("yhid", yhid).getSingleResult();
			if (!canAccessData) {
				result.setDxf_zdfs01(new Float(0));
				result.setDxf_zdwc01(0);
				result.setDxf_zgfs01(new Float(0));
				result.setDxf_zsjhs01(0);
			}
			return result;
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}

	@Transactional(readOnly = true)
	public List<List<DaXueFenShu>> getPiciFenShuOfSpecifiedUniversity(String yxdm, String kldm) {
		List<List<DaXueFenShu>> resultList = new ArrayList<List<DaXueFenShu>>();
		List<DaXueFenShu> daXueFenShuInfos = this.daXueFenShuDao.loadPiciInfosOfDaXueFenShu(yxdm, kldm);
		List<DaXueFenShu> subList = null;
		String lastDxf_yxbh_s = null;
		for (DaXueFenShu currentInfo : daXueFenShuInfos) {
			if (!currentInfo.getId().getDxf_yxbh_s().equals(lastDxf_yxbh_s)) {
//			if (!currentInfo.getDxf_yxbh_s().equals(lastDxf_yxbh_s)) {
				subList = new ArrayList<DaXueFenShu>();
				resultList.add(subList);
				lastDxf_yxbh_s = currentInfo.getId().getDxf_yxbh_s();
//				lastDxf_yxbh_s = currentInfo.getDxf_yxbh_s();
			}
			subList.add(currentInfo);
		}
		return resultList;
	}

	private static final String SEARCH_SQL_FOR_SHOUCANG_UNIVERSITY =
			"    SELECT"
			 + "        dx.dx_yxdm,"
			 + "        CONCAT(IFNULL(dx.dx_yxmc, ''), ' ',  IFNULL(dxf.ffsx_lxmc, '')) AS dx_yxmc,"
			 + "        dx.dx_yxmczj,"
			 + "        dx.dx_pr_code,"
			 + "        dx.dx_ci_code,"
			 + "        dx.dx_zsfs,"
			 + "        dx.dx_t985,"
			 + "        dx.dx_t211,"
			 + "        dx.dx_tzy,"
			 + "        dx.dx_tmb,"
			 + "        dx.dx_tgb,"
			 + "        dx.dx_gfga,"
			 + "        dx.dx_ssmz,"
			 + "        dx.dx_yxlink,"
			 + "        dx.dx_jhlink,"
			 + "        dx.dx_jzlink,"
			 + "        dx.dx_yxadd,"
			 + "        dx.dx_yxtel,"
			 + "        dx.dx_bzxx,"
			 + "        dx.dx_yxpm,"
			 + "        dx.dx_status,"
			 + "        stpr.stpr_name,"
			 + "        stci.stci_name,"
			 + "        dxf.ffsx_yxdh,"
			 + "        dxf.ffsx_lxdm,"
			 + "        dxf.ffsx_pcdm,"
			 + "        dxf.ffsx_nf01,"
			 + "        dxf.ffsx_flag01,"
			 + "        CASE dxf.ffsx_flag01 "
			 + "            WHEN 0 THEN NULL "
			 + "            ELSE dxf.ffsx_lqrs01 "
			 + "        END AS dxf_zsjhs01,"
			 + "        CASE dxf.ffsx_flag01 "
			 + "            WHEN 0 THEN NULL "
			 + "            ELSE dxf.ffsx_zgfs01 "
			 + "        END AS dxf_zgfs01,"
			 + "        CASE dxf.ffsx_flag01 "
			 + "            WHEN 0 THEN NULL "
			 + "            ELSE dxf.ffsx_zdfs01 "
			 + "        END AS dxf_zdfs01,"
			 + "        CASE dxf.ffsx_flag01 "
			 + "            WHEN 0 THEN NULL "
			 + "            ELSE dxf.ffsx_zdwc01 "
			 + "        END AS dxf_zdwc01,"
			 + "        dxf.ffsx_nf02,"
			 + "        dxf.ffsx_flag02,"
			 + "        CASE dxf.ffsx_flag02 "
			 + "            WHEN 0 THEN NULL "
			 + "            ELSE dxf.ffsx_lqrs02 "
			 + "        END AS dxf_zsjhs02,"
			 + "        CASE dxf.ffsx_flag02 "
			 + "            WHEN 0 THEN NULL "
			 + "            ELSE dxf.ffsx_zgfs02 "
			 + "        END AS dxf_zgfs02,"
			 + "        CASE dxf.ffsx_flag02 "
			 + "            WHEN 0 THEN NULL "
			 + "            ELSE dxf.ffsx_zdfs02 "
			 + "        END AS dxf_zdfs02,"
			 + "        CASE dxf.ffsx_flag02 "
			 + "            WHEN 0 THEN NULL "
			 + "            ELSE dxf.ffsx_zdwc02 "
			 + "        END AS dxf_zdwc02,"
			 + "        dxf.ffsx_nf03,"
			 + "        dxf.ffsx_flag03,"
			 + "        CASE dxf.ffsx_flag03 "
			 + "            WHEN 0 THEN NULL "
			 + "            ELSE dxf.ffsx_lqrs03 "
			 + "        END AS dxf_zsjhs03,"
			 + "        CASE dxf.ffsx_flag03 "
			 + "            WHEN 0 THEN NULL "
			 + "            ELSE dxf.ffsx_zgfs03 "
			 + "        END AS dxf_zgfs03,"
			 + "        CASE dxf.ffsx_flag03 "
			 + "            WHEN 0 THEN NULL "
			 + "            ELSE dxf.ffsx_zdfs03 "
			 + "        END AS dxf_zdfs03,"
			 + "        CASE dxf.ffsx_flag03 "
			 + "            WHEN 0 THEN NULL "
			 + "            ELSE dxf.ffsx_zdwc03 "
			 + "        END AS dxf_zdwc03,"
			 + "        dxf.ffsx_nf04,"
			 + "        dxf.ffsx_flag04,"
			 + "        CASE dxf.ffsx_flag04 "
			 + "            WHEN 0 THEN NULL "
			 + "            ELSE dxf.ffsx_lqrs04 "
			 + "        END AS dxf_zsjhs04,"
			 + "        CASE dxf.ffsx_flag04 "
			 + "            WHEN 0 THEN NULL "
			 + "            ELSE dxf.ffsx_zgfs04 "
			 + "        END AS dxf_zgfs04,"
			 + "        CASE dxf.ffsx_flag04 "
			 + "            WHEN 0 THEN NULL "
			 + "            ELSE dxf.ffsx_zdfs04 "
			 + "        END AS dxf_zdfs04,"
			 + "        CASE dxf.ffsx_flag04 "
			 + "            WHEN 0 THEN NULL "
			 + "            ELSE dxf.ffsx_zdwc04 "
			 + "        END AS dxf_zdwc04,"
			 + "        ffsx_kldm,"
			 + "        sc.sc_status  "
			 + "    FROM "
			 + "        tb_daxue AS dx "
			 + "    LEFT JOIN "
			 + "        tb_set_province AS stpr "
			 + "            ON dx.dx_pr_code = stpr.stpr_code "
			 + "    LEFT JOIN "
			 + "        tb_set_city AS stci "
			 + "            ON dx.dx_ci_code = stci.stci_code "
			 + "    LEFT JOIN tb_fin_fsyx AS dxf "
			 + "            ON dx.dx_yxdm = dxf.ffsx_yxdm "
			 + "               AND ffsx_kldm = :kldm "
			 + "    INNER JOIN "
			 + "        ( "
			 + "            SELECT "
			 + "                sc_yxdm,"
			 + "                sc_yxdh,"
			 + "                sc_pcdm,"
			 + "                MAX(sc_status) AS sc_status_max,"
			 + "                MIN(sc_status) AS sc_status, "
			 + "              sc_order "
			 + "            FROM "
			 + "                tb_shoucang "
			 + "            WHERE "
			 + "                sc_yhid = :yhid "
			 + "            GROUP BY "
			 + "                sc_yxdm, sc_yxdh, sc_pcdm "
			 + "        ) AS sc "
			 + "            ON sc.sc_yxdm = dx.dx_yxdm "
			 + "            AND sc.sc_yxdh = dxf.ffsx_yxdh "
			 + "            AND sc.sc_pcdm = dxf.ffsx_pcdm "
			 + "    WHERE "
			 + "        dx.dx_status = 1 "
			 + "    ORDER BY "
			 + "        sc.sc_order ASC";
//			 + "        dxf.ffsx_zdfs01 DESC,"
//			 + "        dx.dx_yxdm,"
//			 + "        dxf.ffsx_yxdh,"
//			 + "        sc.sc_status_max DESC,"
//			 + "        dx_yxmc ASC ";
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<University4ShouCang> getShouCangUniversity(String yhid, String kldm, boolean canAccessData) {
		EntityManager em = entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNativeQuery(SEARCH_SQL_FOR_SHOUCANG_UNIVERSITY, University4ShouCang.class);
			List<University4ShouCang> result = query.setParameter("kldm", kldm).setParameter("yhid", yhid).getResultList();

			if (!canAccessData) {
				for (University4ShouCang yx : result) {
					yx.setDxf_zdfs01(new Float(0));
					yx.setDxf_zdwc01(0);
					yx.setDxf_zgfs01(new Float(0));
					yx.setDxf_zsjhs01(0);
				}
			}
			return result;
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}

	private static final String SEARCH_SQL_FOR_UNIVERSITY_YUANXIAO =
			"SELECT "
			+ "    ffsx_yxdm,"    // 国标院校代码
			+ "    ffsx_lxdm,"    // 院校类型代码
			+ "    ffsx_kldm,"    // 科类代码
			+ "    ffsx_pcdm,"    // 批次代码
			+ "    stpc.stpc_pcmc,"    // 批次名称
			+ "    ffsx_yxdh,"    // 院校报考代码
			+ "    ffsx_lxmc,"    // 院校类型名称**
			+ "    ffsx_jhrs,"    // 当年学校计划人数
			+ "    ffsx_nf01,"    // 年份
			+ "    ffsx_flag01,"    // 状态
			+ "    ffsx_lqrs01,"    // 录取人数
			+ "    ffsx_zgfs01,"    // 最高分数
			+ "    ffsx_zdfs01,"    // 最低分数
			+ "    ffsx_zdwc01,"    // 最低位次
			+ "    ffsx_nf02,"    // 年份
			+ "    ffsx_flag02,"    // 状态
			+ "    ffsx_lqrs02,"    // 录取人数
			+ "    ffsx_zgfs02,"    // 最高分数
			+ "    ffsx_zdfs02,"    // 最低分数
			+ "    ffsx_zdwc02,"    // 最低位次
			+ "    ffsx_nf03,"    // 年份
			+ "    ffsx_flag03,"    // 状态
			+ "    ffsx_lqrs03,"    // 录取人数
			+ "    ffsx_zgfs03,"    // 最高分数
			+ "    ffsx_zdfs03,"    // 最低分数
			+ "    ffsx_zdwc03 "    // 最低位次
			+ "FROM tb_fin_fsyx "
			+ "  LEFT JOIN tb_set_pici AS stpc ON ffsx_pcdm = stpc.stpc_pcdm "
			+ "WHERE ffsx_yxdm = :yxdm "
			+ "    AND ffsx_kldm = :kldm "
			+ "ORDER BY ffsx_pcdm, ffsx_lxdm " ;

	@Transactional(readOnly = true)
	public List<FinFsyx> getFinFsyxOfSpecifiedUniversity(String yxdm, String kldm, boolean canAccessData) {
		EntityManager em = entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNativeQuery(SEARCH_SQL_FOR_UNIVERSITY_YUANXIAO, FinFsyx.class);
			@SuppressWarnings("unchecked")
			List<FinFsyx> result = query.setParameter("kldm", kldm).setParameter("yxdm", yxdm).getResultList();

			// 未激活不能看到最新数据
			if (!canAccessData) {
				for (FinFsyx yx : result) {
					yx.setFfsx_lqrs01(0);
					yx.setFfsx_maxfs01(new Float(0));
					yx.setFfsx_minfs01(new Float(0));
					yx.setFfsx_minwc01(0);
				}
			}
			return result;
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}

	private static final String SEARCH_SQL_FOR_ZHUANYE_OLD_YEAR =
			"SELECT "
					+ "    fg_id,"    // id
					+ "    fg_nf,"    // 年份
					+ "    fg_yxdm,"    // 国标院校编码
					+ "    fg_yxmc,"    // 院校名称
					+ "    fg_kldm,"    // 科类编码
					+ "    fg_klmc,"    // 科类名称
					+ "    fg_pcdm,"    // 批次编码
					+ "    fg_pcmc,"    // 批次名称
					+ "    fg_yxdh,"    // 省报考编码
					+ "    fg_zydh,"    // 省专业编码
					+ "    fg_zymc,"    // 资源名称
					+"     fg_gbzydm," //当年专业编号
					+ "    fg_gbzydm15,"    // 串联专业编号
					+ "    fg_flag,"    // 状态
					+ "    fg_remark,"    // 备注
					+ "    fg_renshu,"    // 录取数
					+ "    fg_zdfs, "    // 最低分1
					+ "    ifnull(fjh.fjh_yxdh, fg_yxdh) AS current_year_yxdh,"    // 省报考编码
					+ "    ifnull(fjh.fjh_pcdm, fg_pcdm) AS current_year_pcdm "    // 批次编码
			+ "FROM tb_fin_gbjh "
					+ "  LEFT JOIN tb_fin_jh AS fjh ON fjh.fjh_yxdm = fg_yxdm "
					+ "      AND fjh.fjh_kldm = fg_kldm "
					+ "      AND fjh.fjh_zydm = fg_gbzydm15 "
			+ "WHERE (fg_nf = :nf1 OR fg_nf = :nf2 OR fg_nf = :nf3) "
			+ "    AND fg_yxdm = :yxdm "
			+ "    AND fg_kldm = :kldm "
			+ "ORDER BY fg_nf, current_year_yxdh, current_year_pcdm, fg_zydh, fg_gbzydm15" ;

	@Transactional(readOnly = true)
	public List<FinGbjh4Yx> getZhuanYeOfOldYears(String yxdm, String kldm, String nf1, String nf2, String nf3, boolean canAccessData) {
		EntityManager em = entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNativeQuery(SEARCH_SQL_FOR_ZHUANYE_OLD_YEAR, FinGbjh4Yx.class);
			@SuppressWarnings("unchecked")
			List<FinGbjh4Yx> result = query.setParameter("kldm", kldm)
				.setParameter("yxdm", yxdm)
				.setParameter("nf1", nf1)
				.setParameter("nf2", nf2)
				.setParameter("nf3", nf3).getResultList();

			// 未激活不能看到最新数据
			if (!canAccessData) {
				for (FinGbjh4Yx yx : result) {
					yx.setFg_zdfs("-");
					yx.setFg_renshu("-");
				}
			}
			return result;
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}


	private static final String SEARCH_SQL_FOR_FENSX_OLD_YEARS =
			"SELECT "
					+ "    fsx_nf,"    // 年份
					+ "    fsx_kldm,"    // 科类代码
					+ "    fsx_pcdm,"    // 批次代码
					+ "    fsx_fs "    // 分数
			+ "FROM tb_fin_fsx "
			+ "WHERE (fsx_nf = :nf1 OR fsx_nf = :nf2 OR fsx_nf = :nf3) "
			+ "    AND fsx_kldm = :kldm "
			+ "ORDER BY fsx_pcdm , fsx_nf" ;
	@Transactional(readOnly = true)
	public List<FinFsx> getFensxOfOldYears(String kldm, String nf1, String nf2, String nf3) {
		EntityManager em = entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNativeQuery(SEARCH_SQL_FOR_FENSX_OLD_YEARS, FinFsx.class);
			@SuppressWarnings("unchecked")
			List<FinFsx> result = query.setParameter("kldm", kldm)
				.setParameter("nf1", nf1)
				.setParameter("nf2", nf2)
				.setParameter("nf3", nf3).getResultList();
			return result;
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}



	private static final String SEARCH_SQL_FOR_UNIVERSITIES_OF_985 =
			        "SELECT"
					+ "        f9_yxdm AS dx_yxdm,"
					+ "        f9_yxmc AS dx_yxmc,"
					+ "        null AS dx_yxmczj,"
					+ "        f9_pr_code AS dx_pr_code,"
					+ "        f9_ci_code AS dx_ci_code,"
					+ "        null AS dx_zsfs,"
					+ "        1 AS dx_t985,"
					+ "        null AS dx_t211,"
					+ "        null AS dx_tzy,"
					+ "        null AS dx_tmb,"
					+ "        null AS dx_tgb,"
					+ "        null AS dx_gfga,"
					+ "        null AS dx_ssmz,"
					+ "        null AS dx_yxlink,"
					+ "        null AS dx_jhlink,"
					+ "        null AS dx_jzlink,"
					+ "        null AS dx_yxadd,"
					+ "        null AS dx_yxtel,"
					+ "        null AS dx_bzxx,"
					+ "        null AS dx_yxpm,"
					+ "        null AS dx_status,"
					+ "        f9_pr_name AS stpr_name,"
					+ "        f9_ci_name AS stci_name,"
					+ "        null AS ffsx_yxdh,"
					+ "        null AS ffsx_pcdm,"
					+ "        null AS ffsx_nf01,"
					+ "        null AS ffsx_flag01,"
					+ "        f9_lqrs AS dxf_zsjhs01,"
					+ "        f9_zgfs AS dxf_zgfs01,"
					+ "        f9_zdfs AS dxf_zdfs01,"
					+ "        f9_zdwc AS dxf_zdwc01,"
					+ "        null AS ffsx_nf02,"
					+ "        null AS ffsx_flag02,"
					+ "        null AS dxf_zsjhs02,"
					+ "        null AS dxf_zgfs02,"
					+ "        null AS dxf_zdfs02,"
					+ "        null AS dxf_zdwc02,"
					+ "        null AS ffsx_nf03,"
					+ "        null AS ffsx_flag03,"
					+ "        null AS dxf_zsjhs03,"
					+ "        null AS dxf_zgfs03,"
					+ "        null AS dxf_zdfs03,"
					+ "        null AS dxf_zdwc03,"
					+ "        null AS ffsx_nf04,"
					+ "        null AS ffsx_flag04,"
					+ "        null AS dxf_zsjhs04,"
					+ "        null AS dxf_zgfs04,"
					+ "        null AS dxf_zdfs04,"
					+ "        null AS dxf_zdwc04,"
					+ "        null AS sc_status "
					+ "    FROM"
					+ "        tb_fin_985"
					+ "    WHERE f9_kldm = :kldm"
					+ "    ORDER BY f9_zdfs desc,f9_yxpm asc" ;

	@Transactional(readOnly = true)
	public List<University> getUniversitiesOf985(String kldm, boolean canAccessData) {
		EntityManager em = entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNativeQuery(SEARCH_SQL_FOR_UNIVERSITIES_OF_985, University.class);
			@SuppressWarnings("unchecked")
			List<University> res = query.setParameter("kldm", kldm).getResultList();

			// 如果没有激活，不显示最新数据
			if (!canAccessData) {
				for (University yx : res) {
					yx.setDxf_zdfs01(new Float(0));
					yx.setDxf_zdwc01(0);
					yx.setDxf_zgfs01(new Float(0));
					yx.setDxf_zsjhs01(0);
				}
			}
			return res;
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}
	private static final String SEARCH_SQL_FOR_UNIVERSITIES_OF_211 =
	        "SELECT"
			+ "        f2_yxdm AS dx_yxdm,"
			+ "        f2_yxmc AS dx_yxmc,"
			+ "        null AS dx_yxmczj,"
			+ "        f2_pr_code AS dx_pr_code,"
			+ "        f2_ci_code AS dx_ci_code,"
			+ "        null AS dx_zsfs,"
			+ "        null AS dx_t985,"
			+ "        1 AS dx_t211,"
			+ "        null AS dx_tzy,"
			+ "        null AS dx_tmb,"
			+ "        null AS dx_tgb,"
			+ "        null AS dx_gfga,"
			+ "        null AS dx_ssmz,"
			+ "        null AS dx_yxlink,"
			+ "        null AS dx_jhlink,"
			+ "        null AS dx_jzlink,"
			+ "        null AS dx_yxadd,"
			+ "        null AS dx_yxtel,"
			+ "        null AS dx_bzxx,"
			+ "        null AS dx_yxpm,"
			+ "        null AS dx_status,"
			+ "        f2_pr_name AS stpr_name,"
			+ "        f2_ci_name AS stci_name,"
			+ "        null AS ffsx_yxdh,"
			+ "        null AS ffsx_pcdm,"
			+ "        null AS ffsx_nf01,"
			+ "        null AS ffsx_flag01,"
			+ "        f2_lqrs AS dxf_zsjhs01,"
			+ "        f2_zgfs AS dxf_zgfs01,"
			+ "        f2_zdfs AS dxf_zdfs01,"
			+ "        f2_zdwc AS dxf_zdwc01,"
			+ "        null AS ffsx_nf02,"
			+ "        null AS ffsx_flag02,"
			+ "        null AS dxf_zsjhs02,"
			+ "        null AS dxf_zgfs02,"
			+ "        null AS dxf_zdfs02,"
			+ "        null AS dxf_zdwc02,"
			+ "        null AS ffsx_nf03,"
			+ "        null AS ffsx_flag03,"
			+ "        null AS dxf_zsjhs03,"
			+ "        null AS dxf_zgfs03,"
			+ "        null AS dxf_zdfs03,"
			+ "        null AS dxf_zdwc03,"
			+ "        null AS ffsx_nf04,"
			+ "        null AS ffsx_flag04,"
			+ "        null AS dxf_zsjhs04,"
			+ "        null AS dxf_zgfs04,"
			+ "        null AS dxf_zdfs04,"
			+ "        null AS dxf_zdwc04,"
			+ "        null AS sc_status "
			+ "    FROM"
			+ "        tb_fin_211"
			+ "    WHERE f2_kldm = :kldm"
			+ "    ORDER BY f2_zdfs desc,f2_yxpm asc" ;

	@Transactional(readOnly = true)
	public List<University> getUniversitiesOf211(String kldm, boolean canAccessData) {
		EntityManager em = entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNativeQuery(SEARCH_SQL_FOR_UNIVERSITIES_OF_211, University.class);
			@SuppressWarnings("unchecked")
			List<University> res = query.setParameter("kldm", kldm).getResultList();

			// 如果没有激活，不显示最新数据
			if (!canAccessData) {
				for (University yx : res) {
					yx.setDxf_zdfs01(new Float(0));
					yx.setDxf_zdwc01(0);
					yx.setDxf_zgfs01(new Float(0));
					yx.setDxf_zsjhs01(0);
				}
			}

			return res;
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}


	private static final String SEARCH_SQL_FOR_UNIVERSITIES_OF_TOP100 =
			        "SELECT"
					+ "        f1_yxdm AS dx_yxdm,"
					+ "        f1_yxmc AS dx_yxmc,"
					+ "        null AS dx_yxmczj,"
					+ "        f1_pr_code AS dx_pr_code,"
					+ "        f1_ci_code AS dx_ci_code,"
					+ "        null AS dx_zsfs,"
					+ "        null AS dx_t985,"
					+ "        null AS dx_t211,"
					+ "        null AS dx_tzy,"
					+ "        null AS dx_tmb,"
					+ "        null AS dx_tgb,"
					+ "        null AS dx_gfga,"
					+ "        null AS dx_ssmz,"
					+ "        null AS dx_yxlink,"
					+ "        null AS dx_jhlink,"
					+ "        null AS dx_jzlink,"
					+ "        null AS dx_yxadd,"
					+ "        null AS dx_yxtel,"
					+ "        null AS dx_bzxx,"
					+ "        null AS dx_yxpm,"
					+ "        null AS dx_status,"
					+ "        f1_pr_name AS stpr_name,"
					+ "        f1_ci_name AS stci_name,"
					+ "        null AS ffsx_yxdh,"
					+ "        null AS ffsx_pcdm,"
					+ "        null AS ffsx_nf01,"
					+ "        null AS ffsx_flag01,"
					+ "        f1_lqrs AS dxf_zsjhs01,"
					+ "        f1_zgfs AS dxf_zgfs01,"
					+ "        f1_zdfs AS dxf_zdfs01,"
					+ "        f1_zdwc AS dxf_zdwc01,"
					+ "        null AS ffsx_nf02,"
					+ "        null AS ffsx_flag02,"
					+ "        null AS dxf_zsjhs02,"
					+ "        null AS dxf_zgfs02,"
					+ "        null AS dxf_zdfs02,"
					+ "        null AS dxf_zdwc02,"
					+ "        null AS ffsx_nf03,"
					+ "        null AS ffsx_flag03,"
					+ "        null AS dxf_zsjhs03,"
					+ "        null AS dxf_zgfs03,"
					+ "        null AS dxf_zdfs03,"
					+ "        null AS dxf_zdwc03,"
					+ "        null AS ffsx_nf04,"
					+ "        null AS ffsx_flag04,"
					+ "        null AS dxf_zsjhs04,"
					+ "        null AS dxf_zgfs04,"
					+ "        null AS dxf_zdfs04,"
					+ "        null AS dxf_zdwc04,"
					+ "        null AS sc_status "
					+ "    FROM"
					+ "        tb_fin_100"
					+ "    WHERE f1_kldm = :kldm"
					+ "    ORDER BY f1_yxpm" ;

	@Transactional(readOnly = true)
	public List<University> getUniversitiesOfTop100(String kldm) {
		EntityManager em = entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNativeQuery(SEARCH_SQL_FOR_UNIVERSITIES_OF_TOP100, University.class);
			@SuppressWarnings("unchecked")
			List<University> res = query.setParameter("kldm", kldm).getResultList();
			return res;
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}
}
