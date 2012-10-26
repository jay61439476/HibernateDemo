package com.ivo.hibernate.asheet;

import com.ivo.hibernate.BaseHibernateDAO;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 	* A data access object (DAO) providing persistence and search support for Asheet entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ivo.hibernate.asheet.Asheet
  * @author MyEclipse Persistence Tools 
 */

public class AsheetDAO extends BaseHibernateDAO  {
		 private static final Log log = LogFactory.getLog(AsheetDAO.class);
		//property constants
	public static final String EVENT_NODE = "event_node";
	public static final String EVENT_NAME = "event_name";
	public static final String EVENT_USER = "event_user";
	public static final String EVENT_NO = "event_no";
	public static final String TABLE_NAME = "table_name";
	public static final String OPERATION = "operation";
	public static final String SGR_ID = "sgr_id";
	public static final String LOT_ID = "lot_id";
	public static final String CRR_ID = "crr_id";
	public static final String SLOT_NO = "slot_no";
	public static final String M_GROUP_ID = "m_group_id";
	public static final String GROUP_ID = "group_id";
	public static final String PPBOX_ID = "ppbox_id";
	public static final String SHT_STAT = "sht_stat";
	public static final String PNL_CNT = "pnl_cnt";
	public static final String X_AXIS_CNT = "x_axis_cnt";
	public static final String Y_AXIS_CNT = "y_axis_cnt";
	public static final String PNL_SHT_CNT = "pnl_sht_cnt";
	public static final String REPROC_FLG = "reproc_flg";
	public static final String EQPT_ID = "eqpt_id";
	public static final String EQPT_PORT_ID = "eqpt_port_id";
	public static final String CR_ROUTE_ID = "cr_route_id";
	public static final String CR_ROUTE_VER = "cr_route_ver";
	public static final String CR_OPE_NO = "cr_ope_no";
	public static final String CR_OPE_ID = "cr_ope_id";
	public static final String CR_OPE_VER = "cr_ope_ver";
	public static final String CR_PROC_ID = "cr_proc_id";
	public static final String CR_EQPTG_ID = "cr_eqptg_id";
	public static final String CR_EQPT_ID = "cr_eqpt_id";
	public static final String CR_PEP_LVL = "cr_pep_lvl";
	public static final String CR_RECIPE_ID = "cr_recipe_id";
	public static final String NX_ROUTE_ID = "nx_route_id";
	public static final String NX_ROUTE_VER = "nx_route_ver";
	public static final String NX_OPE_NO = "nx_ope_no";
	public static final String NX_OPE_ID = "nx_ope_id";
	public static final String NX_OPE_VER = "nx_ope_ver";
	public static final String NX_PROC_ID = "nx_proc_id";
	public static final String NX_EQPTG_ID = "nx_eqptg_id";
	public static final String NX_EQPT_ID = "nx_eqpt_id";
	public static final String NX_PEP_LVL = "nx_pep_lvl";
	public static final String NX_DEPT_CODE = "nx_dept_code";
	public static final String NX_RECIPE_ID = "nx_recipe_id";
	public static final String PV_LOGOF_USER = "pv_logof_user";
	public static final String PV_LOGOF_MFWK = "pv_logof_mfwk";
	public static final String PV_LOGOF_MFMN = "pv_logof_mfmn";
	public static final String PV_LOGOF_MFSH = "pv_logof_mfsh";
	public static final String LOGON_USER = "logon_user";
	public static final String LOGON_CRR_ID = "logon_crr_id";
	public static final String LOGON_SLOT_NO = "logon_slot_no";
	public static final String LOGON_MFWK = "logon_mfwk";
	public static final String LOGON_MFMN = "logon_mfmn";
	public static final String LOGON_MFSH = "logon_mfsh";
	public static final String LOGOF_USER = "logof_user";
	public static final String LOGOF_MFWK = "logof_mfwk";
	public static final String LOGOF_MFMN = "logof_mfmn";
	public static final String LOGOF_MFSH = "logof_mfsh";
	public static final String PV_PLN_CMP_MFWK = "pv_pln_cmp_mfwk";
	public static final String PV_PLN_CMP_MFMN = "pv_pln_cmp_mfmn";
	public static final String PV_PLN_CMP_MFSH = "pv_pln_cmp_mfsh";
	public static final String PLN_CMP_MFWK = "pln_cmp_mfwk";
	public static final String PLN_CMP_MFMN = "pln_cmp_mfmn";
	public static final String PLN_CMP_MFSH = "pln_cmp_mfsh";
	public static final String PCMP_MFWK = "pcmp_mfwk";
	public static final String PCMP_MFMN = "pcmp_mfmn";
	public static final String PCMP_MFSH = "pcmp_mfsh";
	public static final String ACMP_MFWK = "acmp_mfwk";
	public static final String ACMP_MFMN = "acmp_mfmn";
	public static final String ACMP_MFSH = "acmp_mfsh";
	public static final String EVT_CATE = "evt_cate";
	public static final String EVT_USER = "evt_user";
	public static final String EVT_MFWK = "evt_mfwk";
	public static final String EVT_MFMN = "evt_mfmn";
	public static final String EVT_MFSH = "evt_mfsh";
	public static final String CR_MPROC_ID = "cr_mproc_id";
	public static final String CR_MPROC_FLG = "cr_mproc_flg";
	public static final String NX_MPROC_ID = "nx_mproc_id";
	public static final String NX_MPROC_FLG = "nx_mproc_flg";
	public static final String MPROC_HLD = "mproc_hld";
	public static final String PLN_MPROC_MFWK = "pln_mproc_mfwk";
	public static final String PLN_MPROC_MFMN = "pln_mproc_mfmn";
	public static final String PLN_MPROC_MFSH = "pln_mproc_mfsh";
	public static final String ACT_MPROC_MFWK = "act_mproc_mfwk";
	public static final String ACT_MPROC_MFMN = "act_mproc_mfmn";
	public static final String ACT_MPROC_MFSH = "act_mproc_mfsh";
	public static final String SV_CRR_ID = "sv_crr_id";
	public static final String SV_SLOT_NO = "sv_slot_no";
	public static final String SV_ROUTE_ID = "sv_route_id";
	public static final String SV_ROUTE_VER = "sv_route_ver";
	public static final String SV_OPE_NO = "sv_ope_no";
	public static final String SV_EQPTG_ID = "sv_eqptg_id";
	public static final String SV_EQPT_ID = "sv_eqpt_id";
	public static final String SV_RECIPE_ID = "sv_recipe_id";
	public static final String SV_SHT_STAT = "sv_sht_stat";
	public static final String PV_CRR_ID = "pv_crr_id";
	public static final String PV_SLOT_NO = "pv_slot_no";
	public static final String CLM_CRR_ID = "clm_crr_id";
	public static final String CLM_SLOT_NO = "clm_slot_no";
	public static final String ABND_FLG = "abnd_flg";
	public static final String DELDAYS = "deldays";
	public static final String SHT_NOTE_FLG = "sht_note_flg";
	public static final String FAB_ID = "fab_id";
	public static final String LINE_ID = "line_id";
	public static final String PRODUCT_ID = "product_id";
	public static final String EC_CODE = "ec_code";
	public static final String CHARGE_CODE = "charge_code";
	public static final String OWNER_ID = "owner_id";
	public static final String PRTY = "prty";
	public static final String MTRL_PRODUCT_ID = "mtrl_product_id";
	public static final String ORDER_ID = "order_id";
	public static final String SALES_ORDER = "sales_order";
	public static final String PROJECT_CD = "project_cd";
	public static final String ENG_NAME = "eng_name";
	public static final String EXP_NO = "exp_no";
	public static final String STB_LOT_ID = "stb_lot_id";
	public static final String DS_RECIPE_ID = "ds_recipe_id";
	public static final String AC_RECIPE_ID = "ac_recipe_id";
	public static final String PRODUCT_CATE = "product_cate";
	public static final String MRG_HLD_ROUTE_ID = "mrg_hld_route_id";
	public static final String MRG_HLD_ROUTE_VER = "mrg_hld_route_ver";
	public static final String MRG_HLD_OPE_NO = "mrg_hld_ope_no";
	public static final String PRT_SPLT_ID = "prt_splt_id";
	public static final String SPLT_ID = "splt_id";
	public static final String CE_ID = "ce_id";
	public static final String EEN_ID = "een_id";
	public static final String STAGE_ID = "stage_id";
	public static final String SV_REPROC_FLG = "sv_reproc_flg";
	public static final String PTT_GRADE = "ptt_grade";
	public static final String PTT_TYPE = "ptt_type";
	public static final String SHT_RECIPE_ID = "sht_recipe_id";
	public static final String SV_SHT_RECIPE_ID = "sv_sht_recipe_id";
	public static final String DEST_SHOP = "dest_shop";
	public static final String DMY_SHT_ID = "dmy_sht_id";
	public static final String DMY_PRODUCT_ID = "dmy_product_id";
	public static final String DMY_EC_CODE = "dmy_ec_code";
	public static final String MTRL_GRADE = "mtrl_grade";
	public static final String SHT_PLN_ID = "sht_pln_id";
	public static final String BM_PATTERN = "bm_pattern";
	public static final String FORCE_INSP_FLG = "force_insp_flg";
	public static final String SHT_JUDGE = "sht_judge";
	public static final String RECYC_CNT = "recyc_cnt";
	public static final String INSP_RESULT = "insp_result";
	public static final String INSP_JUDGE = "insp_judge";
	public static final String STB_SHOP = "stb_shop";
	public static final String ABNORMAL_FLG_1 = "abnormal_flg_1";
	public static final String BC_SUSPECT_RSN = "bc_suspect_rsn";
	public static final String BC_SUSPECT_OPE_ID = "bc_suspect_ope_id";
	public static final String SHT_FTSMP_FLG = "sht_ftsmp_flg";
	public static final String ORG_LOT_ID = "org_lot_id";
	public static final String ORG_PRT_SPLT_ID = "org_prt_splt_id";
	public static final String ORG_SPLT_ID = "org_splt_id";
	public static final String PV_PROC_ID = "pv_proc_id";
	public static final String PV_EQPT_ID = "pv_eqpt_id";
	public static final String PV_PEP_LVL = "pv_pep_lvl";
	public static final String TEMPLATE_ID = "template_id";
	public static final String SRT_SETTING_NO = "srt_setting_no";
	public static final String SHT_PLN_BATCH_ID = "sht_pln_batch_id";
	public static final String LG_SCRP_FLG = "lg_scrp_flg";
	public static final String STB_SAMPLING_FLG = "stb_sampling_flg";
	public static final String NG_MARK = "ng_mark";
	public static final String SHT_ID_BC = "sht_id_bc";
	public static final String REVW_SHT_JUDGE = "revw_sht_judge";
	public static final String SRT_GRADE_GRP = "srt_grade_grp";
	public static final String SRT_RULE_ID = "srt_rule_id";
	public static final String SRC_SHOP = "src_shop";
	public static final String SALE_FLG = "sale_flg";
	public static final String RGB_LAYER_HIGHT = "rgb_layer_hight";
	public static final String PFCD = "pfcd";
	public static final String PNLMODE = "pnlmode";
	public static final String PR_FLG = "pr_flg";
	public static final String RCVY_ID = "rcvy_id";
	public static final String RCVY_EQPT_ID = "rcvy_eqpt_id";
	public static final String RCVY_SEQ_NO = "rcvy_seq_no";
	public static final String RCVY_TEMPLATE_ID = "rcvy_template_id";
	public static final String RCVY_ACT_SEQ_NO = "rcvy_act_seq_no";
	public static final String MIX_OWNER = "mix_owner";
	public static final String TEG_FLG = "teg_flg";
	public static final String SUB_SHT_STAT = "sub_sht_stat";
	public static final String PV_LOGOF_DEPT = "pv_logof_dept";
	public static final String LOGON_DEPT = "logon_dept";
	public static final String LOGOF_DEPT = "logof_dept";
	public static final String EVT_DEPT = "evt_dept";
	public static final String MAX_QRS_AVL_FLG = "max_qrs_avl_flg";
	public static final String MAX_QRS_ROUTE_ID = "max_qrs_route_id";
	public static final String MAX_QRS_ROUTE_VER = "max_qrs_route_ver";
	public static final String MAX_QRS_OPE_ID = "max_qrs_ope_id";
	public static final String MIN_QRS_AVL_FLG = "min_qrs_avl_flg";
	public static final String MIN_QRS_ROUTE_ID = "min_qrs_route_id";
	public static final String MIN_QRS_ROUTE_VER = "min_qrs_route_ver";
	public static final String MIN_QRS_OPE_ID = "min_qrs_ope_id";
	public static final String MAX_QRK_AVL_FLG = "max_qrk_avl_flg";
	public static final String MAX_QRK_ROUTE_ID = "max_qrk_route_id";
	public static final String MAX_QRK_ROUTE_VER = "max_qrk_route_ver";
	public static final String MAX_QRK_OPE_ID = "max_qrk_ope_id";
	public static final String BNK_FLG = "bnk_flg";
	public static final String RSN_DEPT_1 = "rsn_dept_1";
	public static final String RSN_CATE_1 = "rsn_cate_1";
	public static final String RSN_CODE_1 = "rsn_code_1";
	public static final String RSN_DEPT_2 = "rsn_dept_2";
	public static final String RSN_CATE_2 = "rsn_cate_2";
	public static final String RSN_CODE_2 = "rsn_code_2";
	public static final String RSN_DEPT_3 = "rsn_dept_3";
	public static final String RSN_CATE_3 = "rsn_cate_3";
	public static final String RSN_CODE_3 = "rsn_code_3";
	public static final String RSN_DEPT_4 = "rsn_dept_4";
	public static final String RSN_CATE_4 = "rsn_cate_4";
	public static final String RSN_CODE_4 = "rsn_code_4";
	public static final String RSN_DEPT_5 = "rsn_dept_5";
	public static final String RSN_CATE_5 = "rsn_cate_5";
	public static final String RSN_CODE_5 = "rsn_code_5";
	public static final String PNL_GRADE = "pnl_grade";
	public static final String SV_PNL_GRADE = "sv_pnl_grade";
	public static final String MTRL_LOT_ID = "mtrl_lot_id";
	public static final String PNL_JUDGE = "pnl_judge";
	public static final String SV_PNL_JUDGE = "sv_pnl_judge";
	public static final String SHT_OPE_MSG = "sht_ope_msg";
	public static final String SLOT_FLG = "slot_flg";
	public static final String DEL_TIME = "del_time";
	public static final String METAL_FLG = "metal_flg";
	public static final String CR_SETTING_NO = "cr_setting_no";
	public static final String NX_SETTING_NO = "nx_setting_no";
	public static final String AC_RECIPE_VER = "ac_recipe_ver";
	public static final String PC_WORDER_ID = "pc_worder_id";
	public static final String SMP_PRTY = "smp_prty";



    
    public void save(Asheet transientInstance) {
        log.debug("saving Asheet instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Asheet persistentInstance) {
        log.debug("deleting Asheet instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Asheet findById( java.lang.String id) {
        log.debug("getting Asheet instance with id: " + id);
        try {
            Asheet instance = (Asheet) getSession()
                    .get("com.ivo.model.Asheet", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Asheet instance) {
        log.debug("finding Asheet instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.ivo.model.Asheet")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding Asheet instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Asheet as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByEvent_node(Object event_node
	) {
		return findByProperty(EVENT_NODE, event_node
		);
	}
	
	public List findByEvent_name(Object event_name
	) {
		return findByProperty(EVENT_NAME, event_name
		);
	}
	
	public List findByEvent_user(Object event_user
	) {
		return findByProperty(EVENT_USER, event_user
		);
	}
	
	public List findByEvent_no(Object event_no
	) {
		return findByProperty(EVENT_NO, event_no
		);
	}
	
	public List findByTable_name(Object table_name
	) {
		return findByProperty(TABLE_NAME, table_name
		);
	}
	
	public List findByOperation(Object operation
	) {
		return findByProperty(OPERATION, operation
		);
	}
	
	public List findBySgr_id(Object sgr_id
	) {
		return findByProperty(SGR_ID, sgr_id
		);
	}
	
	public List findByLot_id(Object lot_id
	) {
		return findByProperty(LOT_ID, lot_id
		);
	}
	
	public List findByCrr_id(Object crr_id
	) {
		return findByProperty(CRR_ID, crr_id
		);
	}
	
	public List findBySlot_no(Object slot_no
	) {
		return findByProperty(SLOT_NO, slot_no
		);
	}
	
	public List findByM_group_id(Object m_group_id
	) {
		return findByProperty(M_GROUP_ID, m_group_id
		);
	}
	
	public List findByGroup_id(Object group_id
	) {
		return findByProperty(GROUP_ID, group_id
		);
	}
	
	public List findByPpbox_id(Object ppbox_id
	) {
		return findByProperty(PPBOX_ID, ppbox_id
		);
	}
	
	public List findBySht_stat(Object sht_stat
	) {
		return findByProperty(SHT_STAT, sht_stat
		);
	}
	
	public List findByPnl_cnt(Object pnl_cnt
	) {
		return findByProperty(PNL_CNT, pnl_cnt
		);
	}
	
	public List findByX_axis_cnt(Object x_axis_cnt
	) {
		return findByProperty(X_AXIS_CNT, x_axis_cnt
		);
	}
	
	public List findByY_axis_cnt(Object y_axis_cnt
	) {
		return findByProperty(Y_AXIS_CNT, y_axis_cnt
		);
	}
	
	public List findByPnl_sht_cnt(Object pnl_sht_cnt
	) {
		return findByProperty(PNL_SHT_CNT, pnl_sht_cnt
		);
	}
	
	public List findByReproc_flg(Object reproc_flg
	) {
		return findByProperty(REPROC_FLG, reproc_flg
		);
	}
	
	public List findByEqpt_id(Object eqpt_id
	) {
		return findByProperty(EQPT_ID, eqpt_id
		);
	}
	
	public List findByEqpt_port_id(Object eqpt_port_id
	) {
		return findByProperty(EQPT_PORT_ID, eqpt_port_id
		);
	}
	
	public List findByCr_route_id(Object cr_route_id
	) {
		return findByProperty(CR_ROUTE_ID, cr_route_id
		);
	}
	
	public List findByCr_route_ver(Object cr_route_ver
	) {
		return findByProperty(CR_ROUTE_VER, cr_route_ver
		);
	}
	
	public List findByCr_ope_no(Object cr_ope_no
	) {
		return findByProperty(CR_OPE_NO, cr_ope_no
		);
	}
	
	public List findByCr_ope_id(Object cr_ope_id
	) {
		return findByProperty(CR_OPE_ID, cr_ope_id
		);
	}
	
	public List findByCr_ope_ver(Object cr_ope_ver
	) {
		return findByProperty(CR_OPE_VER, cr_ope_ver
		);
	}
	
	public List findByCr_proc_id(Object cr_proc_id
	) {
		return findByProperty(CR_PROC_ID, cr_proc_id
		);
	}
	
	public List findByCr_eqptg_id(Object cr_eqptg_id
	) {
		return findByProperty(CR_EQPTG_ID, cr_eqptg_id
		);
	}
	
	public List findByCr_eqpt_id(Object cr_eqpt_id
	) {
		return findByProperty(CR_EQPT_ID, cr_eqpt_id
		);
	}
	
	public List findByCr_pep_lvl(Object cr_pep_lvl
	) {
		return findByProperty(CR_PEP_LVL, cr_pep_lvl
		);
	}
	
	public List findByCr_recipe_id(Object cr_recipe_id
	) {
		return findByProperty(CR_RECIPE_ID, cr_recipe_id
		);
	}
	
	public List findByNx_route_id(Object nx_route_id
	) {
		return findByProperty(NX_ROUTE_ID, nx_route_id
		);
	}
	
	public List findByNx_route_ver(Object nx_route_ver
	) {
		return findByProperty(NX_ROUTE_VER, nx_route_ver
		);
	}
	
	public List findByNx_ope_no(Object nx_ope_no
	) {
		return findByProperty(NX_OPE_NO, nx_ope_no
		);
	}
	
	public List findByNx_ope_id(Object nx_ope_id
	) {
		return findByProperty(NX_OPE_ID, nx_ope_id
		);
	}
	
	public List findByNx_ope_ver(Object nx_ope_ver
	) {
		return findByProperty(NX_OPE_VER, nx_ope_ver
		);
	}
	
	public List findByNx_proc_id(Object nx_proc_id
	) {
		return findByProperty(NX_PROC_ID, nx_proc_id
		);
	}
	
	public List findByNx_eqptg_id(Object nx_eqptg_id
	) {
		return findByProperty(NX_EQPTG_ID, nx_eqptg_id
		);
	}
	
	public List findByNx_eqpt_id(Object nx_eqpt_id
	) {
		return findByProperty(NX_EQPT_ID, nx_eqpt_id
		);
	}
	
	public List findByNx_pep_lvl(Object nx_pep_lvl
	) {
		return findByProperty(NX_PEP_LVL, nx_pep_lvl
		);
	}
	
	public List findByNx_dept_code(Object nx_dept_code
	) {
		return findByProperty(NX_DEPT_CODE, nx_dept_code
		);
	}
	
	public List findByNx_recipe_id(Object nx_recipe_id
	) {
		return findByProperty(NX_RECIPE_ID, nx_recipe_id
		);
	}
	
	public List findByPv_logof_user(Object pv_logof_user
	) {
		return findByProperty(PV_LOGOF_USER, pv_logof_user
		);
	}
	
	public List findByPv_logof_mfwk(Object pv_logof_mfwk
	) {
		return findByProperty(PV_LOGOF_MFWK, pv_logof_mfwk
		);
	}
	
	public List findByPv_logof_mfmn(Object pv_logof_mfmn
	) {
		return findByProperty(PV_LOGOF_MFMN, pv_logof_mfmn
		);
	}
	
	public List findByPv_logof_mfsh(Object pv_logof_mfsh
	) {
		return findByProperty(PV_LOGOF_MFSH, pv_logof_mfsh
		);
	}
	
	public List findByLogon_user(Object logon_user
	) {
		return findByProperty(LOGON_USER, logon_user
		);
	}
	
	public List findByLogon_crr_id(Object logon_crr_id
	) {
		return findByProperty(LOGON_CRR_ID, logon_crr_id
		);
	}
	
	public List findByLogon_slot_no(Object logon_slot_no
	) {
		return findByProperty(LOGON_SLOT_NO, logon_slot_no
		);
	}
	
	public List findByLogon_mfwk(Object logon_mfwk
	) {
		return findByProperty(LOGON_MFWK, logon_mfwk
		);
	}
	
	public List findByLogon_mfmn(Object logon_mfmn
	) {
		return findByProperty(LOGON_MFMN, logon_mfmn
		);
	}
	
	public List findByLogon_mfsh(Object logon_mfsh
	) {
		return findByProperty(LOGON_MFSH, logon_mfsh
		);
	}
	
	public List findByLogof_user(Object logof_user
	) {
		return findByProperty(LOGOF_USER, logof_user
		);
	}
	
	public List findByLogof_mfwk(Object logof_mfwk
	) {
		return findByProperty(LOGOF_MFWK, logof_mfwk
		);
	}
	
	public List findByLogof_mfmn(Object logof_mfmn
	) {
		return findByProperty(LOGOF_MFMN, logof_mfmn
		);
	}
	
	public List findByLogof_mfsh(Object logof_mfsh
	) {
		return findByProperty(LOGOF_MFSH, logof_mfsh
		);
	}
	
	public List findByPv_pln_cmp_mfwk(Object pv_pln_cmp_mfwk
	) {
		return findByProperty(PV_PLN_CMP_MFWK, pv_pln_cmp_mfwk
		);
	}
	
	public List findByPv_pln_cmp_mfmn(Object pv_pln_cmp_mfmn
	) {
		return findByProperty(PV_PLN_CMP_MFMN, pv_pln_cmp_mfmn
		);
	}
	
	public List findByPv_pln_cmp_mfsh(Object pv_pln_cmp_mfsh
	) {
		return findByProperty(PV_PLN_CMP_MFSH, pv_pln_cmp_mfsh
		);
	}
	
	public List findByPln_cmp_mfwk(Object pln_cmp_mfwk
	) {
		return findByProperty(PLN_CMP_MFWK, pln_cmp_mfwk
		);
	}
	
	public List findByPln_cmp_mfmn(Object pln_cmp_mfmn
	) {
		return findByProperty(PLN_CMP_MFMN, pln_cmp_mfmn
		);
	}
	
	public List findByPln_cmp_mfsh(Object pln_cmp_mfsh
	) {
		return findByProperty(PLN_CMP_MFSH, pln_cmp_mfsh
		);
	}
	
	public List findByPcmp_mfwk(Object pcmp_mfwk
	) {
		return findByProperty(PCMP_MFWK, pcmp_mfwk
		);
	}
	
	public List findByPcmp_mfmn(Object pcmp_mfmn
	) {
		return findByProperty(PCMP_MFMN, pcmp_mfmn
		);
	}
	
	public List findByPcmp_mfsh(Object pcmp_mfsh
	) {
		return findByProperty(PCMP_MFSH, pcmp_mfsh
		);
	}
	
	public List findByAcmp_mfwk(Object acmp_mfwk
	) {
		return findByProperty(ACMP_MFWK, acmp_mfwk
		);
	}
	
	public List findByAcmp_mfmn(Object acmp_mfmn
	) {
		return findByProperty(ACMP_MFMN, acmp_mfmn
		);
	}
	
	public List findByAcmp_mfsh(Object acmp_mfsh
	) {
		return findByProperty(ACMP_MFSH, acmp_mfsh
		);
	}
	
	public List findByEvt_cate(Object evt_cate
	) {
		return findByProperty(EVT_CATE, evt_cate
		);
	}
	
	public List findByEvt_user(Object evt_user
	) {
		return findByProperty(EVT_USER, evt_user
		);
	}
	
	public List findByEvt_mfwk(Object evt_mfwk
	) {
		return findByProperty(EVT_MFWK, evt_mfwk
		);
	}
	
	public List findByEvt_mfmn(Object evt_mfmn
	) {
		return findByProperty(EVT_MFMN, evt_mfmn
		);
	}
	
	public List findByEvt_mfsh(Object evt_mfsh
	) {
		return findByProperty(EVT_MFSH, evt_mfsh
		);
	}
	
	public List findByCr_mproc_id(Object cr_mproc_id
	) {
		return findByProperty(CR_MPROC_ID, cr_mproc_id
		);
	}
	
	public List findByCr_mproc_flg(Object cr_mproc_flg
	) {
		return findByProperty(CR_MPROC_FLG, cr_mproc_flg
		);
	}
	
	public List findByNx_mproc_id(Object nx_mproc_id
	) {
		return findByProperty(NX_MPROC_ID, nx_mproc_id
		);
	}
	
	public List findByNx_mproc_flg(Object nx_mproc_flg
	) {
		return findByProperty(NX_MPROC_FLG, nx_mproc_flg
		);
	}
	
	public List findByMproc_hld(Object mproc_hld
	) {
		return findByProperty(MPROC_HLD, mproc_hld
		);
	}
	
	public List findByPln_mproc_mfwk(Object pln_mproc_mfwk
	) {
		return findByProperty(PLN_MPROC_MFWK, pln_mproc_mfwk
		);
	}
	
	public List findByPln_mproc_mfmn(Object pln_mproc_mfmn
	) {
		return findByProperty(PLN_MPROC_MFMN, pln_mproc_mfmn
		);
	}
	
	public List findByPln_mproc_mfsh(Object pln_mproc_mfsh
	) {
		return findByProperty(PLN_MPROC_MFSH, pln_mproc_mfsh
		);
	}
	
	public List findByAct_mproc_mfwk(Object act_mproc_mfwk
	) {
		return findByProperty(ACT_MPROC_MFWK, act_mproc_mfwk
		);
	}
	
	public List findByAct_mproc_mfmn(Object act_mproc_mfmn
	) {
		return findByProperty(ACT_MPROC_MFMN, act_mproc_mfmn
		);
	}
	
	public List findByAct_mproc_mfsh(Object act_mproc_mfsh
	) {
		return findByProperty(ACT_MPROC_MFSH, act_mproc_mfsh
		);
	}
	
	public List findBySv_crr_id(Object sv_crr_id
	) {
		return findByProperty(SV_CRR_ID, sv_crr_id
		);
	}
	
	public List findBySv_slot_no(Object sv_slot_no
	) {
		return findByProperty(SV_SLOT_NO, sv_slot_no
		);
	}
	
	public List findBySv_route_id(Object sv_route_id
	) {
		return findByProperty(SV_ROUTE_ID, sv_route_id
		);
	}
	
	public List findBySv_route_ver(Object sv_route_ver
	) {
		return findByProperty(SV_ROUTE_VER, sv_route_ver
		);
	}
	
	public List findBySv_ope_no(Object sv_ope_no
	) {
		return findByProperty(SV_OPE_NO, sv_ope_no
		);
	}
	
	public List findBySv_eqptg_id(Object sv_eqptg_id
	) {
		return findByProperty(SV_EQPTG_ID, sv_eqptg_id
		);
	}
	
	public List findBySv_eqpt_id(Object sv_eqpt_id
	) {
		return findByProperty(SV_EQPT_ID, sv_eqpt_id
		);
	}
	
	public List findBySv_recipe_id(Object sv_recipe_id
	) {
		return findByProperty(SV_RECIPE_ID, sv_recipe_id
		);
	}
	
	public List findBySv_sht_stat(Object sv_sht_stat
	) {
		return findByProperty(SV_SHT_STAT, sv_sht_stat
		);
	}
	
	public List findByPv_crr_id(Object pv_crr_id
	) {
		return findByProperty(PV_CRR_ID, pv_crr_id
		);
	}
	
	public List findByPv_slot_no(Object pv_slot_no
	) {
		return findByProperty(PV_SLOT_NO, pv_slot_no
		);
	}
	
	public List findByClm_crr_id(Object clm_crr_id
	) {
		return findByProperty(CLM_CRR_ID, clm_crr_id
		);
	}
	
	public List findByClm_slot_no(Object clm_slot_no
	) {
		return findByProperty(CLM_SLOT_NO, clm_slot_no
		);
	}
	
	public List findByAbnd_flg(Object abnd_flg
	) {
		return findByProperty(ABND_FLG, abnd_flg
		);
	}
	
	public List findByDeldays(Object deldays
	) {
		return findByProperty(DELDAYS, deldays
		);
	}
	
	public List findBySht_note_flg(Object sht_note_flg
	) {
		return findByProperty(SHT_NOTE_FLG, sht_note_flg
		);
	}
	
	public List findByFab_id(Object fab_id
	) {
		return findByProperty(FAB_ID, fab_id
		);
	}
	
	public List findByLine_id(Object line_id
	) {
		return findByProperty(LINE_ID, line_id
		);
	}
	
	public List findByProduct_id(Object product_id
	) {
		return findByProperty(PRODUCT_ID, product_id
		);
	}
	
	public List findByEc_code(Object ec_code
	) {
		return findByProperty(EC_CODE, ec_code
		);
	}
	
	public List findByCharge_code(Object charge_code
	) {
		return findByProperty(CHARGE_CODE, charge_code
		);
	}
	
	public List findByOwner_id(Object owner_id
	) {
		return findByProperty(OWNER_ID, owner_id
		);
	}
	
	public List findByPrty(Object prty
	) {
		return findByProperty(PRTY, prty
		);
	}
	
	public List findByMtrl_product_id(Object mtrl_product_id
	) {
		return findByProperty(MTRL_PRODUCT_ID, mtrl_product_id
		);
	}
	
	public List findByOrder_id(Object order_id
	) {
		return findByProperty(ORDER_ID, order_id
		);
	}
	
	public List findBySales_order(Object sales_order
	) {
		return findByProperty(SALES_ORDER, sales_order
		);
	}
	
	public List findByProject_cd(Object project_cd
	) {
		return findByProperty(PROJECT_CD, project_cd
		);
	}
	
	public List findByEng_name(Object eng_name
	) {
		return findByProperty(ENG_NAME, eng_name
		);
	}
	
	public List findByExp_no(Object exp_no
	) {
		return findByProperty(EXP_NO, exp_no
		);
	}
	
	public List findByStb_lot_id(Object stb_lot_id
	) {
		return findByProperty(STB_LOT_ID, stb_lot_id
		);
	}
	
	public List findByDs_recipe_id(Object ds_recipe_id
	) {
		return findByProperty(DS_RECIPE_ID, ds_recipe_id
		);
	}
	
	public List findByAc_recipe_id(Object ac_recipe_id
	) {
		return findByProperty(AC_RECIPE_ID, ac_recipe_id
		);
	}
	
	public List findByProduct_cate(Object product_cate
	) {
		return findByProperty(PRODUCT_CATE, product_cate
		);
	}
	
	public List findByMrg_hld_route_id(Object mrg_hld_route_id
	) {
		return findByProperty(MRG_HLD_ROUTE_ID, mrg_hld_route_id
		);
	}
	
	public List findByMrg_hld_route_ver(Object mrg_hld_route_ver
	) {
		return findByProperty(MRG_HLD_ROUTE_VER, mrg_hld_route_ver
		);
	}
	
	public List findByMrg_hld_ope_no(Object mrg_hld_ope_no
	) {
		return findByProperty(MRG_HLD_OPE_NO, mrg_hld_ope_no
		);
	}
	
	public List findByPrt_splt_id(Object prt_splt_id
	) {
		return findByProperty(PRT_SPLT_ID, prt_splt_id
		);
	}
	
	public List findBySplt_id(Object splt_id
	) {
		return findByProperty(SPLT_ID, splt_id
		);
	}
	
	public List findByCe_id(Object ce_id
	) {
		return findByProperty(CE_ID, ce_id
		);
	}
	
	public List findByEen_id(Object een_id
	) {
		return findByProperty(EEN_ID, een_id
		);
	}
	
	public List findByStage_id(Object stage_id
	) {
		return findByProperty(STAGE_ID, stage_id
		);
	}
	
	public List findBySv_reproc_flg(Object sv_reproc_flg
	) {
		return findByProperty(SV_REPROC_FLG, sv_reproc_flg
		);
	}
	
	public List findByPtt_grade(Object ptt_grade
	) {
		return findByProperty(PTT_GRADE, ptt_grade
		);
	}
	
	public List findByPtt_type(Object ptt_type
	) {
		return findByProperty(PTT_TYPE, ptt_type
		);
	}
	
	public List findBySht_recipe_id(Object sht_recipe_id
	) {
		return findByProperty(SHT_RECIPE_ID, sht_recipe_id
		);
	}
	
	public List findBySv_sht_recipe_id(Object sv_sht_recipe_id
	) {
		return findByProperty(SV_SHT_RECIPE_ID, sv_sht_recipe_id
		);
	}
	
	public List findByDest_shop(Object dest_shop
	) {
		return findByProperty(DEST_SHOP, dest_shop
		);
	}
	
	public List findByDmy_sht_id(Object dmy_sht_id
	) {
		return findByProperty(DMY_SHT_ID, dmy_sht_id
		);
	}
	
	public List findByDmy_product_id(Object dmy_product_id
	) {
		return findByProperty(DMY_PRODUCT_ID, dmy_product_id
		);
	}
	
	public List findByDmy_ec_code(Object dmy_ec_code
	) {
		return findByProperty(DMY_EC_CODE, dmy_ec_code
		);
	}
	
	public List findByMtrl_grade(Object mtrl_grade
	) {
		return findByProperty(MTRL_GRADE, mtrl_grade
		);
	}
	
	public List findBySht_pln_id(Object sht_pln_id
	) {
		return findByProperty(SHT_PLN_ID, sht_pln_id
		);
	}
	
	public List findByBm_pattern(Object bm_pattern
	) {
		return findByProperty(BM_PATTERN, bm_pattern
		);
	}
	
	public List findByForce_insp_flg(Object force_insp_flg
	) {
		return findByProperty(FORCE_INSP_FLG, force_insp_flg
		);
	}
	
	public List findBySht_judge(Object sht_judge
	) {
		return findByProperty(SHT_JUDGE, sht_judge
		);
	}
	
	public List findByRecyc_cnt(Object recyc_cnt
	) {
		return findByProperty(RECYC_CNT, recyc_cnt
		);
	}
	
	public List findByInsp_result(Object insp_result
	) {
		return findByProperty(INSP_RESULT, insp_result
		);
	}
	
	public List findByInsp_judge(Object insp_judge
	) {
		return findByProperty(INSP_JUDGE, insp_judge
		);
	}
	
	public List findByStb_shop(Object stb_shop
	) {
		return findByProperty(STB_SHOP, stb_shop
		);
	}
	
	public List findByAbnormal_flg_1(Object abnormal_flg_1
	) {
		return findByProperty(ABNORMAL_FLG_1, abnormal_flg_1
		);
	}
	
	public List findByBc_suspect_rsn(Object bc_suspect_rsn
	) {
		return findByProperty(BC_SUSPECT_RSN, bc_suspect_rsn
		);
	}
	
	public List findByBc_suspect_ope_id(Object bc_suspect_ope_id
	) {
		return findByProperty(BC_SUSPECT_OPE_ID, bc_suspect_ope_id
		);
	}
	
	public List findBySht_ftsmp_flg(Object sht_ftsmp_flg
	) {
		return findByProperty(SHT_FTSMP_FLG, sht_ftsmp_flg
		);
	}
	
	public List findByOrg_lot_id(Object org_lot_id
	) {
		return findByProperty(ORG_LOT_ID, org_lot_id
		);
	}
	
	public List findByOrg_prt_splt_id(Object org_prt_splt_id
	) {
		return findByProperty(ORG_PRT_SPLT_ID, org_prt_splt_id
		);
	}
	
	public List findByOrg_splt_id(Object org_splt_id
	) {
		return findByProperty(ORG_SPLT_ID, org_splt_id
		);
	}
	
	public List findByPv_proc_id(Object pv_proc_id
	) {
		return findByProperty(PV_PROC_ID, pv_proc_id
		);
	}
	
	public List findByPv_eqpt_id(Object pv_eqpt_id
	) {
		return findByProperty(PV_EQPT_ID, pv_eqpt_id
		);
	}
	
	public List findByPv_pep_lvl(Object pv_pep_lvl
	) {
		return findByProperty(PV_PEP_LVL, pv_pep_lvl
		);
	}
	
	public List findByTemplate_id(Object template_id
	) {
		return findByProperty(TEMPLATE_ID, template_id
		);
	}
	
	public List findBySrt_setting_no(Object srt_setting_no
	) {
		return findByProperty(SRT_SETTING_NO, srt_setting_no
		);
	}
	
	public List findBySht_pln_batch_id(Object sht_pln_batch_id
	) {
		return findByProperty(SHT_PLN_BATCH_ID, sht_pln_batch_id
		);
	}
	
	public List findByLg_scrp_flg(Object lg_scrp_flg
	) {
		return findByProperty(LG_SCRP_FLG, lg_scrp_flg
		);
	}
	
	public List findByStb_sampling_flg(Object stb_sampling_flg
	) {
		return findByProperty(STB_SAMPLING_FLG, stb_sampling_flg
		);
	}
	
	public List findByNg_mark(Object ng_mark
	) {
		return findByProperty(NG_MARK, ng_mark
		);
	}
	
	public List findBySht_id_bc(Object sht_id_bc
	) {
		return findByProperty(SHT_ID_BC, sht_id_bc
		);
	}
	
	public List findByRevw_sht_judge(Object revw_sht_judge
	) {
		return findByProperty(REVW_SHT_JUDGE, revw_sht_judge
		);
	}
	
	public List findBySrt_grade_grp(Object srt_grade_grp
	) {
		return findByProperty(SRT_GRADE_GRP, srt_grade_grp
		);
	}
	
	public List findBySrt_rule_id(Object srt_rule_id
	) {
		return findByProperty(SRT_RULE_ID, srt_rule_id
		);
	}
	
	public List findBySrc_shop(Object src_shop
	) {
		return findByProperty(SRC_SHOP, src_shop
		);
	}
	
	public List findBySale_flg(Object sale_flg
	) {
		return findByProperty(SALE_FLG, sale_flg
		);
	}
	
	public List findByRgb_layer_hight(Object rgb_layer_hight
	) {
		return findByProperty(RGB_LAYER_HIGHT, rgb_layer_hight
		);
	}
	
	public List findByPfcd(Object pfcd
	) {
		return findByProperty(PFCD, pfcd
		);
	}
	
	public List findByPnlmode(Object pnlmode
	) {
		return findByProperty(PNLMODE, pnlmode
		);
	}
	
	public List findByPr_flg(Object pr_flg
	) {
		return findByProperty(PR_FLG, pr_flg
		);
	}
	
	public List findByRcvy_id(Object rcvy_id
	) {
		return findByProperty(RCVY_ID, rcvy_id
		);
	}
	
	public List findByRcvy_eqpt_id(Object rcvy_eqpt_id
	) {
		return findByProperty(RCVY_EQPT_ID, rcvy_eqpt_id
		);
	}
	
	public List findByRcvy_seq_no(Object rcvy_seq_no
	) {
		return findByProperty(RCVY_SEQ_NO, rcvy_seq_no
		);
	}
	
	public List findByRcvy_template_id(Object rcvy_template_id
	) {
		return findByProperty(RCVY_TEMPLATE_ID, rcvy_template_id
		);
	}
	
	public List findByRcvy_act_seq_no(Object rcvy_act_seq_no
	) {
		return findByProperty(RCVY_ACT_SEQ_NO, rcvy_act_seq_no
		);
	}
	
	public List findByMix_owner(Object mix_owner
	) {
		return findByProperty(MIX_OWNER, mix_owner
		);
	}
	
	public List findByTeg_flg(Object teg_flg
	) {
		return findByProperty(TEG_FLG, teg_flg
		);
	}
	
	public List findBySub_sht_stat(Object sub_sht_stat
	) {
		return findByProperty(SUB_SHT_STAT, sub_sht_stat
		);
	}
	
	public List findByPv_logof_dept(Object pv_logof_dept
	) {
		return findByProperty(PV_LOGOF_DEPT, pv_logof_dept
		);
	}
	
	public List findByLogon_dept(Object logon_dept
	) {
		return findByProperty(LOGON_DEPT, logon_dept
		);
	}
	
	public List findByLogof_dept(Object logof_dept
	) {
		return findByProperty(LOGOF_DEPT, logof_dept
		);
	}
	
	public List findByEvt_dept(Object evt_dept
	) {
		return findByProperty(EVT_DEPT, evt_dept
		);
	}
	
	public List findByMax_qrs_avl_flg(Object max_qrs_avl_flg
	) {
		return findByProperty(MAX_QRS_AVL_FLG, max_qrs_avl_flg
		);
	}
	
	public List findByMax_qrs_route_id(Object max_qrs_route_id
	) {
		return findByProperty(MAX_QRS_ROUTE_ID, max_qrs_route_id
		);
	}
	
	public List findByMax_qrs_route_ver(Object max_qrs_route_ver
	) {
		return findByProperty(MAX_QRS_ROUTE_VER, max_qrs_route_ver
		);
	}
	
	public List findByMax_qrs_ope_id(Object max_qrs_ope_id
	) {
		return findByProperty(MAX_QRS_OPE_ID, max_qrs_ope_id
		);
	}
	
	public List findByMin_qrs_avl_flg(Object min_qrs_avl_flg
	) {
		return findByProperty(MIN_QRS_AVL_FLG, min_qrs_avl_flg
		);
	}
	
	public List findByMin_qrs_route_id(Object min_qrs_route_id
	) {
		return findByProperty(MIN_QRS_ROUTE_ID, min_qrs_route_id
		);
	}
	
	public List findByMin_qrs_route_ver(Object min_qrs_route_ver
	) {
		return findByProperty(MIN_QRS_ROUTE_VER, min_qrs_route_ver
		);
	}
	
	public List findByMin_qrs_ope_id(Object min_qrs_ope_id
	) {
		return findByProperty(MIN_QRS_OPE_ID, min_qrs_ope_id
		);
	}
	
	public List findByMax_qrk_avl_flg(Object max_qrk_avl_flg
	) {
		return findByProperty(MAX_QRK_AVL_FLG, max_qrk_avl_flg
		);
	}
	
	public List findByMax_qrk_route_id(Object max_qrk_route_id
	) {
		return findByProperty(MAX_QRK_ROUTE_ID, max_qrk_route_id
		);
	}
	
	public List findByMax_qrk_route_ver(Object max_qrk_route_ver
	) {
		return findByProperty(MAX_QRK_ROUTE_VER, max_qrk_route_ver
		);
	}
	
	public List findByMax_qrk_ope_id(Object max_qrk_ope_id
	) {
		return findByProperty(MAX_QRK_OPE_ID, max_qrk_ope_id
		);
	}
	
	public List findByBnk_flg(Object bnk_flg
	) {
		return findByProperty(BNK_FLG, bnk_flg
		);
	}
	
	public List findByRsn_dept_1(Object rsn_dept_1
	) {
		return findByProperty(RSN_DEPT_1, rsn_dept_1
		);
	}
	
	public List findByRsn_cate_1(Object rsn_cate_1
	) {
		return findByProperty(RSN_CATE_1, rsn_cate_1
		);
	}
	
	public List findByRsn_code_1(Object rsn_code_1
	) {
		return findByProperty(RSN_CODE_1, rsn_code_1
		);
	}
	
	public List findByRsn_dept_2(Object rsn_dept_2
	) {
		return findByProperty(RSN_DEPT_2, rsn_dept_2
		);
	}
	
	public List findByRsn_cate_2(Object rsn_cate_2
	) {
		return findByProperty(RSN_CATE_2, rsn_cate_2
		);
	}
	
	public List findByRsn_code_2(Object rsn_code_2
	) {
		return findByProperty(RSN_CODE_2, rsn_code_2
		);
	}
	
	public List findByRsn_dept_3(Object rsn_dept_3
	) {
		return findByProperty(RSN_DEPT_3, rsn_dept_3
		);
	}
	
	public List findByRsn_cate_3(Object rsn_cate_3
	) {
		return findByProperty(RSN_CATE_3, rsn_cate_3
		);
	}
	
	public List findByRsn_code_3(Object rsn_code_3
	) {
		return findByProperty(RSN_CODE_3, rsn_code_3
		);
	}
	
	public List findByRsn_dept_4(Object rsn_dept_4
	) {
		return findByProperty(RSN_DEPT_4, rsn_dept_4
		);
	}
	
	public List findByRsn_cate_4(Object rsn_cate_4
	) {
		return findByProperty(RSN_CATE_4, rsn_cate_4
		);
	}
	
	public List findByRsn_code_4(Object rsn_code_4
	) {
		return findByProperty(RSN_CODE_4, rsn_code_4
		);
	}
	
	public List findByRsn_dept_5(Object rsn_dept_5
	) {
		return findByProperty(RSN_DEPT_5, rsn_dept_5
		);
	}
	
	public List findByRsn_cate_5(Object rsn_cate_5
	) {
		return findByProperty(RSN_CATE_5, rsn_cate_5
		);
	}
	
	public List findByRsn_code_5(Object rsn_code_5
	) {
		return findByProperty(RSN_CODE_5, rsn_code_5
		);
	}
	
	public List findByPnl_grade(Object pnl_grade
	) {
		return findByProperty(PNL_GRADE, pnl_grade
		);
	}
	
	public List findBySv_pnl_grade(Object sv_pnl_grade
	) {
		return findByProperty(SV_PNL_GRADE, sv_pnl_grade
		);
	}
	
	public List findByMtrl_lot_id(Object mtrl_lot_id
	) {
		return findByProperty(MTRL_LOT_ID, mtrl_lot_id
		);
	}
	
	public List findByPnl_judge(Object pnl_judge
	) {
		return findByProperty(PNL_JUDGE, pnl_judge
		);
	}
	
	public List findBySv_pnl_judge(Object sv_pnl_judge
	) {
		return findByProperty(SV_PNL_JUDGE, sv_pnl_judge
		);
	}
	
	public List findBySht_ope_msg(Object sht_ope_msg
	) {
		return findByProperty(SHT_OPE_MSG, sht_ope_msg
		);
	}
	
	public List findBySlot_flg(Object slot_flg
	) {
		return findByProperty(SLOT_FLG, slot_flg
		);
	}
	
	public List findByDel_time(Object del_time
	) {
		return findByProperty(DEL_TIME, del_time
		);
	}
	
	public List findByMetal_flg(Object metal_flg
	) {
		return findByProperty(METAL_FLG, metal_flg
		);
	}
	
	public List findByCr_setting_no(Object cr_setting_no
	) {
		return findByProperty(CR_SETTING_NO, cr_setting_no
		);
	}
	
	public List findByNx_setting_no(Object nx_setting_no
	) {
		return findByProperty(NX_SETTING_NO, nx_setting_no
		);
	}
	
	public List findByAc_recipe_ver(Object ac_recipe_ver
	) {
		return findByProperty(AC_RECIPE_VER, ac_recipe_ver
		);
	}
	
	public List findByPc_worder_id(Object pc_worder_id
	) {
		return findByProperty(PC_WORDER_ID, pc_worder_id
		);
	}
	
	public List findBySmp_prty(Object smp_prty
	) {
		return findByProperty(SMP_PRTY, smp_prty
		);
	}
	

	public List findAll() {
		log.debug("finding all Asheet instances");
		try {
			String queryString = "from Asheet";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Asheet merge(Asheet detachedInstance) {
        log.debug("merging Asheet instance");
        try {
            Asheet result = (Asheet) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Asheet instance) {
        log.debug("attaching dirty Asheet instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Asheet instance) {
        log.debug("attaching clean Asheet instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}