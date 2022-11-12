package guru.springframework.library.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
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
    @ManyToMany
    @JoinTable(     name = "author_book",
                    joinColumns = @JoinColumn(name = "book_id"),
                    inverseJoinColumns = @JoinColumn(name = "author_id"))
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
