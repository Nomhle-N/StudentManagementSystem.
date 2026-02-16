# StudentManagementSystem.
A student system using builder pattern ,inheritance and polymorphism to calculate tuition and show student details.It is writtern in Java.
Design Pattern Used:
The Builder Pattern is used to create student objects.
It makes the code easier to read and allows optional values.
Example from this project:
UndergraduateStudent ug = new UndergraduateStudent.Builder("2258412", "Anelisa")
.email("2258412@cput.ac.za")
.department("Marketing")
.creditHours(18)
.scholarshipAmount(2000)
.build();

GraduateStudent grad = new GraduateStudent.Builder("2514896", "Azola")
.email("2514896@mycput.ac.za")
.department("Information Technology")
.researchAssistant(true)
.stipend(2500)
.build();

Inheritance and Polymorphism-
The base class:
Student
is extended by:
UndergraduateStudent
GraduateStudent
Each type calculates tuition differently.
SOLID Principles Used-
1. Single Responsibility Principle
Each class has one job.
Student stores shared student information.
UndergraduateStudent handles undergraduate data.
GraduateStudent handles graduate data.
Main runs the program.

2. Open/Closed Principle
The system can be extended without changing existing code.
For example, a PartTimeStudent class can be added later.
Project Structure:
za.ac.cput (package)
 model
-Student.java
-UndergraduateStudent.java
-GraduateStudent.java
main
-Main.java
How to Run-
1. Open the project in IntelliJ IDEA.
2. Run Main.java.
3. The student details and tuition will display.




