# CSP-Solver
This project focuses on solving Numerical Constraint Satisfaction Problems (CSPs), employing Depth First Search (DFS) with pruning in Java. 

It offers a clear view of the SEARCH TREE in the console and diligently tracks failed consistency checks.

Flexibility is at your fingertips:
- Adjust the hardcoded values of VariableOrdering and VariableDomain to tailor the solution to different problems.
- Expand the scope by introducing new numerical constraints through the IsSatisfyingConstraint method for added depth.

This project was a hands-on opportunity to explore CSPs and gain valuable experience in algorithmic problem-solving.

## CURRENT INPUTS  
    1. 8 variables a,b,c,d,e,f,g,h with the same domain {1,2,3,4}
    2. A variable ordering for the search (ex: "F", "H", "C", "D", "G", "E", "A", "B")
    3. A set of constraints that need to be satisfied:
        a > g
        a <= h
        |f - b| = 1
        g < h
        |g - c| = 1
        (h - c) mod 2 = 0
        h != d
        d >= g
        d != c
        e != c
        e < d - 1
        e != h - 2
        g != f
        h != f
        c != f
        d != f - 1
        |e - f| mod 2 = 1
## CURRENT OUTPUT
    1. SEARCH TREE
    2. Number of loops taken
    3. Number of failing consistency checks
    4. Variable Ordering
    5. Solutions (if they exist)
    
