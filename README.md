
# SOLID Principles in Java

This repository provides practical examples of implementing the **SOLID principles** in Java. Each principle is illustrated with both **bad examples** (non-SOLID) and **refactored examples** (SOLID-compliant), making it easier to understand how to design flexible, maintainable, and readable code.

I have written a detailed blog post to dive deeper into the theoretical aspect of these principles. You can read it [here](https://secured-polygon-902513.framer.app/blog/solid-principles).

![solid](https://github.com/user-attachments/assets/1c881840-16f2-45fc-bd24-5d7718c2af44)

## Table of Contents

1. [Overview](#overview)
2. [SOLID Principles](#solid-principles)
   - [Single Responsibility Principle](#single-responsibility-principle)
   - [Open/Closed Principle](#openclosed-principle)
   - [Liskov Substitution Principle](#liskov-substitution-principle)
   - [Interface Segregation Principle](#interface-segregation-principle)
   - [Dependency Inversion Principle](#dependency-inversion-principle)

---

## Overview

The **SOLID** principles are five design principles that help developers build well-structured, understandable, and extendable code. This repository includes examples for each principle, demonstrating how to refactor code to follow SOLID practices.

**SOLID Principles:**
- **S**: Single Responsibility Principle
- **O**: Open/Closed Principle
- **L**: Liskov Substitution Principle
- **I**: Interface Segregation Principle
- **D**: Dependency Inversion Principle

## SOLID Principles

### 1. Single Responsibility Principle (SRP)
- **Definition**: A class should have only one reason to change, meaning it should have only one job.
- **Example**: Separating user data storage and report generation functionalities into different classes.

### 2. Open/Closed Principle (OCP)
- **Definition**: Classes should be open for extension but closed for modification.
- **Example**: Using an interface to allow different discount types, making it easy to add new discounts without modifying the core class.

### 3. Liskov Substitution Principle (LSP)
- **Definition**: Subtypes must be substitutable for their base types.
- **Example**: Creating separate `Rectangle` and `Square` classes to avoid unexpected behavior when setting dimensions.

### 4. Interface Segregation Principle (ISP)
- **Definition**: A class should not be forced to implement interfaces it doesn’t use.
- **Example**: Splitting a `Worker` interface into `Workable` and `Eatable` to better represent classes with only relevant methods.

### 5. Dependency Inversion Principle (DIP)
- **Definition**: High-level modules should not depend on low-level modules. Both should depend on abstractions.
- **Example**: Using an interface to decouple a `Project` class from specific developer types, allowing easier extension.
