package AOP;
import org.springframework.stereotype.Component;


@Component ("libraryBear" )
public class Library {
  public void getBook (){

        System.out.println("Мы берем книгу");
    }
}