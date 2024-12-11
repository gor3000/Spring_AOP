package AOP.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* AOP.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(* AOP.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary()||allReturnMethodsFromUniLibrary()")
//    private void allGetUndReturnMethodsFromUniLibrary() {
//    }
//
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #-1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #-2");
//    }
//
//    @Before("allGetUndReturnMethodsFromUniLibrary()")
//    public void beforeGetUndReturnLoggingAdvice() {
//        System.out.println("beforeGetUndReturnLoggingAdvice: writing Log #-3");


    @Before("AOP.aspect.MyPointcuts.allGetMethod()")
    public void beforeGetSecurityAdvice() {

        System.out.println("beforeGetSecurityAdvice : проверка прав на получение" + " книги/журнала" + " #- 1");
    }
}