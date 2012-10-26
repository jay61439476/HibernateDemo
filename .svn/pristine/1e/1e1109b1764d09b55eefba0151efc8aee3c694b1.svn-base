package com.ivo.hibernate.fcst_aps_d_mps;

import com.ivo.hibernate.BaseHibernateDAO;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * FcstApsDMps entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ivo.hibernate.fcst_aps_d_mps.FcstApsDMps
 * @author MyEclipse Persistence Tools
 */

public class FcstApsDMpsDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(FcstApsDMpsDAO.class);

	// property constants

	public void save(FcstApsDMps transientInstance) {
		log.debug("saving FcstApsDMps instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FcstApsDMps persistentInstance) {
		log.debug("deleting FcstApsDMps instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FcstApsDMps findById(
			com.ivo.hibernate.fcst_aps_d_mps.FcstApsDMpsId id) {
		log.debug("getting FcstApsDMps instance with id: " + id);
		try {
			FcstApsDMps instance = (FcstApsDMps) getSession().get(
					"com.ivo.hibernate.fcst_aps_d_mps.FcstApsDMps", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FcstApsDMps instance) {
		log.debug("finding FcstApsDMps instance by example");
		try {
			List results = getSession().createCriteria(
					"com.ivo.hibernate.fcst_aps_d_mps.FcstApsDMps").add(
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
		log.debug("finding FcstApsDMps instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FcstApsDMps as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FcstApsDMps instances");
		try {
			String queryString = "from FcstApsDMps";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FcstApsDMps merge(FcstApsDMps detachedInstance) {
		log.debug("merging FcstApsDMps instance");
		try {
			FcstApsDMps result = (FcstApsDMps) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FcstApsDMps instance) {
		log.debug("attaching dirty FcstApsDMps instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FcstApsDMps instance) {
		log.debug("attaching clean FcstApsDMps instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}