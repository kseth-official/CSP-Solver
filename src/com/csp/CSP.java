package com.csp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*  A class to solve a CSP using using Depth First Search with Pruning that prints the SEARCH TREE to the
    console and the number of failing consistency checks. Different problems can be modeled by changing the
    hardcoded values of VariableOrdering, VariableDomain, and manually adding new constraints in IsSatisfyingConstraint.

    CURRENT INPUTS:
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

    CURRENT OUTPUT:
    1. SEARCH TREE
    2. Number of loops taken
    3. Number of failing consistency checks
    4. Variable Ordering
    5. Solutions (if they exist)
 */
public class CSP {
    public static final int NUMBER_OF_CONSTRAINTS = 17;

    public static final String SOLUTION_MESSAGE = "solution";
    public static final String FAILURE_MESSAGE = "failure";

    public static final List<String> VariableOrdering = new ArrayList<>(Arrays.asList("F", "H", "C", "D", "G", "E", "A", "B"));
    public static final List<Integer> VariableDomain = new ArrayList<>(Arrays.asList(1,2,3,4));

    // Frontier is a stack of paths. Each path by itself is represented using a stack.
    private Stack<Stack<State>> frontier = new Stack<>();

    // Constructor for CSP. Begins CSP immediately when CSP object is created.
    public CSP(){
        System.out.println("SEARCH TREE");

        Setup();

        List<State> solutions = PerformDFSWithPruning();

        System.out.println("Variable Ordering: " + VariableOrdering + "\n");

        System.out.println("\nSolutions:");
        for (int i = 0; i < solutions.size(); i++)  {
            System.out.print(i + 1 + ". ");
            solutions.get(i).PrintValues();
        }
    }

    // Helper function to setup start state for search.
    private void Setup() {
        State startState = GenerateStartState();
        Stack<State> startPath = new Stack<>();
        startPath.push(startState);
        frontier.push(startPath);
    }

    // Currently performs a DFS with Pruning returning all solutions States found to the search tree as a List of solution States.
    public List<State> PerformDFSWithPruning() {
        int loopCounter = 0;
        int failedConsistencyChecks = 0;

        List<State> solutions = new ArrayList<>();

        Stack<State> currentPath;
        while (!frontier.isEmpty()) {
            currentPath = frontier.pop();

            State endOfPath = currentPath.peek();

            if (IsGoal(endOfPath)) {
                solutions.add(new State(endOfPath));
                endOfPath.PrintValuesUptoFirstUnassigned(SOLUTION_MESSAGE);
                continue;
            }

            List<State> successorStates = GenerateSuccessors(endOfPath);

            for (State successor : successorStates) {
                if (!IsViolatingAnyConstraints(successor)) {
                    // Add path with successor to frontier
                    Stack<State> currentPathClone = (Stack<State>) currentPath.clone();
                    currentPathClone.push(successor);
                    frontier.push(currentPathClone);
                    continue;
                }
                // else we prune the path by never adding it to the frontier
                successor.PrintValuesUptoFirstUnassigned(FAILURE_MESSAGE);
                failedConsistencyChecks++;
            }

            loopCounter++;
        }

        System.out.println("\nNumber of loops taken: " + loopCounter);
        System.out.println("Failed Consistency Checks: " + failedConsistencyChecks);
        return solutions;
    }

    // Checks if a state is violating any constraints.
    // If a State is violating a constraint, then the given constraint's variables are assigned values,
    // and those values violate the constraints.
    public boolean IsViolatingAnyConstraints(State state) {
        for (int i = 1; i <= NUMBER_OF_CONSTRAINTS; i++){
            if (!IsSatisfyingConstraint(i, state)){
                return true;
            }
        }
        return false;
    }

    // Generates the start state for the search by creating a State with all UNASSIGNED.
    public State GenerateStartState() {
        return new State();
    }

    // TODO: Use a pair to represent a variable instead to make this code cleaner -> lots of code repitition
    // Generates all successor states to the given state following the Variable Ordering for the problem.
    public List<State> GenerateSuccessors(State state) {
        List<State> successors = new ArrayList<>();

        String nextAssignment = FindNextAssignment(state);

        if (nextAssignment == null) {
            System.out.println("Nothing left to be assigned. Returning empty successor list.");
            return successors;
        }

        switch(nextAssignment) {
            case "A":
                for (int i : VariableDomain) {
                    State successor = new State(state);
                    successor.A = i;
                    successors.add(successor);
                }
                return successors;
            case "B":
                for (int i : VariableDomain) {
                    State successor = new State(state);
                    successor.B = i;
                    successors.add(successor);
                }
                return successors;
            case "C":
                for (int i : VariableDomain) {
                    State successor = new State(state);
                    successor.C = i;
                    successors.add(successor);
                }
                return successors;
            case "D":
                for (int i : VariableDomain) {
                    State successor = new State(state);
                    successor.D = i;
                    successors.add(successor);
                }
                return successors;
            case "E":
                for (int i : VariableDomain) {
                    State successor = new State(state);
                    successor.E = i;
                    successors.add(successor);
                }
                return successors;
            case "F":
                for (int i : VariableDomain) {
                    State successor = new State(state);
                    successor.F = i;
                    successors.add(successor);
                }
                return successors;
            case "G":
                for (int i : VariableDomain) {
                    State successor = new State(state);
                    successor.G = i;
                    successors.add(successor);
                }
                return successors;
            case "H":
                for (int i : VariableDomain) {
                    State successor = new State(state);
                    successor.H = i;
                    successors.add(successor);
                }
                return successors;
            default:
                System.out.println("Invalid Assignment! An error occurred!");
                return null;
        }
    }

