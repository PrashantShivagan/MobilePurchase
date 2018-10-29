package com.cg.mobileapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.mobileapplication.Dto.Mobile;
import com.cg.mobileapplication.Service.OrderMobileService;

@Controller
public class OrderMobileController {
	@Autowired
	OrderMobileService service;
	@RequestMapping(value="show")
	public ModelAndView showData(){
		List<Mobile> allMobile = service.showAllMobile();
		return new ModelAndView("Showdata","temp", allMobile);
		
	}
}
