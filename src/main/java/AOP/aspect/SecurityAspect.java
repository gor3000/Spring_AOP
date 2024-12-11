package AOP.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("AOP.aspect.MyPointcuts.allGetMethod()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetBookAdvice: проверка прав на получить книгу/журнал  " + "      #- 2");
    }
}