    // Finds the next variable that must be assigned in a given state.
    // Returns null if there are no more variables to be assigned.
    public String FindNextAssignment(State state) {
        for (String next: VariableOrdering) {
            switch(next) {
                case "A":
                    if (state.A == State.UNASSIGNED)
                        return "A";
                    else continue;
                case "B":
                    if (state.B == State.UNASSIGNED)
                        return "B";
                    else continue;
                case "C":
                    if (state.C == State.UNASSIGNED)
                        return "C";
                    else continue;
                case "D":
                    if (state.D == State.UNASSIGNED)
                        return "D";
                    else continue;
                case "E":
                    if (state.E == State.UNASSIGNED)
                        return "E";
                    else continue;
                case "F":
                    if (state.F == State.UNASSIGNED)
                        return "F";
                    else continue;
                case "G":
                    if (state.G == State.UNASSIGNED)
                        return "G";
                    else continue;
                case "H":
                    if (state.H == State.UNASSIGNED)
                        return "H";
                    else continue;
                default:
                    System.out.println("Error. Checking for invalid variable");
                    return null;
            }
        }

        System.out.println("No more variables to be assigned");
        return null;
    }

    // Checks if a State is a start state (all values are  assigned to 0)
    public boolean IsStartState(State state) {
        return state.A == 0 && state.B == 0 && state.C == 0 && state.D == 0 && state.E == 0 && state.F == 0
                && state.G == 0 && state.H == 0;
    }

    // Checks if a State is a goal state by checking if all values have been assigned and all constraints of CSP are satisfied.
    public boolean IsGoal(State state) {
        if (
                state.A == State.UNASSIGNED ||
                state.B == State.UNASSIGNED ||
                state.C == State.UNASSIGNED ||
                state.D == State.UNASSIGNED ||
                state.E == State.UNASSIGNED ||
                state.F == State.UNASSIGNED ||
                state.G == State.UNASSIGNED ||
                state.H == State.UNASSIGNED
        )
            return false;

        return !IsViolatingAnyConstraints(state);
    }

    // Checks if a constraint labeled by number is satisfied by the given state.
    // If a constraint is satisfied, it means the State has an assignment for the constraint variable(s),
    // and the constraint is satisfied => return true
    // If a State does not have an assignment for those constraint variable(s),
    // it cannot violate that constraint. Therefore, constraint is satisfied => return true
    // If a constraint is not satisfied, it means the State has an assignment for the constraint variable(s),
    // and the constraint is not satisfied => return false
    // i.e., return Constraint Variables Assigned => CheckConstraintSatisfaction
    public boolean IsSatisfyingConstraint(int number, State state) {
        int a = state.A;
        int b = state.B;
        int c = state.C;
        int d = state.D;
        int e = state.E;
        int f = state.F;
        int g = state.G;
        int h = state.H;

        switch(number){
            case 1:  return a == State.UNASSIGNED || g == State.UNASSIGNED || a > g;
            case 2:  return a == State.UNASSIGNED || h == State.UNASSIGNED || a <= h;
            case 3:  return f == State.UNASSIGNED || b == State.UNASSIGNED || Math.abs(f - b) == 1;
            case 4:  return g == State.UNASSIGNED || h == State.UNASSIGNED || g < h;
            case 5:  return g == State.UNASSIGNED || c == State.UNASSIGNED || Math.abs(g - c) == 1;
            case 6:  return h == State.UNASSIGNED || c == State.UNASSIGNED || (h - c) % 2 == 0;
            case 7:  return d == State.UNASSIGNED || h != d;
            case 8:  return d == State.UNASSIGNED || g == State.UNASSIGNED || d >= g;
            case 9:  return c == State.UNASSIGNED || d != c;
            case 10: return c == State.UNASSIGNED || e != c;
            case 11: return e == State.UNASSIGNED || d == State.UNASSIGNED || e < d - 1;
            case 12: return e == State.UNASSIGNED || h == State.UNASSIGNED || e != h - 2;
            case 13: return f == State.UNASSIGNED || g != f;
            case 14: return f == State.UNASSIGNED || h != f;
            case 15: return f == State.UNASSIGNED || c != f;
            case 16: return d == State.UNASSIGNED || f == State.UNASSIGNED || d != f - 1;
            case 17: return e == State.UNASSIGNED || f == State.UNASSIGNED || Math.abs(e - f) % 2 == 1;
            default:
                System.out.println("Checked Illegal Constraint Number");
                return false;
        }
    }
}
