package AOP;
import org.springframework.stereotype.Component;


@Component()


public class UniLibrary extends AbstractLibrary {


    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary ");
        System.out.println("------------------------------------------------------------");
    }

    public String returnBook() {
        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "Война и мир";
    }

    public void getMagazin() {
        System.out.println("Mы берем журнал из UniLibrary");
        System.out.println("------------------------------------------------------------");
    }

    public void returnMagazin() {
        System.out.println("Mы возвращаем журнал в UniLibrary");
        System.out.println("------------------------------------------------------------");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println("------------------------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в UniLibrary");
        System.out.println("------------------------------------------------------------");
    }

}