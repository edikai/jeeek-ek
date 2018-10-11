package com.ek.bo.aop;

import java.util.List;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopExampleAspectJ {

	private Logger logger = Logger.getLogger(this.getClass());
	 /*
	  * 以下都是正确的切入点表达式
	  @Pointcut("execution(* AspectJTestBean.*(..))")
	  @Pointcut("execution(void com.laoyangx.bean.chapter11.*.*(..))")
	  @Pointcut("execution(* com.laoyangx.bean.chapter11..*.*(..))")    
	  @Pointcut("execution(* com.laoyangx.bean.chapter11.AspectJTestBean.*(..))")
	*/ 
	
	@Pointcut("execution(public * com.ek.bo.aop.AopService.*(..))")
	public void beforeTest(){}
	
	@Before("beforeTest()")
	public void beforeAspectJAopExample(JoinPoint jp){
		AopServiceImpl si = (AopServiceImpl) jp.getTarget();
		logger.info(si.getClass().getName()+"."+jp.getSignature().getName()+" 将要运行 ！");
	}
	 
	
	@SuppressWarnings("unchecked")
	@AfterReturning(pointcut="beforeTest()", returning="retVal")
	public void afterAspectJAopExample(JoinPoint jp, Object retVal){
		AopServiceImpl si = (AopServiceImpl) jp.getTarget();
		logger.info(si.getClass().getName()+"."+jp.getSignature().getName()+" is run over ! ");
		logger.info("And AfterRunning is my own method ! ");
		
		List<String> list = (List<String>) retVal;
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
}
