package com.csp;

// A State consists of an assignment of values to 8 variables A...H. If a variable is not assigned, its value is 0.
public class State {
    public static final int UNASSIGNED = 0;

    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;

    public State() {
        // Initializes all UNASSIGNED (int primitive value in Java == 0)
    }

    // Constructor that initializes a State with values.
    public State(int A, int B, int C, int D, int E, int F, int G, int H) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.E = E;
        this.F = F;
        this.G = G;
        this.H = H;
    }

    // Constructor that initializes a State using another State.
    public State(State state) {
        this.A = state.A;
        this.B = state.B;
        this.C = state.C;
        this.D = state.D;
        this.E = state.E;
        this.F = state.F;
        this.G = state.G;
        this.H = state.H;
    }

    // Prints values of all variables in the State from A...H
    public void PrintValues() {
        System.out.printf("A = %d B = %d C = %d D = %d E = %d F = %d G = %d H = %d\n", A, B, C, D, E, F, G, H);
    }

    // Prints values of all variables in the State from A...H and adds append to the end
    public void PrintValues(String append) {
        System.out.printf("A = %d B = %d C = %d D = %d E = %d F = %d G = %d H = %d " + append + "\n", A, B, C, D, E, F, G, H);
    }

    // Prints values of all variables in order of CSP.VariableOrdering upto first unassigned variable.
    // Adds append to the end
    public void PrintValuesUptoFirstUnassigned(String append) {
        for (String next: CSP.VariableOrdering) {
            switch(next) {
                case "A":
                    if (A != UNASSIGNED) {
                        System.out.printf("A = %d ", A);
                    }
                    break;
                case "B":
                    if (B != UNASSIGNED)
                        System.out.printf("B = %d ", B);
                    break;
                case "C":
                    if (C != UNASSIGNED)
                        System.out.printf("C = %d ", C);
                    break;
                case "D":
                    if (D != UNASSIGNED)
                        System.out.printf("D = %d ", D);
                    break;
                case "E":
                    if (E != UNASSIGNED)
                        System.out.printf("E = %d ", E);
                    break;
                case "F":
                    if (F != UNASSIGNED)
                        System.out.printf("F = %d ", F);
                    break;
                case "G":
                    if (G != UNASSIGNED)
                        System.out.printf("G = %d ", G);
                    break;
                case "H":
                    if (H != UNASSIGNED)
                        System.out.printf("H = %d ", H);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + next);
            }
        }

        System.out.println(append);
    }
}
