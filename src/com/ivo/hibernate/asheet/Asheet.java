package com.ivo.hibernate.asheet;

import java.sql.Timestamp;
import java.util.Date;


/**
 * Asheet entity. @author MyEclipse Persistence Tools
 */

public class Asheet  implements java.io.Serializable {


    // Fields    

     private String sht_id;
     private Timestamp timestamp;
     private String event_node;
     private String event_name;
     private String event_user;
     private Integer event_no;
     private String table_name;
     private String operation;
     private String sgr_id;
     private String lot_id;
     private String crr_id;
     private String slot_no;
     private String m_group_id;
     private String group_id;
     private String ppbox_id;
     private String sht_stat;
     private Integer pnl_cnt;
     private Integer x_axis_cnt;
     private Integer y_axis_cnt;
     private Integer pnl_sht_cnt;
     private String reproc_flg;
     private String eqpt_id;
     private String eqpt_port_id;
     private String cr_route_id;
     private String cr_route_ver;
     private String cr_ope_no;
     private String cr_ope_id;
     private String cr_ope_ver;
     private String cr_proc_id;
     private String cr_eqptg_id;
     private String cr_eqpt_id;
     private String cr_pep_lvl;
     private String cr_recipe_id;
     private String nx_route_id;
     private String nx_route_ver;
     private String nx_ope_no;
     private String nx_ope_id;
     private String nx_ope_ver;
     private String nx_proc_id;
     private String nx_eqptg_id;
     private String nx_eqpt_id;
     private String nx_pep_lvl;
     private String nx_dept_code;
     private String nx_recipe_id;
     private String pv_logof_user;
     private Timestamp pv_logof_timestamp;
     private Date pv_logof_mfdt;
     private String pv_logof_mfwk;
     private String pv_logof_mfmn;
     private Integer pv_logof_mfsh;
     private String logon_user;
     private String logon_crr_id;
     private String logon_slot_no;
     private Timestamp logon_timestamp;
     private Date logon_mfdt;
     private String logon_mfwk;
     private String logon_mfmn;
     private Integer logon_mfsh;
     private String logof_user;
     private Timestamp logof_timestamp;
     private Date logof_mfdt;
     private String logof_mfwk;
     private String logof_mfmn;
     private Integer logof_mfsh;
     private Timestamp pv_pln_cmp_timestamp;
     private Date pv_pln_cmp_mfdt;
     private String pv_pln_cmp_mfwk;
     private String pv_pln_cmp_mfmn;
     private Integer pv_pln_cmp_mfsh;
     private Timestamp pln_cmp_timestamp;
     private Date pln_cmp_mfdt;
     private String pln_cmp_mfwk;
     private String pln_cmp_mfmn;
     private Integer pln_cmp_mfsh;
     private Timestamp pcmp_timestamp;
     private Date pcmp_mfdt;
     private String pcmp_mfwk;
     private String pcmp_mfmn;
     private Integer pcmp_mfsh;
     private Timestamp acmp_timestamp;
     private Date acmp_mfdt;
     private String acmp_mfwk;
     private String acmp_mfmn;
     private Integer acmp_mfsh;
     private String evt_cate;
     private String evt_user;
     private Timestamp evt_timestamp;
     private Date evt_mfdt;
     private String evt_mfwk;
     private String evt_mfmn;
     private Integer evt_mfsh;
     private String cr_mproc_id;
     private String cr_mproc_flg;
     private String nx_mproc_id;
     private String nx_mproc_flg;
     private Integer mproc_hld;
     private Timestamp pln_mproc_timestamp;
     private Date pln_mproc_mfdt;
     private String pln_mproc_mfwk;
     private String pln_mproc_mfmn;
     private Integer pln_mproc_mfsh;
     private Timestamp act_mproc_timestamp;
     private Date act_mproc_mfdt;
     private String act_mproc_mfwk;
     private String act_mproc_mfmn;
     private Integer act_mproc_mfsh;
     private String sv_crr_id;
     private String sv_slot_no;
     private String sv_route_id;
     private String sv_route_ver;
     private String sv_ope_no;
     private String sv_eqptg_id;
     private String sv_eqpt_id;
     private String sv_recipe_id;
     private String sv_sht_stat;
     private String pv_crr_id;
     private String pv_slot_no;
     private String clm_crr_id;
     private String clm_slot_no;
     private String abnd_flg;
     private String deldays;
     private String sht_note_flg;
     private Timestamp cel_stb_timestamp;
     private String fab_id;
     private String line_id;
     private String product_id;
     private String ec_code;
     private String charge_code;
     private String owner_id;
     private String prty;
     private String mtrl_product_id;
     private String order_id;
     private String sales_order;
     private String project_cd;
     private String eng_name;
     private String exp_no;
     private String stb_lot_id;
     private String ds_recipe_id;
     private String ac_recipe_id;
     private String product_cate;
     private String mrg_hld_route_id;
     private String mrg_hld_route_ver;
     private String mrg_hld_ope_no;
     private Timestamp act_stb_timestamp;
     private String prt_splt_id;
     private String splt_id;
     private String ce_id;
     private String een_id;
     private String stage_id;
     private String sv_reproc_flg;
     private String ptt_grade;
     private String ptt_type;
     private String sht_recipe_id;
     private String sv_sht_recipe_id;
     private String dest_shop;
     private String dmy_sht_id;
     private String dmy_product_id;
     private String dmy_ec_code;
     private String mtrl_grade;
     private String sht_pln_id;
     private String bm_pattern;
     private String force_insp_flg;
     private String sht_judge;
     private Integer recyc_cnt;
     private String insp_result;
     private String insp_judge;
     private String stb_shop;
     private String abnormal_flg_1;
     private String bc_suspect_rsn;
     private String bc_suspect_ope_id;
     private String sht_ftsmp_flg;
     private String org_lot_id;
     private String org_prt_splt_id;
     private String org_splt_id;
     private String pv_proc_id;
     private String pv_eqpt_id;
     private String pv_pep_lvl;
     private Date cmp_due_date;
     private String template_id;
     private Integer srt_setting_no;
     private String sht_pln_batch_id;
     private String lg_scrp_flg;
     private String stb_sampling_flg;
     private String ng_mark;
     private String sht_id_bc;
     private String revw_sht_judge;
     private String srt_grade_grp;
     private String srt_rule_id;
     private String src_shop;
     private String sale_flg;
     private String rgb_layer_hight;
     private String pfcd;
     private String pnlmode;
     private String pr_flg;
     private String rcvy_id;
     private String rcvy_eqpt_id;
     private String rcvy_seq_no;
     private String rcvy_template_id;
     private String rcvy_act_seq_no;
     private String mix_owner;
     private String teg_flg;
     private String sub_sht_stat;
     private String pv_logof_dept;
     private String logon_dept;
     private String logof_dept;
     private String evt_dept;
     private String max_qrs_avl_flg;
     private String max_qrs_route_id;
     private String max_qrs_route_ver;
     private String max_qrs_ope_id;
     private Timestamp max_qrs_timestamp;
     private String min_qrs_avl_flg;
     private String min_qrs_route_id;
     private String min_qrs_route_ver;
     private String min_qrs_ope_id;
     private Timestamp min_qrs_timestamp;
     private String max_qrk_avl_flg;
     private String max_qrk_route_id;
     private String max_qrk_route_ver;
     private String max_qrk_ope_id;
     private Timestamp max_qrk_timestamp;
     private String bnk_flg;
     private String rsn_dept_1;
     private String rsn_cate_1;
     private String rsn_code_1;
     private String rsn_dept_2;
     private String rsn_cate_2;
     private String rsn_code_2;
     private String rsn_dept_3;
     private String rsn_cate_3;
     private String rsn_code_3;
     private String rsn_dept_4;
     private String rsn_cate_4;
     private String rsn_code_4;
     private String rsn_dept_5;
     private String rsn_cate_5;
     private String rsn_code_5;
     private String pnl_grade;
     private String sv_pnl_grade;
     private String mtrl_lot_id;
     private String pnl_judge;
     private String sv_pnl_judge;
     private String sht_ope_msg;
     private String slot_flg;
     private Integer del_time;
     private String metal_flg;
     private String cr_setting_no;
     private String nx_setting_no;
     private String ac_recipe_ver;
     private String pc_worder_id;
     private String smp_prty;
     private Timestamp cur_timestamp;


    // Constructors

    /** default constructor */
    public Asheet() {
    }

	/** minimal constructor */
    public Asheet(String sht_id) {
        this.sht_id = sht_id;
    }
    
