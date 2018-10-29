package com.cg.mobileapplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.mobileapplication.Dao.OrderMobileDao;
import com.cg.mobileapplication.Dao.OrderMobileDaoImpl;
import com.cg.mobileapplication.Dto.Mobile;
@Service("ordermobileservice")
@Transactional
public class OrderMobileServiceImpl implements OrderMobileService {
	@Autowired
	OrderMobileDao dao ;
	public OrderMobileServiceImpl() {
		 dao = new OrderMobileDaoImpl();
	}
	@Override
	public List<Mobile> showAllMobile() {
		// TODO Auto-generated method stub
		return dao.showAllMobile();
	}

}
