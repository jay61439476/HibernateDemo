package com.ivo.hibernate.scm_aps_d_mps;

import com.ivo.hibernate.BaseHibernateDAO;
import java.sql.Timestamp;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * ScmApsDMps entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ivo.hibernate.scm_aps_d_mps.ScmApsDMps
 * @author MyEclipse Persistence Tools
 */

public class ScmApsDMpsDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(ScmApsDMpsDAO.class);
	// property constants
	public static final String SEQ_NO = "seqNo";
	public static final String SEQ_ID = "seqId";
	public static final String SIZE_ID = "sizeId";
	public static final String SALES_PLAN_QTY = "salesPlanQty";
	public static final String LCM_INPUT = "lcmInput";
	public static final String LCM_OUTPUT = "lcmOutput";
	public static final String LCM1_INPUT = "lcm1Input";
	public static final String LCM2_INPUT = "lcm2Input";
	public static final String LCM1_OUTPUT = "lcm1Output";
	public static final String LCM2_OUTPUT = "lcm2Output";
	public static final String INVENTORY = "inventory";
	public static final String ACT_INVENTORY = "actInventory";
	public static final String FCST_QTY = "fcstQty";
	public static final String CHANGE_QTY = "changeQty";
	public static final String REMARK = "remark";
	public static final String CREATE_USER = "createUser";
	public static final String UPDATE_USER = "updateUser";

	public void save(ScmApsDMps transientInstance) {
		log.debug("saving ScmApsDMps instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ScmApsDMps persistentInstance) {
		log.debug("deleting ScmApsDMps instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ScmApsDMps findById(com.ivo.hibernate.scm_aps_d_mps.ScmApsDMpsId id) {
		log.debug("getting ScmApsDMps instance with id: " + id);
		try {
			ScmApsDMps instance = (ScmApsDMps) getSession().get(
					"com.ivo.hibernate.scm_aps_d_mps.ScmApsDMps", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ScmApsDMps instance) {
		log.debug("finding ScmApsDMps instance by example");
		try {
			List results = getSession().createCriteria(
					"com.ivo.hibernate.scm_aps_d_mps.ScmApsDMps").add(
					Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ScmApsDMps instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ScmApsDMps as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySeqNo(Object seqNo) {
		return findByProperty(SEQ_NO, seqNo);
	}

	public List findBySeqId(Object seqId) {
		return findByProperty(SEQ_ID, seqId);
	}

	public List findBySizeId(Object sizeId) {
		return findByProperty(SIZE_ID, sizeId);
	}

	public List findBySalesPlanQty(Object salesPlanQty) {
		return findByProperty(SALES_PLAN_QTY, salesPlanQty);
	}

	public List findByLcmInput(Object lcmInput) {
		return findByProperty(LCM_INPUT, lcmInput);
	}

	public List findByLcmOutput(Object lcmOutput) {
		return findByProperty(LCM_OUTPUT, lcmOutput);
	}

	public List findByLcm1Input(Object lcm1Input) {
		return findByProperty(LCM1_INPUT, lcm1Input);
	}

	public List findByLcm2Input(Object lcm2Input) {
		return findByProperty(LCM2_INPUT, lcm2Input);
	}

	public List findByLcm1Output(Object lcm1Output) {
		return findByProperty(LCM1_OUTPUT, lcm1Output);
	}

	public List findByLcm2Output(Object lcm2Output) {
		return findByProperty(LCM2_OUTPUT, lcm2Output);
	}

	public List findByInventory(Object inventory) {
		return findByProperty(INVENTORY, inventory);
	}

	public List findByActInventory(Object actInventory) {
		return findByProperty(ACT_INVENTORY, actInventory);
	}

	public List findByFcstQty(Object fcstQty) {
		return findByProperty(FCST_QTY, fcstQty);
	}

	public List findByChangeQty(Object changeQty) {
		return findByProperty(CHANGE_QTY, changeQty);
	}

	public List findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

	public List findByCreateUser(Object createUser) {
		return findByProperty(CREATE_USER, createUser);
	}

	public List findByUpdateUser(Object updateUser) {
		return findByProperty(UPDATE_USER, updateUser);
	}

	public List findAll() {
		log.debug("finding all ScmApsDMps instances");
		try {
			String queryString = "from ScmApsDMps";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ScmApsDMps merge(ScmApsDMps detachedInstance) {
		log.debug("merging ScmApsDMps instance");
		try {
			ScmApsDMps result = (ScmApsDMps) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ScmApsDMps instance) {
		log.debug("attaching dirty ScmApsDMps instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ScmApsDMps instance) {
		log.debug("attaching clean ScmApsDMps instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}