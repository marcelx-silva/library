package guru.springframework.library.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;
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
    @ManyToMany(mappedBy = "authorSet")
    private Set<Book> bookSet;

    public Author(){}

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        return Objects.equals(id, author.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bookSet=" + bookSet +
                '}';
    }
}
