package guru.springframework.library.bootstrap;

import guru.springframework.library.model.Author;
import guru.springframework.library.model.Book;
import guru.springframework.library.model.Publisher;
import guru.springframework.library.repository.AuthorRepository;
import guru.springframework.library.repository.BookRepository;
import guru.springframework.library.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    //injeção de dependência
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    private Publisher publisherOne = new Publisher("Grupo Editorial Alta Books",
            "R. Viúva Cláudio, 291",
            "Jacaré","Rio de Janeiro","20970-031");

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    private void logDatabase(){
        System.out.println("Log:");
        System.out.println("Quantidade de Autores: "+authorRepository.count());
        System.out.println("Quantidade de Livros: "+bookRepository.count());
        System.out.println("Quantidade de Editores: "+publisherRepository.count());
    }

    private void createEntityOne(){

        Author authorOne = new Author("Eric","Evans");
        Book bookOne = new Book("Domain Drive Design","8550800651",publisherOne);

        authorOne.getBookSet().add(bookOne);
        bookOne.getAuthorSet().add(authorOne);

        authorRepository.save(authorOne);
        bookRepository.save(bookOne);
    }

    private void createEntityTwo(){

        Author authorTwo = new Author("Robert","C. Martin");
        Book bookTwo = new Book("Código limpo: Habilidades práticas do Agile Software","8576082675",publisherOne);


        authorTwo.getBookSet().add(bookTwo);
        bookTwo.getAuthorSet().add(authorTwo);


        authorRepository.save(authorTwo);
        bookRepository.save(bookTwo);
    }

    @Override
    public void run(String... args) throws Exception {
        createPublisherEntity();
        createEntityOne();
        createEntityTwo();
        logDatabase();
    }

    private void createPublisherEntity() {
        publisherRepository.save(publisherOne);
    }
}
