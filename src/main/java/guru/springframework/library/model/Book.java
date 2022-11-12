package guru.springframework.library.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String title;
    @Getter @Setter
    private String isbn;
    @Getter @Setter
    private Set<Author> authorSet;

    public Book(){}

    public Book(Long id,String title,String isbn,Set<Author> authorSet){
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.authorSet = authorSet;
    }

    public Book(String title,String isbn,Set<Author> authorSet){
        this.title = title;
        this.isbn = isbn;
        this.authorSet = authorSet;
    }
}
