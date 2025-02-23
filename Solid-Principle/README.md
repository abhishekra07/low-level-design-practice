SOLID Principles Recap
1. Single Responsibility Principle (SRP)
   🔑 Key Idea: One class = One responsibility.

Example:

ReportGenerator → Formats reports.
FileExporter → Exports files.
🛑 Bad: Mixing both responsibilities in one class.
✅ Good: Split them into two classes.

📌 Pop-Up:

"If I need to change how files are exported, I only touch FileExporter, not ReportGenerator."
2. Open/Closed Principle (OCP)
   🔑 Key Idea: Extend without modifying.

Example:

Discount → Interface.
BlackFridayDiscount → 30% off.
ClearanceSaleDiscount → 50% off.
CombinedDiscount → Combines discounts.
🛑 Bad: Adding if-else in the base class for every discount type.
✅ Good: Add new classes for each discount.

📌 Pop-Up:

"To add a new discount, I just create a new class implementing Discount—no need to touch old code!"
3. Liskov Substitution Principle (LSP)
   🔑 Key Idea: Subclasses must behave like their parent class.

Example:

Bird → Parent class.
Sparrow → Flies.
Penguin → Doesn’t fly.
🛑 Bad: Bird has a fly() method that Penguin can’t use.
✅ Good: Abstract Bird to focus on shared behavior (e.g., walk()).

📌 Pop-Up:

"Substitute a Penguin for a Bird, and the app shouldn’t break!"
4. Interface Segregation Principle (ISP)
   🔑 Key Idea: Smaller, specific interfaces > One huge interface.

Example:

Big Interface: Machine (methods: print(), scan(), fax()).
Split Interfaces:
Printer → print().
Scanner → scan().
Fax → fax().
🛑 Bad: Printer class forced to implement scan() and fax() methods it doesn’t use.
✅ Good: Printer only implements Printer interface.

📌 Pop-Up:

"Let classes implement only what they need—no more, no less!"
5. Dependency Inversion Principle (DIP)
   🔑 Key Idea: Depend on abstractions, not concrete classes.

Example:

EmailService depends on EmailSender (interface).
SmtpEmailSender and SendGridEmailSender implement EmailSender.
Use Dependency Injection (DI) to pass the desired implementation to EmailService.
🛑 Bad: Directly using SmtpEmailSender inside EmailService.
✅ Good: Use EmailSender interface.

📌 Pop-Up:

"If I switch from SMTP to SendGrid, I don’t touch EmailService—just inject the new sender!"