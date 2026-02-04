# Copilot Instructions - Java DSA & OOP

## Project Overview
This is a Java-focused repository for Data Structures & Algorithms with emphasis on Object-Oriented Programming principles.

## Code Organization & Structure

### Package Conventions
- Organize by topic: `datastructures/`, `algorithms/`, `oopprinciples/`, `problems/`
- Use lowercase package names following Java conventions
- Each major concept should have its own packa ge

### Class Structure Pattern
```java
// Each DS/Algorithm class should include:
// 1. Class-level documentation with complexity analysis
// 2. Private fields with proper encapsulation
// 3. Constructors with validation
// 4. Public methods with clear contracts
// 5. Helper methods as private
// 6. Main method for testing/demonstration
```

## OOP Principles to Apply

### Encapsulation
- All fields should be private with getters/setters when needed
- Validate inputs in constructors and setters
- Use immutable classes where appropriate (final fields, no setters)

### Inheritance & Polymorphism
- Use abstract classes for shared DS/algorithm behaviors
- Implement interfaces for common operations (Iterable, Comparable)
- Prefer composition over inheritance for utility classes

### Example Pattern
```java
public abstract class AbstractTree<T> {
    protected Node<T> root;
    public abstract void insert(T data);
    public abstract boolean search(T data);
}
```

## Documentation Standards

### Required Comments
- **Class-level**: Purpose, time/space complexity, typical use cases
- **Method-level**: Parameters, return values, exceptions, complexity
- Use `@param`, `@return`, `@throws` JavaDoc tags

### Complexity Notation
Always document Big-O notation for operations:
```java
/**
 * Inserts element into binary search tree
 * Time: O(log n) average, O(n) worst case
 * Space: O(1)
 */
```

## Testing & Demonstration

### Main Method Pattern
Each class should include a main method demonstrating:
1. Basic usage examples
2. Edge cases (empty, single element, large input)
3. Expected output with clear println statements

```java
public static void main(String[] args) {
    // Create instance
    // Test basic operations
    // Test edge cases
    // Display results with labels
}
```

## Naming Conventions

- **Classes**: PascalCase, descriptive (BinarySearchTree, LinkedList)
- **Methods**: camelCase, verb-based (insertNode, removeElement)
- **Variables**: camelCase, meaningful names (currentNode, not n)
- **Constants**: UPPER_SNAKE_CASE (MAX_SIZE, DEFAULT_CAPACITY)
- **Generics**: Single uppercase letter (T, E, K, V)

## Common Patterns

### Node Classes
Use static inner classes for data structure nodes:
```java
private static class Node<T> {
    T data;
    Node<T> next;
    Node(T data) { this.data = data; }
}
```

### Generic Type Usage
- Use `<T extends Comparable<T>>` when ordering is needed
- Provide both generic and primitive type support where applicable

### Exception Handling
- Throw IllegalArgumentException for invalid inputs
- Throw IllegalStateException for invalid operations (e.g., pop on empty stack)
- Document exceptions in method JavaDoc

## Build & Run

### Compilation
```bash
javac -d bin src/package/ClassName.java
```

### Execution
```bash
java -cp bin package.ClassName
```

### Quick Test
Each file can be compiled and run independently for testing

## Code Quality Expectations

- No public fields (except static final constants)
- Avoid code duplication - extract common logic to helper methods
- Keep methods focused (single responsibility)
- Null checks on object parameters
- Meaningful variable names over comments
- Consistent indentation (4 spaces)

## Problem-Solving Approach

When implementing algorithms:
1. Write clear problem statement as comment
2. Explain the approach before implementation
3. Provide examples of input/output
4. Analyze time and space complexity
5. Include alternative approaches as comments if relevant
