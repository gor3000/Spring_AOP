package AOP;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("ბავშვობის დღეები")
    private String name;

    @Value("Ф.M.Достоевский")
    private String auther;

    @Value("1866")
    private int yearOfPublication;

    public String getAuther() {
        return auther;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getName() {
        return name;
    }
}
