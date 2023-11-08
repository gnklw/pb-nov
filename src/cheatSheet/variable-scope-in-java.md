## Variable Scope in Java

The scope of a variable in programming describes the region of the code where a given variable is accessible for use. In Java, there are several different visibility scopes that determine where a variable can be accessed and modified:

### 1. Class Scope (Global Scope)
Variables defined within a class but outside any method, constructor, or block of code, are accessible by all methods and blocks of code within that class (and other classes if the variable is declared as `public` or `protected`).

```java
public class MyClass {
    public static int globalVar = 5; // Class scope

    public void someMethod() {
        System.out.println(globalVar); // Accessing globalVar within a method of the same class
    }
}
```

### 2. Local Scope
Variables defined inside a method, constructor, or block are accessible only within that method, constructor, or block.

```java
public void myMethod() {
    int localVar = 10; // Local scope
    System.out.println(localVar); // Accessing localVar within myMethod
}
// localVar is not accessible outside myMethod
```

### 3. Block Scope
Variables defined within a block of code (e.g., within `if`, `for`, `while` blocks) are accessible only within that block.

```java
if (true) {
    int blockVar = 20; // Block scope
    System.out.println(blockVar); // Accessing blockVar within the if block
}
// blockVar is not accessible outside the if block
```

### 4. Loop Scope
Similar to block scope, variables within a `for` loop are accessible only within that loop.

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i); // Accessing i within the for loop
}
// i is not accessible outside the for loop
```

### 5. Scope in Nested Blocks
Variables defined in an outer block are accessible in the nested blocks but not vice versa.

```java
{
    int outerVar = 30; // Outer block scope
    {
        int innerVar = 40; // Inner block scope
        System.out.println(outerVar); // Accessing outerVar from the inner block
        System.out.println(innerVar); // Accessing innerVar within the inner block
    }
    System.out.println(outerVar); // Accessing outerVar within the outer block
    // innerVar is not accessible outside the inner block
}
```