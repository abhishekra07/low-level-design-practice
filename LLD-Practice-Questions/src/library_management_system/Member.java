package library_management_system;

import library_management_system.book.Book;
import library_management_system.latefee.LateFee;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();
    private LateFee lateFeeStrategy;
    private LocalDate borrowDate;

    public Member(String name, LateFee lateFeeStrategy) {
        this.name = name;
        this.lateFeeStrategy = lateFeeStrategy;
    }

    public void borrowBook(Book book, LocalDate borrowDate) {
        borrowedBooks.add(book);
        this.borrowDate = borrowDate;
    }

    public void returnBook(Book book, LocalDate returnDate) {
        borrowedBooks.remove(book);
        calculateLateFee(returnDate);
    }

    public double calculateLateFee(LocalDate returnDate) {
        long daysLate = ChronoUnit.DAYS.between(borrowDate, returnDate);
        if (daysLate > 0) {
            return lateFeeStrategy.calculateFee(daysLate);
        } else {
            return 0; // No late fee if returned on time
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public LateFee getLateFeeStrategy() {
        return lateFeeStrategy;
    }

    public void setLateFeeStrategy(LateFee lateFeeStrategy) {
        this.lateFeeStrategy = lateFeeStrategy;
    }
}