    /** full constructor */
    public Asheet(String sht_id, Timestamp timestamp, String event_node, String event_name, String event_user, Integer event_no, String table_name, String operation, String sgr_id, String lot_id, String crr_id, String slot_no, String m_group_id, String group_id, String ppbox_id, String sht_stat, Integer pnl_cnt, Integer x_axis_cnt, Integer y_axis_cnt, Integer pnl_sht_cnt, String reproc_flg, String eqpt_id, String eqpt_port_id, String cr_route_id, String cr_route_ver, String cr_ope_no, String cr_ope_id, String cr_ope_ver, String cr_proc_id, String cr_eqptg_id, String cr_eqpt_id, String cr_pep_lvl, String cr_recipe_id, String nx_route_id, String nx_route_ver, String nx_ope_no, String nx_ope_id, String nx_ope_ver, String nx_proc_id, String nx_eqptg_id, String nx_eqpt_id, String nx_pep_lvl, String nx_dept_code, String nx_recipe_id, String pv_logof_user, Timestamp pv_logof_timestamp, Date pv_logof_mfdt, String pv_logof_mfwk, String pv_logof_mfmn, Integer pv_logof_mfsh, String logon_user, String logon_crr_id, String logon_slot_no, Timestamp logon_timestamp, Date logon_mfdt, String logon_mfwk, String logon_mfmn, Integer logon_mfsh, String logof_user, Timestamp logof_timestamp, Date logof_mfdt, String logof_mfwk, String logof_mfmn, Integer logof_mfsh, Timestamp pv_pln_cmp_timestamp, Date pv_pln_cmp_mfdt, String pv_pln_cmp_mfwk, String pv_pln_cmp_mfmn, Integer pv_pln_cmp_mfsh, Timestamp pln_cmp_timestamp, Date pln_cmp_mfdt, String pln_cmp_mfwk, String pln_cmp_mfmn, Integer pln_cmp_mfsh, Timestamp pcmp_timestamp, Date pcmp_mfdt, String pcmp_mfwk, String pcmp_mfmn, Integer pcmp_mfsh, Timestamp acmp_timestamp, Date acmp_mfdt, String acmp_mfwk, String acmp_mfmn, Integer acmp_mfsh, String evt_cate, String evt_user, Timestamp evt_timestamp, Date evt_mfdt, String evt_mfwk, String evt_mfmn, Integer evt_mfsh, String cr_mproc_id, String cr_mproc_flg, String nx_mproc_id, String nx_mproc_flg, Integer mproc_hld, Timestamp pln_mproc_timestamp, Date pln_mproc_mfdt, String pln_mproc_mfwk, String pln_mproc_mfmn, Integer pln_mproc_mfsh, Timestamp act_mproc_timestamp, Date act_mproc_mfdt, String act_mproc_mfwk, String act_mproc_mfmn, Integer act_mproc_mfsh, String sv_crr_id, String sv_slot_no, String sv_route_id, String sv_route_ver, String sv_ope_no, String sv_eqptg_id, String sv_eqpt_id, String sv_recipe_id, String sv_sht_stat, String pv_crr_id, String pv_slot_no, String clm_crr_id, String clm_slot_no, String abnd_flg, String deldays, String sht_note_flg, Timestamp cel_stb_timestamp, String fab_id, String line_id, String product_id, String ec_code, String charge_code, String owner_id, String prty, String mtrl_product_id, String order_id, String sales_order, String project_cd, String eng_name, String exp_no, String stb_lot_id, String ds_recipe_id, String ac_recipe_id, String product_cate, String mrg_hld_route_id, String mrg_hld_route_ver, String mrg_hld_ope_no, Timestamp act_stb_timestamp, String prt_splt_id, String splt_id, String ce_id, String een_id, String stage_id, String sv_reproc_flg, String ptt_grade, String ptt_type, String sht_recipe_id, String sv_sht_recipe_id, String dest_shop, String dmy_sht_id, String dmy_product_id, String dmy_ec_code, String mtrl_grade, String sht_pln_id, String bm_pattern, String force_insp_flg, String sht_judge, Integer recyc_cnt, String insp_result, String insp_judge, String stb_shop, String abnormal_flg_1, String bc_suspect_rsn, String bc_suspect_ope_id, String sht_ftsmp_flg, String org_lot_id, String org_prt_splt_id, String org_splt_id, String pv_proc_id, String pv_eqpt_id, String pv_pep_lvl, Date cmp_due_date, String template_id, Integer srt_setting_no, String sht_pln_batch_id, String lg_scrp_flg, String stb_sampling_flg, String ng_mark, String sht_id_bc, String revw_sht_judge, String srt_grade_grp, String srt_rule_id, String src_shop, String sale_flg, String rgb_layer_hight, String pfcd, String pnlmode, String pr_flg, String rcvy_id, String rcvy_eqpt_id, String rcvy_seq_no, String rcvy_template_id, String rcvy_act_seq_no, String mix_owner, String teg_flg, String sub_sht_stat, String pv_logof_dept, String logon_dept, String logof_dept, String evt_dept, String max_qrs_avl_flg, String max_qrs_route_id, String max_qrs_route_ver, String max_qrs_ope_id, Timestamp max_qrs_timestamp, String min_qrs_avl_flg, String min_qrs_route_id, String min_qrs_route_ver, String min_qrs_ope_id, Timestamp min_qrs_timestamp, String max_qrk_avl_flg, String max_qrk_route_id, String max_qrk_route_ver, String max_qrk_ope_id, Timestamp max_qrk_timestamp, String bnk_flg, String rsn_dept_1, String rsn_cate_1, String rsn_code_1, String rsn_dept_2, String rsn_cate_2, String rsn_code_2, String rsn_dept_3, String rsn_cate_3, String rsn_code_3, String rsn_dept_4, String rsn_cate_4, String rsn_code_4, String rsn_dept_5, String rsn_cate_5, String rsn_code_5, String pnl_grade, String sv_pnl_grade, String mtrl_lot_id, String pnl_judge, String sv_pnl_judge, String sht_ope_msg, String slot_flg, Integer del_time, String metal_flg, String cr_setting_no, String nx_setting_no, String ac_recipe_ver, String pc_worder_id, String smp_prty, Timestamp cur_timestamp) {
        this.sht_id = sht_id;
        this.timestamp = timestamp;
        this.event_node = event_node;
        this.event_name = event_name;
        this.event_user = event_user;
        this.event_no = event_no;
        this.table_name = table_name;
        this.operation = operation;
        this.sgr_id = sgr_id;
        this.lot_id = lot_id;
        this.crr_id = crr_id;
        this.slot_no = slot_no;
        this.m_group_id = m_group_id;
        this.group_id = group_id;
        this.ppbox_id = ppbox_id;
        this.sht_stat = sht_stat;
        this.pnl_cnt = pnl_cnt;
        this.x_axis_cnt = x_axis_cnt;
        this.y_axis_cnt = y_axis_cnt;
        this.pnl_sht_cnt = pnl_sht_cnt;
        this.reproc_flg = reproc_flg;
        this.eqpt_id = eqpt_id;
        this.eqpt_port_id = eqpt_port_id;
        this.cr_route_id = cr_route_id;
        this.cr_route_ver = cr_route_ver;
        this.cr_ope_no = cr_ope_no;
        this.cr_ope_id = cr_ope_id;
        this.cr_ope_ver = cr_ope_ver;
        this.cr_proc_id = cr_proc_id;
        this.cr_eqptg_id = cr_eqptg_id;
        this.cr_eqpt_id = cr_eqpt_id;
        this.cr_pep_lvl = cr_pep_lvl;
        this.cr_recipe_id = cr_recipe_id;
        this.nx_route_id = nx_route_id;
        this.nx_route_ver = nx_route_ver;
        this.nx_ope_no = nx_ope_no;
        this.nx_ope_id = nx_ope_id;
        this.nx_ope_ver = nx_ope_ver;
        this.nx_proc_id = nx_proc_id;
        this.nx_eqptg_id = nx_eqptg_id;
        this.nx_eqpt_id = nx_eqpt_id;
        this.nx_pep_lvl = nx_pep_lvl;
        this.nx_dept_code = nx_dept_code;
        this.nx_recipe_id = nx_recipe_id;
        this.pv_logof_user = pv_logof_user;
        this.pv_logof_timestamp = pv_logof_timestamp;
        this.pv_logof_mfdt = pv_logof_mfdt;
        this.pv_logof_mfwk = pv_logof_mfwk;
        this.pv_logof_mfmn = pv_logof_mfmn;
        this.pv_logof_mfsh = pv_logof_mfsh;
        this.logon_user = logon_user;
        this.logon_crr_id = logon_crr_id;
        this.logon_slot_no = logon_slot_no;
        this.logon_timestamp = logon_timestamp;
        this.logon_mfdt = logon_mfdt;
        this.logon_mfwk = logon_mfwk;
        this.logon_mfmn = logon_mfmn;
        this.logon_mfsh = logon_mfsh;
        this.logof_user = logof_user;
        this.logof_timestamp = logof_timestamp;
        this.logof_mfdt = logof_mfdt;
        this.logof_mfwk = logof_mfwk;
        this.logof_mfmn = logof_mfmn;
        this.logof_mfsh = logof_mfsh;
        this.pv_pln_cmp_timestamp = pv_pln_cmp_timestamp;
        this.pv_pln_cmp_mfdt = pv_pln_cmp_mfdt;
        this.pv_pln_cmp_mfwk = pv_pln_cmp_mfwk;
        this.pv_pln_cmp_mfmn = pv_pln_cmp_mfmn;
        this.pv_pln_cmp_mfsh = pv_pln_cmp_mfsh;
        this.pln_cmp_timestamp = pln_cmp_timestamp;
        this.pln_cmp_mfdt = pln_cmp_mfdt;
        this.pln_cmp_mfwk = pln_cmp_mfwk;
        this.pln_cmp_mfmn = pln_cmp_mfmn;
        this.pln_cmp_mfsh = pln_cmp_mfsh;
        this.pcmp_timestamp = pcmp_timestamp;
        this.pcmp_mfdt = pcmp_mfdt;
        this.pcmp_mfwk = pcmp_mfwk;
        this.pcmp_mfmn = pcmp_mfmn;
        this.pcmp_mfsh = pcmp_mfsh;
        this.acmp_timestamp = acmp_timestamp;
        this.acmp_mfdt = acmp_mfdt;
        this.acmp_mfwk = acmp_mfwk;
        this.acmp_mfmn = acmp_mfmn;
        this.acmp_mfsh = acmp_mfsh;
        this.evt_cate = evt_cate;
        this.evt_user = evt_user;
        this.evt_timestamp = evt_timestamp;
        this.evt_mfdt = evt_mfdt;
        this.evt_mfwk = evt_mfwk;
        this.evt_mfmn = evt_mfmn;
        this.evt_mfsh = evt_mfsh;
        this.cr_mproc_id = cr_mproc_id;
        this.cr_mproc_flg = cr_mproc_flg;
        this.nx_mproc_id = nx_mproc_id;
        this.nx_mproc_flg = nx_mproc_flg;
        this.mproc_hld = mproc_hld;
        this.pln_mproc_timestamp = pln_mproc_timestamp;
        this.pln_mproc_mfdt = pln_mproc_mfdt;
        this.pln_mproc_mfwk = pln_mproc_mfwk;
        this.pln_mproc_mfmn = pln_mproc_mfmn;
        this.pln_mproc_mfsh = pln_mproc_mfsh;
        this.act_mproc_timestamp = act_mproc_timestamp;
        this.act_mproc_mfdt = act_mproc_mfdt;
        this.act_mproc_mfwk = act_mproc_mfwk;
        this.act_mproc_mfmn = act_mproc_mfmn;
        this.act_mproc_mfsh = act_mproc_mfsh;
        this.sv_crr_id = sv_crr_id;
        this.sv_slot_no = sv_slot_no;
        this.sv_route_id = sv_route_id;
        this.sv_route_ver = sv_route_ver;
        this.sv_ope_no = sv_ope_no;
        this.sv_eqptg_id = sv_eqptg_id;
        this.sv_eqpt_id = sv_eqpt_id;
        this.sv_recipe_id = sv_recipe_id;
        this.sv_sht_stat = sv_sht_stat;
        this.pv_crr_id = pv_crr_id;
        this.pv_slot_no = pv_slot_no;
        this.clm_crr_id = clm_crr_id;
        this.clm_slot_no = clm_slot_no;
        this.abnd_flg = abnd_flg;
        this.deldays = deldays;
        this.sht_note_flg = sht_note_flg;
        this.cel_stb_timestamp = cel_stb_timestamp;
        this.fab_id = fab_id;
        this.line_id = line_id;
        this.product_id = product_id;
        this.ec_code = ec_code;
        this.charge_code = charge_code;
        this.owner_id = owner_id;
        this.prty = prty;
        this.mtrl_product_id = mtrl_product_id;
        this.order_id = order_id;
        this.sales_order = sales_order;
        this.project_cd = project_cd;
        this.eng_name = eng_name;
        this.exp_no = exp_no;
        this.stb_lot_id = stb_lot_id;
        this.ds_recipe_id = ds_recipe_id;
        this.ac_recipe_id = ac_recipe_id;
        this.product_cate = product_cate;
        this.mrg_hld_route_id = mrg_hld_route_id;
        this.mrg_hld_route_ver = mrg_hld_route_ver;
        this.mrg_hld_ope_no = mrg_hld_ope_no;
        this.act_stb_timestamp = act_stb_timestamp;
        this.prt_splt_id = prt_splt_id;
        this.splt_id = splt_id;
        this.ce_id = ce_id;
        this.een_id = een_id;
        this.stage_id = stage_id;
        this.sv_reproc_flg = sv_reproc_flg;
        this.ptt_grade = ptt_grade;
        this.ptt_type = ptt_type;
        this.sht_recipe_id = sht_recipe_id;
        this.sv_sht_recipe_id = sv_sht_recipe_id;
        this.dest_shop = dest_shop;
        this.dmy_sht_id = dmy_sht_id;
        this.dmy_product_id = dmy_product_id;
        this.dmy_ec_code = dmy_ec_code;
        this.mtrl_grade = mtrl_grade;
        this.sht_pln_id = sht_pln_id;
        this.bm_pattern = bm_pattern;
        this.force_insp_flg = force_insp_flg;
        this.sht_judge = sht_judge;
        this.recyc_cnt = recyc_cnt;
        this.insp_result = insp_result;
        this.insp_judge = insp_judge;
        this.stb_shop = stb_shop;
        this.abnormal_flg_1 = abnormal_flg_1;
        this.bc_suspect_rsn = bc_suspect_rsn;
        this.bc_suspect_ope_id = bc_suspect_ope_id;
        this.sht_ftsmp_flg = sht_ftsmp_flg;
        this.org_lot_id = org_lot_id;
        this.org_prt_splt_id = org_prt_splt_id;
        this.org_splt_id = org_splt_id;
        this.pv_proc_id = pv_proc_id;
        this.pv_eqpt_id = pv_eqpt_id;
        this.pv_pep_lvl = pv_pep_lvl;
        this.cmp_due_date = cmp_due_date;
        this.template_id = template_id;
        this.srt_setting_no = srt_setting_no;
        this.sht_pln_batch_id = sht_pln_batch_id;
        this.lg_scrp_flg = lg_scrp_flg;
        this.stb_sampling_flg = stb_sampling_flg;
        this.ng_mark = ng_mark;
        this.sht_id_bc = sht_id_bc;
        this.revw_sht_judge = revw_sht_judge;
        this.srt_grade_grp = srt_grade_grp;
        this.srt_rule_id = srt_rule_id;
        this.src_shop = src_shop;
        this.sale_flg = sale_flg;
        this.rgb_layer_hight = rgb_layer_hight;
        this.pfcd = pfcd;
        this.pnlmode = pnlmode;
        this.pr_flg = pr_flg;
        this.rcvy_id = rcvy_id;
        this.rcvy_eqpt_id = rcvy_eqpt_id;
        this.rcvy_seq_no = rcvy_seq_no;
        this.rcvy_template_id = rcvy_template_id;
        this.rcvy_act_seq_no = rcvy_act_seq_no;
        this.mix_owner = mix_owner;
        this.teg_flg = teg_flg;
        this.sub_sht_stat = sub_sht_stat;
        this.pv_logof_dept = pv_logof_dept;
        this.logon_dept = logon_dept;
        this.logof_dept = logof_dept;
        this.evt_dept = evt_dept;
        this.max_qrs_avl_flg = max_qrs_avl_flg;
        this.max_qrs_route_id = max_qrs_route_id;
        this.max_qrs_route_ver = max_qrs_route_ver;
        this.max_qrs_ope_id = max_qrs_ope_id;
        this.max_qrs_timestamp = max_qrs_timestamp;
        this.min_qrs_avl_flg = min_qrs_avl_flg;
        this.min_qrs_route_id = min_qrs_route_id;
        this.min_qrs_route_ver = min_qrs_route_ver;
        this.min_qrs_ope_id = min_qrs_ope_id;
        this.min_qrs_timestamp = min_qrs_timestamp;
        this.max_qrk_avl_flg = max_qrk_avl_flg;
        this.max_qrk_route_id = max_qrk_route_id;
        this.max_qrk_route_ver = max_qrk_route_ver;
        this.max_qrk_ope_id = max_qrk_ope_id;
        this.max_qrk_timestamp = max_qrk_timestamp;
        this.bnk_flg = bnk_flg;
        this.rsn_dept_1 = rsn_dept_1;
        this.rsn_cate_1 = rsn_cate_1;
        this.rsn_code_1 = rsn_code_1;
        this.rsn_dept_2 = rsn_dept_2;
        this.rsn_cate_2 = rsn_cate_2;
        this.rsn_code_2 = rsn_code_2;
        this.rsn_dept_3 = rsn_dept_3;
        this.rsn_cate_3 = rsn_cate_3;
        this.rsn_code_3 = rsn_code_3;
        this.rsn_dept_4 = rsn_dept_4;
        this.rsn_cate_4 = rsn_cate_4;
        this.rsn_code_4 = rsn_code_4;
        this.rsn_dept_5 = rsn_dept_5;
        this.rsn_cate_5 = rsn_cate_5;
        this.rsn_code_5 = rsn_code_5;
        this.pnl_grade = pnl_grade;
        this.sv_pnl_grade = sv_pnl_grade;
        this.mtrl_lot_id = mtrl_lot_id;
        this.pnl_judge = pnl_judge;
        this.sv_pnl_judge = sv_pnl_judge;
        this.sht_ope_msg = sht_ope_msg;
        this.slot_flg = slot_flg;
        this.del_time = del_time;
        this.metal_flg = metal_flg;
        this.cr_setting_no = cr_setting_no;
        this.nx_setting_no = nx_setting_no;
        this.ac_recipe_ver = ac_recipe_ver;
        this.pc_worder_id = pc_worder_id;
        this.smp_prty = smp_prty;
        this.cur_timestamp = cur_timestamp;
    }

   
    // Property accessors

