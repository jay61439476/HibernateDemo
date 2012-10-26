package com.ivo.hibernate.acode;

import com.ivo.hibernate.BaseHibernateDAO;
import java.sql.Timestamp;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for Acode
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.ivo.hibernate.acode.Acode
 * @author MyEclipse Persistence Tools
 */

public class AcodeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(AcodeDAO.class);
	// property constants
	public static final String SUBITEM = "subitem";
	public static final String CODE_DSC = "code_dsc";
	public static final String EXT_1 = "ext_1";
	public static final String EXT_2 = "ext_2";
	public static final String EXT_3 = "ext_3";
	public static final String EXT_4 = "ext_4";
	public static final String EXT_5 = "ext_5";
	public static final String SEQUENCE = "sequence";

	public void save(Acode transientInstance) {
		log.debug("saving Acode instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Acode persistentInstance) {
		log.debug("deleting Acode instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Acode findById(com.ivo.hibernate.acode.AcodeId id) {
		log.debug("getting Acode instance with id: " + id);
		try {
			Acode instance = (Acode) getSession().get(
					"com.ivo.hibernate.acode.Acode", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Acode instance) {
		log.debug("finding Acode instance by example");
		try {
			List results = getSession()
					.createCriteria("com.ivo.hibernate.acode.Acode")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Acode instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Acode as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySubitem(Object subitem) {
		return findByProperty(SUBITEM, subitem);
	}

	public List findByCode_dsc(Object code_dsc) {
		return findByProperty(CODE_DSC, code_dsc);
	}

	public List findByExt_1(Object ext_1) {
		return findByProperty(EXT_1, ext_1);
	}

	public List findByExt_2(Object ext_2) {
		return findByProperty(EXT_2, ext_2);
	}

	public List findByExt_3(Object ext_3) {
		return findByProperty(EXT_3, ext_3);
	}

	public List findByExt_4(Object ext_4) {
		return findByProperty(EXT_4, ext_4);
	}

	public List findByExt_5(Object ext_5) {
		return findByProperty(EXT_5, ext_5);
	}

	public List findBySequence(Object sequence) {
		return findByProperty(SEQUENCE, sequence);
	}

	public List findAll() {
		log.debug("finding all Acode instances");
		try {
			String queryString = "from Acode";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Acode merge(Acode detachedInstance) {
		log.debug("merging Acode instance");
		try {
			Acode result = (Acode) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Acode instance) {
		log.debug("attaching dirty Acode instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Acode instance) {
		log.debug("attaching clean Acode instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}