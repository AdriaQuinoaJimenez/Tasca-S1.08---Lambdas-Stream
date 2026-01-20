# Task 08: Lambdas & Streams

**Description**: A comprehensive collection of exercises designed to master **Functional Programming in Java** (versions 8+). The project focuses on transitioning from imperative to declarative programming using the **Stream API**, **Lambda Expressions**, **Method References**, and **Custom Functional Interfaces**. It covers a range of complexities, from basic list filtering to algorithmic sorting strategies and arithmetic operations.

## 📌 Challenges Description

The project is divided into two mastery levels:

### Level 1: Basics of Streams & Lambdas
* **Filtering:** Identifying strings containing specific characters ("o") and length constraints (>5).
* **Printing:** Using Lambda expressions vs. Method References (`System.out::println`).
* **Custom Interfaces:** Creating interfaces to return constants (Pi) or manipulate strings (Reverse).
* **Sorting:** Ordering lists by string length (ascending and descending).

### Level 2: Advanced Data Manipulation
* **Complex Filtering:** Filtering names starting with 'A' with exact length constraints.
* **Data Transformation (Map):** Formatting integer lists into a single string, prefixing numbers with "e" (even) or "o" (odd).
* **Arithmetic Strategy:** Implementing a calculator using a single Functional Interface `Operation` to define Addition, Subtraction, Multiplication, and Division dynamically.
* **Advanced List Processing (Exercise 4):**
    1.  Sorting alphabetically by the first character.
    2.  **Custom Logic Sorting:** Prioritizing words containing "e" at the beginning of the list.
    3.  **Mapping:** Replacing specific characters ('a' → '4').
    4.  **Regex Filtering:** Extracting valid numeric values (integers and decimals) stored as Strings.

## ✨ Functionalities

* **Declarative Code:** Usage of `.stream()`, `.filter()`, `.map()`, and `.collect()` to write clean and readable code.
* **Strategy Pattern:** Implementation of the `ListFilterer` and `Operation` interfaces to decouple the logic definition from execution.
* **Custom Comparator Logic:** Algorithmic sorting returning `-1`, `0`, or `1` based on character presence.
* **Robust Pattern Matching:** Usage of **Regular Expressions (Regex)** to validate numeric strings including floating-point numbers.
* **Type Safety:** Proper handling of `FunctionalInterface` annotations.

## 🛠 Technologies

-   **Backend:** Java SE (JDK 17+)
-   **Build Tool:** Maven / Gradle (Optional)
-   **IDE:** IntelliJ IDEA / Eclipse
-   **Version Control:** Git

## 🚀 Installation and Execution

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/your-username/java-lambdas-streams.git](https://github.com/your-username/java-lambdas-streams.git)
    ```