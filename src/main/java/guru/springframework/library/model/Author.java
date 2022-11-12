package guru.springframework.library.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

public class Author {
    @Getter @Setter
    private String firstName;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private Set<Book> bookSet;

    public Author(String firstName,String lastName, Set<Book> bookSet){
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookSet = bookSet;
    }
}
