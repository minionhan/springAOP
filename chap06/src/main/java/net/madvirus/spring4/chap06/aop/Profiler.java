package net.madvirus.spring4.chap06.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Profiler {
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable{
		String signaturString = joinPoint.getSignature().toShortString();
		System.out.println("+++"+signaturString+" 시작");
		long start = System.currentTimeMillis();
		try{
			Object result = joinPoint.proceed();
			return result;
		} finally{
			long finish = System.currentTimeMillis();
			System.out.println(signaturString+" 종료");
			System.out.println(signaturString+" 실행시간: "+(finish - start)+"ms");
		}
	}

}
