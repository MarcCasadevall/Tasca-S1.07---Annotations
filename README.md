# Java Annotations – Level 1 Exercises

**Description**:  
This project aims to introduce and reinforce the use of **annotations in Java**. Annotations allow adding metadata to the source code, influencing behavior or providing extra information. This is essential for understanding frameworks like Spring or JPA, which rely heavily on annotations for declarative configuration.

---

## 📌 Exercise Statements

### Exercise 1 — Override
Create a hierarchy of classes with three classes: `Worker`, `InPersonWorker`, and `OnlineWorker`.

- `Worker` (parent class) has attributes: `firstName`, `lastName`, `hourlyRate` and a method `calculateSalary()` that multiplies the number of worked hours by the hourly rate.  
- Child classes must **override** `calculateSalary()` using `@Override`.  

Additional rules:
- `InPersonWorker` should add a static `fuelAllowance` to the salary.  
- `OnlineWorker` should add a final `INTERNET_FEE` to the salary.  

In the `Main` class, create objects of both types and call `calculateSalary()` to demonstrate **polymorphism and the use of @Override**.

---

### Exercise 2 — Deprecated
Add some **deprecated methods** to the child classes (`InPersonWorker` and `OnlineWorker`) and mark them with `@Deprecated`.  

- From an external class (e.g., `Main`), invoke these deprecated methods.  
- Suppress the warnings using `@SuppressWarnings("deprecation")`.

This exercise demonstrates:
- How to mark methods as obsolete  
- How to maintain backward compatibility  
- How to suppress warnings when necessary  

---

## ✨ Features

- Inheritance and method overriding (`@Override`)  
- Polymorphism demonstration  
- Use of `static` and `final` for class attributes  
- Creation and use of deprecated methods (`@Deprecated`)  
- Suppression of compiler warnings (`@SuppressWarnings("deprecation")`)  
- Clean and maintainable code with encapsulation  

---

## 🛠 Technologies

- Backend: Java  
- Recommended IDE: IntelliJ IDEA / Eclipse  
- Version Control: Git  

---

## 🚀 Installation and Execution

1. Clone the repository:  
   ```bash
   git clone <repository-url>
