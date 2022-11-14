package guru.springframework.library.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String addresLineOne;
    @Getter @Setter
    private String city;
    @Getter @Setter
    private String state;
    @Getter @Setter
    private String zip;

    @Getter @Setter
    @OneToMany
    private Set<Book> bookSet = new HashSet<>();
    //'Basic' attribute type should not be a container

    public Publisher (){}


    public Publisher(String name,String addresLineOne, String city, String state, String zip){
        this.name = name;
        this.addresLineOne = addresLineOne;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Publisher(String name,String addresLineOne, String city, String state, String zip, Set<Book> bookSet){
        this.name = name;
        this.addresLineOne = addresLineOne;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.bookSet = bookSet;
    }

    public Publisher(Long id, String name,String addresLineOne, String city, String state, String zip){
        this.id = id;
        this.name = name;
        this.addresLineOne = addresLineOne;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Publisher(Long id, String name,String addresLineOne, String city, String state, String zip, Set<Book> bookSet){
        this.id = id;
        this.name = name;
        this.addresLineOne = addresLineOne;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.bookSet = bookSet;
    }


}
