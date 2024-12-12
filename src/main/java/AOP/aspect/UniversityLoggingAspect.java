package AOP.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents ()) ")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение " +
//                "списка студентов перед методом getStudents");
//    }

    //    @AfterReturning(" execution(* getStudents() ) ")
//    public void afterReturningGetStudentsLoggingAdvice() {
//        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение " +
//                "списка студентов после работы метода getStudents");
//    }
    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exeption")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exeption) {
        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем выброс " + "исключения" + exeption);

    }
}
