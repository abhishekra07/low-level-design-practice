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


## Scenario: Student Grading System

- Allow students to enroll in courses.
- Calculate final grades based on assignments and exams for each student.
- Generate a grade report (like A, B, C, etc.) for a student.
- Support additional grading strategies in the future (e.g., Pass/Fail, GPA-based grading).

## Scenario: Employee Management System
Let's say we're building a simple employee management system. We have different types of employees, and we need to handle different roles and compensation schemes. Employees could be Full-time, Part-time, or Contract.

Here's the rough breakdown of what we're trying to achieve:

- Employees should have a name, age, and role.
- Each employee type will have different compensation calculations.
- We should be able to generate a report for each employee showing their compensation.

We'll need to apply SOLID principles to this structure. Let's get started with the basic class setup.

### Your task:
- Define the classes and interfaces based on the problem.
- Ensure that SOLID principles (especially the ones we've learned) are applied.