    public String getSht_id() {
        return this.sht_id;
    }
    
    public void setSht_id(String sht_id) {
        this.sht_id = sht_id;
    }

    public Timestamp getTimestamp() {
        return this.timestamp;
    }
    
    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getEvent_node() {
        return this.event_node;
    }
    
    public void setEvent_node(String event_node) {
        this.event_node = event_node;
    }

    public String getEvent_name() {
        return this.event_name;
    }
    
    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getEvent_user() {
        return this.event_user;
    }
    
    public void setEvent_user(String event_user) {
        this.event_user = event_user;
    }

    public Integer getEvent_no() {
        return this.event_no;
    }
    
    public void setEvent_no(Integer event_no) {
        this.event_no = event_no;
    }

    public String getTable_name() {
        return this.table_name;
    }
    
    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public String getOperation() {
        return this.operation;
    }
    
    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getSgr_id() {
        return this.sgr_id;
    }
    
    public void setSgr_id(String sgr_id) {
        this.sgr_id = sgr_id;
    }

    public String getLot_id() {
        return this.lot_id;
    }
    
    public void setLot_id(String lot_id) {
        this.lot_id = lot_id;
    }

    public String getCrr_id() {
        return this.crr_id;
    }
    
    public void setCrr_id(String crr_id) {
        this.crr_id = crr_id;
    }

    public String getSlot_no() {
        return this.slot_no;
    }
    
    public void setSlot_no(String slot_no) {
        this.slot_no = slot_no;
    }

    public String getM_group_id() {
        return this.m_group_id;
    }
    
    public void setM_group_id(String m_group_id) {
        this.m_group_id = m_group_id;
    }

