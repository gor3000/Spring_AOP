package AOP.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice:  в библиотеку " +
                "пытаются вернуть книгу");
        Object targetMethodResuit = proceedingJoinPoint.proceed();
        System.out.println("aroundReturnBookLoggingAdvice:  в библиотеку " +
                "успешно вернули книгу");
        return targetMethodResuit;
    }
}
