package com.cg.mobileapplication.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.mobileapplication.Dto.Mobile;
@Repository("ordermobiledao")
public class OrderMobileDaoImpl implements OrderMobileDao {
@PersistenceContext
	EntityManager em;
	@Override
	public List<Mobile> showAllMobile() {
		Query query = em.createQuery("From Mobile");
		List<Mobile> myall = query.getResultList();
		return myall;
	}

}