    public String getGroup_id() {
        return this.group_id;
    }
    
    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getPpbox_id() {
        return this.ppbox_id;
    }
    
    public void setPpbox_id(String ppbox_id) {
        this.ppbox_id = ppbox_id;
    }

    public String getSht_stat() {
        return this.sht_stat;
    }
    
    public void setSht_stat(String sht_stat) {
        this.sht_stat = sht_stat;
    }

    public Integer getPnl_cnt() {
        return this.pnl_cnt;
    }
    
    public void setPnl_cnt(Integer pnl_cnt) {
        this.pnl_cnt = pnl_cnt;
    }

    public Integer getX_axis_cnt() {
        return this.x_axis_cnt;
    }
    
    public void setX_axis_cnt(Integer x_axis_cnt) {
        this.x_axis_cnt = x_axis_cnt;
    }

    public Integer getY_axis_cnt() {
        return this.y_axis_cnt;
    }
    
    public void setY_axis_cnt(Integer y_axis_cnt) {
        this.y_axis_cnt = y_axis_cnt;
    }

    public Integer getPnl_sht_cnt() {
        return this.pnl_sht_cnt;
    }
    
    public void setPnl_sht_cnt(Integer pnl_sht_cnt) {
        this.pnl_sht_cnt = pnl_sht_cnt;
    }

    public String getReproc_flg() {
        return this.reproc_flg;
    }
    
    public void setReproc_flg(String reproc_flg) {
        this.reproc_flg = reproc_flg;
    }

    public String getEqpt_id() {
        return this.eqpt_id;
    }
    
    public void setEqpt_id(String eqpt_id) {
        this.eqpt_id = eqpt_id;
    }

    public String getEqpt_port_id() {
        return this.eqpt_port_id;
    }
    
    public void setEqpt_port_id(String eqpt_port_id) {
        this.eqpt_port_id = eqpt_port_id;
    }

    public String getCr_route_id() {
        return this.cr_route_id;
    }
    
    public void setCr_route_id(String cr_route_id) {
        this.cr_route_id = cr_route_id;
    }

    public String getCr_route_ver() {
        return this.cr_route_ver;
    }
    
    public void setCr_route_ver(String cr_route_ver) {
        this.cr_route_ver = cr_route_ver;
    }

    public String getCr_ope_no() {
        return this.cr_ope_no;
    }
    
    public void setCr_ope_no(String cr_ope_no) {
        this.cr_ope_no = cr_ope_no;
    }

    public String getCr_ope_id() {
        return this.cr_ope_id;
    }
    
    public void setCr_ope_id(String cr_ope_id) {
        this.cr_ope_id = cr_ope_id;
    }

    public String getCr_ope_ver() {
        return this.cr_ope_ver;
    }
    
    public void setCr_ope_ver(String cr_ope_ver) {
        this.cr_ope_ver = cr_ope_ver;
    }

    public String getCr_proc_id() {
        return this.cr_proc_id;
    }
    
    public void setCr_proc_id(String cr_proc_id) {
        this.cr_proc_id = cr_proc_id;
    }

    public String getCr_eqptg_id() {
        return this.cr_eqptg_id;
    }
    
    public void setCr_eqptg_id(String cr_eqptg_id) {
        this.cr_eqptg_id = cr_eqptg_id;
    }

    public String getCr_eqpt_id() {
        return this.cr_eqpt_id;
    }
    
    public void setCr_eqpt_id(String cr_eqpt_id) {
        this.cr_eqpt_id = cr_eqpt_id;
    }

    public String getCr_pep_lvl() {
        return this.cr_pep_lvl;
    }
    
    public void setCr_pep_lvl(String cr_pep_lvl) {
        this.cr_pep_lvl = cr_pep_lvl;
    }

    public String getCr_recipe_id() {
        return this.cr_recipe_id;
    }
    
    public void setCr_recipe_id(String cr_recipe_id) {
        this.cr_recipe_id = cr_recipe_id;
    }

    public String getNx_route_id() {
        return this.nx_route_id;
    }
    
    public void setNx_route_id(String nx_route_id) {
        this.nx_route_id = nx_route_id;
    }

    public String getNx_route_ver() {
        return this.nx_route_ver;
    }
    
    public void setNx_route_ver(String nx_route_ver) {
        this.nx_route_ver = nx_route_ver;
    }

    public String getNx_ope_no() {
        return this.nx_ope_no;
    }
    
    public void setNx_ope_no(String nx_ope_no) {
        this.nx_ope_no = nx_ope_no;
    }

    public String getNx_ope_id() {
        return this.nx_ope_id;
    }
    
    public void setNx_ope_id(String nx_ope_id) {
        this.nx_ope_id = nx_ope_id;
    }

    public String getNx_ope_ver() {
        return this.nx_ope_ver;
    }
    
    public void setNx_ope_ver(String nx_ope_ver) {
        this.nx_ope_ver = nx_ope_ver;
    }

    public String getNx_proc_id() {
        return this.nx_proc_id;
    }
    
    public void setNx_proc_id(String nx_proc_id) {
        this.nx_proc_id = nx_proc_id;
    }

    public String getNx_eqptg_id() {
        return this.nx_eqptg_id;
    }
    
    public void setNx_eqptg_id(String nx_eqptg_id) {
        this.nx_eqptg_id = nx_eqptg_id;
    }

    public String getNx_eqpt_id() {
        return this.nx_eqpt_id;
    }
    
    public void setNx_eqpt_id(String nx_eqpt_id) {
        this.nx_eqpt_id = nx_eqpt_id;
    }

    public String getNx_pep_lvl() {
        return this.nx_pep_lvl;
    }
    
    public void setNx_pep_lvl(String nx_pep_lvl) {
        this.nx_pep_lvl = nx_pep_lvl;
    }

    public String getNx_dept_code() {
        return this.nx_dept_code;
    }
    
    public void setNx_dept_code(String nx_dept_code) {
        this.nx_dept_code = nx_dept_code;
    }

    public String getNx_recipe_id() {
        return this.nx_recipe_id;
    }
    
    public void setNx_recipe_id(String nx_recipe_id) {
        this.nx_recipe_id = nx_recipe_id;
    }

    public String getPv_logof_user() {
        return this.pv_logof_user;
    }
    
    public void setPv_logof_user(String pv_logof_user) {
        this.pv_logof_user = pv_logof_user;
    }

    public Timestamp getPv_logof_timestamp() {
        return this.pv_logof_timestamp;
    }
    
    public void setPv_logof_timestamp(Timestamp pv_logof_timestamp) {
        this.pv_logof_timestamp = pv_logof_timestamp;
    }

    public Date getPv_logof_mfdt() {
        return this.pv_logof_mfdt;
    }
    
    public void setPv_logof_mfdt(Date pv_logof_mfdt) {
        this.pv_logof_mfdt = pv_logof_mfdt;
    }

    public String getPv_logof_mfwk() {
        return this.pv_logof_mfwk;
    }
    
    public void setPv_logof_mfwk(String pv_logof_mfwk) {
        this.pv_logof_mfwk = pv_logof_mfwk;
    }

    public String getPv_logof_mfmn() {
        return this.pv_logof_mfmn;
    }
    
    public void setPv_logof_mfmn(String pv_logof_mfmn) {
        this.pv_logof_mfmn = pv_logof_mfmn;
    }

    public Integer getPv_logof_mfsh() {
        return this.pv_logof_mfsh;
    }
    
    public void setPv_logof_mfsh(Integer pv_logof_mfsh) {
        this.pv_logof_mfsh = pv_logof_mfsh;
    }

    public String getLogon_user() {
        return this.logon_user;
    }
    
    public void setLogon_user(String logon_user) {
        this.logon_user = logon_user;
    }

    public String getLogon_crr_id() {
        return this.logon_crr_id;
    }
    
    public void setLogon_crr_id(String logon_crr_id) {
        this.logon_crr_id = logon_crr_id;
    }

    public String getLogon_slot_no() {
        return this.logon_slot_no;
    }
    
    public void setLogon_slot_no(String logon_slot_no) {
        this.logon_slot_no = logon_slot_no;
    }

    public Timestamp getLogon_timestamp() {
        return this.logon_timestamp;
    }
    
    public void setLogon_timestamp(Timestamp logon_timestamp) {
        this.logon_timestamp = logon_timestamp;
    }

    public Date getLogon_mfdt() {
        return this.logon_mfdt;
    }
    
    public void setLogon_mfdt(Date logon_mfdt) {
        this.logon_mfdt = logon_mfdt;
    }

    public String getLogon_mfwk() {
        return this.logon_mfwk;
    }
    
    public void setLogon_mfwk(String logon_mfwk) {
        this.logon_mfwk = logon_mfwk;
    }

    public String getLogon_mfmn() {
        return this.logon_mfmn;
    }
    
    public void setLogon_mfmn(String logon_mfmn) {
        this.logon_mfmn = logon_mfmn;
    }

    public Integer getLogon_mfsh() {
        return this.logon_mfsh;
    }
    
    public void setLogon_mfsh(Integer logon_mfsh) {
        this.logon_mfsh = logon_mfsh;
    }

    public String getLogof_user() {
        return this.logof_user;
    }
    
    public void setLogof_user(String logof_user) {
        this.logof_user = logof_user;
    }

    public Timestamp getLogof_timestamp() {
        return this.logof_timestamp;
    }
    
    public void setLogof_timestamp(Timestamp logof_timestamp) {
        this.logof_timestamp = logof_timestamp;
    }

    public Date getLogof_mfdt() {
        return this.logof_mfdt;
    }
    
    public void setLogof_mfdt(Date logof_mfdt) {
        this.logof_mfdt = logof_mfdt;
    }

    public String getLogof_mfwk() {
        return this.logof_mfwk;
    }
    
