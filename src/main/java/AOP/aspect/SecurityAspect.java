package AOP.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
//    @Before("AOP.aspect.MyPointcuts.allAddMethods()")
//    public void beforeAddLoggingAdvice() {
//        System.out.println("beforeGetBookAdvice: проверка прав на получить книгу/журнал  " + "      #- 2");
//        System.out.println("------------------------------------------------------------");
//    }
}
