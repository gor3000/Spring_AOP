package aop;
import AOP.Library;

public class Testl {
    public static void main(String[]  args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Library library = context .getBean ( name: "libraryBear.",  Library.class) ;
        library.getBookO ;
) }
}
context.close();