    public void setLogof_mfwk(String logof_mfwk) {
        this.logof_mfwk = logof_mfwk;
    }

    public String getLogof_mfmn() {
        return this.logof_mfmn;
    }
    
    public void setLogof_mfmn(String logof_mfmn) {
        this.logof_mfmn = logof_mfmn;
    }

    public Integer getLogof_mfsh() {
        return this.logof_mfsh;
    }
    
    public void setLogof_mfsh(Integer logof_mfsh) {
        this.logof_mfsh = logof_mfsh;
    }

    public Timestamp getPv_pln_cmp_timestamp() {
        return this.pv_pln_cmp_timestamp;
    }
    
    public void setPv_pln_cmp_timestamp(Timestamp pv_pln_cmp_timestamp) {
        this.pv_pln_cmp_timestamp = pv_pln_cmp_timestamp;
    }

    public Date getPv_pln_cmp_mfdt() {
        return this.pv_pln_cmp_mfdt;
    }
    
    public void setPv_pln_cmp_mfdt(Date pv_pln_cmp_mfdt) {
        this.pv_pln_cmp_mfdt = pv_pln_cmp_mfdt;
    }

    public String getPv_pln_cmp_mfwk() {
        return this.pv_pln_cmp_mfwk;
    }
    
    public void setPv_pln_cmp_mfwk(String pv_pln_cmp_mfwk) {
        this.pv_pln_cmp_mfwk = pv_pln_cmp_mfwk;
    }

    public String getPv_pln_cmp_mfmn() {
        return this.pv_pln_cmp_mfmn;
    }
    
    public void setPv_pln_cmp_mfmn(String pv_pln_cmp_mfmn) {
        this.pv_pln_cmp_mfmn = pv_pln_cmp_mfmn;
    }

    public Integer getPv_pln_cmp_mfsh() {
        return this.pv_pln_cmp_mfsh;
    }
    
    public void setPv_pln_cmp_mfsh(Integer pv_pln_cmp_mfsh) {
        this.pv_pln_cmp_mfsh = pv_pln_cmp_mfsh;
    }

    public Timestamp getPln_cmp_timestamp() {
        return this.pln_cmp_timestamp;
    }
    
    public void setPln_cmp_timestamp(Timestamp pln_cmp_timestamp) {
        this.pln_cmp_timestamp = pln_cmp_timestamp;
    }

    public Date getPln_cmp_mfdt() {
        return this.pln_cmp_mfdt;
    }
    
    public void setPln_cmp_mfdt(Date pln_cmp_mfdt) {
        this.pln_cmp_mfdt = pln_cmp_mfdt;
    }

    public String getPln_cmp_mfwk() {
        return this.pln_cmp_mfwk;
    }
    
    public void setPln_cmp_mfwk(String pln_cmp_mfwk) {
        this.pln_cmp_mfwk = pln_cmp_mfwk;
    }

    public String getPln_cmp_mfmn() {
        return this.pln_cmp_mfmn;
    }
    
    public void setPln_cmp_mfmn(String pln_cmp_mfmn) {
        this.pln_cmp_mfmn = pln_cmp_mfmn;
    }

    public Integer getPln_cmp_mfsh() {
        return this.pln_cmp_mfsh;
    }
    
    public void setPln_cmp_mfsh(Integer pln_cmp_mfsh) {
        this.pln_cmp_mfsh = pln_cmp_mfsh;
    }

    public Timestamp getPcmp_timestamp() {
        return this.pcmp_timestamp;
    }
    
    public void setPcmp_timestamp(Timestamp pcmp_timestamp) {
        this.pcmp_timestamp = pcmp_timestamp;
    }

    public Date getPcmp_mfdt() {
        return this.pcmp_mfdt;
    }
    
    public void setPcmp_mfdt(Date pcmp_mfdt) {
        this.pcmp_mfdt = pcmp_mfdt;
    }

    public String getPcmp_mfwk() {
        return this.pcmp_mfwk;
    }
    
    public void setPcmp_mfwk(String pcmp_mfwk) {
        this.pcmp_mfwk = pcmp_mfwk;
    }

    public String getPcmp_mfmn() {
        return this.pcmp_mfmn;
    }
    
    public void setPcmp_mfmn(String pcmp_mfmn) {
        this.pcmp_mfmn = pcmp_mfmn;
    }

    public Integer getPcmp_mfsh() {
        return this.pcmp_mfsh;
    }
    
    public void setPcmp_mfsh(Integer pcmp_mfsh) {
        this.pcmp_mfsh = pcmp_mfsh;
    }

    public Timestamp getAcmp_timestamp() {
        return this.acmp_timestamp;
    }
    
    public void setAcmp_timestamp(Timestamp acmp_timestamp) {
        this.acmp_timestamp = acmp_timestamp;
    }

    public Date getAcmp_mfdt() {
        return this.acmp_mfdt;
    }
    
    public void setAcmp_mfdt(Date acmp_mfdt) {
        this.acmp_mfdt = acmp_mfdt;
    }

    public String getAcmp_mfwk() {
        return this.acmp_mfwk;
    }
    
    public void setAcmp_mfwk(String acmp_mfwk) {
        this.acmp_mfwk = acmp_mfwk;
    }

    public String getAcmp_mfmn() {
        return this.acmp_mfmn;
    }
    
    public void setAcmp_mfmn(String acmp_mfmn) {
        this.acmp_mfmn = acmp_mfmn;
    }

    public Integer getAcmp_mfsh() {
        return this.acmp_mfsh;
    }
    
    public void setAcmp_mfsh(Integer acmp_mfsh) {
        this.acmp_mfsh = acmp_mfsh;
    }

    public String getEvt_cate() {
        return this.evt_cate;
    }
    
    public void setEvt_cate(String evt_cate) {
        this.evt_cate = evt_cate;
    }

    public String getEvt_user() {
        return this.evt_user;
    }
    
    public void setEvt_user(String evt_user) {
        this.evt_user = evt_user;
    }

    public Timestamp getEvt_timestamp() {
        return this.evt_timestamp;
    }
    
    public void setEvt_timestamp(Timestamp evt_timestamp) {
        this.evt_timestamp = evt_timestamp;
    }

    public Date getEvt_mfdt() {
        return this.evt_mfdt;
    }
    
    public void setEvt_mfdt(Date evt_mfdt) {
        this.evt_mfdt = evt_mfdt;
    }

    public String getEvt_mfwk() {
        return this.evt_mfwk;
    }
    
    public void setEvt_mfwk(String evt_mfwk) {
        this.evt_mfwk = evt_mfwk;
    }

    public String getEvt_mfmn() {
        return this.evt_mfmn;
    }
    
    public void setEvt_mfmn(String evt_mfmn) {
        this.evt_mfmn = evt_mfmn;
    }

    public Integer getEvt_mfsh() {
        return this.evt_mfsh;
    }
    
    public void setEvt_mfsh(Integer evt_mfsh) {
        this.evt_mfsh = evt_mfsh;
    }

    public String getCr_mproc_id() {
        return this.cr_mproc_id;
    }
    
    public void setCr_mproc_id(String cr_mproc_id) {
        this.cr_mproc_id = cr_mproc_id;
    }

    public String getCr_mproc_flg() {
        return this.cr_mproc_flg;
    }
    
    public void setCr_mproc_flg(String cr_mproc_flg) {
        this.cr_mproc_flg = cr_mproc_flg;
    }

    public String getNx_mproc_id() {
        return this.nx_mproc_id;
    }
    
    public void setNx_mproc_id(String nx_mproc_id) {
        this.nx_mproc_id = nx_mproc_id;
    }

    public String getNx_mproc_flg() {
        return this.nx_mproc_flg;
    }
    
    public void setNx_mproc_flg(String nx_mproc_flg) {
        this.nx_mproc_flg = nx_mproc_flg;
    }

    public Integer getMproc_hld() {
        return this.mproc_hld;
    }
    
    public void setMproc_hld(Integer mproc_hld) {
        this.mproc_hld = mproc_hld;
    }

    public Timestamp getPln_mproc_timestamp() {
        return this.pln_mproc_timestamp;
    }
    
    public void setPln_mproc_timestamp(Timestamp pln_mproc_timestamp) {
        this.pln_mproc_timestamp = pln_mproc_timestamp;
    }

    public Date getPln_mproc_mfdt() {
        return this.pln_mproc_mfdt;
    }
    
    public void setPln_mproc_mfdt(Date pln_mproc_mfdt) {
        this.pln_mproc_mfdt = pln_mproc_mfdt;
    }

    public String getPln_mproc_mfwk() {
        return this.pln_mproc_mfwk;
    }
    
    public void setPln_mproc_mfwk(String pln_mproc_mfwk) {
        this.pln_mproc_mfwk = pln_mproc_mfwk;
    }

    public String getPln_mproc_mfmn() {
        return this.pln_mproc_mfmn;
    }
    
    public void setPln_mproc_mfmn(String pln_mproc_mfmn) {
        this.pln_mproc_mfmn = pln_mproc_mfmn;
    }

    public Integer getPln_mproc_mfsh() {
        return this.pln_mproc_mfsh;
    }
    
    public void setPln_mproc_mfsh(Integer pln_mproc_mfsh) {
        this.pln_mproc_mfsh = pln_mproc_mfsh;
    }

    public Timestamp getAct_mproc_timestamp() {
        return this.act_mproc_timestamp;
    }
    
    public void setAct_mproc_timestamp(Timestamp act_mproc_timestamp) {
        this.act_mproc_timestamp = act_mproc_timestamp;
    }

    public Date getAct_mproc_mfdt() {
        return this.act_mproc_mfdt;
    }
    
    public void setAct_mproc_mfdt(Date act_mproc_mfdt) {
        this.act_mproc_mfdt = act_mproc_mfdt;
    }

