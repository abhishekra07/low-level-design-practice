package library_management_system;

import library_management_system.book.Book;
import library_management_system.latefee.PremiumLateFee;
import library_management_system.latefee.StandardLateFee;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book();
        book1.title = "The Catcher in the Rye";
        book1.author = "J.D. Salinger";
        book1.isAvailable = true;

        Book book2 = new Book();
        book2.title = "1984";
        book2.author = "George Orwell";
        book2.isAvailable = true;

        // Create library and add books
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        // Create members with different late fee strategies
        Member standardMember = new Member("Alice", new StandardLateFee());
        Member premiumMember = new Member("Bob", new PremiumLateFee());

        // Borrow books with borrow dates
        LocalDate borrowDateAlice = LocalDate.now();
        LocalDate borrowDateBob = LocalDate.now().minusDays(5);  // Bob borrowed 5 days ago
        library.borrowBook(standardMember, book1, borrowDateAlice);  // Alice borrows book1
        library.borrowBook(premiumMember, book2, borrowDateBob);  // Bob borrows book2

        // Simulate returning books with actual return dates
        LocalDate returnDateAlice = LocalDate.now().plusDays(3);  // Alice returns 3 days later
        LocalDate returnDateBob = LocalDate.now();  // Bob returns today

        // Calculate and apply late fees
        double lateFeeAlice = standardMember.calculateLateFee(returnDateAlice);
        double lateFeeBob = premiumMember.calculateLateFee(returnDateBob);

        System.out.println(standardMember.getName() + " owes a late fee of: $" + lateFeeAlice);
        System.out.println(premiumMember.getName() + " owes a late fee of: $" + lateFeeBob);

        // Return books
        library.returnBook(standardMember, book1, returnDateAlice);  // Alice returns book1
        library.returnBook(premiumMember, book2, returnDateBob);   // Bob returns book2
    }
}
