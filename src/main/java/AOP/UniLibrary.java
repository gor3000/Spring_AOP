package AOP;
import org.springframework.stereotype.Component;


@Component()


public class UniLibrary extends AbstractLibrary {


    public void getBook(Book book) {
        System.out.println("Mu берем книгу из UniLibrary " + book.getName());
    }

    public void returnBook() {
        System.out.println("Мы возвращаем книгу в UniLibrary");
    }

    public void getMagazin() {
        System.out.println("Mы берем журнал из UniLibrary");
    }



}