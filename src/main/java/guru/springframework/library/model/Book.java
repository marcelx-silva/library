package guru.springframework.library.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
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
    private Set<Author> authorSet = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Book(){}

    public Book(String title, String isbn, Publisher publisher){
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    public Book(Long id,String title,String isbn,Set<Author> authorSet,Publisher publisher){
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.authorSet = authorSet;
        this.publisher = publisher;
    }

    public Book(String title,String isbn,Set<Author> authorSet,Publisher publisher){
        this.title = title;
        this.isbn = isbn;
        this.authorSet = authorSet;
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", authorSet=" + authorSet +
                '}';
    }
}
