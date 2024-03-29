package day06_01.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ProfilingAspect {
		@Pointcut("execution(public * day06_01..*(..))")
		private void profileTarget() {
		}
		@Around("profileTarget()")
		public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
			String signatureString = joinPoint.getSignature().toShortString();
			System.out.println(signatureString + "시작");
			long start = System.currentTimeMillis();
			try {
				Object result = joinPoint.proceed();
				return result;
			} finally {
				long finish = System.currentTimeMillis();
				System.out.println(signatureString + "종료");
				System.out.println(signatureString + "실행 시간: " + (finish - start) + "ms");
			}
		}

}
