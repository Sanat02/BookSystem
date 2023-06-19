package kg.attractor.java.lesson44;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BookDataModel {
    private List<Book> books = new ArrayList<>();
    private Book book = new Book("Alice in Wonderland", "fairy-tayle", "Lewis Carol", "images/alice.jpg", "given", "Vin Diesel","1865");

    public BookDataModel() {
        books = readFile();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    List<Book> readFile() {
        List<Book> bookList = new ArrayList<>();
        try {
            Path path = Paths.get("books.json");
            String json = Files.readString(path);
            Type listType = new TypeToken<ArrayList<Book>>() {
            }.getType();
            bookList = new Gson().fromJson(json, listType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookList;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public static class Book {
        private String name;
        private String genre;
        private String author;
        private String image;
        private String state;
        private String bookTaker;
        private String year;

        public Book(String name, String genre, String author, String image, String state, String bookTaker,String year) {
            this.name = name;
            this.genre = genre;
            this.author = author;
            this.image = image;
            this.state = state;
            this.bookTaker = bookTaker;
            this.year=year;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getBookTaker() {
            return bookTaker;
        }

        public void setBookTaker(String bookTaker) {
            this.bookTaker = bookTaker;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }
    }
}
