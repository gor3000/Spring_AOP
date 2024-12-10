package AOP.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {
    @Pointcut("execution(* get* ())")
    private void allGetMethod() {
    }


    @Before("allGetMethod()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить книгу/журнал");
    }

    @Before("allGetMethod()")
    public void beforeGetSecurityAdvice() {

        System.out.println("beforeGetSecurityAdvice : проверка прав на получение" + " книги/журнала");
    }
}