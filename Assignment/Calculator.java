package Assignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * CLI Calculator (Java)
 * - Supports +, -, *, /, %, ^ (power), parentheses, unary +/-.
 * - Infix parsing via Shunting-Yard -> Postfix evaluation.
 * - 'ans' variable holds the previous result in the session.
 *
 * Build:
 *   javac Calculator.java
 * Run:
 *   java Calculator                      // interactive REPL
 *   java Calculator "2 + 3*(4+5)^2"      // one-shot
 */
public class Calculator {

    private static final Map<String, Integer> PREC = new HashMap<>();
    private static final Set<String> RIGHT_ASSOC = new HashSet<>();

    static {
        PREC.put("+", 1);
        PREC.put("-", 1);
        PREC.put("*", 2);
        PREC.put("/", 2);
        PREC.put("%", 2);
        PREC.put("^", 3);
        RIGHT_ASSOC.add("^"); // exponent is right-associative
    }

    private static boolean isOperator(String t) {
        return PREC.containsKey(t);
    }
    private static int precedence(String t) {
        return PREC.getOrDefault(t, -1);
    }
    private static boolean isRightAssoc(String t) {
        return RIGHT_ASSOC.contains(t);
    }

    private static List<String> tokenize(String s, double ans) {
        List<String> tokens = new ArrayList<>();
        int n = s.length();
        int i = 0;
        while (i < n) {
            char c = s.charAt(i);
            if (Character.isWhitespace(c)) { i++; continue; }

            // number (integer or decimal)
            if (Character.isDigit(c) || (c == '.' && i + 1 < n && Character.isDigit(s.charAt(i+1)))) {
                int j = i + 1;
                boolean hasDot = (c == '.');
                while (j < n) {
                    char d = s.charAt(j);
                    if (Character.isDigit(d)) { j++; }
                    else if (d == '.' && !hasDot) { hasDot = true; j++; }
                    else { break; }
                }
                tokens.add(s.substring(i, j));
                i = j;
                continue;
            }

            // parentheses
            if (c == '(' || c == ')') {
                tokens.add(String.valueOf(c));
                i++;
                continue;
            }

            // operator or part of unary +/- (handled later)
            if ("+-*/%^".indexOf(c) >= 0) {
                tokens.add(String.valueOf(c));
                i++;
                continue;
            }

            // identifier (e.g., ans)
            if (Character.isLetter(c)) {
                int j = i + 1;
                while (j < n && (Character.isLetterOrDigit(s.charAt(j)) || s.charAt(j) == '_')) j++;
                String ident = s.substring(i, j);
                if (ident.equalsIgnoreCase("ans")) {
                    tokens.add(Double.toString(ans));
                } else {
                    throw new IllegalArgumentException("Unknown identifier: " + ident);
                }
                i = j;
                continue;
            }

            throw new IllegalArgumentException("Unexpected character: " + c);
        }
        // Handle unary +/-
        return handleUnary(tokens);
    }

    private static List<String> handleUnary(List<String> tokens) {
        List<String> out = new ArrayList<>();
        String prev = null;
        for (String t : tokens) {
            if ((t.equals("+") || t.equals("-"))
                    && (prev == null || prev.equals("(") || isOperator(prev))) {
                // unary operator -> convert to 0 <op> x
                out.add("0");
                out.add(t);
            } else {
                out.add(t);
            }
            prev = t;
        }
        return out;
    }

    private static List<String> toPostfix(List<String> tokens) {
        List<String> output = new ArrayList<>();
        Deque<String> ops = new ArrayDeque<>();
        for (String t : tokens) {
            if (isNumber(t)) {
                output.add(t);
            } else if (isOperator(t)) {
                while (!ops.isEmpty() && isOperator(ops.peek())) {
                    String top = ops.peek();
                    if ((isRightAssoc(t) && precedence(t) < precedence(top)) ||
                        (!isRightAssoc(t) && precedence(t) <= precedence(top))) {
                        output.add(ops.pop());
                    } else break;
                }
                ops.push(t);
            } else if (t.equals("(")) {
                ops.push(t);
            } else if (t.equals(")")) {
                while (!ops.isEmpty() && !ops.peek().equals("(")) {
                    output.add(ops.pop());
                }
                if (ops.isEmpty() || !ops.peek().equals("(")) {
                    throw new IllegalArgumentException("Mismatched parentheses");
                }
                ops.pop(); // remove '('
            } else {
                throw new IllegalArgumentException("Invalid token: " + t);
            }
        }
        while (!ops.isEmpty()) {
            String top = ops.pop();
            if (top.equals("(") || top.equals(")")) throw new IllegalArgumentException("Mismatched parentheses");
            output.add(top);
        }
        return output;
    }

    private static double evalPostfix(List<String> postfix) {
        Deque<Double> st = new ArrayDeque<>();
        for (String t : postfix) {
            if (isNumber(t)) {
                st.push(Double.parseDouble(t));
            } else if (isOperator(t)) {
                if (st.size() < 2) throw new IllegalArgumentException("Malformed expression");
                double b = st.pop();
                double a = st.pop();
                double r;
                switch (t) {
                    case "+": r = a + b; break;
                    case "-": r = a - b; break;
                    case "*": r = a * b; break;
                    case "/":
                        if (b == 0.0) throw new ArithmeticException("Division by zero");
                        r = a / b; break;
                    case "%":
                        if (b == 0.0) throw new ArithmeticException("Modulo by zero");
                        r = a % b; break;
                    case "^": r = Math.pow(a, b); break;
                    default: throw new IllegalStateException("Unexpected operator: " + t);
                }
                st.push(r);
            } else {
                throw new IllegalArgumentException("Invalid token in postfix: " + t);
            }
        }
        if (st.size() != 1) throw new IllegalArgumentException("Malformed expression");
        return st.pop();
    }

    private static boolean isNumber(String s) {
        if (s == null || s.isEmpty()) return false;
        char c0 = s.charAt(0);
        if (!(Character.isDigit(c0) || c0 == '.')) return false;
        try { Double.parseDouble(s); return true; } catch (NumberFormatException e) { return false; }
    }

    private static double evaluate(String expr, double ans) {
        List<String> toks = tokenize(expr, ans);
        List<String> post = toPostfix(toks);
        return evalPostfix(post);
    }

    private static void repl() throws Exception {
        System.out.println("Java CLI Calculator. Type 'exit' to quit. Variable: ans");
        double ans = 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("calc> ");
            String line = br.readLine();
            if (line == null) break;
            line = line.trim();
            if (line.equalsIgnoreCase("exit") || line.equalsIgnoreCase("quit")) break;
            if (line.isEmpty()) continue;
            try {
                double res = evaluate(line, ans);
                ans = res;
                if (Math.rint(res) == res) {
                    System.out.println((long) res);
                } else {
                    System.out.println(res);
                }
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        try {
            if (args.length > 0) {
                double res = evaluate(String.join(" ", args), 0.0);
                if (Math.rint(res) == res) {
                    System.out.println((long) res);
                } else {
                    System.out.println(res);
                }
            } else {
                repl();
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(1);
        }
    }
}

