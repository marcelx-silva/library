package guru.springframework.library.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

public class Book {
    @Getter @Setter
    private String title;
    @Getter @Setter
    private String isbn;
    @Getter @Setter
    private Set<Author> authorSet;

    public Book(String title,String isbn,Set<Author> authorSet){
        this.title = title;
        this.isbn = isbn;
        this.authorSet = authorSet;
    }
}
