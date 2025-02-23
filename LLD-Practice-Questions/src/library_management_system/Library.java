package library_management_system;

import library_management_system.book.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(Member member, Book book, LocalDate borrowDate) {
        if (book.isAvailable) {
            member.borrowBook(book, borrowDate);
            book.isAvailable = false;
            System.out.println(member.getName() + " borrowed " + book.title);
        } else {
            System.out.println(book.title + " is not available.");
        }
    }

    public void returnBook(Member member, Book book, LocalDate returnDate) {
        member.returnBook(book, returnDate);
        book.isAvailable = true;
        System.out.println(member.getName() + " returned " + book.title);
    }
}