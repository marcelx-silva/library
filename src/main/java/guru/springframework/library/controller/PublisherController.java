package guru.springframework.library.controller;

import guru.springframework.library.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublisherController {

    private final BookRepository bookRepository;

    public PublisherController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getAllBook(Model model){
        model.addAttribute("book",bookRepository.findAll());
        return null;
    }
}