    public String getAct_mproc_mfwk() {
        return this.act_mproc_mfwk;
    }
    
    public void setAct_mproc_mfwk(String act_mproc_mfwk) {
        this.act_mproc_mfwk = act_mproc_mfwk;
    }

    public String getAct_mproc_mfmn() {
        return this.act_mproc_mfmn;
    }
    
    public void setAct_mproc_mfmn(String act_mproc_mfmn) {
        this.act_mproc_mfmn = act_mproc_mfmn;
    }

    public Integer getAct_mproc_mfsh() {
        return this.act_mproc_mfsh;
    }
    
    public void setAct_mproc_mfsh(Integer act_mproc_mfsh) {
        this.act_mproc_mfsh = act_mproc_mfsh;
    }

    public String getSv_crr_id() {
        return this.sv_crr_id;
    }
    
    public void setSv_crr_id(String sv_crr_id) {
        this.sv_crr_id = sv_crr_id;
    }

    public String getSv_slot_no() {
        return this.sv_slot_no;
    }
    
    public void setSv_slot_no(String sv_slot_no) {
        this.sv_slot_no = sv_slot_no;
    }

    public String getSv_route_id() {
        return this.sv_route_id;
    }
    
    public void setSv_route_id(String sv_route_id) {
        this.sv_route_id = sv_route_id;
    }

    public String getSv_route_ver() {
        return this.sv_route_ver;
    }
    
    public void setSv_route_ver(String sv_route_ver) {
        this.sv_route_ver = sv_route_ver;
    }

    public String getSv_ope_no() {
        return this.sv_ope_no;
    }
    
    public void setSv_ope_no(String sv_ope_no) {
        this.sv_ope_no = sv_ope_no;
    }

    public String getSv_eqptg_id() {
        return this.sv_eqptg_id;
    }
    
    public void setSv_eqptg_id(String sv_eqptg_id) {
        this.sv_eqptg_id = sv_eqptg_id;
    }

    public String getSv_eqpt_id() {
        return this.sv_eqpt_id;
    }
    
    public void setSv_eqpt_id(String sv_eqpt_id) {
        this.sv_eqpt_id = sv_eqpt_id;
    }

    public String getSv_recipe_id() {
        return this.sv_recipe_id;
    }
    
    public void setSv_recipe_id(String sv_recipe_id) {
        this.sv_recipe_id = sv_recipe_id;
    }

    public String getSv_sht_stat() {
        return this.sv_sht_stat;
    }
    
    public void setSv_sht_stat(String sv_sht_stat) {
        this.sv_sht_stat = sv_sht_stat;
    }

    public String getPv_crr_id() {
        return this.pv_crr_id;
    }
    
    public void setPv_crr_id(String pv_crr_id) {
        this.pv_crr_id = pv_crr_id;
    }

    public String getPv_slot_no() {
        return this.pv_slot_no;
    }
    
    public void setPv_slot_no(String pv_slot_no) {
        this.pv_slot_no = pv_slot_no;
    }

    public String getClm_crr_id() {
        return this.clm_crr_id;
    }
    
    public void setClm_crr_id(String clm_crr_id) {
        this.clm_crr_id = clm_crr_id;
    }

    public String getClm_slot_no() {
        return this.clm_slot_no;
    }
    
    public void setClm_slot_no(String clm_slot_no) {
        this.clm_slot_no = clm_slot_no;
    }

    public String getAbnd_flg() {
        return this.abnd_flg;
    }
    
    public void setAbnd_flg(String abnd_flg) {
        this.abnd_flg = abnd_flg;
    }

    public String getDeldays() {
        return this.deldays;
    }
    
    public void setDeldays(String deldays) {
        this.deldays = deldays;
    }

    public String getSht_note_flg() {
        return this.sht_note_flg;
    }
    
    public void setSht_note_flg(String sht_note_flg) {
        this.sht_note_flg = sht_note_flg;
    }

    public Timestamp getCel_stb_timestamp() {
        return this.cel_stb_timestamp;
    }
    
    public void setCel_stb_timestamp(Timestamp cel_stb_timestamp) {
        this.cel_stb_timestamp = cel_stb_timestamp;
    }

    public String getFab_id() {
        return this.fab_id;
    }
    
    public void setFab_id(String fab_id) {
        this.fab_id = fab_id;
    }

    public String getLine_id() {
        return this.line_id;
    }
    
    public void setLine_id(String line_id) {
        this.line_id = line_id;
    }

    public String getProduct_id() {
        return this.product_id;
    }
    
    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getEc_code() {
        return this.ec_code;
    }
    
    public void setEc_code(String ec_code) {
        this.ec_code = ec_code;
    }

    public String getCharge_code() {
        return this.charge_code;
    }
    
    public void setCharge_code(String charge_code) {
        this.charge_code = charge_code;
    }

