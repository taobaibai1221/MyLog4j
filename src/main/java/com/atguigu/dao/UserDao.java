package com.atguigu.dao;

import org.apache.log4j.Logger;

public class UserDao {
	
	private static final Logger logger = Logger.getLogger(UserDao.class);

	public void sayHello(){
		if (logger.isDebugEnabled()) {
			logger.debug("sayHello() - start");
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("sayHello() - end");
		}
	}
	
	public static void main(String[] args) {
		
//		logger.debug("hello log4j-----debug");
//		logger.info("hello log4j-----info");
//		logger.warn("hello log4j-----warn");
//		logger.error("hello log4j-----error");
		
		int age = 0;
		if (logger.isInfoEnabled()) {
			logger.info("main(String[]) - int age=" + age);
		}
		
		
//		try {
//			logger.debug("111111");
//			age = 10/5;
//			logger.debug("222222");
//		} catch (Exception e) {
//			e.printStackTrace();
//			logger.error(e.getMessage(), e.getCause());
//		}
		
	}

}
