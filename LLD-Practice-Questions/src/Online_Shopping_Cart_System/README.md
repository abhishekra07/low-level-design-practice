## Scenario: Online Shopping Cart System
You are building an online shopping cart system. It has the following requirements:

- *Cart Management*: Users can add or remove items from their cart.
- *Discounts*: The system supports different types of discounts (e.g., percentage-based, flat-rate discounts).
- *Payment Processing*: Users can pay using multiple payment methods (e.g., credit card, PayPal).
- *Extensibility*: The system should allow adding new discount types and payment methods in the future with minimal changes.
- *Reports*: A report summarizing the cart's total cost and discounts should be generated.
  
### Task
Design and implement this system while adhering to the SOLID principles. Write down how you'd approach it step by step, and ensure that:

   - Each class has a single responsibility.
   - The system is open for extension but closed for modification.
   - You can substitute new implementations without breaking existing functionality.
   - Interfaces are designed to be specific rather than forcing irrelevant methods.
   - Dependencies rely on abstractions, not concrete implementations.