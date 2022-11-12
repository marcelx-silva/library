package guru.springframework.library.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String firstName;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private Set<Book> bookSet;

    public Author(){}

    public Author(Long id,String firstName,String lastName, Set<Book> bookSet){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookSet = bookSet;
    }

    public Author(String firstName,String lastName, Set<Book> bookSet){
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookSet = bookSet;
    }
}