## Sample Output
SEARCH TREE  
F = 4 H = 4 failure  
F = 4 H = 3 C = 2 failure  
F = 4 H = 3 C = 4 failure  
F = 4 H = 3 C = 3 D = 3 failure  
F = 4 H = 3 C = 3 D = 4 G = 1 failure  
F = 4 H = 3 C = 3 D = 4 G = 3 failure  
F = 4 H = 3 C = 3 D = 4 G = 4 failure  
F = 4 H = 3 C = 3 D = 4 G = 2 E = 1 failure  
F = 4 H = 3 C = 3 D = 4 G = 2 E = 2 failure  
F = 4 H = 3 C = 3 D = 4 G = 2 E = 3 failure  
F = 4 H = 3 C = 3 D = 4 G = 2 E = 4 failure  
F = 4 H = 3 C = 3 D = 2 G = 1 failure  
F = 4 H = 3 C = 3 D = 2 G = 3 failure  
F = 4 H = 3 C = 3 D = 2 G = 4 failure  
F = 4 H = 3 C = 3 D = 2 G = 2 E = 1 failure  
F = 4 H = 3 C = 3 D = 2 G = 2 E = 2 failure  
F = 4 H = 3 C = 3 D = 2 G = 2 E = 3 failure  
F = 4 H = 3 C = 3 D = 2 G = 2 E = 4 failure  
F = 4 H = 3 C = 3 D = 1 G = 1 failure  
F = 4 H = 3 C = 3 D = 1 G = 2 failure  
F = 4 H = 3 C = 3 D = 1 G = 3 failure  
F = 4 H = 3 C = 3 D = 1 G = 4 failure  
F = 4 H = 3 C = 1 D = 1 failure  
F = 4 H = 3 C = 1 D = 3 failure  
F = 4 H = 3 C = 1 D = 4 G = 1 failure  
F = 4 H = 3 C = 1 D = 4 G = 3 failure  
F = 4 H = 3 C = 1 D = 4 G = 4 failure  
F = 4 H = 3 C = 1 D = 4 G = 2 E = 1 failure  
F = 4 H = 3 C = 1 D = 4 G = 2 E = 2 failure  
F = 4 H = 3 C = 1 D = 4 G = 2 E = 3 failure  
F = 4 H = 3 C = 1 D = 4 G = 2 E = 4 failure  
F = 4 H = 3 C = 1 D = 2 G = 1 failure  
F = 4 H = 3 C = 1 D = 2 G = 3 failure  
F = 4 H = 3 C = 1 D = 2 G = 4 failure  
F = 4 H = 3 C = 1 D = 2 G = 2 E = 1 failure  
F = 4 H = 3 C = 1 D = 2 G = 2 E = 2 failure  
F = 4 H = 3 C = 1 D = 2 G = 2 E = 3 failure  
F = 4 H = 3 C = 1 D = 2 G = 2 E = 4 failure  
F = 4 H = 2 C = 1 failure  
F = 4 H = 2 C = 3 failure  
F = 4 H = 2 C = 4 failure  
F = 4 H = 2 C = 2 D = 2 failure  
F = 4 H = 2 C = 2 D = 3 failure  
F = 4 H = 2 C = 2 D = 4 G = 2 failure  
F = 4 H = 2 C = 2 D = 4 G = 3 failure  
F = 4 H = 2 C = 2 D = 4 G = 4 failure  
F = 4 H = 2 C = 2 D = 4 G = 1 E = 2 failure  
F = 4 H = 2 C = 2 D = 4 G = 1 E = 3 failure  
F = 4 H = 2 C = 2 D = 4 G = 1 E = 4 failure  
F = 4 H = 2 C = 2 D = 4 G = 1 E = 1 A = 1 failure  
F = 4 H = 2 C = 2 D = 4 G = 1 E = 1 A = 3 failure  
F = 4 H = 2 C = 2 D = 4 G = 1 E = 1 A = 4 failure  
F = 4 H = 2 C = 2 D = 4 G = 1 E = 1 A = 2 B = 1 failure  
F = 4 H = 2 C = 2 D = 4 G = 1 E = 1 A = 2 B = 2 failure  
F = 4 H = 2 C = 2 D = 4 G = 1 E = 1 A = 2 B = 4 failure  
F = 4 H = 2 C = 2 D = 4 G = 1 E = 1 A = 2 B = 3 solution  
F = 4 H = 2 C = 2 D = 1 G = 2 failure  
F = 4 H = 2 C = 2 D = 1 G = 3 failure  
F = 4 H = 2 C = 2 D = 1 G = 4 failure  
F = 4 H = 2 C = 2 D = 1 G = 1 E = 1 failure  
F = 4 H = 2 C = 2 D = 1 G = 1 E = 2 failure  
F = 4 H = 2 C = 2 D = 1 G = 1 E = 3 failure  
F = 4 H = 2 C = 2 D = 1 G = 1 E = 4 failure  
F = 4 H = 1 C = 2 failure  
F = 4 H = 1 C = 4 failure  
F = 4 H = 1 C = 3 D = 1 failure  
F = 4 H = 1 C = 3 D = 3 failure  
F = 4 H = 1 C = 3 D = 4 G = 1 failure  
F = 4 H = 1 C = 3 D = 4 G = 2 failure  
F = 4 H = 1 C = 3 D = 4 G = 3 failure  
F = 4 H = 1 C = 3 D = 4 G = 4 failure  
F = 4 H = 1 C = 3 D = 2 G = 1 failure  
F = 4 H = 1 C = 3 D = 2 G = 2 failure  
F = 4 H = 1 C = 3 D = 2 G = 3 failure  
F = 4 H = 1 C = 3 D = 2 G = 4 failure  
F = 4 H = 1 C = 1 D = 1 failure  
F = 4 H = 1 C = 1 D = 3 failure  
F = 4 H = 1 C = 1 D = 4 G = 1 failure  
F = 4 H = 1 C = 1 D = 4 G = 2 failure  
F = 4 H = 1 C = 1 D = 4 G = 3 failure  
F = 4 H = 1 C = 1 D = 4 G = 4 failure  
F = 4 H = 1 C = 1 D = 2 G = 1 failure  
F = 4 H = 1 C = 1 D = 2 G = 2 failure  
F = 4 H = 1 C = 1 D = 2 G = 3 failure  
F = 4 H = 1 C = 1 D = 2 G = 4 failure  
F = 3 H = 3 failure  
F = 3 H = 4 C = 1 failure  
F = 3 H = 4 C = 3 failure  
F = 3 H = 4 C = 4 D = 2 failure  
F = 3 H = 4 C = 4 D = 4 failure  
F = 3 H = 4 C = 4 D = 3 G = 1 failure  
F = 3 H = 4 C = 4 D = 3 G = 2 failure  
F = 3 H = 4 C = 4 D = 3 G = 3 failure  
F = 3 H = 4 C = 4 D = 3 G = 4 failure  
F = 3 H = 4 C = 4 D = 1 G = 1 failure  
F = 3 H = 4 C = 4 D = 1 G = 2 failure  
F = 3 H = 4 C = 4 D = 1 G = 3 failure  
F = 3 H = 4 C = 4 D = 1 G = 4 failure  
F = 3 H = 4 C = 2 D = 2 failure  
F = 3 H = 4 C = 2 D = 4 failure  
F = 3 H = 4 C = 2 D = 3 G = 2 failure  
F = 3 H = 4 C = 2 D = 3 G = 3 failure  
F = 3 H = 4 C = 2 D = 3 G = 4 failure  
F = 3 H = 4 C = 2 D = 3 G = 1 E = 1 failure  
F = 3 H = 4 C = 2 D = 3 G = 1 E = 2 failure  
F = 3 H = 4 C = 2 D = 3 G = 1 E = 3 failure  
F = 3 H = 4 C = 2 D = 3 G = 1 E = 4 failure  
F = 3 H = 4 C = 2 D = 1 G = 2 failure  
F = 3 H = 4 C = 2 D = 1 G = 3 failure  
F = 3 H = 4 C = 2 D = 1 G = 4 failure  
F = 3 H = 4 C = 2 D = 1 G = 1 E = 1 failure  
F = 3 H = 4 C = 2 D = 1 G = 1 E = 2 failure  
F = 3 H = 4 C = 2 D = 1 G = 1 E = 3 failure  
F = 3 H = 4 C = 2 D = 1 G = 1 E = 4 failure  
F = 3 H = 2 C = 1 failure  
F = 3 H = 2 C = 3 failure  
F = 3 H = 2 C = 4 D = 2 failure  
F = 3 H = 2 C = 4 D = 4 failure  
F = 3 H = 2 C = 4 D = 3 G = 1 failure  
F = 3 H = 2 C = 4 D = 3 G = 2 failure  
F = 3 H = 2 C = 4 D = 3 G = 3 failure  
F = 3 H = 2 C = 4 D = 3 G = 4 failure  
F = 3 H = 2 C = 4 D = 1 G = 1 failure  
F = 3 H = 2 C = 4 D = 1 G = 2 failure  
F = 3 H = 2 C = 4 D = 1 G = 3 failure  
F = 3 H = 2 C = 4 D = 1 G = 4 failure  
F = 3 H = 2 C = 2 D = 2 failure  
F = 3 H = 2 C = 2 D = 4 G = 2 failure  
F = 3 H = 2 C = 2 D = 4 G = 3 failure  
F = 3 H = 2 C = 2 D = 4 G = 4 failure  
F = 3 H = 2 C = 2 D = 4 G = 1 E = 1 failure  
F = 3 H = 2 C = 2 D = 4 G = 1 E = 2 failure  
F = 3 H = 2 C = 2 D = 4 G = 1 E = 3 failure  
F = 3 H = 2 C = 2 D = 4 G = 1 E = 4 failure  
F = 3 H = 2 C = 2 D = 3 G = 2 failure  
F = 3 H = 2 C = 2 D = 3 G = 3 failure  
F = 3 H = 2 C = 2 D = 3 G = 4 failure  
F = 3 H = 2 C = 2 D = 3 G = 1 E = 1 failure  
F = 3 H = 2 C = 2 D = 3 G = 1 E = 2 failure  
F = 3 H = 2 C = 2 D = 3 G = 1 E = 3 failure  
F = 3 H = 2 C = 2 D = 3 G = 1 E = 4 failure  
F = 3 H = 2 C = 2 D = 1 G = 2 failure  
F = 3 H = 2 C = 2 D = 1 G = 3 failure  
F = 3 H = 2 C = 2 D = 1 G = 4 failure  
F = 3 H = 2 C = 2 D = 1 G = 1 E = 1 failure  
F = 3 H = 2 C = 2 D = 1 G = 1 E = 2 failure  
F = 3 H = 2 C = 2 D = 1 G = 1 E = 3 failure  
F = 3 H = 2 C = 2 D = 1 G = 1 E = 4 failure  
F = 3 H = 1 C = 2 failure  
F = 3 H = 1 C = 3 failure  
F = 3 H = 1 C = 4 failure  
F = 3 H = 1 C = 1 D = 1 failure  
F = 3 H = 1 C = 1 D = 2 failure  
F = 3 H = 1 C = 1 D = 4 G = 1 failure  
F = 3 H = 1 C = 1 D = 4 G = 2 failure  
F = 3 H = 1 C = 1 D = 4 G = 3 failure  
F = 3 H = 1 C = 1 D = 4 G = 4 failure  
F = 3 H = 1 C = 1 D = 3 G = 1 failure  
F = 3 H = 1 C = 1 D = 3 G = 2 failure  
F = 3 H = 1 C = 1 D = 3 G = 3 failure  
F = 3 H = 1 C = 1 D = 3 G = 4 failure  
F = 2 H = 2 failure  
F = 2 H = 4 C = 1 failure  
F = 2 H = 4 C = 2 failure  
F = 2 H = 4 C = 3 failure  
F = 2 H = 4 C = 4 D = 1 failure  
F = 2 H = 4 C = 4 D = 4 failure  
F = 2 H = 4 C = 4 D = 3 G = 1 failure  
F = 2 H = 4 C = 4 D = 3 G = 2 failure  
F = 2 H = 4 C = 4 D = 3 G = 4 failure  
F = 2 H = 4 C = 4 D = 3 G = 3 E = 2 failure  
F = 2 H = 4 C = 4 D = 3 G = 3 E = 3 failure  
F = 2 H = 4 C = 4 D = 3 G = 3 E = 4 failure  
F = 2 H = 4 C = 4 D = 3 G = 3 E = 1 A = 1 failure  
F = 2 H = 4 C = 4 D = 3 G = 3 E = 1 A = 2 failure  
F = 2 H = 4 C = 4 D = 3 G = 3 E = 1 A = 3 failure  
F = 2 H = 4 C = 4 D = 3 G = 3 E = 1 A = 4 B = 2 failure  
F = 2 H = 4 C = 4 D = 3 G = 3 E = 1 A = 4 B = 4 failure  
F = 2 H = 4 C = 4 D = 3 G = 3 E = 1 A = 4 B = 3 solution  
F = 2 H = 4 C = 4 D = 3 G = 3 E = 1 A = 4 B = 1 solution  
F = 2 H = 4 C = 4 D = 2 G = 1 failure  
F = 2 H = 4 C = 4 D = 2 G = 2 failure  
F = 2 H = 4 C = 4 D = 2 G = 3 failure  
F = 2 H = 4 C = 4 D = 2 G = 4 failure  
F = 2 H = 3 C = 2 failure  
F = 2 H = 3 C = 4 failure  
F = 2 H = 3 C = 3 D = 1 failure  
F = 2 H = 3 C = 3 D = 3 failure  
F = 2 H = 3 C = 3 D = 4 G = 1 failure  
F = 2 H = 3 C = 3 D = 4 G = 2 failure  
F = 2 H = 3 C = 3 D = 4 G = 3 failure  
F = 2 H = 3 C = 3 D = 4 G = 4 failure  
F = 2 H = 3 C = 3 D = 2 G = 1 failure  
F = 2 H = 3 C = 3 D = 2 G = 2 failure  
F = 2 H = 3 C = 3 D = 2 G = 3 failure  
F = 2 H = 3 C = 3 D = 2 G = 4 failure  
F = 2 H = 3 C = 1 D = 1 failure  
F = 2 H = 3 C = 1 D = 3 failure  
F = 2 H = 3 C = 1 D = 4 G = 1 failure  
F = 2 H = 3 C = 1 D = 4 G = 2 failure  
F = 2 H = 3 C = 1 D = 4 G = 3 failure  
F = 2 H = 3 C = 1 D = 4 G = 4 failure  
F = 2 H = 3 C = 1 D = 2 G = 1 failure  
F = 2 H = 3 C = 1 D = 2 G = 2 failure  
F = 2 H = 3 C = 1 D = 2 G = 3 failure  
F = 2 H = 3 C = 1 D = 2 G = 4 failure  
F = 2 H = 1 C = 2 failure  
F = 2 H = 1 C = 4 failure  
F = 2 H = 1 C = 3 D = 1 failure  
F = 2 H = 1 C = 3 D = 3 failure  
F = 2 H = 1 C = 3 D = 4 G = 1 failure  
F = 2 H = 1 C = 3 D = 4 G = 2 failure  
F = 2 H = 1 C = 3 D = 4 G = 3 failure  
F = 2 H = 1 C = 3 D = 4 G = 4 failure  
F = 2 H = 1 C = 3 D = 2 G = 1 failure  
F = 2 H = 1 C = 3 D = 2 G = 2 failure  
F = 2 H = 1 C = 3 D = 2 G = 3 failure  
F = 2 H = 1 C = 3 D = 2 G = 4 failure  
F = 2 H = 1 C = 1 D = 1 failure  
F = 2 H = 1 C = 1 D = 4 G = 1 failure  
F = 2 H = 1 C = 1 D = 4 G = 2 failure  
F = 2 H = 1 C = 1 D = 4 G = 3 failure  
F = 2 H = 1 C = 1 D = 4 G = 4 failure  
F = 2 H = 1 C = 1 D = 3 G = 1 failure  
F = 2 H = 1 C = 1 D = 3 G = 2 failure  
F = 2 H = 1 C = 1 D = 3 G = 3 failure  
F = 2 H = 1 C = 1 D = 3 G = 4 failure  
F = 2 H = 1 C = 1 D = 2 G = 1 failure  
F = 2 H = 1 C = 1 D = 2 G = 2 failure  
F = 2 H = 1 C = 1 D = 2 G = 3 failure  
F = 2 H = 1 C = 1 D = 2 G = 4 failure  
F = 1 H = 1 failure  
F = 1 H = 4 C = 1 failure  
F = 1 H = 4 C = 3 failure  
F = 1 H = 4 C = 4 D = 4 failure  
F = 1 H = 4 C = 4 D = 3 G = 1 failure  
F = 1 H = 4 C = 4 D = 3 G = 2 failure  
F = 1 H = 4 C = 4 D = 3 G = 4 failure  
F = 1 H = 4 C = 4 D = 3 G = 3 E = 1 failure  
F = 1 H = 4 C = 4 D = 3 G = 3 E = 2 failure  
F = 1 H = 4 C = 4 D = 3 G = 3 E = 3 failure  
F = 1 H = 4 C = 4 D = 3 G = 3 E = 4 failure  
F = 1 H = 4 C = 4 D = 2 G = 1 failure  
F = 1 H = 4 C = 4 D = 2 G = 2 failure  
F = 1 H = 4 C = 4 D = 2 G = 3 failure  
F = 1 H = 4 C = 4 D = 2 G = 4 failure  
F = 1 H = 4 C = 4 D = 1 G = 1 failure  
F = 1 H = 4 C = 4 D = 1 G = 2 failure  
F = 1 H = 4 C = 4 D = 1 G = 3 failure  
F = 1 H = 4 C = 4 D = 1 G = 4 failure  
F = 1 H = 4 C = 2 D = 2 failure  
F = 1 H = 4 C = 2 D = 4 failure  
F = 1 H = 4 C = 2 D = 3 G = 1 failure  
F = 1 H = 4 C = 2 D = 3 G = 2 failure  
F = 1 H = 4 C = 2 D = 3 G = 4 failure  
F = 1 H = 4 C = 2 D = 3 G = 3 E = 1 failure  
F = 1 H = 4 C = 2 D = 3 G = 3 E = 2 failure  
F = 1 H = 4 C = 2 D = 3 G = 3 E = 3 failure  
F = 1 H = 4 C = 2 D = 3 G = 3 E = 4 failure  
F = 1 H = 4 C = 2 D = 1 G = 1 failure  
F = 1 H = 4 C = 2 D = 1 G = 2 failure  
F = 1 H = 4 C = 2 D = 1 G = 3 failure  
F = 1 H = 4 C = 2 D = 1 G = 4 failure  
F = 1 H = 3 C = 1 failure  
F = 1 H = 3 C = 2 failure  
F = 1 H = 3 C = 4 failure  
F = 1 H = 3 C = 3 D = 3 failure  
F = 1 H = 3 C = 3 D = 4 G = 1 failure  
F = 1 H = 3 C = 3 D = 4 G = 3 failure  
F = 1 H = 3 C = 3 D = 4 G = 4 failure  
F = 1 H = 3 C = 3 D = 4 G = 2 E = 1 failure  
F = 1 H = 3 C = 3 D = 4 G = 2 E = 3 failure  
F = 1 H = 3 C = 3 D = 4 G = 2 E = 4 failure  
F = 1 H = 3 C = 3 D = 4 G = 2 E = 2 A = 1 failure  
F = 1 H = 3 C = 3 D = 4 G = 2 E = 2 A = 2 failure  
F = 1 H = 3 C = 3 D = 4 G = 2 E = 2 A = 4 failure  
F = 1 H = 3 C = 3 D = 4 G = 2 E = 2 A = 3 B = 1 failure  
F = 1 H = 3 C = 3 D = 4 G = 2 E = 2 A = 3 B = 3 failure  
F = 1 H = 3 C = 3 D = 4 G = 2 E = 2 A = 3 B = 4 failure  
F = 1 H = 3 C = 3 D = 4 G = 2 E = 2 A = 3 B = 2 solution  
F = 1 H = 3 C = 3 D = 2 G = 1 failure  
F = 1 H = 3 C = 3 D = 2 G = 3 failure  
F = 1 H = 3 C = 3 D = 2 G = 4 failure  
F = 1 H = 3 C = 3 D = 2 G = 2 E = 1 failure  
F = 1 H = 3 C = 3 D = 2 G = 2 E = 2 failure  
F = 1 H = 3 C = 3 D = 2 G = 2 E = 3 failure  
F = 1 H = 3 C = 3 D = 2 G = 2 E = 4 failure  
F = 1 H = 3 C = 3 D = 1 G = 1 failure  
F = 1 H = 3 C = 3 D = 1 G = 2 failure  
F = 1 H = 3 C = 3 D = 1 G = 3 failure  
F = 1 H = 3 C = 3 D = 1 G = 4 failure  
F = 1 H = 2 C = 1 failure  
F = 1 H = 2 C = 3 failure  
F = 1 H = 2 C = 4 D = 2 failure  
F = 1 H = 2 C = 4 D = 4 failure  
F = 1 H = 2 C = 4 D = 3 G = 1 failure  
F = 1 H = 2 C = 4 D = 3 G = 2 failure  
F = 1 H = 2 C = 4 D = 3 G = 3 failure  
F = 1 H = 2 C = 4 D = 3 G = 4 failure  
F = 1 H = 2 C = 4 D = 1 G = 1 failure  
F = 1 H = 2 C = 4 D = 1 G = 2 failure  
F = 1 H = 2 C = 4 D = 1 G = 3 failure  
F = 1 H = 2 C = 4 D = 1 G = 4 failure  
F = 1 H = 2 C = 2 D = 2 failure  
F = 1 H = 2 C = 2 D = 4 G = 1 failure  
F = 1 H = 2 C = 2 D = 4 G = 2 failure  
F = 1 H = 2 C = 2 D = 4 G = 3 failure  
F = 1 H = 2 C = 2 D = 4 G = 4 failure  
F = 1 H = 2 C = 2 D = 3 G = 1 failure  
F = 1 H = 2 C = 2 D = 3 G = 2 failure  
F = 1 H = 2 C = 2 D = 3 G = 3 failure  
F = 1 H = 2 C = 2 D = 3 G = 4 failure  
F = 1 H = 2 C = 2 D = 1 G = 1 failure  
F = 1 H = 2 C = 2 D = 1 G = 2 failure  
F = 1 H = 2 C = 2 D = 1 G = 3 failure  
F = 1 H = 2 C = 2 D = 1 G = 4 failure  

Number of loops taken: 105  
Failed Consistency Checks: 312  
Variable Ordering: [F, H, C, D, G, E, A, B]
  

Solutions:  
1. A = 2 B = 3 C = 2 D = 4 E = 1 F = 4 G = 1 H = 2
2. A = 4 B = 3 C = 4 D = 3 E = 1 F = 2 G = 3 H = 4
3. A = 4 B = 1 C = 4 D = 3 E = 1 F = 2 G = 3 H = 4
4. A = 3 B = 2 C = 3 D = 4 E = 2 F = 1 G = 2 H = 3