    public String getOwner_id() {
        return this.owner_id;
    }
    
    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }

    public String getPrty() {
        return this.prty;
    }
    
    public void setPrty(String prty) {
        this.prty = prty;
    }

    public String getMtrl_product_id() {
        return this.mtrl_product_id;
    }
    
    public void setMtrl_product_id(String mtrl_product_id) {
        this.mtrl_product_id = mtrl_product_id;
    }

    public String getOrder_id() {
        return this.order_id;
    }
    
    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getSales_order() {
        return this.sales_order;
    }
    
    public void setSales_order(String sales_order) {
        this.sales_order = sales_order;
    }

    public String getProject_cd() {
        return this.project_cd;
    }
    
    public void setProject_cd(String project_cd) {
        this.project_cd = project_cd;
    }

    public String getEng_name() {
        return this.eng_name;
    }
    
    public void setEng_name(String eng_name) {
        this.eng_name = eng_name;
    }

    public String getExp_no() {
        return this.exp_no;
    }
    
    public void setExp_no(String exp_no) {
        this.exp_no = exp_no;
    }

    public String getStb_lot_id() {
        return this.stb_lot_id;
    }
    
    public void setStb_lot_id(String stb_lot_id) {
        this.stb_lot_id = stb_lot_id;
    }

    public String getDs_recipe_id() {
        return this.ds_recipe_id;
    }
    
    public void setDs_recipe_id(String ds_recipe_id) {
        this.ds_recipe_id = ds_recipe_id;
    }

    public String getAc_recipe_id() {
        return this.ac_recipe_id;
    }
    
    public void setAc_recipe_id(String ac_recipe_id) {
        this.ac_recipe_id = ac_recipe_id;
    }

    public String getProduct_cate() {
        return this.product_cate;
    }
    
    public void setProduct_cate(String product_cate) {
        this.product_cate = product_cate;
    }

    public String getMrg_hld_route_id() {
        return this.mrg_hld_route_id;
    }
    
    public void setMrg_hld_route_id(String mrg_hld_route_id) {
        this.mrg_hld_route_id = mrg_hld_route_id;
    }

    public String getMrg_hld_route_ver() {
        return this.mrg_hld_route_ver;
    }
    
    public void setMrg_hld_route_ver(String mrg_hld_route_ver) {
        this.mrg_hld_route_ver = mrg_hld_route_ver;
    }

    public String getMrg_hld_ope_no() {
        return this.mrg_hld_ope_no;
    }
    
    public void setMrg_hld_ope_no(String mrg_hld_ope_no) {
        this.mrg_hld_ope_no = mrg_hld_ope_no;
    }

    public Timestamp getAct_stb_timestamp() {
        return this.act_stb_timestamp;
    }
    
    public void setAct_stb_timestamp(Timestamp act_stb_timestamp) {
        this.act_stb_timestamp = act_stb_timestamp;
    }

    public String getPrt_splt_id() {
        return this.prt_splt_id;
    }
    
    public void setPrt_splt_id(String prt_splt_id) {
        this.prt_splt_id = prt_splt_id;
    }

    public String getSplt_id() {
        return this.splt_id;
    }
    
    public void setSplt_id(String splt_id) {
        this.splt_id = splt_id;
    }

    public String getCe_id() {
        return this.ce_id;
    }
    
    public void setCe_id(String ce_id) {
        this.ce_id = ce_id;
    }

    public String getEen_id() {
        return this.een_id;
    }
    
    public void setEen_id(String een_id) {
        this.een_id = een_id;
    }

    public String getStage_id() {
        return this.stage_id;
    }
    
    public void setStage_id(String stage_id) {
        this.stage_id = stage_id;
    }

    public String getSv_reproc_flg() {
        return this.sv_reproc_flg;
    }
    
    public void setSv_reproc_flg(String sv_reproc_flg) {
        this.sv_reproc_flg = sv_reproc_flg;
    }

    public String getPtt_grade() {
        return this.ptt_grade;
    }
    
    public void setPtt_grade(String ptt_grade) {
        this.ptt_grade = ptt_grade;
    }

    public String getPtt_type() {
        return this.ptt_type;
    }
    
    public void setPtt_type(String ptt_type) {
        this.ptt_type = ptt_type;
    }

    public String getSht_recipe_id() {
        return this.sht_recipe_id;
    }
    
    public void setSht_recipe_id(String sht_recipe_id) {
        this.sht_recipe_id = sht_recipe_id;
    }

    public String getSv_sht_recipe_id() {
        return this.sv_sht_recipe_id;
    }
    
    public void setSv_sht_recipe_id(String sv_sht_recipe_id) {
        this.sv_sht_recipe_id = sv_sht_recipe_id;
    }

    public String getDest_shop() {
        return this.dest_shop;
    }
    
    public void setDest_shop(String dest_shop) {
        this.dest_shop = dest_shop;
    }

    public String getDmy_sht_id() {
        return this.dmy_sht_id;
    }
    
    public void setDmy_sht_id(String dmy_sht_id) {
        this.dmy_sht_id = dmy_sht_id;
    }

    public String getDmy_product_id() {
        return this.dmy_product_id;
    }
    
    public void setDmy_product_id(String dmy_product_id) {
        this.dmy_product_id = dmy_product_id;
    }

    public String getDmy_ec_code() {
        return this.dmy_ec_code;
    }
    
    public void setDmy_ec_code(String dmy_ec_code) {
        this.dmy_ec_code = dmy_ec_code;
    }

    public String getMtrl_grade() {
        return this.mtrl_grade;
    }
    
    public void setMtrl_grade(String mtrl_grade) {
        this.mtrl_grade = mtrl_grade;
    }

    public String getSht_pln_id() {
        return this.sht_pln_id;
    }
    
    public void setSht_pln_id(String sht_pln_id) {
        this.sht_pln_id = sht_pln_id;
    }

    public String getBm_pattern() {
        return this.bm_pattern;
    }
    
    public void setBm_pattern(String bm_pattern) {
        this.bm_pattern = bm_pattern;
    }

    public String getForce_insp_flg() {
        return this.force_insp_flg;
    }
    
    public void setForce_insp_flg(String force_insp_flg) {
        this.force_insp_flg = force_insp_flg;
    }

    public String getSht_judge() {
        return this.sht_judge;
    }
    
    public void setSht_judge(String sht_judge) {
        this.sht_judge = sht_judge;
    }

    public Integer getRecyc_cnt() {
        return this.recyc_cnt;
    }
    
    public void setRecyc_cnt(Integer recyc_cnt) {
        this.recyc_cnt = recyc_cnt;
    }

    public String getInsp_result() {
        return this.insp_result;
    }
    
    public void setInsp_result(String insp_result) {
        this.insp_result = insp_result;
    }

    public String getInsp_judge() {
        return this.insp_judge;
    }
    
    public void setInsp_judge(String insp_judge) {
        this.insp_judge = insp_judge;
    }

    public String getStb_shop() {
        return this.stb_shop;
    }
    
    public void setStb_shop(String stb_shop) {
        this.stb_shop = stb_shop;
    }

    public String getAbnormal_flg_1() {
        return this.abnormal_flg_1;
    }
    
    public void setAbnormal_flg_1(String abnormal_flg_1) {
        this.abnormal_flg_1 = abnormal_flg_1;
    }

    public String getBc_suspect_rsn() {
        return this.bc_suspect_rsn;
    }
    
    public void setBc_suspect_rsn(String bc_suspect_rsn) {
        this.bc_suspect_rsn = bc_suspect_rsn;
    }

    public String getBc_suspect_ope_id() {
        return this.bc_suspect_ope_id;
    }
    
    public void setBc_suspect_ope_id(String bc_suspect_ope_id) {
        this.bc_suspect_ope_id = bc_suspect_ope_id;
    }

    public String getSht_ftsmp_flg() {
        return this.sht_ftsmp_flg;
    }
    
    public void setSht_ftsmp_flg(String sht_ftsmp_flg) {
        this.sht_ftsmp_flg = sht_ftsmp_flg;
    }

    public String getOrg_lot_id() {
        return this.org_lot_id;
    }
    
    public void setOrg_lot_id(String org_lot_id) {
        this.org_lot_id = org_lot_id;
    }

    public String getOrg_prt_splt_id() {
        return this.org_prt_splt_id;
    }
    
    public void setOrg_prt_splt_id(String org_prt_splt_id) {
        this.org_prt_splt_id = org_prt_splt_id;
    }

    public String getOrg_splt_id() {
        return this.org_splt_id;
    }
    
    public void setOrg_splt_id(String org_splt_id) {
        this.org_splt_id = org_splt_id;
    }

    public String getPv_proc_id() {
        return this.pv_proc_id;
    }
    
    public void setPv_proc_id(String pv_proc_id) {
        this.pv_proc_id = pv_proc_id;
    }

    public String getPv_eqpt_id() {
        return this.pv_eqpt_id;
    }
    
    public void setPv_eqpt_id(String pv_eqpt_id) {
        this.pv_eqpt_id = pv_eqpt_id;
    }

    public String getPv_pep_lvl() {
        return this.pv_pep_lvl;
    }
    
    public void setPv_pep_lvl(String pv_pep_lvl) {
        this.pv_pep_lvl = pv_pep_lvl;
    }

    public Date getCmp_due_date() {
        return this.cmp_due_date;
    }
    
    public void setCmp_due_date(Date cmp_due_date) {
        this.cmp_due_date = cmp_due_date;
    }

    public String getTemplate_id() {
        return this.template_id;
    }
    
    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public Integer getSrt_setting_no() {
        return this.srt_setting_no;
    }
    
    public void setSrt_setting_no(Integer srt_setting_no) {
        this.srt_setting_no = srt_setting_no;
    }

    public String getSht_pln_batch_id() {
        return this.sht_pln_batch_id;
    }
    
    public void setSht_pln_batch_id(String sht_pln_batch_id) {
        this.sht_pln_batch_id = sht_pln_batch_id;
    }

    public String getLg_scrp_flg() {
        return this.lg_scrp_flg;
    }
    
    public void setLg_scrp_flg(String lg_scrp_flg) {
        this.lg_scrp_flg = lg_scrp_flg;
    }

    public String getStb_sampling_flg() {
        return this.stb_sampling_flg;
    }
    
    public void setStb_sampling_flg(String stb_sampling_flg) {
        this.stb_sampling_flg = stb_sampling_flg;
    }

    public String getNg_mark() {
        return this.ng_mark;
    }
    
    public void setNg_mark(String ng_mark) {
        this.ng_mark = ng_mark;
    }

    public String getSht_id_bc() {
        return this.sht_id_bc;
    }
    
    public void setSht_id_bc(String sht_id_bc) {
        this.sht_id_bc = sht_id_bc;
    }

    public String getRevw_sht_judge() {
        return this.revw_sht_judge;
    }
    
    public void setRevw_sht_judge(String revw_sht_judge) {
        this.revw_sht_judge = revw_sht_judge;
    }

    public String getSrt_grade_grp() {
        return this.srt_grade_grp;
    }
    
    public void setSrt_grade_grp(String srt_grade_grp) {
        this.srt_grade_grp = srt_grade_grp;
    }

    public String getSrt_rule_id() {
        return this.srt_rule_id;
    }
    
    public void setSrt_rule_id(String srt_rule_id) {
        this.srt_rule_id = srt_rule_id;
    }

    public String getSrc_shop() {
        return this.src_shop;
    }
    
    public void setSrc_shop(String src_shop) {
        this.src_shop = src_shop;
    }

    public String getSale_flg() {
        return this.sale_flg;
    }
    
    public void setSale_flg(String sale_flg) {
        this.sale_flg = sale_flg;
    }

    public String getRgb_layer_hight() {
        return this.rgb_layer_hight;
    }
    
    public void setRgb_layer_hight(String rgb_layer_hight) {
        this.rgb_layer_hight = rgb_layer_hight;
    }

    public String getPfcd() {
        return this.pfcd;
    }
    
    public void setPfcd(String pfcd) {
        this.pfcd = pfcd;
    }

    public String getPnlmode() {
        return this.pnlmode;
    }
    
    public void setPnlmode(String pnlmode) {
        this.pnlmode = pnlmode;
    }

    public String getPr_flg() {
        return this.pr_flg;
    }
    
    public void setPr_flg(String pr_flg) {
        this.pr_flg = pr_flg;
    }

    public String getRcvy_id() {
        return this.rcvy_id;
    }
    
    public void setRcvy_id(String rcvy_id) {
        this.rcvy_id = rcvy_id;
    }

    public String getRcvy_eqpt_id() {
        return this.rcvy_eqpt_id;
    }
    
    public void setRcvy_eqpt_id(String rcvy_eqpt_id) {
        this.rcvy_eqpt_id = rcvy_eqpt_id;
    }

    public String getRcvy_seq_no() {
        return this.rcvy_seq_no;
    }
    
    public void setRcvy_seq_no(String rcvy_seq_no) {
        this.rcvy_seq_no = rcvy_seq_no;
    }

    public String getRcvy_template_id() {
        return this.rcvy_template_id;
    }
    
    public void setRcvy_template_id(String rcvy_template_id) {
        this.rcvy_template_id = rcvy_template_id;
    }

    public String getRcvy_act_seq_no() {
        return this.rcvy_act_seq_no;
    }
    
    public void setRcvy_act_seq_no(String rcvy_act_seq_no) {
        this.rcvy_act_seq_no = rcvy_act_seq_no;
    }

    public String getMix_owner() {
        return this.mix_owner;
    }
    
    public void setMix_owner(String mix_owner) {
        this.mix_owner = mix_owner;
    }

    public String getTeg_flg() {
        return this.teg_flg;
    }
    
    public void setTeg_flg(String teg_flg) {
        this.teg_flg = teg_flg;
    }

    public String getSub_sht_stat() {
        return this.sub_sht_stat;
    }
    
    public void setSub_sht_stat(String sub_sht_stat) {
        this.sub_sht_stat = sub_sht_stat;
    }

    public String getPv_logof_dept() {
        return this.pv_logof_dept;
    }
    
    public void setPv_logof_dept(String pv_logof_dept) {
        this.pv_logof_dept = pv_logof_dept;
    }

    public String getLogon_dept() {
        return this.logon_dept;
    }
    
    public void setLogon_dept(String logon_dept) {
        this.logon_dept = logon_dept;
    }

    public String getLogof_dept() {
        return this.logof_dept;
    }
    
    public void setLogof_dept(String logof_dept) {
        this.logof_dept = logof_dept;
    }

    public String getEvt_dept() {
        return this.evt_dept;
    }
    
    public void setEvt_dept(String evt_dept) {
        this.evt_dept = evt_dept;
    }

    public String getMax_qrs_avl_flg() {
        return this.max_qrs_avl_flg;
    }
    
    public void setMax_qrs_avl_flg(String max_qrs_avl_flg) {
        this.max_qrs_avl_flg = max_qrs_avl_flg;
    }

    public String getMax_qrs_route_id() {
        return this.max_qrs_route_id;
    }
    
    public void setMax_qrs_route_id(String max_qrs_route_id) {
        this.max_qrs_route_id = max_qrs_route_id;
    }

    public String getMax_qrs_route_ver() {
        return this.max_qrs_route_ver;
    }
    
    public void setMax_qrs_route_ver(String max_qrs_route_ver) {
        this.max_qrs_route_ver = max_qrs_route_ver;
    }

    public String getMax_qrs_ope_id() {
        return this.max_qrs_ope_id;
    }
    
    public void setMax_qrs_ope_id(String max_qrs_ope_id) {
        this.max_qrs_ope_id = max_qrs_ope_id;
    }

    public Timestamp getMax_qrs_timestamp() {
        return this.max_qrs_timestamp;
    }
    
    public void setMax_qrs_timestamp(Timestamp max_qrs_timestamp) {
        this.max_qrs_timestamp = max_qrs_timestamp;
    }

    public String getMin_qrs_avl_flg() {
        return this.min_qrs_avl_flg;
    }
    
    public void setMin_qrs_avl_flg(String min_qrs_avl_flg) {
        this.min_qrs_avl_flg = min_qrs_avl_flg;
    }

    public String getMin_qrs_route_id() {
        return this.min_qrs_route_id;
    }
    
    public void setMin_qrs_route_id(String min_qrs_route_id) {
        this.min_qrs_route_id = min_qrs_route_id;
    }

    public String getMin_qrs_route_ver() {
        return this.min_qrs_route_ver;
    }
    
    public void setMin_qrs_route_ver(String min_qrs_route_ver) {
        this.min_qrs_route_ver = min_qrs_route_ver;
    }

    public String getMin_qrs_ope_id() {
        return this.min_qrs_ope_id;
    }
    
    public void setMin_qrs_ope_id(String min_qrs_ope_id) {
        this.min_qrs_ope_id = min_qrs_ope_id;
    }

    public Timestamp getMin_qrs_timestamp() {
        return this.min_qrs_timestamp;
    }
    
    public void setMin_qrs_timestamp(Timestamp min_qrs_timestamp) {
        this.min_qrs_timestamp = min_qrs_timestamp;
    }

    public String getMax_qrk_avl_flg() {
        return this.max_qrk_avl_flg;
    }
    
    public void setMax_qrk_avl_flg(String max_qrk_avl_flg) {
        this.max_qrk_avl_flg = max_qrk_avl_flg;
    }

    public String getMax_qrk_route_id() {
        return this.max_qrk_route_id;
    }
    
    public void setMax_qrk_route_id(String max_qrk_route_id) {
        this.max_qrk_route_id = max_qrk_route_id;
    }

    public String getMax_qrk_route_ver() {
        return this.max_qrk_route_ver;
    }
    
    public void setMax_qrk_route_ver(String max_qrk_route_ver) {
        this.max_qrk_route_ver = max_qrk_route_ver;
    }

    public String getMax_qrk_ope_id() {
        return this.max_qrk_ope_id;
    }
    
    public void setMax_qrk_ope_id(String max_qrk_ope_id) {
        this.max_qrk_ope_id = max_qrk_ope_id;
    }

    public Timestamp getMax_qrk_timestamp() {
        return this.max_qrk_timestamp;
    }
    
    public void setMax_qrk_timestamp(Timestamp max_qrk_timestamp) {
        this.max_qrk_timestamp = max_qrk_timestamp;
    }

    public String getBnk_flg() {
        return this.bnk_flg;
    }
    
    public void setBnk_flg(String bnk_flg) {
        this.bnk_flg = bnk_flg;
    }

    public String getRsn_dept_1() {
        return this.rsn_dept_1;
    }
    
    public void setRsn_dept_1(String rsn_dept_1) {
        this.rsn_dept_1 = rsn_dept_1;
    }

    public String getRsn_cate_1() {
        return this.rsn_cate_1;
    }
    
    public void setRsn_cate_1(String rsn_cate_1) {
        this.rsn_cate_1 = rsn_cate_1;
    }

    public String getRsn_code_1() {
        return this.rsn_code_1;
    }
    
    public void setRsn_code_1(String rsn_code_1) {
        this.rsn_code_1 = rsn_code_1;
    }

    public String getRsn_dept_2() {
        return this.rsn_dept_2;
    }
    
    public void setRsn_dept_2(String rsn_dept_2) {
        this.rsn_dept_2 = rsn_dept_2;
    }

    public String getRsn_cate_2() {
        return this.rsn_cate_2;
    }
    
    public void setRsn_cate_2(String rsn_cate_2) {
        this.rsn_cate_2 = rsn_cate_2;
    }

    public String getRsn_code_2() {
        return this.rsn_code_2;
    }
    
    public void setRsn_code_2(String rsn_code_2) {
        this.rsn_code_2 = rsn_code_2;
    }

    public String getRsn_dept_3() {
        return this.rsn_dept_3;
    }
    
    public void setRsn_dept_3(String rsn_dept_3) {
        this.rsn_dept_3 = rsn_dept_3;
    }

    public String getRsn_cate_3() {
        return this.rsn_cate_3;
    }
    
    public void setRsn_cate_3(String rsn_cate_3) {
        this.rsn_cate_3 = rsn_cate_3;
    }

    public String getRsn_code_3() {
        return this.rsn_code_3;
    }
    
    public void setRsn_code_3(String rsn_code_3) {
        this.rsn_code_3 = rsn_code_3;
    }

    public String getRsn_dept_4() {
        return this.rsn_dept_4;
    }
    
    public void setRsn_dept_4(String rsn_dept_4) {
        this.rsn_dept_4 = rsn_dept_4;
    }

    public String getRsn_cate_4() {
        return this.rsn_cate_4;
    }
    
    public void setRsn_cate_4(String rsn_cate_4) {
        this.rsn_cate_4 = rsn_cate_4;
    }

    public String getRsn_code_4() {
        return this.rsn_code_4;
    }
    
    public void setRsn_code_4(String rsn_code_4) {
        this.rsn_code_4 = rsn_code_4;
    }

    public String getRsn_dept_5() {
        return this.rsn_dept_5;
    }
    
    public void setRsn_dept_5(String rsn_dept_5) {
        this.rsn_dept_5 = rsn_dept_5;
    }

    public String getRsn_cate_5() {
        return this.rsn_cate_5;
    }
    
    public void setRsn_cate_5(String rsn_cate_5) {
        this.rsn_cate_5 = rsn_cate_5;
    }

    public String getRsn_code_5() {
        return this.rsn_code_5;
    }
    
    public void setRsn_code_5(String rsn_code_5) {
        this.rsn_code_5 = rsn_code_5;
    }

    public String getPnl_grade() {
        return this.pnl_grade;
    }
    
    public void setPnl_grade(String pnl_grade) {
        this.pnl_grade = pnl_grade;
    }

    public String getSv_pnl_grade() {
        return this.sv_pnl_grade;
    }
    
    public void setSv_pnl_grade(String sv_pnl_grade) {
        this.sv_pnl_grade = sv_pnl_grade;
    }

    public String getMtrl_lot_id() {
        return this.mtrl_lot_id;
    }
    
    public void setMtrl_lot_id(String mtrl_lot_id) {
        this.mtrl_lot_id = mtrl_lot_id;
    }

    public String getPnl_judge() {
        return this.pnl_judge;
    }
    
    public void setPnl_judge(String pnl_judge) {
        this.pnl_judge = pnl_judge;
    }

    public String getSv_pnl_judge() {
        return this.sv_pnl_judge;
    }
    
    public void setSv_pnl_judge(String sv_pnl_judge) {
        this.sv_pnl_judge = sv_pnl_judge;
    }

    public String getSht_ope_msg() {
        return this.sht_ope_msg;
    }
    
    public void setSht_ope_msg(String sht_ope_msg) {
        this.sht_ope_msg = sht_ope_msg;
    }

    public String getSlot_flg() {
        return this.slot_flg;
    }
    
    public void setSlot_flg(String slot_flg) {
        this.slot_flg = slot_flg;
    }

    public Integer getDel_time() {
        return this.del_time;
    }
    
    public void setDel_time(Integer del_time) {
        this.del_time = del_time;
    }

    public String getMetal_flg() {
        return this.metal_flg;
    }
    
    public void setMetal_flg(String metal_flg) {
        this.metal_flg = metal_flg;
    }

    public String getCr_setting_no() {
        return this.cr_setting_no;
    }
    
    public void setCr_setting_no(String cr_setting_no) {
        this.cr_setting_no = cr_setting_no;
    }

    public String getNx_setting_no() {
        return this.nx_setting_no;
    }
    
    public void setNx_setting_no(String nx_setting_no) {
        this.nx_setting_no = nx_setting_no;
    }

    public String getAc_recipe_ver() {
        return this.ac_recipe_ver;
    }
    
    public void setAc_recipe_ver(String ac_recipe_ver) {
        this.ac_recipe_ver = ac_recipe_ver;
    }

    public String getPc_worder_id() {
        return this.pc_worder_id;
    }
    
    public void setPc_worder_id(String pc_worder_id) {
        this.pc_worder_id = pc_worder_id;
    }

    public String getSmp_prty() {
        return this.smp_prty;
    }
    
    public void setSmp_prty(String smp_prty) {
        this.smp_prty = smp_prty;
    }

    public Timestamp getCur_timestamp() {
        return this.cur_timestamp;
    }
    
    public void setCur_timestamp(Timestamp cur_timestamp) {
        this.cur_timestamp = cur_timestamp;
    }
   








}