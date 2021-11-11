# Recitation9-591Fall2021
---
## Topics Recap
1. HashMap
    * Concepts
        * Key -> Value Mapping/Look-up Table
        * Hashing == Fast Operation == Less Time Resources == Useful in Computing
    * Operations
        * put(key, value)
        * putIfAbsent(key, value)
        * get(key)
        * getOrDefault(key)
        * containsKey(key)
        * remove(key)
        * keySet()
    * Application 
        * Counter, Memoization, fast look-up of key->value

2. HashSet 
    * Concepts
        * a set of value -> no repeating
        * again, Hashing == Fast Operation == Less Time Resources == Useful in Computing
    * Operations
        * add(element) -> return boolean
        * remove(element) -> return boolean
        * contains(element) -> return boolean
        * size() -> return int
        * return value can be useful

3. Recursion
    * Concepts
        * A function that calls itself repeatedly
        * A recursive algorithm is an algorithm that breaks the problem into smaller subproblems and applies the same algorithm to solve the smaller subproblems.
        * The base case is the case where a recursive algorithm actually does some final work--grading the one exam in the previous case.
    * Rule of Thumb to appproach a problem recursively
        * Think about how the problem can be break into smaller problems
        * Always think about the base case
---
## Recap Example
In RecapExample.java, there are 3 inner classes that are waiting to be implemented. We will be going through these examples during recitation.
1. Use HashMap to implement a counter
2. Subway Fare table stored in HashMap
3. Student Grades: HashMap of HashMaps
---
## Recitation Problem Set
Complete either Q1-Q5 *or* Q6-Q7 in Rec9ProblemSet.java. 
1. Print all entries in HashMap
2. Find repeated character in a String (use HashMap)
3. Find repeated character in a String (use HashSet)
4. Find mode in an array of numbers (use HashMap)
5. Fibonacci number generator (use Recursion)
6. Two-Sum (Use HashMap)
7. Check Panlindrome

### What to Submit?
Copy and paste your code into gradscopes.
#### Note: Q6 and Q7 are optional questions that are slightly harder than Q1-Q5. If you decide to work on Q6 and Q7, you don't need to finish Q1-Q5 to get points for recitation.
