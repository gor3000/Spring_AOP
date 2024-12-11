package AOP.aspect;


import AOP.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
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


    @Before("AOP.aspect.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod()  = "
                + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() "
                + methodSignature.getReturnType());
        System.out.println("methodSignature.getName()  = "
                + methodSignature.getName());


        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: название - " +
                            myBook.getName() + ", автор - " + myBook.getAuther() +
                            ", год издания - " + myBook.getYearOfPublication());
                } else if (obj instanceof String) {
                    System.out.println("книгу в библиотеку добавляет " + obj);

                }



        System.out.println("beforeGetSecurityAdvice : проверка прав на получение" + " книги/журнала" + " #- 1");
                System.out.println("------------------------------------------------------------");
            }
        }
    }
}