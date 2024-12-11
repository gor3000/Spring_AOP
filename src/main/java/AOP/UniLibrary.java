package AOP;
import org.springframework.stereotype.Component;


@Component()


public class UniLibrary extends AbstractLibrary {


    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary ");
    }

    public void returnBook() {
        System.out.println("Мы возвращаем книгу в UniLibrary");
    }

    public void getMagazin() {
        System.out.println("Mы берем журнал из UniLibrary");
    }

    public void returnMagazin() {
        System.out.println("Mы возвращаем журнал в UniLibrary");
    }

    public void addBook() {
        System.out.println("Мы добавляем книгу в UniLibrary");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в UniLibrary");
    }

}