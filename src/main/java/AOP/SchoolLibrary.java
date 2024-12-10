package AOP;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {


    public void getBook() {
        System.out.println("Mu берем книгу из SchoolLibrary ");
    }
}
