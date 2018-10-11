package com.ek.bo.aop;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class AopServiceImpl implements AopService{
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	public List<String> aopExample1() {
		List<String> list = new ArrayList<String>();
		list.add("Aop");
		list.add(" ");
		list.add("Example !");
		
		logger.info("AopServiceImpl.aopExample1() is run ! ");
		return list;
	}

}
